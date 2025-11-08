package SegmentTrees;

public class SegmentTree {


    private static class Node{
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        public Node(int startInterval, int endInterval){
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }

    Node root;

    public SegmentTree(int[] arr){
        //create a tree using the array
        this.root = contstructTree(arr,0,arr.length-1);
    }

    private  Node contstructTree(int[] arr,int start,int end){
        if(start == end){
            //leaf node
            Node leaf = new Node(start,end);
            leaf.data = arr[start];
            return leaf;
        }

        Node node = new Node(start,end);

        int mid = (start + end)/2;

        node.left = this.contstructTree(arr,start,mid);
        node.right = this.contstructTree(arr,mid+1,end);

        node.data = node.left.data + node.right.data;
        return node;
    }

    public void display(){
        display(this.root);
    }

    private void display(Node node){
        String str = "";
        if(node.left!= null){
            str = str + "Interval=[" + node.left.startInterval + "-" + node.left.endInterval + "] and data: "+node.left.data + "+ ->";

        }
        else{
            str = str + "No left child";
        }

        str = str + "Interval=[" + node.startInterval + "-" + node.endInterval + "] and data: "+node.data + "+ ->";
        if(node.right!= null){
            str = str + "Interval=[" + node.right.startInterval + "-" + node.right.endInterval + "] and data: "+node.right.data + "+ ->";

        }
        else{
            str = str + "No Right child";
        }

        System.out.println(str);

        if(node.left != null){
            display(node.left);
        }

        if(node.right != null){
            display(node.right);
        }

    }



    //query

    public int query(int st, int ed){
        return this.query(this.root,st,ed);
    }

    private int query(Node node, int st,int ed){
        if(node.startInterval >= st && node.endInterval <= ed){
            return node.data;
        }
        else if(node.startInterval > st || node.endInterval <ed){
            return 0;
        }
        else{
            return this.query(node.left,st,ed) + this.query(node.right,st,ed);
        }
    }


    //tree update function

    public void update(int index,int value){
        this.root.data = update(this.root,index,value);
    }

    private int update(Node node, int index, int value){
        if(index >= node.startInterval && index <= node.endInterval){
            if(index == node.startInterval && index==node.endInterval){
                node.data = value;
                return node.data;
            }
            else{
                int leftAns = update(node.left,index,value);
                int rightAns = update(node.right,index,value);
                node.data = leftAns + rightAns;
                return node.data;
            }
        }

        return node.data;
    }


}
