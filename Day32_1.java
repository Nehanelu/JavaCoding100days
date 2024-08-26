
import java.util.ArrayList;
import java.util.List;

class Day32_1 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int remaining, int start, List<Integer> current, List<List<Integer>> result) {
        if (remaining < 0) {
            return; 
        } else if (remaining == 0) {
            result.add(new ArrayList<>(current)); 
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            current.add(candidates[i]); 
            backtrack(candidates, remaining - candidates[i], i, current, result);
            current.remove(current.size() - 1); 
        }
    }
}
