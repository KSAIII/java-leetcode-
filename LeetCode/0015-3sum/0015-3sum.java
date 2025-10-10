class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {

        // This lsist will store all unique triplets

        List<List<Integer>> result = new ArrayList<>();

        // step 1:sort the array so that we can use two pointers efficiently
       Arrays.sort(nums);
        // Step 2: Loop through the array fixing one element at a time
        for(int i=0;i<nums.length-2;i++){
        // Skip duplicate fixed elements to avoid duplicate triplets
        if(i>0 && nums[i] == nums[i-1]){
            continue;
        }
        // Two pointers for the remaining part of the array
        int left = i + 1;
        int right = nums.length - 1;
        // Step 3: Move pointers to find pairs that sum with nums[i] to zero
        while(left < right){
            int sum = nums[i] + nums[left] + nums[right];

            if(sum == 0){
                //found a triplet
                result.add(Arrays.asList(nums[i],nums[left],nums[right]));

        // Move left and right pointers to next different numbers
        while(left<right && nums[left] == nums[left+1]){
            left++;
        }
        while(left<right && nums[right] == nums[right-1]) {
            right--;
        }
        left++;
        right--;
            }
            else if(sum < 0){
            // Sum is too small, move left pointer right to increase sum
            left++; 
            }
            else{
            // Sum is too big, move right pointer left to decrease sum
            right--;
            }
        }
        

        }
        return result; 
    }
public static void main(String[] args){
        int[] input = {-1,0,1,2,-1,-4};
        List<List<Integer>> triplets = threeSum(input);
        System.out.println("Unique triplets that sum to zero:");
         for (List<Integer> triplet : triplets) {
            System.out.println(triplet);
        }


        
    }
}