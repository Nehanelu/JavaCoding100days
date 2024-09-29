import java.util.*;

class Day65_1  {
    private Map<String, Integer> keyCount;
    private Map<Integer, Bucket> countBucket;
    private Bucket head, tail;
  private class Bucket {
        int count;
        Set<String> keys;
        Bucket prev, next;
        
        public Bucket(int count) {
            this.count = count;
            this.keys = new HashSet<>();
        }
    }

    public Day65_1 () {
        keyCount = new HashMap<>();
        countBucket = new HashMap<>();
        head = new Bucket(0);
        tail = new Bucket(0);
        head.next = tail;
        tail.prev = head;
    }
    public void inc(String key) {
        int count = keyCount.getOrDefault(key, 0);
        keyCount.put(key, count + 1);
        moveKey(key, count, count + 1);
    }
    public void dec(String key) {
        int count = keyCount.get(key);
        if (count == 1) {
            keyCount.remove(key); 
            removeKeyFromBucket(key, count);
        } else {
            keyCount.put(key, count - 1);
            moveKey(key, count, count - 1);
        }
    }
    public String getMaxKey() {
        if (tail.prev == head) return ""; 
        return tail.prev.keys.iterator().next(); 
    }
    public String getMinKey() {
        if (head.next == tail) return ""; 
        return head.next.keys.iterator().next(); 
    }
    private void moveKey(String key, int oldCount, int newCount) {
        if (oldCount > 0) {
            removeKeyFromBucket(key, oldCount);
        }
        addKeyToBucket(key, newCount);
    }
    private void addKeyToBucket(String key, int count) {
        Bucket bucket = countBucket.get(count);
        if (bucket == null) {
            bucket = new Bucket(count);
            countBucket.put(count, bucket);
            insertBucketAfter(bucket, findBucket(count - 1));
        }
        bucket.keys.add(key);
    }
    private void removeKeyFromBucket(String key, int count) {
        Bucket bucket = countBucket.get(count);
        bucket.keys.remove(key);
        if (bucket.keys.isEmpty()) {
            removeBucket(bucket);
            countBucket.remove(count);
        }
    }
    private void insertBucketAfter(Bucket newBucket, Bucket prevBucket) {
        newBucket.next = prevBucket.next;
        newBucket.prev = prevBucket;
        prevBucket.next.prev = newBucket;
        prevBucket.next = newBucket;
    }

    private void removeBucket(Bucket bucket) {
        bucket.prev.next = bucket.next;
        bucket.next.prev = bucket.prev;
    }

    private Bucket findBucket(int count) {
        Bucket curr = head;
        while (curr.next != tail && curr.next.count <= count) {
            curr = curr.next;
        }
        return curr;
    }
}
