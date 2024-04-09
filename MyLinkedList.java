
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

            if(head == null){
                // Node<T> newNode = new Node<T>(data);
                // size++;
                // head = newNode;
                AddFront(data);

            }
            Node<T> currentNode = head;

            while(currentNode != null) {
                currentNode = currentNode.next;
                size++;
            }
            Node<T> newnNode = new Node<T>(data);
            
        }

        public void Insert (int index, T data) {
            Node<T> currentNode = head;
            int currentIndex = 0;

            for(int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }

            Node<T> newNode = new Node<T>(data, currentNode.next);
            currentNode.next = newNode;

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

    public void DeleteFront() {
        head = head.next;

        
    }

    public void DeleteBack() {
        Node<T> currentNode = head;

        while (currentNode.next != null) {
            currentNode = currentNode.next;            
        }
        //System.out.println(currentNode.data);
        currentNode.next = null;

    }

    public void DeleteNodeBasedOnValue(T data){
        Node<T> currentNode = head;

        if(currentNode.data == data) {
            DeleteFront();
            return;
        }

        while (currentNode.next.data != data) {
            currentNode = currentNode.next;
            
        }

        //System.out.println(currentNode.data);
        currentNode.next = currentNode.next.next;


    }

    public int GetSize() {
        return size;
    }

    public boolean IsEmpty() {
        return head == null;
    }
    }

