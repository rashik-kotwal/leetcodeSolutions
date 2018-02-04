//Accepted for Leecode problem : Course Schedule

class Solution {
     static int[][] graph;
    //static Set<Integer> mySet;
    static boolean[] visited;
    static boolean[] stack;
    static int top;
    static int count;
    static boolean[] Globalvisited;
    public static boolean detectCycle(int s,int n)
    {
        if(visited[s]==false) {
            visited[s] = true;
            Globalvisited[s]=true;
            count++;
            stack[s] = true;

            //recur for all the connections to this node, not visited
            for (int i = 0; i < n; i++) {
                if (visited[i]==false && graph[s][i] == 1 && detectCycle(i, n)) {
                    return true;
                } else if (graph[s][i] == 1 && stack[i] == true)
                    return true;
            }
        }
        stack[s] = false;       //remove the vertex from the recursion stack
        return false;
    }
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        //base case
        if(prerequisites.length==0)
            return true;
        //make adjacency matrix and detect cycle in graph
        graph = new int[numCourses][numCourses];        //all 0
        int start=-1;
        for(int i=0;i<prerequisites.length;i++)
        {
            graph[prerequisites[i][0]][prerequisites[i][1]]=1;
            if(start==-1)
            {
                //initialize start
                start = prerequisites[i][0];
            }
        }
        //mySet = new HashSet<Integer>();
        visited = new boolean[numCourses];
        Globalvisited = new boolean[numCourses];
        stack = new boolean[numCourses];
        top=0;
        count=0;
        boolean ans=false;
        while(count<numCourses)
        {
            //if(count==0) {
                ans = detectCycle(start, numCourses);

                if (ans == true)           //there is a cycle, break out else check for more
                    break;

            for(int i=0;i<numCourses;i++)
            {
                if(Globalvisited[i]==true)          //visited
                    continue;
                else
                {
                    //re-initialize start
                    start = i;
                    break;
                }
            }
        }



            return !ans;
        
    }
}
