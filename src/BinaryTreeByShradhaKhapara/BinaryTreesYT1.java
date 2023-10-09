package BinaryTreeByShradhaKhapara;

public class BinaryTreesYT1 {
       // this maded node class , who will represent single node .
        static class Node{
            int data;
            Node left;
            Node right;

            Node(int data){  // Constructor in which store our data
                this.data = data;  //
                this.left = null; // in starting left child will null.
                this.right = null; //in starting right child will null.
            }
        }
        static  class BinaryTree {
            static int idx = -1;  // isse ke through ham travell karvate hai........isko ham increment kar kar ke puri length tak lekar ja sake
            public static Node buildTree(int nodes[]){
                idx++;  // pahli bar me update hoga to ye -1 se 0 hojayega ..To 0th index yani,
                // root ko ham sabse pahle create kar lege
                if(nodes[idx] == -1){
                    return null;  // leaf noda ka na to left child hota hai na hi right child hota hai to ham null return kar dege
                }
                // aur ham baki data ke liye new  node banayege
                Node newNode = new Node(nodes[idx]);
                // left subtree of new node
                newNode.left = buildTree(nodes);
                newNode.right = buildTree(nodes);

                return  newNode; //it is  rootNode.
            }
        }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);  // 1
    }
}
