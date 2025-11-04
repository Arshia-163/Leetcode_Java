class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] ans = new int[n-k+1];

 for(int i=0;i<=n-k;i++){ // yeh hr window bnata hai mtlb subarr kitne 
    Map<Integer,Integer> map = new HashMap<>();//isme freq store krege hr ek 
    for(int j=i;j<i+k;j++){// hr wndw i se strt hogi aur k pe end;
map.put(nums[j],map.getOrDefault(nums[j],0)+1);
    }

    // list sorting ke liye
List<int[]> frq  = new ArrayList<>();
for(Map.Entry<Integer,Integer> ent:map.entrySet()){
    frq.add(new int[] {ent.getValue(),ent.getKey()});
}
frq.sort((a,b)->{
    if(a[0] != b[0]){
        return b[0] -a[0];
    }
    else{
        return b[1]-a[1];
    }
});
int sum =0;
for(int j=0;j<x&& j<frq.size();j++){
sum += frq.get(j)[0]*frq.get(j)[1];
}
ans[i] = sum;
        }
        return ans;

    }
}