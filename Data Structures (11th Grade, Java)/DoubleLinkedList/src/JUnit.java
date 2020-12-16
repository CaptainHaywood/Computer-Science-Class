import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JUnit {

    @Test
    public void testAdd01(){
        DoubleLinkedList<String> sll = new DoubleLinkedList<String>();
        sll.add(0, "Two");
        sll.add(0, "One");
        Assertions.assertEquals("[One, Two]", sll.toString());
    }

    @Test
    public void testAdd02(){
        DoubleLinkedList<String> sll = new DoubleLinkedList<String>();
        for(int i=0; i<10; i++)
        {
            sll.add(i, Integer.toString(i));
        }
        Assertions.assertEquals("[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]", sll.toString());
    }

    @Test
    public void testAdd03(){
        DoubleLinkedList<String> sll = new DoubleLinkedList<String>();
        sll.add(0, "One");
        sll.add(1, "Two");
        sll.add(2, "Four");
        sll.add(2, "Three");
        sll.add(0, "One");
        Assertions.assertEquals("[One, One, Two, Three, Four]", sll.toString());
    }

    @Test
    public void testAdd4(){
        DoubleLinkedList<String> sll = new DoubleLinkedList<String>();
        sll.add(0, "One");
        sll.add(1, "Two");
        boolean ans = false;
        try
        {
            sll.add(3, "Three");
        }
        catch (IndexOutOfBoundsException e)
        {
            ans = true;
        }
        Assertions.assertEquals(true, ans);
    }

    @Test
    public void testAdd7(){
        DoubleLinkedList<String> sll = new DoubleLinkedList<String>();
        sll.add("1");
        sll.add("2");
        sll.add(0, "5");
        sll.add(3, "8");
        sll.add("22");
        sll.add(2, "33");
        Assertions.assertEquals("[5, 1, 33, 2, 8, 22]", sll.toString());
    }

    @Test
    public void testSize1(){
        DoubleLinkedList<String> sll = new DoubleLinkedList<String>();

        sll.add(0, "One");

        sll.add(1, "Two");

        sll.add(2, "Four");

        sll.add(2, "Three");

        Assertions.assertEquals(4, sll.size());
    }

    /*@Test
    public void testMixed(){
        DLL_GH<String> sll = new DLL_GH<String>();
        sll.add("One");
        sll.add(1, "Two");
        sll.remove(0);
        sll.set(0, "2");
        sll.add(1, "Two");
        sll.add(2, "Three");
        sll.add(3, "Four");
        sll.remove(2);
        sll.set(1, "Wow");
        Assertions.assertEquals("[2, Wow, Four]", sll.toString());
    }*/

    @Test
    public void testRem1(){
        DoubleLinkedList<String> sll = new DoubleLinkedList<String>();
        sll.add(0, "One");
        sll.add(1, "Two");
        sll.add(2, "Four");
        sll.add(2, "Three");
        sll.remove(0);
        sll.remove(0);
        Assertions.assertEquals("[Three, Four]", sll.toString());
    }

    @Test
    public void testRem2(){
        DoubleLinkedList<String> sll = new DoubleLinkedList<String>();
        sll.add(0, "One");
        sll.add(1, "Two");
        sll.add(2, "Three");
        sll.add(3, "Four");
        sll.remove(0);
        Assertions.assertEquals("[Two, Three, Four]", sll.toString());
    }

    @Test
    public void testRem3(){
        DoubleLinkedList<String> sll = new DoubleLinkedList<String>();
        sll.add(0, "One");
        sll.add(1, "Two");
        sll.add(2, "Three");
        sll.add(3, "Four");
        sll.remove(3);
        Assertions.assertEquals("[One, Two, Three]", sll.toString());
    }

    @Test
    public void testRem4(){
        DoubleLinkedList<String> sll = new DoubleLinkedList<String>();
        sll.add(0, "One");
        sll.add(1, "Two");
        sll.add(2, "Three");
        sll.add(3, "Four");
        sll.remove(2);
        Assertions.assertEquals("[One, Two, Four]", sll.toString());
    }

    @Test
    public void testRem5(){
        DoubleLinkedList<String> sll = new DoubleLinkedList<String>();
        sll.add(0, "One");
        sll.add(1, "Two");
        boolean ans = false;
        try
        {
            sll.remove(-1);
        }
        catch (IndexOutOfBoundsException e)
        {
            ans = true;
        }
        Assertions.assertEquals(true, ans);
    }

    @Test
    public void testRem6(){
        DoubleLinkedList<String> sll = new DoubleLinkedList<String>();
        sll.add(0, "One");
        sll.add(1, "Two");
        boolean ans = false;
        try
        {
            sll.remove(2);
        }
        catch (IndexOutOfBoundsException e)
        {
            ans = true;
        }
        Assertions.assertEquals(true, ans);
    }

   /* @Test
    public void testSet1(){
        DLL_GH<String> sll = new DLL_GH<String>();
        sll.add(0, "One");
        sll.set(0, "1");
        Assertions.assertEquals("[1]", sll.toString());
    }

    @Test
    public void testSet2(){
        DLL_GH<String> sll = new DLL_GH<String>();
        sll.add(0, "One");
        sll.add(1, "Two");
        sll.add(2, "Four");
        sll.add(2, "Three");
        sll.set(0, "1");
        sll.set(1, "2");
        sll.set(2, "3");
        sll.set(3, "4");
        Assertions.assertEquals("[1, 2, 3, 4]", sll.toString());
    }

    @Test
    public void testSet3(){
        DLL_GH<String> sll = new DLL_GH<String>();
        sll.add(0, "One");
        sll.add(1, "Two");
        boolean ans = false;
        try
        {
            sll.set(-1, "One");
        }
        catch (IndexOutOfBoundsException e)
        {
            ans = true;
        }
        Assertions.assertEquals(true, ans);
    }

    @Test
    public void testSet4(){
        DLL_GH<String> sll = new DLL_GH<String>();
        sll.add(0, "One");
        sll.add(1, "Two");
        boolean ans = false;
        try
        {
            sll.set(2, "One");
        }
        catch (IndexOutOfBoundsException e)
        {
            ans = true;
        }
        Assertions.assertEquals(true, ans);
    }*/


}
