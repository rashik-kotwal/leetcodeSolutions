static int[] dx={1,0,0,-1};
    static int[] dy={0,1,-1,0};
    
    public static boolean DFS(int R,int C, int i,int j,char[][] board,boolean[][] v,String word,int length)
    {
        v[i][j]=true;
        if(length+1==word.length())
            return true;
        else
            length++;
        int testx,testy;
        for(int k=0;k<=3;k++)
        {
            testx=i+dx[k];
            testy=j+dy[k];
            
            if(testx>=0 && testx<R && testy>=0 && testy<C && v[testx][testy]==false)
            {
                if(board[testx][testy]==word.charAt(length))
                    if(DFS(R,C,testx,testy,board,v,word,length))return true;
                        /*return true;
                    else
                        return false;*/
            }
        }
         v[i][j]=false;             //This step is so crucial for passing this testcase: char[][] arr={{'A','B','C','E'},
                                                                                                    // {'S','F','E','S'},
                                                                                                   // {'A','D','E','E'}}; "ABCESEEEFS"
        return false;
    }
    public static boolean exist(char[][] board, String word) {
        int R=board.length;
        int C=board[0].length;
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                boolean[][] v = new boolean[R][C];
                if(word.charAt(0)==board[i][j])
                    if(DFS(R,C,i,j,board,v,word,0))
                        return true;
            }
        }
        
        return false;
    }  
