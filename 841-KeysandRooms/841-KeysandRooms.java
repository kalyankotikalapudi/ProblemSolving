// Last updated: 4/5/2025, 10:57:40 PM
class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        Set<Integer> visit = new HashSet<>();
        
        
           dfs(rooms, 0 ,visit);

           if(rooms.size()==visit.size())
           {
            return true;
           }

         return false;
    }


    private void dfs(List<List<Integer>> result, int node, Set<Integer> visit)
    {
           

           Stack<Integer> stack = new Stack<>();
           stack.push(node);

           while(!stack.isEmpty())
           {

            int x = stack.pop();
            if(!visit.contains(node))
           {
             visit.add(node);
           }

            for(int neighbour: result.get(x))
              {

                if(!visit.contains(neighbour))
               {
                    stack.push(neighbour);
                    visit.add(neighbour);
               }
                 
           }



           }
         

    }
    
}