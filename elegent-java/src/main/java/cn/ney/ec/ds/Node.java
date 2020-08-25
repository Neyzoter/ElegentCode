package cn.ney.ec.ds;

/**
 * Node
 * @author neyzoter
 */
public interface Node<T> {
    /**
     * get next node
     * @return next node
     */
    Node<T> getNext();

    /**
     * set next node
     * @param n next node
     */
    void setNext(Node<T> n);
}
