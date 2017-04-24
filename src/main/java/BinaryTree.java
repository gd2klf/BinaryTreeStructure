/**
 * Created by Greg on 4/23/17.
 */
public class BinaryTree<T> {

    private BinaryTreeNode<T> rootTreeNode = null;

    public BinaryTree( T obj ){
        rootTreeNode = new BinaryTreeNode<T>( obj, null, null, null);
    }

    public BinaryTreeNode<T> getRootTreeNode(){
        return rootTreeNode;
    }

    public BinaryTreeNode<T> addRightChild( BinaryTreeNode<T> parentNode, T obj ){
        BinaryTreeNode<T> newRight = new BinaryTreeNode<T>(obj, parentNode );
        parentNode.setRightChild(newRight);
        return newRight;
    }

    public BinaryTreeNode<T> addLeftChild( BinaryTreeNode<T> parentNode, T obj ){
        BinaryTreeNode<T> newLeft = new BinaryTreeNode<T>(obj, parentNode );
        parentNode.setLeftChild(newLeft);
        return newLeft;
    }

    public void preOrderTreeTraversal(BinaryTreeNode<T> currentNode) {
        if (currentNode != null) {
            System.out.print(" " + currentNode.getObj());
            preOrderTreeTraversal(currentNode.getLeftChild());
            preOrderTreeTraversal(currentNode.getRightChild());
        }
    }

    public void inOrderTreeTraversal(BinaryTreeNode<T> currentNode) {
        if (currentNode != null) {
            inOrderTreeTraversal(currentNode.getLeftChild());
            System.out.print(" " + currentNode.getObj());
            inOrderTreeTraversal(currentNode.getRightChild());
        }
    }

    public void postOrderTreeTraversal(BinaryTreeNode<T> currentNode) {
        if (currentNode != null) {
            postOrderTreeTraversal(currentNode.getLeftChild());
            postOrderTreeTraversal(currentNode.getRightChild());
            System.out.print(" " + currentNode.getObj());
        }
    }
}