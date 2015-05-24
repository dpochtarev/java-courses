package clinic;

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
        list.add("5");
        System.out.println(list.toString());
        while (list.hasNext())  {
            if (list.next().equals("3")) list.remove();
        }
        System.out.printf(list.toString());
    }

}