class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> ans = new ArrayList<>();
        HashMap<Integer, List<Integer>> hm =  new HashMap<>();
        for(int i=0;i<groupSizes.length;i++){
            int current = groupSizes[i];
            List<Integer> temp = hm.getOrDefault(current,  new ArrayList<>());
            temp.add(i);
            hm.put(current, temp);
            if(temp.size()==current){
                ans.add(temp);
                hm.remove(current);
            }
        }
        return ans;
    }
}
