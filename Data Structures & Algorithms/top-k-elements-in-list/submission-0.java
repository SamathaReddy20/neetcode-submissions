class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int num:nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        List<Map.Entry<Integer,Integer>> ans=new ArrayList<>(hm.entrySet());
        ans.sort(Map.Entry.<Integer,Integer>comparingByValue().reversed());
        //int size=res.size();
        int[] arr=new int[k];
        for(int i=0;i<k;i++){
            arr[i]=ans.get(i).getKey();
        }
        return arr;
    }
}
