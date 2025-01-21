class Solution {
    public int[] topKFrequent(int[] nums, int k) {

       Map<Integer , Integer> map = new HashMap<>();

       for(int i=0;i<nums.length;i++)
       {
           if(map.containsKey(nums[i]))
           {
                 map.put(nums[i], map.get(nums[i])+1);
           }
           else
           {
                 map.put(nums[i], 1);
           }
          

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