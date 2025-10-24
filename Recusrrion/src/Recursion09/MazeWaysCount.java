package Recursion09;

import java.util.ArrayList;

public class MazeWaysCount {
    public static void main(String[] args) {
        // 3 x 3 grid start and end are fixed
//        System.out.println(findCount(3,3));
//        path("",3,3);
//        System.out.println(pathList("",3,3));
        System.out.println(pathListDiagonal("",3,3));


    }

    static int findCount(int r,int c){
        if(r==1 || c==1){
            return 1;
        }

        int right = findCount(r,c-1);
        int down = findCount(r-1,c);

        return right + down;
    }

    static void path(String p, int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }

        if(r>1){
            path(p + "D",r-1,c);
        }

        if(c>1){
            path(p + "R",r,c-1);
        }
    }

    static ArrayList<String> pathList(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if(r>1){
            list.addAll(pathList(p + "D",r-1,c));
        }

        if(c>1){
           list.addAll(pathList(p + "R",r,c-1));
        }

        return list;
    }

    //including diagonal path

    static ArrayList<String> pathListDiagonal(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if(c>1 && r>1){
            list.addAll(pathListDiagonal(p + "x",r-1,c-1));
        }
        if(r>1){
            list.addAll(pathListDiagonal(p + "D",r-1,c));
        }

        if(c>1){
            list.addAll(pathListDiagonal(p + "R",r,c-1));
        }



        return list;
    }
}
