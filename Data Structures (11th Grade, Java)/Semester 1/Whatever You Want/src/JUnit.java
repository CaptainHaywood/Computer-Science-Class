import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class JUnit {

    @Test
    public void testAdd01(){
        ArrayList<String> myList = new ArrayList();
        myList.add("10");
        Assertions.assertEquals("[10]", myList.toString());
    }

    @Test
    public void testAdd02(){
        ArrayList<String> myList = new ArrayList();
        myList.add("10");
        myList.add("20");
        myList.add("30");
        Assertions.assertEquals("[10, 20, 30]", myList.toString());
    }

    @Test
    public void testAdd03(){
        ArrayList<String> myList = new ArrayList();
        myList.add("10");
        myList.add("20");
        myList.add(2, "30");
        Assertions.assertEquals("[10, 20, 30]", myList.toString());
    }

    @Test
    public void testAdd4(){
        ArrayList<Integer> myList = new ArrayList();
        for(int i=0; i<=10; i++)
            myList.add(i);

        Assertions.assertEquals("[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]", myList.toString());
    }

    @Test
    public void testSize05(){
        ArrayList<String> myList = new ArrayList();
        myList.add("10");
        myList.add("20");
        Assertions.assertEquals(2, myList.size());
    }

    @Test
    public void testGet06(){
        ArrayList<String> myList = new ArrayList();
        myList.add("10");
        myList.add("20");
        Assertions.assertEquals("20", myList.get(1));
    }

    @Test
    public void testGet07(){
        ArrayList<String> myList = new ArrayList();
        myList.add("10");
        myList.add("20");
        Assertions.assertEquals("1020", myList.get(0) + myList.get(1));
    }

    @Test
    public void testGet08(){
        ArrayList<String> myList = new ArrayList();
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
        ArrayList<String> myList = new ArrayList();
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
        ArrayList<String> myList = new ArrayList();
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
        ArrayList<String> myList = new ArrayList();
        myList.add("10");
        myList.remove(0);
        Assertions.assertEquals("[]", myList.toString());
    }

    @Test
    public void testRem12(){
        ArrayList<String> myList = new ArrayList();
        myList.add("10");
        myList.add("20");
        myList.remove(0);
        Assertions.assertEquals("[20]", myList.toString());
    }

    @Test
    public void testRem13(){
        ArrayList<String> myList = new ArrayList();
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
        ArrayList<String> myList = new ArrayList();
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
        ArrayList<String> myList = new ArrayList();
        myList.add("10");
        myList.set(0, "20");
        Assertions.assertEquals("[20]", myList.toString());
    }

    @Test
    public void testSet16(){
        ArrayList<String> myList = new ArrayList();
        myList.add("10");
        myList.add("20");
        myList.set(1, "30");
        Assertions.assertEquals("[10, 30]", myList.toString());
    }

    @Test
    public void testSet17(){
        ArrayList<String> myList = new ArrayList();
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
        ArrayList<String> myList = new ArrayList();
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
        ArrayList<Integer> myList = new ArrayList();
        for(int i=0; i<=10; i++)
            myList.add(i);
        myList.remove(5);
        Assertions.assertEquals("[0, 1, 2, 3, 4, 6, 7, 8, 9, 10]", myList.toString());
    }

    @Test
    public void testSet20(){
        ArrayList<Integer> myList = new ArrayList();
        for(int i=0; i<=10; i++)
            myList.add(i);
        myList.set(5, 99);
        Assertions.assertEquals("[0, 1, 2, 3, 4, 99, 6, 7, 8, 9, 10]", myList.toString());
    }

}
