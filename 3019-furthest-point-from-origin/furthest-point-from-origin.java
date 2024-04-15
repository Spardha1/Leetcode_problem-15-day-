class Solution {
    public int furthestDistanceFromOrigin(String moves) {
       
        int cl=0,cr=0;
        int ans=0;
        int n= moves.length();
        for(int i = 0;i<n;i++){
            if(moves.charAt(i)=='L'){
                cl++;
            }
            else if(moves.charAt(i)=='R'){
                cr++;
            }
        }
        if(cl>cr){
            ans=cl-cr;
        }
        else{
            ans=cr-cl;
        }
        ans=ans+(n-cl-cr);
        return ans;

    }
}