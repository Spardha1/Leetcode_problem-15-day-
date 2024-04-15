class Solution {
    public int minimizedStringLength(String s) {
        char[] chars=s.toCharArray();
        int [] ct = new int[26];
        int res=0;
        for(char c:chars){
            ct[c-'a']++;
        }

        for(int i :ct){
            if(i>0){
                res++;
            }
        }
        return res;
        
    }
}