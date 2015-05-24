package clinic;


import java.util.Arrays;
import java.util.Iterator;

public class ArrayList implements Iterator{

    private Object list[];
    private int index=0;


    ArrayList(){

        list = new Object[10];

    }

    public void add(String value) {
        if (list[list.length - 1]==null) {
            for (int i = 0; i < list.length; i++) {
                if (list[i]==null) {
                    list[i] = value;
                    return;
                }
            }
        }   else {
            Object args[] = new Object[list.length*2];
            System.arraycopy(list, 0, args, 0, list.length);
            list = args;
        }
    }
    public Object get(int index) {
        return list[index];
    }

    @Override
    public String toString() {
        return "ArrayList{" +
                "list=" + Arrays.toString(list) +
                '}';
    }

    @Override
    public boolean hasNext() {
        boolean hasnext;
        if (index < list.length - 1) hasnext = true;
        else {
            hasnext = false;
            index = 0;
        }
        return hasnext;
    }

    @Override
    public Object next() {
        return list[index++];
    }

    @Override
    public void remove() {
        Object array[] = new Object[list.length-1];
        if (index==0) System.arraycopy(list, 1, array, 0, array.length);
        else {
            if (index == list.length-1) System.arraycopy(list, 0, array, 0, array.length);
            else {
                System.arraycopy(list, 0, array, 0, index);
                System.arraycopy(list, index+1, array, index, list.length-index);
            }
        }
        list = array;
    }
}
