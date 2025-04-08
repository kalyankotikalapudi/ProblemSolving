// Last updated: 4/8/2025, 1:49:48 PM
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        
      int i=0;
       Set<String> set1 = new HashSet<>();
       Set<String> set2 = new HashSet<>();

       while(i+10<=s.length())
      {
           if(!set1.contains(s.substring(i,i+10)))
        {
            set1.add(s.substring(i,i+10));   
        }
        else
        {
            set2.add(s.substring(i,i+10));   
        }
        i++;
            
      }

      return new ArrayList<>(set2);
     
    }
}