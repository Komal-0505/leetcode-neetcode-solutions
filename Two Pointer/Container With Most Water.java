//Brute Force
class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int maxWater = 0;
        for(int i= 0;i<n;i++){
            for(int j =i+1;j<n;j++){
                int width = j-i;
                int ht = Math.min(heights[i],heights[j]);
                int area = width * ht;
                maxWater = Math.max(area, maxWater);
            }
        }
        return maxWater;
    }
}
/*
Time Complexity: O(n²)
Space Complexity: O(1)
*/

class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int maxWater = 0;
        while(left < right){
            int area = Math.min(heights[left],heights[right]) * (right - left);
            maxWater = Math.max(area,maxWater);

            if(heights[left] < heights[right]){
                left++;
            }
            else{
                right--;
            }
            
        }
        return maxWater;
    }
}
/*
Time Complexity: O(n)
Space Complexity: O(1)
*/



