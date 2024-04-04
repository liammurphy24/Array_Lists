import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MyArrayListTest {
    @Test
    public void AddStart_Add_ArrayListToContainAddedElements() {
        MyArrayList<Integer> myArrayList = new MyArrayList<Integer>();
        myArrayList.AddStart(20);
        myArrayList.AddStart(18);
        myArrayList.AddStart(69);
        assertEquals(myArrayList.Size(), 4);
        assertEquals(myArrayList.GetElementAtIndex(0), 1);
    }
}
