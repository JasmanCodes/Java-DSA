package Backtracking;



import java.util.Arrays;
  
//this is the problem with recursion that is why we need backtracking this is a never ending
public class AllPaths {

    public static void main(String[] args) {
        boolean[][] board = {
                {true,true,true},
                {true,true ,true},
                {true,true,true}
        };
        int[][] path = new int[board.length][board[0].length];
        allPathPrint("",board,0,0, path,1);

    }

    static void allPath(String p,boolean[][] maze, int r, int c) {
        if (r == maze.length-1 && c == maze[0].length-1) {
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;}
        // i am considering this block as my path
        maze[r][c] =false; //backtracking

        if (r < maze.length-1) {   //down
            allPath(p + 'D',maze, r + 1, c);
        }
        if (c < maze.length-1) {   //right
            allPath(p + 'R',maze,  r, c +  1);

        }

        if (r>0) {
            allPath(p + 'U',maze,  r-1, c );

        }
        if (c > 0) {
            allPath(p + 'L',maze,  r, c -1);

        }

        //this line is where the function is over
        // so before the function gets removed, also remove the changes that were made by the function

        maze[r][c] =true;// backtracing
    }

    static void allPathPrint(String p,boolean[][] maze, int r, int c, int[][] path, int step) {
        if (r == maze.length-1 && c == maze[0].length-1) {
            path[r][c] = step;
            for(int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!maze[r][c]){
            return;}
        // i am considering this block as my path
        maze[r][c] =false; //backtracking
        path[r][c] =step;

        if (r < maze.length-1) {   //down
            allPathPrint(p + 'D',maze, r + 1, c, path,step+1);
        }
        if (c < maze.length-1) {   //right
            allPathPrint(p + 'R',maze,  r, c +  1,path,step+1);

        }

        if (r>0) {
            allPathPrint(p + 'U',maze,  r-1, c,path,step+1);

        }
        if (c > 0) {
            allPathPrint(p + 'L',maze,  r, c -1,path,step+1);

        }

        //this line is where the function is over
        // so before the function gets removed, also remove the changes that were made by the function

        maze[r][c] =true;// backtracing
        path[r][c] = 0;
    }
}
