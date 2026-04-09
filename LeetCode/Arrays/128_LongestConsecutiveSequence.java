class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set =  new HashSet<>();
        int count = 0;
        for(int num : nums){
                set.add(num);
        }
        for(int num : set){
            if(!set.contains(num-1)){
                int currentNum = num;
                int currentCount = 1;

                while(set.contains(currentNum + 1)){
                    currentNum +=1;
                    currentCount +=1;
                }
                count = Math.max(count,currentCount);
            }
        }
        return count;
        
    }
}
/*
class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

       Arrays.sort(nums);
       int count = 1;
       int longest  = 1;
       for(int i=1;i<nums.length;i++){
        if(nums[i]==nums[i-1]){
            continue;
        }
        else if(nums[i]==nums[i-1]+1){
            count++;
        }
        else{
            count = 1;
        }
        longest = Math.max(longest, count);
       }
       return longest; 
    }
}*/
