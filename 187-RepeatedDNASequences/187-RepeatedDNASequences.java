// Last updated: 4/8/2025, 1:49:07 PM
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        
      
       Set<String> set1 = new HashSet<>();
       Set<String> set2 = new HashSet<>();

       for(int i=0;i+10<=s.length();i++)
      {
           if(!set1.contains(s.substring(i,i+10)))
        {
            set1.add(s.substring(i,i+10));   
        }
        else
        {
            set2.add(s.substring(i,i+10));   
        }
        
            
      }

      return new ArrayList<>(set2);
     
    }
}