package clinic;


import java.util.Arrays;

public class ArrayList implements Iterable{

    private Object list[];
    private int index;
    private Iterator itr;

    ArrayList(){
        list = new Object[10];
        itr = new Iterator();
        index = 0;
    }

    public void add(String value) {
        if (itr.hasNext()) {
            while (itr.hasNext()) {
                if (itr.next() == null) {
                    list[index-1] = value;
                    break;
                }
            }
        } else {
            Object mass[] = new Object[list.length*2];
            System.arraycopy(list, 0, mass, 0, list.length);
            list = mass;
            add(value);
        }

//        if (list[list.length - 1]==null) {
//            for (int i = 0; i < list.length; i++) {
//                if (list[i]==null) {
//                    list[i] = value;
//                    return;
//                }
//            }
//        }   else {
//            Object args[] = new Object[list.length*2];
//            System.arraycopy(list, 0, args, 0, list.length);
//            list = args;
//        }
    }

    public void remove(int indexDelete) {
        index =0;
        while (index!=indexDelete) itr.next();
        itr.remove();
    }


//        Object array[] = new Object[list.length-1];
//        if (index==0) System.arraycopy(list, 1, array, 0, array.length);
//        else {
//            if (index == list.length-1) System.arraycopy(list, 0, array, 0, array.length);
//            else {
//                System.arraycopy(list, 0, array, 0, index);
//                System.arraycopy(list, index+1, array, index, list.length-index);
//            }
//        }
//    }


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
    public java.util.Iterator iterator() {
        return this.itr;
    }

    private class Iterator implements java.util.Iterator {

        @Override
        public boolean hasNext() {
            boolean hasnext;
            hasnext = index < list.length - 1;
            return hasnext;
        }

        @Override
        public Object next() {
            return list[index++];
        }

        @Override
        public void remove() {
            if (index!=list.length){
                Object dest[] = new Object[list.length-1];
                System.arraycopy(list, 0, dest, 0, index);
                System.arraycopy(list, index+1, dest, index, dest.length-index-1);
                list = dest;
                index--;
            } else {
                Object dest[] = new Object[list.length-1];
                System.arraycopy(list, 0, dest, index, index);
                list=dest;
                index--;
            }
        }
    }
}

