import java.util.ArrayList;
import java.util.Arrays;

/**
 * Program
 */
public class Program {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<String>();
        myLinkedList.Append("World!");
        myLinkedList.AddFront("Hello");
        myLinkedList.AddFront("This");
        myLinkedList.AddFront("Hi");
        myLinkedList.Append("Dog");
        System.out.println(myLinkedList.GetSize());
        myLinkedList.Insert(1, "Leaf");
        System.out.println(myLinkedList);
        myLinkedList.Append("cat");
        System.out.println(myLinkedList);
        myLinkedList.AddFront("gato");
        System.out.println(myLinkedList);
        myLinkedList.DeleteFront();
        System.out.println(myLinkedList);
        myLinkedList.DeleteBack();
        System.out.println(myLinkedList);
        myLinkedList.DeleteNodeBasedOnValue("Hello");
        System.out.println(myLinkedList);






    }
    }
    
