import java.util.ArrayList;
import java.util.Arrays;

/**
 * Program
 */
public class Program {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<String>();
        myLinkedList.AddFront("World!");
        myLinkedList.AddFront("Hello");
        myLinkedList.AddFront("This is me");
        myLinkedList.AddFront("Hi");
        myLinkedList.Append("I like dogs.");
        System.out.println(myLinkedList);

    }
    }
    
