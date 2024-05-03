class Solution {
    public int compareVersion(String version1, String version2) {

        var v1 = version1.split("\\.");
        var v2 = version2.split("\\.");

        for(var i =0;i<Math.max(v1.length,v2.length);i++){
            var a = i<v1.length?Integer.parseInt(v1[i]):0;
            var b = i<v2.length?Integer.parseInt(v2[i]):0;
            if(a<b) return -1;
            if(a>b) return 1;
        }
            return 0;
        
    }
}