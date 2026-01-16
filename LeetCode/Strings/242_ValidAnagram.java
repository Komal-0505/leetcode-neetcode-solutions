// LeetCode 242 - Valid Anagram
// --------------------------------
// Approach 1: Sorting
// Time: O(n log n), Space: O(1)
//
// Approach 2: Frequency Count (Optimized)
// Time: O(n), Space: O(1)

  // Approach 1: Sorting
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] c1= s.toCharArray();
        char[] c2 = t.toCharArray();
        if(c1.length != c2.length){
            return false;
        }
        Arrays.sort(c1);
        Arrays.sort(c2);
        for(int i =0;i<c1.length;i++){
                if(c1[i]!=c2[i]){
                    return false;
                }
        }
        return true;
    }
}

// Approach 2: Frequency Count (Optimized)

class Solution {
    public boolean isAnagram(String s, String t) {
        int len1= s.length();
        int len2 = t.length();
        if(len1 != len2){
            return false;
        }
        int count[] = new int[26];
        for(int i =0;i<len1;i++){
            count[s.charAt(i)-'a']++;
        }
        for(int i = 0;i<len2;i++){
            count[t.charAt(i) -'a']--;
        }
        for(int i =0;i<count.length;i++){
            if(count[i]!=0){
                return false;

            }
        }
        return true;
    }
}


