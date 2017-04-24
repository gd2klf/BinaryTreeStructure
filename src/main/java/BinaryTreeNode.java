/**
 * Created by Greg on 4/23/17.
 */
public class BinaryTreeNode<T> {
    private BinaryTreeNode<T> parent = null;
    private BinaryTreeNode<T> rightChild = null;
    private BinaryTreeNode<T> leftChild = null;
    T obj = null;
    public BinaryTreeNode( T nodeObj, BinaryTreeNode<T> parentNode){
        setVars( nodeObj, parentNode, null, null);
    }

    public BinaryTreeNode( T nodeObj,  BinaryTreeNode parentNode, BinaryTreeNode<T> rightChildNode, BinaryTreeNode<T> leftChildNode){
        setVars( nodeObj, parentNode, rightChildNode, leftChildNode);
    }
    private void setVars( T nodeObj,  BinaryTreeNode<T> parentNode, BinaryTreeNode<T> rightChildNode, BinaryTreeNode<T> leftChildNode){
        obj = nodeObj;
        parent = parentNode;
        rightChild = rightChildNode;
        leftChild = leftChildNode;
    }

    public void setParent( BinaryTreeNode<T> parentNode ){
        parent = parentNode;
    }
    public BinaryTreeNode<T> getParent(){
        return parent;
    }

    public void setLeftChild( BinaryTreeNode<T> leftChildNode ){
        leftChild = leftChildNode;
    }
    public BinaryTreeNode<T> getLeftChild(){
        return leftChild;
    }

    public void setRightChild( BinaryTreeNode<T> rightChildNode ){
        rightChild = rightChildNode;
    }
    public BinaryTreeNode<T> getRightChild(){
        return rightChild;
    }

    public void setObj( T nodeObj ){
        obj = nodeObj;
    }
    public T  getObj(){
        return obj;
    }

}
