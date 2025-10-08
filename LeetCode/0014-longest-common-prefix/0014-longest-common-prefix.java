class Solution {
    public static String  longestCommonPrefix(String[] strs) {
        // check for empty input

        if(strs == null || strs.length==0) return "";

        // step 1: sort the array alphabetically
        Arrays.sort(strs);

        // step 2:Take the first and last strings after sorting

        String first = strs[0];
        String last = strs[strs.length -1];

        // step 3:Initialize index i to track matching chracters

        int i =0;

        // step 4: Loop until characters at position i match in first and last strings
        while(i < first.length() && i<last.length()  && first.charAt(i) == last.charAt(i)){
            i++;
        }
        return first.substring(0, i);   
    }
     public static void main(String[] args) {
        String[] input = {"flower", "flow", "flight"};

        System.out.println("Longest Common Prefix: " + longestCommonPrefix(input));
    }

}