package Backtracking;
//this is the problem with recursion that is why we need backtracking this is a never ending
public class AllPaths {

    public static void main(String[] args) {
        boolean[][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };

        allPath("",board,0,0);

    }

    static void allPath(String p,boolean[][] maze, int r, int c) {
        if (r == maze.length-1 && c == maze[0].length-1) {
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;}
        // i am considering this block as my path
        maze[r][c] =false;

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

        maze[r][c] =true;
    }
}
