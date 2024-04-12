public class MyLinkedList<T> {
    private Node<T> head = null, tail = null;
    private int size = 0;

    /**
     * Getter for the start or head of the list
     * @return
     */
    public Node<T> GetHead() {
        return head;
    }

    /**
     * Getter for the end or tail of the list
     * @return
     */
    public Node<T> GetTail() {
        return tail;
    }

    public void AddFront(T data) {
        Node<T> newNode = new Node<T>(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    /**
     * Adds a new node to the end of the LinkedList
     */
    public void Append(T data) {

        if (head == null) {
            // Node<T> newNode = new Node<T>(data); // create the new node and ensure it's next is null
            // size++;
            // head = newNode;
            AddFront(data);
            return;
        }

        // Node<T> currentNode = head;

        // while (currentNode.next != null) {
        //     currentNode = currentNode.next;
        // }

        // once we have our current last node
        Node<T> newNode = new Node<T>(data); // create the new node and ensure it's next is null
        tail.next = newNode; // set the next of the old last node equal to the new node
        tail = newNode;
        size++;
    }
    
    // 1
    public void Insert(int index, T data) {

        // we know they are asking to insert at the last element
        if (index == size) {
            Append(data);
        }
    
        if (index < 0 || index > size - 1) {
            return;
        }
    
        Node<T> currentNode = head;
    
        // go to the element prior to where we want to insert our element
        for (int i = 0; i < index - 1; i++) {
            currentNode = currentNode.next;
        }
        
        Node<T> newNode = new Node<T>(data, currentNode.next, currentNode.next.prev);
        currentNode.next = newNode;
    }
    
    
    public void remove(int indexToRemove) {
        if (indexToRemove < 0 || indexToRemove >= size) {
            throw new IndexOutOfBoundsException("Index " + indexToRemove + " is out of bounds.");
        }

        if (size == 1) {
            // If there is only one node in the list, set head and tail to null
            head = null;
            tail = null;
        } else if (indexToRemove == 0) {
            // If removing the first node, adjust head and the next link of the new head
            head = head.next;
            head.prev = null;
        } else if (indexToRemove == size - 1) {
            // If removing the last node, adjust tail and the previous link of the new tail
            tail = tail.prev;
            tail.next = null;
        } else {
            // If removing a node in between, adjust the previous and next links of adjacent nodes
            Node<T> nodeToRemove = getNodeAtIndex(indexToRemove);
            Node<T> previousNode = nodeToRemove.prev;
            Node<T> nextNode = nodeToRemove.next;
            previousNode.next = nextNode;
            nextNode.prev = previousNode;
        }
        size--; // Decrement the size of the list
    }

    private Node<T> getNodeAtIndex(int indexToRemove) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNodeAtIndex'");
    }

    public void traverseReverse() {
        Node<T> currentNode = tail; // Start from the tail
        while (currentNode != null) {
            System.out.print(currentNode.data + " "); // Print the data of the current node
            currentNode = currentNode.prev; // Move to the previous node
        }
        System.out.println(); // Print a newline after traversing the list
    }

    @Override
    public String toString() {
        Node<T> currentNode = head;
        String returnString = "";

        while (currentNode != null) {
            returnString += " " + currentNode.data.toString();
            currentNode = currentNode.next;
        }

        return returnString;
    }

    public void DeleteFront() {

        if (head == tail) {
            tail = null;
        }

        head = head.next;
        size--;
    }
    
    public void DeleteBack() {
        Node<T> currentNode = head;

        while (currentNode.next.next != null) {
            currentNode = currentNode.next;
        }
        //System.out.println(currentNode.data);
        currentNode.next = null;
        tail = currentNode;
        size--;
    }

    /**
     * This will find the first instance of matching data and delete it
     * @param data the data of type T whose node we want to delete
     */
    public void DeleteNodeBasedOnValue(T data) {
        
        if (head == null) {
            return;
        }
        
        Node<T> currentNode = head;

        if (currentNode.data == data) {
            DeleteFront();
            return;
        }

        if (currentNode.next == null)
            return;

        while (currentNode.next.data != data) {
            currentNode = currentNode.next;
            if (currentNode.next == null)
                return;
        }
        
        //System.out.println(currentNode.data);
        currentNode.next = currentNode.next.next;
        if (currentNode.next == null) {
            tail = currentNode;
        }
        size--;
    }
    
    public int GetSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }
}