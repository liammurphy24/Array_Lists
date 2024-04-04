
public class MyLinkedList<T> {
    Node<T> head = null;
    private int size = 0;

    public void AddFront(T data) {
        Node<T> newNode = new Node<T>(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

        }

        public void Append(T data){
            Node<T> currentNode = head;

            while(currentNode != null) {
                currentNode = currentNode.next;
                size++;
            }
        }

        public void Insert (int index) {
            Node<T> currentNode = head;
            int currentIndex = 0;
            for(int i = 0; i <index; i++) {

            }
        }

    @Override
    public String toString() {
        Node<T> currentNode = head;
        String returnString= "";

        while(currentNode != null) {
        returnString += " " + currentNode.data.toString();
        currentNode = currentNode.next;
        }
        return returnString;
    }

    public int GetSize() {
        return size;
    }
    }

