class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int start = 0, maxLength = 0, count=0;

        for (int i = 0; i < s.length(); i++) {
           
            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(start)); 
                start++; 
                count--;
            }

           
            set.add(s.charAt(i));
            count++;

         
            maxLength = Math.max(maxLength, i-start+1);
        }

        return maxLength;
    }
}