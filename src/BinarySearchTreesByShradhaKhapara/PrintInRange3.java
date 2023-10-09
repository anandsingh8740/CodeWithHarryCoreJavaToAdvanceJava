package BinarySearchTreesByShradhaKhapara;

import java.util.ArrayList;

public class PrintInRange3 {
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

    // PRINT IN RANGE
    public static void printInrange(Node root , int X, int Y){
        if(root == null){
            return;
        }
        if(root.data >= X && root.data <= Y){ // Case 1
            printInrange(root.left, X, Y);  // left subtree
            System.out.print(root.data+" ");
            printInrange(root.right, X, Y);

        } else if (root.data >=Y) {
            printInrange(root.left, X, Y);
        }
        else {
            printInrange(root.right, X, Y);
        }
    }
    public static void printPath(ArrayList<Integer>path){ // hamne abhi tak jitna bhi path track kiya hai
        // sabko ham print karvane ki kosis karege
        for(int i =0; i<path.size(); i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println();
    }
    // ROOT TO LEAF PATHS CODE
    public static void printRoot2Leaf(Node root, ArrayList<Integer>path){
        if(root == null){ // starting me null Node not a leaf
            return;
        }
       path.add(root.data);  // jaise hi kisi bhi node per pahuchege usko ham "path" ke ander add kar lenge

        // jaise hi hame path chal jaye ki ham ak leaf Node per hai
        // leaf Node condition
        if(root.left == null && root.right == null){ // is case me ham print kar denge apne path ko
            printPath(path);  // leaf hai to abhi tak ka pura path print kar denge
        }else{  // for non-leaf Nodes // is case me ham dusare path ko pahle print kar denge
            printRoot2Leaf(root.left, path); // left subtree per ja kar path print karege niche vale me right subtree per jakar path print karege
            printRoot2Leaf(root.right, path);
        }

        path.remove(path.size()-1); // remove kar dege apne node ko apne path se kyoki ham yaha
        // se Backtrack karne vale hai and finally return kar jayege vapash se
        // size()-1 means last index ko remove karate jayege
    }
    public static void main(String[] args) {
        int values[] = {8, 5, 3, 6, 10, 11, 14};
          Node root = null;


        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);  // 3  5 6 8 10 11 14
        System.out.println();
      // insert(root)
        printInrange(root , 6 , 10);  //  6 se lekar 10 tak value print karvana hai o/p :- 6 8 10
        System.out.println();

        printRoot2Leaf(root, new ArrayList<>());
        // Output :-
//        8->5->3->
//        8->5->6->
//        8->10->11->14->
    }
}
