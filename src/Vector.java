public class Vector<T> {

    private int size;
    private int capacity;
    private T[] arr;

    public Vector(T type){
        arr = (T[])new Object[10];
    }

    public int getSize(){
        return size;
    }
    public int getCapacity(){
        return capacity;
    }
    public void setSize(int size){
        this.size = size;
    }
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public void expand(){
        int newCapacity = capacity *2;
        capacity = newCapacity;
        T[] newArr = (T[]) new Object[newCapacity];
        for(int i = 0; i < arr.length; i++){
            newArr[i] = arr[i];

        }
        arr = newArr;
    }

}
