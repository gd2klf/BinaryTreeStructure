/**
 * Created by Greg on 4/23/17.
 */
public class BinaryTreeTest {
    public static void main(String[] args) {
        //Create tree for:
        //(a + b * c) + ((d * e + f) * g)
        //0                    +
        //1              +           *
        //2           *     a      +   g
        //3         b   c        *   f
        //4                     d e

        System.out.println("Create tree for: " );
        System.out.println("(a + b * c) + ((d * e + f) * g)");
        System.out.println("Depth 0                    +");
        System.out.println("Depth 1              +           *");
        System.out.println("Depth 2           *     a      +   g");
        System.out.println("Depth 3         b   c        *   f");
        System.out.println("Depth 4                     d e");

        String plus = "+";
        String times = "*";
        String a = "a";
        String b = "b";
        String c = "c";
        String d = "d";
        String e = "e";
        String f = "f";
        String g = "g";

        BinaryTree<String> binTree = new BinaryTree<String>(plus);
        BinaryTreeNode<String> rootNode = binTree.getRootTreeNode();
        BinaryTreeNode<String> level1Node1 = binTree.addLeftChild( rootNode, plus );
        BinaryTreeNode<String> level1Node2 = binTree.addRightChild( rootNode, times );
        BinaryTreeNode<String> level2Node1 = binTree.addLeftChild( level1Node1, times );
        BinaryTreeNode<String> level2Node2 = binTree.addRightChild( level1Node1, a );
        BinaryTreeNode<String> level2Node3 = binTree.addLeftChild( level1Node2, plus );
        BinaryTreeNode<String> level2Node4 = binTree.addRightChild( level1Node2, g );
        BinaryTreeNode<String> level3Node1 = binTree.addLeftChild( level2Node1, b );
        BinaryTreeNode<String> level3Node2 = binTree.addRightChild( level2Node1, c );
        BinaryTreeNode<String> level3Node5 = binTree.addLeftChild( level2Node3, times );
        BinaryTreeNode<String> level3Node6 = binTree.addRightChild( level2Node3, f );
        BinaryTreeNode<String> level4Node5 = binTree.addLeftChild( level3Node5, d );
        BinaryTreeNode<String> level4Node6 = binTree.addRightChild( level3Node5, e );

        System.out.println( "preorder traversal" );
        binTree.preOrderTreeTraversal(rootNode);

        System.out.println( "\n\ninorder traversal" );
        binTree.inOrderTreeTraversal(rootNode);

        System.out.println( "\n\npostorder traversal" );
        binTree.postOrderTreeTraversal(rootNode);

    }
}
