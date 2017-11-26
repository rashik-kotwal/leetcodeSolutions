/*Contest 60: Question 1
  static int[] dx={1,0,0,-1};
   static int[] dy={0,1,-1,0};
    
    public static int[][] DFS(int[][] image, int sr, int sc,int R,int C, int newColor,boolean[][] v,int origColor)
    {
        image[sr][sc]=newColor;
        v[sr][sc]=true;
        int testx,testy;
        for(int k=0;k<=3;k++)
        {
            testx=sr+dx[k];
            testy=sc+dy[k];
            
            if(testx>=0 && testx<R && testy>=0 && testy<C && v[testx][testy]==false)
            {
                if(image[testx][testy]==origColor)
                image=DFS(image,testx,testy,R,C,newColor,v,origColor);
               
            }
        }
        return image;
    }
    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int R=image.length;
        int C=image[0].length;
        int origColor=image[sr][sc];
        boolean[][] v= new boolean[R][C];
        image=DFS(image,sr,sc,R,C,newColor,v,origColor);
        
        return image;
    }*/
