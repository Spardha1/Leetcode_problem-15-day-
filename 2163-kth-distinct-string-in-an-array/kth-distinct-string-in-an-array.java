class Solution {
    public String kthDistinct(String[] arr, int k) {
        int n = arr.length;
        List<String> distinctStrings = new ArrayList<>();

        //go to each string one by one and check in the array

        for(int i = 0;i<n;i++){
            String currString = arr[i];
            boolean isDistinct = true;

            for(int j = 0;j<n;j++){
                if(j==i)
                continue;
                if(arr[j].equals(currString)){
                    isDistinct = false;
                    break;
                }
            }

            if(isDistinct){
                distinctStrings.add(currString);
            }

        }
        if(distinctStrings.size()<k){
            return "";
        }

        return distinctStrings.get(k-1);
        
    }
}