// class Solution {
//     public int countSeniors(String[] details) {
//       char a =   details.charAt(11);
//       int m = Integer.parseInt(String.valueOf(a));
//       char b =  details.charAt(12);
//       int count = 0;
//     for(int m = 0; m<details.length();m++){
//     int  i = 11;
//     String s = details.substring(i,i+1);
//     int r = Integer.parseInt(s);  
//     if(r>60){
//         count++;
//     }

//     }
    
//     return count;
// }


class Solution {
    public int countSeniors(String[] details) {
        int seniorCount = 0;
        for (String info : details) {
            char tens = info.charAt(11);
            char ones = info.charAt(12);
            if (tens > '6' || (tens == '6' && ones > '0')) {
                seniorCount++;
            }
        }
        return seniorCount;
    }
}