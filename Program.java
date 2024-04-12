import java.util.ArrayList;
import java.util.Arrays;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<String>();
        myLinkedList.Append("World!");
        // Add a new Node here
        myLinkedList.Append("Hello");
        myLinkedList.Append("This");
        myLinkedList.Append("Hi");
        myLinkedList.Append("Dog");
        System.out.println(myLinkedList.GetSize());
        System.out.println(myLinkedList);
        myLinkedList.Insert(1, "Leaf");
        System.out.println(myLinkedList);
        myLinkedList.DeleteFront();
        System.out.println(myLinkedList);
        myLinkedList.Append("Cat");
        System.out.println(myLinkedList);
        myLinkedList.AddFront("Gato");
        System.out.println(myLinkedList);
        myLinkedList.DeleteBack();
        System.out.println(myLinkedList);
        myLinkedList.DeleteNodeBasedOnValue("Hello");
        System.out.println(myLinkedList);
        System.out.println("Head" + myLinkedList.GetHead().data);
        System.out.println("Tail" + myLinkedList.GetTail().data);

    }
    
}