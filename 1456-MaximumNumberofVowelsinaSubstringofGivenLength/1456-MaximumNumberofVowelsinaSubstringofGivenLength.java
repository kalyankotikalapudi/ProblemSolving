class Solution {
    public int maxVowels(String s, int k) {
        
    int max=0;
    int maxsum=0;
    
    for(int i=0;i<k;i++)
    {
        if(isvowel(s.charAt(i)))
        {
            max++;
        }
    }

    maxsum= max;


    int start =0;
    for(int i=k;i<s.length();i++)
    {
        if(isvowel(s.charAt(start)))
        {
               max--;
        }
        
       if(isvowel(s.charAt(i)))
       {
         max++;
       }
    
       start++;
      maxsum= Math.max(max,maxsum);

    }

    System.out.print(maxsum);

       return maxsum;
    }




    private boolean isvowel(char c)
    {
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
}