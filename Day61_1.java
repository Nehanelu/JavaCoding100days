public class Day61_1 {

    class TrieNode {
        TrieNode[] children = new TrieNode[26]; 
        int prefixCount = 0; 
    }

    class Trie {
        TrieNode root;
        
        public Trie() {
            root = new TrieNode();
        }
        public void insert(String word) {
            TrieNode current = root;
            for (char c : word.toCharArray()) {
                int idx = c - 'a';
                if (current.children[idx] == null) {
                    current.children[idx] = new TrieNode();
                }
                current = current.children[idx];
                current.prefixCount++; 
            }
        }
        public int getPrefixScore(String word) {
            TrieNode current = root;
            int totalScore = 0;
            for (char c : word.toCharArray()) {
                int idx = c - 'a';
                if (current.children[idx] == null) {
                    break;
                }
                current = current.children[idx];
                totalScore += current.prefixCount;
            }
            return totalScore;
        }
    }
    
    public int[] sumPrefixScores(String[] words) {
        Trie trie = new Trie();
        for (String word : words) {
            trie.insert(word);
        }
        int[] result = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            result[i] = trie.getPrefixScore(words[i]);
        }
        
        return result;
    }
}
