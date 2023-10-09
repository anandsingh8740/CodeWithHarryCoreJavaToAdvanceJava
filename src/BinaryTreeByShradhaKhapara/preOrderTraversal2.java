package BinaryTreeByShradhaKhapara;
import java.util.*;
public class preOrderTraversal2 {
    // this maded node class , who will represent single node .
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static  class BinaryTree {
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            // aur ham baki data ke liye new  node banayege
           Node newNode = new Node(nodes[idx]);
            // left subtree of new node
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return  newNode; //it is  rootNode.
        }
    }
    // PRE ORDER TRAVESAL
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    // INORDER TRAVERSAL CODE HERE
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    //PREORDER TRAVERSAL
    public static void postorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.left); //postorder call kar denge apne root ke left ke liye
        postorder(root.right);
        System.out.print(root.data+ " ");
    }

    // LEVEL ORDER TRAVERSAL - O(n)
    public static void levelOrder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);  //  hame sabse pahle queue ke ander add kar dena hai root Node ko
        q.add(null); // aur null ko add kar denge

        while (!q.isEmpty()){
            Node currNode = q.remove();  // curr node ko nikala
            if(currNode == null){    // null means next line
                System.out.println();
                if(q.isEmpty()){ // last node empty to ham break kar jayege mtlb hamne sabhi ko print karva diya hai
                    break; // yani last node null to hamri loop break kar jayegi yani ki hamre sare
                    // node ko print karva diya LevelOrder me
                }else {
                    q.add(null); // agar aise above nahi hai to q me ham add kar denge vapas se null
                    // ko taki next level ke liye bhi next line print ho sake
                }
            }else{
                System.out.print(currNode.data+" "); // null node nahi hai to data ko print karva denge
                if(currNode.left!= null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }

    // COUNT OF NODES
    public static int countOfNodes(Node root){   // O(n)
        if(root == null){  // Base Case  // kisi bhi point per hamari root jab null hojati hai to uscase me return 0 kar dege
            return 0; // kyoki null ke pass count jo hai vo zero(0) ho jata hai
        }
        int leftNodes = countOfNodes(root.left);  // recursion formula
        int rightNodes = countOfNodes(root.right);

        return  leftNodes + rightNodes + 1;
    }

    // SUM OF NODES
    public static int sumOfNodes(Node root){   // O(n)
        if(root == null){
            return 0;
        }
        int leftSum = sumOfNodes(root.left);  // recursion formula
        int rightSum = sumOfNodes(root.right);

        return  leftSum + rightSum + root.data; // yaha root ka data lenge kyoki nodes ke ander vali value print karvani hai
    }

    // HEIGHT OF A TREE  O(n)
    public static int height(Node root){
        if( root== null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int myHeight = Math.max(leftHeight, rightHeight) + 1;

        return myHeight;
    }

    // DIAMETER OF A TREE  Approach 1 : O(n^2)
    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int diam1 = diameter(root.left);  // left tree se maximum kya diameter la sakte hai
        int diam2 = diameter(root.left);  // aur right sub tree se kya diameter la sakte hai
        int diam3 = height(root.left) + height(root.right) +1;  // uper ham ak "height()" name ka function banaye hai
        // (right sub tree ki max height + left sub tree ki max height + 1)
        return Math.max(diam3, Math.max(diam1, diam2));
    }

    // DIAMETER OF A TREE  Approach 2 : O(n)
    static class TreeInfo {
        int ht;
        int diam;

        TreeInfo(int ht , int diam){
            this.ht = ht;
            this.diam = diam;
        }
    }
    public static TreeInfo diameter2(Node root) {// TreeInfo isliye return karege kyoki ye ak sath
    // heigth and diameter return karege  . do return ak sath nahi ho sakta hai isliye ham iska use karege
       if(root == null){
         return  new TreeInfo(0,0);
       }
       TreeInfo left = diameter2(root.left);
       TreeInfo right = diameter2(root.right);

       int myHeight = Math.max(left.ht , right.ht) + 1;  // height

       int diam1 = left.diam;
       int diam2 = right.diam;
       int diam3 = left.ht + right.ht +1;

       int mydiam = Math.max(Math.max(diam1, diam2), diam3); //  diameter calculate ... is Node ke liye ham TreeInfo banayege below

       TreeInfo myInfo = new TreeInfo(myHeight, mydiam);
       return myInfo;
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        preorder(root);  // 1 2 4 5 3 6
        System.out.println();
        inorder(root); // 4 2 5 1 3 6
        System.out.println();
        postorder(root);  // 4 5 2 6 3 1
        System.out.println();
        levelOrder(root); // output
//        1
//        2 3
//        4 5 6

        System.out.println(countOfNodes(root));    // 6
        System.out.println(sumOfNodes(root));     // 21
        System.out.println(height(root));         // 3
        System.out.println(diameter(root));       // 5
        System.out.println(diameter2(root).diam); // 5
    }
}
