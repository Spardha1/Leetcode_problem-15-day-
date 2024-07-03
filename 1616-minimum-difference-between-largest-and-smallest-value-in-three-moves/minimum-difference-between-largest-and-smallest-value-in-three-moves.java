class Solution {
    public int minDifference(int[] nums) {
       Arrays.sort(nums);

      //for min to maax
      int i = 3;
      int a=0;
      int res =0;

      int j = nums.length;
      int b = j-1-3;

      if(j<=4){
        return 0;
      }
      else {
        res = Math.min((nums[j-1]-nums[i]),nums[b]-nums[a]);
        int x=nums[j-3]-nums[1];
        int y = nums[j-2]-nums[2];
        y = Math.min(y,x);
        res = Math.min(res,y);
      }
      return res;
    }
}