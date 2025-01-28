class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int start = 0, maxLength = 0, count=0;

        for (int end = 0; end < s.length(); end++) {
           
            while (set.contains(s.charAt(end))) {
                set.remove(s.charAt(start)); 
                start++; 
                count--;
            }

           
            set.add(s.charAt(end));
            count++;

         
            maxLength = Math.max(maxLength, count);
        }

        return maxLength;
    }
}