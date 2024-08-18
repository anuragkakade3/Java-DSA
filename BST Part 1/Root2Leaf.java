import java.util.ArrayList;

public class Root2Leaf {
  
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
    }
    
    // Searching in BST
    public static boolean search(Node root, int key){
        if(root==null){
            return false;
        }

        if(root.data==key){
            return true;
        }

        if(root.data>key){
            return search(root.left,key);
        }else{
            return search(root.right,key);
        }
    }
    
    // Insertion in BST
    public static Node insert(Node root, int val){
        if(root==null){
            root=new Node(val);
            return root;
        }

        if(root.data> val){
            // left subree
            root.left=insert(root.left, val);
        }else{
            // right subree
            root.right=insert(root.right, val);
        }
        return root;
    }

    public static void printPath(ArrayList<Integer> path){
        for(int i=0; i<path.size(); i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("Null");
    }

    public static void printRoot2Leaf(Node root, ArrayList<Integer> path){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printPath(path);
        }
        printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right, path);
        path.remove(path.size()-1);
    }
    

    // Inorder traversal to check the BST property
    public static void inorder(Node root){
        if(root==null){
            return;
       }
       inorder(root.left);
       System.out.print(root.data+" ");
       inorder(root.right);
    } 

    public static void main(String args[]){
        int values[]={8,5,3,6,10,11,14};
        Node root=null;
        int key=11;

        for(int i=0; i<values.length; i++){
            root=insert(root, values[i]);
        }

        inorder(root);
        System.out.println();
        printRoot2Leaf(root, new ArrayList<>());
    }
    
}
