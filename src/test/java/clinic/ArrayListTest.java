package clinic;

import org.junit.Assert;
import org.junit.Test;

public class ArrayListTest {

    @Test
    public void testAdd() throws Exception {

        ArrayList list = new ArrayList();
//        for (int i = 0; i < 12 ; i++) {
//            System.out.println(i + "Итерация");
//            list.add(String.valueOf(i));
//        }
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("19");
        list.add("6");
        list.add("6");
        list.add("6");
        list.add("6");
        list.add("6");
        list.add("9");
        list.add("6");
        list.remove(3);
        Assert.assertEquals(list.get(3), "19");
    }

}