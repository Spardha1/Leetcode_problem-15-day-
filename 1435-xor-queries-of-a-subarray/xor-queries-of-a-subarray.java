// class Solution {
//     public int[] xorQueries(int[] arr, int[][] queries) {

//         int prefixor[] = new int[arr.length];

//         for(int i = 0 ;i <arr.length;i++){

//             for(int j =0 ; j< queries.length; j++){

//                 for(int k = j; k< queries[j].length;j++){

                    
//                     prefixor[i] = arr[j] ^ arr[k];
//                 }

//             }


//         }
//         return prefixor;
        
//     }
// }


class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {

        int n = arr.length;
        int[] prefixor = new int[n + 1]; // Prefix XOR array of size n + 1 for easier calculations

        // Compute prefix XOR
        for (int i = 1; i <= n; i++) {
            prefixor[i] = prefixor[i - 1] ^ arr[i - 1];
        }

        // Prepare the result array
        int[] result = new int[queries.length];

        // Answer each query
        for (int i = 0; i < queries.length; i++) {
            int L = queries[i][0];
            int R = queries[i][1];
            result[i] = prefixor[R + 1] ^ prefixor[L]; // XOR of range [L, R]
        }

        return result;
    }
}
