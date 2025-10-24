package Recursion09;

public class MazeAndObstacles {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true,true,true},
                {true,false,true},
                {true,true,true}

        };
        Maze("",maze,0,0);

    }

    static void Maze(String p,boolean[][] maze,int r,int c){
        if(r == maze.length-1 && c == maze[0].length -1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }

        if(r < maze.length-1){
            Maze(p + "D",maze,r+1,c);
        }
        if(c < maze[0].length-1){
            Maze(p+"R",maze,r,c+1);
        }

    }
}
