class Solution {
    public boolean judgeCircle(String moves) {
        int a =0;
        int b = 0;
        for(int i = 0;i<moves.length();i++){
           if (moves.charAt(i)== 'L'){
            a++;
           }
           else if(moves.charAt(i)=='R'){
            a--;
           }
           else if(moves.charAt(i)=='U'){
            b++;
           }
           else if(moves.charAt(i)=='D'){
            b--;
           }
        }
        // if(a+b==0){
        //     return true;
        // }
        // else{
        //     return false;
        // }
        
        return (a==0 && b==0);
    }
}