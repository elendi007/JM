package level.jbc.one;

public class StudentList <E> {

    private int length = 0;
    private Object [] objectArray = new Object[length];


    public <E> void add(E element){
        length++;
        Object[] extendedArray = new Object[length];
        extendedArray[length -1] = element;
        System.arraycopy(objectArray, 0, extendedArray, 0, objectArray.length);
        objectArray = extendedArray;
    }

    public <E> Object get(int index){
        return objectArray[index];
    }
}
