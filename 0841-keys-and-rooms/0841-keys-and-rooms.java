// using DFS
class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n];

        q.add(0);
        visited[0] = true;

        while (!q.isEmpty()) {
            int val = q.poll();
    
            for (int i : rooms.get(val)) {
                if (!visited[i]) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
        for (boolean visite: visited){
            if(visite== false) return false;
        }
        return true;
    }
}