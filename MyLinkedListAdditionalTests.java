import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class MyLinkedListAdditionalTests {

    @Test
    public void DeleteFront_ListIsEmpty_ShouldThrowException() {
        // Arrange
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();

        // Act and Assert
        assertThrows(IndexOutOfBoundsException.class, () -> myLinkedList.DeleteFront());
    }

    @Test
    public void DeleteFront_ListHasMultipleElements_ShouldUpdateHeadAndSize() {
        // Arrange
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        myLinkedList.AddFront(3);
        myLinkedList.AddFront(10);

        // Act
        myLinkedList.DeleteFront();

        // Assert
        assertEquals(1, myLinkedList.GetSize());
        assertEquals(3, (int) myLinkedList.GetHead().data);
    }

    @Test
    public void ReverseTraversal_ListHasMultipleElements_ShouldTraverseInReverseOrder() {
        // Arrange
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        myLinkedList.AddFront(3);
        myLinkedList.AddFront(10);
        myLinkedList.AddFront(7);
        myLinkedList.AddFront(1);

        // Act
        String result = "";
        Node<Integer> current = myLinkedList.GetTail();
        while (current != null) {
            result += current.data + " ";
            current = current.prev;
        }

        // Assert
        assertEquals("3 10 7 1 ", result.trim());
    }

    @Test
    public void DeleteBack_ListIsEmpty_ShouldNotChangeList() {
        // Arrange
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();

        // Act
        myLinkedList.DeleteBack();

        // Assert
        assertNull(myLinkedList.GetHead());
        assertNull(myLinkedList.GetTail());
        assertEquals(0, myLinkedList.GetSize());
    }
}
