package BinarySearchTreesByShradhaKhapara;

public class SearchaBST {
    static  class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val){


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

    // SEARCH A BINARY SEARCH TREE
    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data > key) {  // Left subtree
            return search(root.left, key);  // jo bhi value hamara left subtree return kar dega usi
            // ko directly root return karne vala hai
        } else if (root.data == key) {
            return true;
        } else {
            return search(root.right, key);    //Right subtree
        }
    }

    // DELETE A NODE
    public static Node delete(Node root, int val) {            // kyoki har level per ham apni hi Node return karne vale hai jo
        // bhi changes honge jab bhi ham Node ko return kar dete hai, root ko return kar dete hai to jo
        // bhi changes hote hai vo reflect karne lag jate hai

        // first search karna hai jis node ko hame delete karna hai
        if(root.data > val){
            root.left = delete(root.left, val);  // delete se delete hone ke bad jo value bachegi use
            // ham root.left me store kar denge
        } else if (root.data < val) {
            root.right = delete(root.right, val);
        }
        else{ // root.data == val;   // ye vo case hai jisme jis Node ko hame delete karna hai ,
            // means ye vo vala case hai ki ham us node tak pahuch gaye jisko hame delete karna hai
            // Case 1    Na hamara left Node hai Na hamara Right Node hai means ham ak leaf Node hai
            if(root.left == null && root.right == null){
                return null;
            }

            // Case 2   kya root ka left Null hai agar null hai to root ka right exist kar raha hai
            if(root.left == null){
                return root.right;
            } else if (root.right == null) {
                return root.left;

            }
             // case 3 .. sabse pahle inorder successor ko find out karna padega ..yani left most Node
             //  in are right sub tree
            Node IS = inorderSuccessor(root.right); // inorderSuccessor ko dhudh liye root ke right se
             root.data = IS.data; // now root ke data ko ham update kar denge inorderSuccessor ke data se
             root.right = delete(root.right, IS.data); // delete kar diya inorderSuccessor ko root ke right
            // subtree se ... root ke right subtree ko update kar diya
        }
        return root; // finally return kar diya root ko
    }
    public static Node inorderSuccessor(Node root){ // inorderSuccessor dhudhane vala function hai
        // ham ak loop chala lege loop ham tab tak chahala lege jab tak left most child nahi mil jata
        while (root.left !=null){
            root = root.left;  // update karte rahege ham
        }
        // jaise hi root ka left null hojayega ..aur ham yaha se return kar dege root ki value ko
        return root;     // to ye ban jayega inorderSuccessor
    }
    public static void main(String[] args) {
        // int values[] = {5,1,3,4,2,7};
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);  // 1 3 4 5 6 8 10 11 14
        System.out.println();

        if (search(root, 1)) {
            System.out.println("found");  // found
        } else {
            System.out.println("Not found"); // on 7  -> Not found
        }
//        delete(root,4);  // four(4) will delete.
//        inorder(root);  // 1 3 5 6 8 10 11 14
        delete(root,5);  // four(4) will delete.
        inorder(root);  // 1 3 4 6 8 10 11 14
    }
}

