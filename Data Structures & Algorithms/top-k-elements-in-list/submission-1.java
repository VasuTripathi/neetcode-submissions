class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int [] arr = new int [k];
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i ++ ){
            hmap.put(nums[i],hmap.getOrDefault(nums[i],0)+1);
        }
        List<Map.Entry<Integer, Integer>> entries =
        new ArrayList<>(hmap.entrySet()); 
        entries.sort((a, b) -> b.getValue() - a.getValue());
        for(int i = 0 ; i < k; i++){
         arr[i] =  entries.get(i).getKey();
        }
        return arr;
    }
}                                                                                                                                                                                                                                                                                                                                                                                                                   