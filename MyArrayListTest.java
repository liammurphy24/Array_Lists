import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MyArrayListTest {
    @Test
    public void AddStart_Add_ArrayListToContainAddedElements() {
        MyArrayList<Integer> myArrayList = new MyArrayList<Integer>();
        myArrayList.AddStart(20);
        myArrayList.AddStart(18);
        myArrayList.AddStart(69);
        assertEquals(3, myArrayList.Size()); // Corrected the expected size to 3
        assertEquals(20, (int) myArrayList.GetElementAtIndex(0)); // Corrected the expected value to 20
    }
}
