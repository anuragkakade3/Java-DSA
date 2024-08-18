public class Delete {
    
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

    // Deletion in BST
    public static Node delete(Node root, int val){
        if(root.data< val){
            root.right =delete(root.right, val);
        }
        else if(root.data > val){
            root.left=delete(root.left, val);
        }
        else{ // Voila 
            // Case 1-  leaf node
            if(root.left==null && root.right==null){
                return null;
            }

            // Case 2 - single child
            if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }

            // Case 3 = Both Childern
            Node IS =findInorderSuccessor(root.right);
            root.data=IS.data;
            root.right=delete(root.right, IS.data);

        }
        return root;
    }

    // Finding inorder successor
    public static Node findInorderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
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
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root=null;
        int key=11;

        for(int i=0; i<values.length; i++){
            root=insert(root, values[i]);
        }

        inorder(root);
        System.out.println();
        
        root=delete(root, key);
        System.out.println();

        inorder(root);
    }
    
}
