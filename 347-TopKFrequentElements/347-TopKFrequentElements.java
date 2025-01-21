class Solution {
    public int[] topKFrequent(int[] nums, int k) {

       Map<Integer , Integer> map = new HashMap<>();

       for(int i:nums)
       {
          
                 map.put(i, map.getOrDefault(i,0)+1);
           
         
          

       }
       

    PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(key-> map.get(key)));

     for (Map.Entry<Integer, Integer> entry : map.entrySet())
      {
         
            pq.offer(entry.getKey());
            if (pq.size() > k) 
            { 
                pq.poll();
            }
            
      }


     

       int[] ar = new int[k];


       for(int i=0;i<ar.length;i++)
       {
            ar[i]= pq.poll();
          
       }


       return ar; 
    }
}