import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JUnitToSubmit {

    @Test
    public void testAdd01(){
        SingleLinkedList<String> sll = new SingleLinkedList<String>();
        sll.add(0, "Two");
        sll.add(0, "One");
        Assertions.assertEquals("[One, Two]", sll.toString());
    }

    @Test
    public void testAdd02(){
        SingleLinkedList<String> sll = new SingleLinkedList<String>();
        for(int i=0; i<10; i++)
        {
            sll.add(i, Integer.toString(i));
        }
        //return sll.toString().equals("[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]");
    }

    @Test
    public void testAdd03(){
        SingleLinkedList myList = new SingleLinkedList();
        myList.add("10");
        myList.add("20");
        myList.add(1, "30");
        Assertions.assertEquals("[10, 20, 30]", myList.toString());
    }

    @Test
    public void testAdd4(){
        SingleLinkedList myList = new SingleLinkedList();
        for(int i=0; i<=10; i++)
            myList.add(i);

        Assertions.assertEquals("[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]", myList.toString());
    }

    @Test
    public void testSize05(){
        SingleLinkedList<String> sll = new SingleLinkedList<String>();

        sll.add(0, "One");

        sll.add(1, "Two");

        sll.add(2, "Four");

        sll.add(2, "Three");

        Assertions.assertEquals(4, sll.size());
    }

    @Test
    public void testGet06(){
        SingleLinkedList myList = new SingleLinkedList();
        myList.add("10");
        myList.add("20");
        Assertions.assertEquals("20", myList.get(1));
    }

    /*@Test
    public void testGet07(){
        SingleLinkedList myList = new SingleLinkedList();
        myList.add("10");
        myList.add("20");
        Assertions.assertEquals("1020", myList.get(0) + myList.get(1));
    }*/

    @Test
    public void testGet08(){
        SingleLinkedList myList = new SingleLinkedList();
        myList.add("10");
        myList.add("20");
        boolean test = false;
        try{
            myList.get(-1);
        }
        catch(Exception e){
            test = true;
        }
        Assertions.assertEquals(true, test);
    }

    @Test
    public void testGet09(){
        SingleLinkedList myList = new SingleLinkedList();
        myList.add("10");
        myList.add("20");
        boolean test = false;
        try{
            myList.get(1);
        }
        catch(Exception e){
            test = true;
        }
        Assertions.assertEquals(false, test);
    }

    @Test
    public void testAdd10(){
        SingleLinkedList myList = new SingleLinkedList();
        myList.add("10");
        myList.add("20");
        boolean test = false;
        try{
            myList.add("30");
        }
        catch(Exception e){
            test = true;
        }
        Assertions.assertEquals(false, test);
    }

    @Test
    public void testRem11(){
        SingleLinkedList myList = new SingleLinkedList();
        myList.add("10");
        myList.remove(0);
        Assertions.assertEquals("[]", myList.toString());
    }

    @Test
    public void testRem12(){
        SingleLinkedList myList = new SingleLinkedList();
        myList.add("10");
        myList.add("20");
        myList.remove(0);
        Assertions.assertEquals("[20]", myList.toString());
    }

    @Test
    public void testRem13(){
        SingleLinkedList myList = new SingleLinkedList();
        myList.add("10");
        myList.add("20");
        boolean test = false;
        try{
            myList.remove(-1);
        }
        catch(Exception e){
            test = true;
        }
        Assertions.assertEquals(true, test);
    }

    @Test
    public void testRem14(){
        SingleLinkedList myList = new SingleLinkedList();
        myList.add("10");
        myList.add("20");
        boolean test = false;
        try{
            myList.remove(1);
        }
        catch(Exception e){
            test = true;
        }
        Assertions.assertEquals(false, test);
    }

    @Test
    public void testSet15(){
        SingleLinkedList myList = new SingleLinkedList();
        myList.add("10");
        myList.set(0, "20");
        Assertions.assertEquals("[20]", myList.toString());
    }

    @Test
    public void testSet16(){
        SingleLinkedList myList = new SingleLinkedList();
        myList.add("10");
        myList.add("20");
        myList.set(1, "30");
        Assertions.assertEquals("[10, 30]", myList.toString());
    }

    @Test
    public void testSet17(){
        SingleLinkedList myList = new SingleLinkedList();
        myList.add("10");
        myList.add("20");
        boolean test = false;
        try{
            myList.set(-1, "filler");
        }
        catch(Exception e){
            test = true;
        }
        Assertions.assertEquals(true, test);
    }

    @Test
    public void testSet18(){
        SingleLinkedList myList = new SingleLinkedList();
        myList.add("10");
        myList.add("20");
        boolean test = false;
        try{
            myList.set(1, "filler");
        }
        catch(Exception e){
            test = true;
        }
        Assertions.assertEquals(false, test);
    }

    @Test
    public void testRem19(){
        SingleLinkedList myList = new SingleLinkedList();
        for(int i=0; i<=10; i++)
            myList.add(i);
        myList.remove(5);
        Assertions.assertEquals("[0, 1, 2, 3, 4, 6, 7, 8, 9, 10]", myList.toString());
    }

    @Test
    public void testSet20(){
        SingleLinkedList myList = new SingleLinkedList();
        for(int i=0; i<=10; i++)
            myList.add(i);
        myList.set(5, 99);
        Assertions.assertEquals("[0, 1, 2, 3, 4, 99, 6, 7, 8, 9, 10]", myList.toString());
    }

}
