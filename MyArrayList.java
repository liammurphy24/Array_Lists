public class MyArrayList<T> {
    // Node class to represent elements in the doubly linked list
    private Node<T> head; // Reference to the first node in the list
    private Node<T> tail; // Reference to the last node in the list
    private int size; // Number of elements in the list
    private final int CAPACITY = 10; // Initial capacity of the list

    // Constructor to initialize an empty list
    public MyArrayList() {
        head = null;
        tail = null;
        size = 0;
    }

    // Method to add an element to the beginning of the list
    public void AddStart(T elementToAdd) {
        Node<T> newNode = new Node<>(elementToAdd); // Create a new node with the given element
        if (isEmpty()) {
            // If the list is empty, set the new node as both head and tail
            head = newNode;
            tail = newNode;
        } else {
            // If the list is not empty, adjust references to add the new node at the beginning
            newNode.next = head;
            head.prev = newNode;
            head = newNode; // Update head reference
        }
        size++; // Increment the size of the list
    }

    // Method to add an element to the end of the list
    public void AddEnd(T elementToAdd) {
        Node<T> newNode = new Node<>(elementToAdd); // Create a new node with the given element
        if (isEmpty()) {
            // If the list is empty, set the new node as both head and tail
            head = newNode;
            tail = newNode;
        } else {
            // If the list is not empty, adjust references to add the new node at the end
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode; // Update tail reference
        }
        size++; // Increment the size of the list
    }

    // Method to add an element at a specific index in the list
    public void AddAtIndex(T elementToAdd, int indexToAddAt) {
        if (indexToAddAt > size || indexToAddAt < 0) {
            // If the index is invalid, add the element to the end of the list
            AddEnd(elementToAdd);
        } else if (indexToAddAt == 0) {
            // If the index is 0, add the element to the beginning of the list
            AddStart(elementToAdd);
        } else {
            // Otherwise, add the element at the specified index
            Node<T> newNode = new Node<>(elementToAdd); // Create a new node with the given element
            Node<T> current = getNodeAtIndex(indexToAddAt); // Get the node at the specified index
            Node<T> previous = current.prev; // Get the previous node

            // Adjust references to insert the new node at the specified index
            previous.next = newNode;
            newNode.prev = previous;
            newNode.next = current;
            current.prev = newNode;

            size++; // Increment the size of the list
        }
    }

    // Method to get the element at a specific index in the list
    public T GetElementAtIndex(int index) {
        if (index < 0 || index >= size) {
            // If the index is out of bounds, throw an exception
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds.");
        }
        return getNodeAtIndex(index).data; // Get the element of the node at the specified index
    }

    // Method to get the node at a specific index in the list
    private Node<T> getNodeAtIndex(int index) {
        Node<T> current = head; // Start from the head of the list
        for (int i = 0; i < index; i++) {
            current = current.next; // Move to the next node until reaching the specified index
        }
        return current; // Return the node at the specified index
    }

    // Method to check if the list is empty
    private boolean isEmpty() {
        return size == 0; // Return true if the size is 0, indicating an empty list
    }

    public Object Size() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Size'");
    }

    // Other methods like DeleteAtStart, DeleteAtEnd, DeleteAtIndex, ClearAll,
    // IsEmpty, Size, and Print remain unchanged
}
