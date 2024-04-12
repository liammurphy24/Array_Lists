import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class MyLinkedListTest {

    @Test
    public void AddFront_SingleNode_ShouldUpdateHeadAndTail() {
        // Arrange
        MyLinkedList<String> myLinkedList = new MyLinkedList<String>();

        // Act
        myLinkedList.AddFront("Hello");

        // Assert
        assertEquals(myLinkedList.GetHead(), myLinkedList.GetTail());
    }

    @Test
    public void AddFront_MultipleNodes_ShouldUpdateHeadAndTail() {
        // Arrange
        MyLinkedList<String> myLinkedList = new MyLinkedList<String>();

        // Act
        myLinkedList.AddFront("Hello");
        myLinkedList.AddFront("Art");

        // Assert
        assertNotEquals(myLinkedList.GetHead(), myLinkedList.GetTail());
        assertEquals(myLinkedList.GetHead().data, "Art");
        assertEquals(myLinkedList.GetTail().data, "Hello");
    }

    @Test
    public void Append_SingleNode_ShouldUpdateTail() {
        // Arrange
        MyLinkedList<String> myLinkedList = new MyLinkedList<String>();

        // Act
        myLinkedList.Append("Hello");

        // Assert
        assertEquals(myLinkedList.GetHead(), myLinkedList.GetTail());
        assertEquals(1, myLinkedList.GetSize());
    }

    @Test
    public void Append_MultipleNodes_ShouldUpdateTail() {
        // Arrange
        MyLinkedList<String> myLinkedList = new MyLinkedList<String>();

        // Act
        myLinkedList.Append("Hello");
        myLinkedList.Append("Art");
        myLinkedList.Append("Gato");
        myLinkedList.Append("Apple");

        // Assert
        assertNotEquals(myLinkedList.GetHead(), myLinkedList.GetTail());
        assertEquals("Hello", myLinkedList.GetHead().data);
        assertEquals("Apple", myLinkedList.GetTail().data);
        assertEquals(4, myLinkedList.GetSize());
    }

    // @Test
    // public void Insert_InvalidIndex_ShouldThrowException() {
    //     // Arrange
    //     MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();

    //     // Act and Assert
    //     assertThrows(NullPointerException.class, () -> myLinkedList.Insert(-1, 2));
    // }

    @Test
    public void Insert_InvalidIndex_ShouldLeaveListUnchanged() {
        // Arrange
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        myLinkedList.AddFront(3);

        // Act
        myLinkedList.Insert(-1, 2);

        // Assert
        assertEquals(1, myLinkedList.GetSize());

    }

    @Test
    public void Insert_InvalidIndexEqualsSize_ShouldLeaveListUnchanged() {
        // Arrange
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        myLinkedList.AddFront(3);

        // Act
        myLinkedList.Insert(4, 2);

        // Assert
        assertEquals(1, myLinkedList.GetSize());

    }

    @Test
    public void DeleteFront_ListHadOneElement_ShouldUpdateHeadAndTailToNull() {
        // Arrange
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        myLinkedList.AddFront(3);

        // Act
        myLinkedList.DeleteFront();

        // Assert
        assertEquals(0, myLinkedList.GetSize());
        assertEquals(null, myLinkedList.GetTail());
        assertEquals(null, myLinkedList.GetHead());
    }

    @Test
    public void DeleteBack_ListHasMultipleElements__ShouldUpdateTail() {
        // Arrange
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        myLinkedList.AddFront(3);
        myLinkedList.AddFront(10);
        myLinkedList.AddFront(1);
        myLinkedList.AddFront(4);

        // Act
        myLinkedList.DeleteBack();
        Integer iInteger = Integer.valueOf(10);

        // Assert
        assertEquals(iInteger, myLinkedList.GetTail().data);
        assertEquals(null, myLinkedList.GetTail().next);
    }

    @Test
    public void DeleteNodeBasedOnValue_ElementIsLastInList_ShouldDeleteElement() {
        // Arrange
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        myLinkedList.AddFront(3);
        myLinkedList.AddFront(10);
        myLinkedList.AddFront(1); 
        myLinkedList.AddFront(4);

        // Act
        myLinkedList.DeleteNodeBasedOnValue(3);
        Integer iInteger = Integer.valueOf(10);


        assertEquals(3, myLinkedList.GetSize());

        // Assert
        assertEquals(iInteger, myLinkedList.GetTail().data);
        assertEquals(null, myLinkedList.GetTail().next);
        
    }

    @Test
    public void Insert_IntoLastPosition_ShouldUpdateTail() {
        // Arrange
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        myLinkedList.AddFront(3);
        myLinkedList.AddFront(3);

        // Act
        myLinkedList.Insert(2, 4);
        Integer iInteger = Integer.valueOf(4);

        // Assert
        assertEquals(3, myLinkedList.GetSize());
        assertEquals(iInteger, myLinkedList.GetTail().data);
    }
    

    @Test
    public void DeleteNodeBasedOnValue_EmptyList_ListShouldRemainEmpty() {
        // Arrange-Act-Assert

        // Arrange
        MyLinkedList<String> myLinkedList = new MyLinkedList<String>();

        // Act
        myLinkedList.DeleteNodeBasedOnValue("Art");

        // Assert
        assertEquals(myLinkedList.GetSize(), 0);
    }

    @Test
    public void DeleteNodeBasedOnValue_SingleNodeList_ShouldDeleteSingleNode() {
        // Arrange-Act-Assert

        // Arrange
        MyLinkedList<String> myLinkedList = new MyLinkedList<String>();
        myLinkedList.AddFront("Hello");

        // Act
        myLinkedList.DeleteNodeBasedOnValue("Hello");

        // Assert
        assertEquals(0, myLinkedList.GetSize());
        assertEquals(true, myLinkedList.isEmpty());
    }

    @Test
    public void DeleteNodeBasedOnValue_ElementNotInList_ShouldNotChangeList() {
        // Arrange-Act-Assert

        // Arrange
        MyLinkedList<String> myLinkedList = new MyLinkedList<String>();
        myLinkedList.AddFront("Hello");

        // Act
        myLinkedList.DeleteNodeBasedOnValue("Art");

        // Assert
        assertEquals(1, myLinkedList.GetSize());
    }

    @Test
    public void DeleteNodeBasedOnValue_ElementNotInListAndListContainsMultipleValues_ShouldNotChangeList() {
        // Arrange-Act-Assert

        // Arrange
        MyLinkedList<String> myLinkedList = new MyLinkedList<String>();
        myLinkedList.AddFront("Hello");
        myLinkedList.AddFront("Hi");
        myLinkedList.AddFront("Gato");

        // Act
        myLinkedList.DeleteNodeBasedOnValue("Art");

        // Assert
        assertEquals(3, myLinkedList.GetSize());
    }
}