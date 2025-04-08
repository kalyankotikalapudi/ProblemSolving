// Last updated: 4/8/2025, 12:27:55 AM
class Solution {
    public int lengthOfLongestSubstring(String s) {
    
           int i=0;
           int j=0;
           int len=0;
           Set<Character> set = new HashSet<>();

           while(i<s.length())
           {
               if(!set.contains(s.charAt(i)))
               {
                   set.add(s.charAt(i));   
                   len = Math.max(len,i-j+1);
                   i++;
               }
              else{
                   set.remove(s.charAt(j));
                   j++;
              }
           }

           return len;
       
    }
}