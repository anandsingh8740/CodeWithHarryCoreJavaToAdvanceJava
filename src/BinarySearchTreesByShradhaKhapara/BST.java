package BinarySearchTreesByShradhaKhapara;

public class BST {
    // sabse pahle apna Node structure define karege apne BST ka
    static  class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
           this.data = data;
        }
    }

    // ye function jo bhi hame root di jayegi aur jo bhi key ya jo bhi node hame diya jayega usko ham
    // apne BST ke ander "insert" kar denge
    public static Node insert(Node root, int val){ // "val/key jo bhi data hame return karna hai "
        // iska return type ham node isliye rakhe hai taki ham
        // ise recursivally insert karege values ko

        // 1st compression ka
        if(root == null){
            root = new Node(val);  // yaha hamne root ko bana diya hai new Node ke equal
            return root;
        }
        if(root.data > val){
            // left subtree ke ander insert karna hai
             root.left = insert(root.left, val);
        }
        else{
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static void inorder(Node root){  // isse ham check kar lenge ki hamara tree sahi build hua hai
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        int values[] = {5,1,3,4,2,7};
        Node root = null;

        for (int i=0; i<values.length; i++){
            root = insert(root, values[i]); // ye insert fun tree ke ander changes kar dega har bar aur
            // aur final root hame lakar dedega ..us final root ko ham apne root = ke ander insert kar
            // denge...phir varify kaise kare ki tree hamara sahi build hua hai usko liye ham inorderd kar denge tree ka
        }
        inorder(root);  // 1 2 3 4 5 7
        System.out.println();
    }
}
