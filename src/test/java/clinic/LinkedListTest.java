package clinic;


import junit.framework.Assert;
import org.junit.Test;

public class LinkedListTest {
  LinkedList list = new LinkedList();

    @Test
    public void testAdd() throws Exception {
        list.add("first");
        list.add("second");
        list.add("third");
        list.add("fourth");
        list.add("myvalue", 3);
        list.add("fifth");
        list.add("sixth");

        print();
        list.remove(4);
        print();
        Assert.assertEquals(list.get(0), "first");
        Assert.assertEquals(list.get(2), "third");
        Assert.assertEquals(list.get(3), "myvalue");
        Assert.assertEquals(list.get(4), "fifth");

    }

    private void print() throws Exception {
        for (int i = 0 ; i<list.getLength(); i++){
            System.out.print(i + " ");
            System.out.print(list.get(i) + " => ");
        }
        System.out.println();
    }

}
