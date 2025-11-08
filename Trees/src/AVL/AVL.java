package AVL;
//used BST class for methods
//making self balancing tree AVL
public class AVL {
    public class Node{
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value){
            this.value = value;
        }
        public int getValue(){
            return value;
        }
    }

    private Node root;

    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }



    public boolean isEmpty(){
        return root==null;
    }

    public void display(){
        display(root,"Root Node: ");
    }
    private void display(Node node,String details){
        if(node==null){
            return;
        }
        System.out.println(details + node.getValue());
        display(node.left,"Left child of "+node.getValue() + " : ");
        display(node.right,"Right child of "+node.getValue() + " : ");
    }

    //insertion in bst
    public void populate(int [] arr){
        for(int i=0;i<arr.length;i++){
            insert(arr[i]);
        }

    }

    //inserting an sorted arr
    public void populateSorted(int[] nums){
        populateSorted(nums,0,nums.length);
    }

    private void populateSorted(int[] nums,int start,int end){
        if(start>=end){
            return;
        }

        int mid = (start + end)/2;

        this.insert(nums[mid]);
        populateSorted(nums,start,mid);
        populateSorted(nums,mid+1,end);
    }



    public void insert(int value){
        root = insert(value,root);
    }

    private Node insert(int value,Node node){

        if(node == null){
            return new Node(value);
        }
        if(value < node.value){
            node.left = insert(value,node.left);
        }
        if(value > node.value){
            node.right = insert(value,node.right);
        }
        node.height = Math.max(height(node.left),height(node.right)) + 1;
        //rotate function to balance
        return rotate(node);
    }

    //rotate method
    private Node rotate(Node node){
        if(height(node.left) - height(node.right)>1){
            //left heavy
            if(height(node.left.left) - height(node.left.right)>0){
                // left - left case
                return rightRotate(node);
            }
            if(height(node.left.left) - height(node.left.right)<0){
                // left - Right case
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }

        }

        if(height(node.left) - height(node.right)<-1){
            //right heavy
            if(height(node.right.left) - height(node.right.right)<0){
                // right - right case
                return leftRotate(node);
            }
            if(height(node.right.left) - height(node.right.right)>0){
                // right - left case
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }

        }
        return node;
    }
    //right rotation by the diagram
    public Node rightRotate(Node p){
        Node c = p.left;
        Node t = c.right;
        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left),height(p.right)+1);
        c.height = Math.max(height(c.left),height(c.right)+1);
        return c;
    }

    //left rotation br the diagram
    public Node leftRotate(Node c){
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;
        p.height = Math.max(height(p.left),height(p.right)+1);
        c.height = Math.max(height(c.left),height(c.right)+1);
        return p;
    }


    public boolean balanced(){
        return balanced(root);
    }

    private boolean balanced(Node node){
        if(node == null){
            return true;
        }

        return Math.abs(height(node.left) - height(node.right)) <=1 && balanced(node.left) && balanced(node.right);
    }

}
