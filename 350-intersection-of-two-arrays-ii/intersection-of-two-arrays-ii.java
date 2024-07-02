class Solution {
    public int[] intersect(int[] num1, int[] num2) {
     // Arrays.sort(num1);
      //Arrays.sort(num2);


 //     int i = 0;
   //   int j =0, k =0;
     // int l1 = num1.length;
//      int l2 = num2.length;
 //     int []res = new int[Math.min(l1,l2)];
//
   //   while(i<l1 && j<l2){
 //       if(num1[i]==num2[j]){
         //   res[k]=num1[i];
          //  k++;
          //  i++;
          //  j++;
        
      //  }
     //   else if(num1[i] < num2[j]){
     //       i++;
      //  }
       // else if(num1[i]>num2[j]){
        //    j++;
       // }
    //  }
    //  int fin[] = new int[k];
    //  for(int ii = 0; ii<k;ii=ii+1){
   //     fin[ii]=res[ii];
   //   }
  //    return fin;


  HashMap<Integer, Integer> map = new HashMap<>();

  for(int num: num1){
    map.put(num, map.getOrDefault(num,0)+1);
  }

  List<Integer> reslist = new ArrayList<>();

  for(int num:num2){
    if(map.containsKey(num) && map.get(num)>0){
        reslist.add(num);
        map.put(num,map.get(num)-1);
    }
  }

  int[] res = new int[reslist.size()];
  for(int i = 0;i<reslist.size();i++){
    res[i]= reslist.get(i);
  }
  return res;


    }
}