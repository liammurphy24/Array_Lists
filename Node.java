public class Node<T> {
    T data;
    Node<T> next;
    Node<T> prev;

    public Node(T dt) {
        data = dt;
        next = null;
        prev = null;
    }

    public Node(T dt, Node<T> next, Node<T> prev) {
        data = dt;
        this.next = next;
        this.prev = prev;
    }
}