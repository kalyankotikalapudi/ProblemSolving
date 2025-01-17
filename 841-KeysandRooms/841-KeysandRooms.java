class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        Set<Integer> visited = new HashSet<>();
        

        helper(rooms,0,visited);
       
       return visited.size() == rooms.size();
    }


    private void helper(List<List<Integer>> rooms, int key , Set<Integer> visited)
    {
       if(!visited.contains(key))
       {
          visited.add(key);
       }

       for(int i : rooms.get(key))
       {
             if(!visited.contains(i))
             {
                   helper(rooms,i,visited);
            }
       }
    }



    
}