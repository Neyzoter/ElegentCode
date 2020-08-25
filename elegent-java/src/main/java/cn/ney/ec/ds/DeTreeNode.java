package cn.ney.ec.ds;

/**
 * DeTreeNode
 * @author neyzoter
 */
public class DeTreeNode<T> implements Node<T> {
    private T val;
    private DeTreeNode<T> next;
    private DeTreeNode<T> prev;

    public DeTreeNode(T ti) {
        val = ti;
    }

    public void setVal(T ti) {
        val = ti;
    }

    public T getVal() {
        return val;
    }
    @Override
    public DeTreeNode<T> getNext() {
        return next;
    }

    @Override
    public void setNext(Node<T> dtn) {
        next = (DeTreeNode<T>) dtn;
    }

    public void setPrev(DeTreeNode<T> dtn) {
        prev = dtn;
    }

    public DeTreeNode<T> getPrev() {
        return prev;
    }
}
