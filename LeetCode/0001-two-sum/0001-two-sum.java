class Solution {
    public int[] twoSum(int[] nums, int target) {
    // Step 1: Create a HashMap to store numbers and their indices

        HashMap<Integer, Integer> map = new HashMap<>();

    // Step 2: Loop through each number in the array

    for(int i=0;i<nums.length;i++) {

        int compliment = target - nums[i]; //Find the compliment

        // step 4: check if compliment is there in the map

        if(map.containsKey(compliment)) {
            //Step 5: If yes,return indices
            return new int[]{map.get(compliment),i};

        }
        // Step 6: If no, store the current number and its index
        map.put(nums[i], i);
    }
    // Step 7: Return empty array (won’t happen, guaranteed solution exists)
        return new int[] {};  
        
    }
}