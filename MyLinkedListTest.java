import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyLinkedListTest {
    @Test
    public void DeleteNodeBasedOnValue_SingleNodeList_ShouldDeleteSingleNode(){
        myLinkedList.AddFront("hello");

        
    }

    public void DeleteNodeBasedOnValue_EmptyList_ListShouldRemainEmpty() {
        MyLinkedList<String> myLinkedList = new MyLinkedList<String>();

        myLinkedList.DeleteNodeBasedOnValue("Art");

        assertEquals(1, myLinkedList.GetSize());
        
    }
    
}
