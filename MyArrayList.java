public class MyArrayList{
    private int[] elements;
    private int size;
    private final int CAPACITY = 10;
    
    public MyArrayList() {
        elements = new int [CAPACITY];
        size = 0;

    }

    public void AddStart(int elementToAdd) {
        EnsureCapacity();
        for(int i = size; i >= 0; i--){
            elements[i + 1] = elements[i];
        }
        elements[0] = elementToAdd;
        size++;
    }

    public void AddEnd(int elementToAdd) {
        EnsureCapacity();
        elements[size] = elementToAdd;
        size++;
    }

    public void AddAtIndex(int elementToAdd, int indexToAddAt){
        if(indexToAddAt > size || indexToAddAt < 0 ) {
            AddEnd(elementToAdd);
        } else{

        EnsureCapacity();

        for(int i = size; i >= indexToAddAt; i--){
            elements[i + 1] = elements[i];
        }
        elements[indexToAddAt] = elementToAdd;
        size++;
        }

    }

    public int GetElementAtIndex(int index) {

        if(index >= size || index < 0 )  {
            return elements[size - 1];
        }
        return elements[index];

    }

    /**
     * Checks capacity of our elemetns array and 
     * increases capacity if there isn't enough space
     */
    private void EnsureCapacity() {
        if(size == elements.length) {
            int[] newElements = new int[elements.length * 2];

            for(int i = 0; i < size; i++) {
                newElements[i] = elements[i];

            }

            elements = newElements;
        }
    } 
    public void Print(){
        for(int i = 0; i < size; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }
}