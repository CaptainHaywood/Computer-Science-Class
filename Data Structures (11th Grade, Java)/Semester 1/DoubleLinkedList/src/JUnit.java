import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JUnit {

    @Test
    public void testAdd01(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
        list.add(0, 10);
        Assertions.assertEquals(10, list.get(0));
    }

    @Test
    public void testAdd02() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
        list.add(0, 10);

        list.add(0, 5);
        Assertions.assertEquals("[5, 10]", list.toString());
    }

    @Test
    public void testAdd03(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
        list.add(0, 10);
        list.add(1, 5);
        Assertions.assertEquals("[10, 5]", list.toString());
    }

    @Test
    public void testAdd04(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
        for(int i = 1; i <= 10; i++) {
            list.add(i - 1, i);
        }
        list.add(0, 10);
        list.add(5, 5);
        list.add(12, 12);
        Assertions.assertEquals("[10, 1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10, 12]", list.toString());
    }

    @Test
    public void testAdd05(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
        Boolean ans = false;
        try
        {
            list.add(-1, 10);
        } catch(IndexOutOfBoundsException e)
        {
            ans = true;
        }
        Assertions.assertEquals(true, ans);
    }

    @Test
    public void testAdd06(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
        Boolean ans = false;
        for(int i = 1; i <= 10; i++)
            list.add(i-1, i);
        try
        {
            list.add(11, 10);
        } catch(IndexOutOfBoundsException e)
        {
            ans = true;
        }
        Assertions.assertEquals(true, ans);
    }

    @Test
    public void testAdd07(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
        for(int i = 1; i <= 10; i++)
            list.add(i-1, i);
        list.add(10, 10);
        Assertions.assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10]", list.toString());
    }

    @Test
    public void testGet01(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
        list.add(0, 10);
        list.add(1, 20);
        list.add(2, 30);
        Boolean ans = false;
        try
        {
            list.get(3);
        }
        catch(IndexOutOfBoundsException e)
        {
            ans = true;
        }
        Assertions.assertEquals(true, ans);
    }

    @Test
    public void testGet02(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
        list.add(0, 10);
        list.add(1, 20);
        list.add(2, 30);
        Boolean ans = false;
        try
        {
            list.get(-1);
        }
        catch(IndexOutOfBoundsException e)
        {
            ans = true;
        }
        Assertions.assertEquals(true, ans);    }

    @Test
    public void testGet03(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
        list.add(0, 10);
        list.add(1, 20);
        list.add(2, 30);
        Assertions.assertEquals(30, list.get(2));

    }

    @Test
	public void testIterator01(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
        java.util.Iterator<Integer> itr = list.iterator();
        String s = "";
        while(itr.hasNext()) {
            s += itr.next();
        }
        Assertions.assertEquals("", s);
    }

	@Test
	public void testIterator02(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
        for(int i = 1; i <= 10; i++) {
            list.add(i - 1, i);
        }
        java.util.Iterator<Integer> itr = list.iterator();
        String s = "";
        while(itr.hasNext()) {
            s += itr.next();
        }

        Assertions.assertEquals("12345678910", s);
    }

	@Test
	public void testIterator03(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
        java.util.Iterator<Integer> itr = list.iterator();
        Boolean ans = false;
        try
        {
            itr.next();
        }catch (java.util.NoSuchElementException e) {
            ans = true;
        }
        Assertions.assertEquals(true, ans);
    }

	@Test
	public void testIterator04(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
        list.add(0, 10);
        java.util.Iterator<Integer> itr = list.iterator();
        boolean ans = false;
        try
        {
            itr.remove();
        }
        catch (IllegalStateException e)
        {
            ans = true;
        }
        Assertions.assertEquals(true, ans);
    }

	@Test
	public void testIterator05(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
        list.add(0, 10);
        list.add(1, 20);
        list.add(2, 30);
        java.util.Iterator<Integer> itr = list.iterator();
        Boolean ans = false;
        try
        {
            itr.next();
            itr.next();
            itr.remove();
            itr.remove();
        }
        catch (IllegalStateException e)
        {
            ans = true;
        }
        Assertions.assertEquals(true, ans);
    }

	@Test
	public void testIterator06(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
        list.add(0, 10);
        list.add(1, 20);
        list.add(2, 30);
        java.util.Iterator<Integer> itr = list.iterator();
        itr.next();
        itr.remove();
        Assertions.assertEquals("[20, 30]", list.toString());
	}

	@Test
	public void testIterator07(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
        list.add(0, 10);
        list.add(1, 20);
        list.add(2, 30);
        java.util.Iterator<Integer> itr = list.iterator();
        itr.next();
        itr.next();
        itr.remove();
        Assertions.assertEquals("[10, 30]", list.toString());
	}

	@Test
	public void testIterator08(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
        list.add(0, 10);
        list.add(1, 20);
        list.add(2, 30);
        java.util.Iterator<Integer> itr = list.iterator();
        itr.next();
        itr.next();
        itr.next();
        itr.remove();
        Assertions.assertEquals("[10, 20]", list.toString());
	}

	@Test
	public void testIterator09(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
        list.add(0, 10);
        list.add(1, 20);
        list.add(2, 30);
        java.util.Iterator<Integer> itr = list.iterator();
        itr.next();
        itr.remove();
        itr.next();
        itr.remove();
        itr.next();
        itr.remove();
        Assertions.assertEquals("[]", list.toString());
	}

	@Test
	public void testIterator010(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
        list.add(0, 10);
        list.add(1, 20);
        list.add(2, 30);
        java.util.Iterator<Integer> itr = list.iterator();
        itr.next();
        itr.remove();
        itr.next();
        itr.next();
        itr.remove();
        Assertions.assertEquals("[20]", list.toString());
	}

	@Test
	public void testIterator011(){
        DoubleLinkedList<String> dll = new DoubleLinkedList<String>();
        dll.add(0, "A");
        dll.add(0, "B");
        dll.add(0, "C");
        dll.add(0, "D");
        java.util.Iterator<String> itr = dll.iterator();
        String str = "";
        while(itr.hasNext()) {
            str += itr.next();
        }
        Assertions.assertEquals("DCBA", str);
	}

	@Test
	public void testIterator012(){
        DoubleLinkedList<String> dll = new DoubleLinkedList<String>();
        java.util.Iterator<String> itr = dll.iterator();
        String str = "";
        while(itr.hasNext()) {
            str += itr.next();
        }
        Assertions.assertEquals("", str);
	}

	@Test
	public void testIterator013(){
        DoubleLinkedList<String> dll = new DoubleLinkedList<String>();
        dll.add(0, "A");
        dll.add(0, "B");
        dll.add(0, "C");
        dll.add(0, "D");
        java.util.Iterator<String> itr = dll.iterator();
        Boolean ans = false;
        try
        {
            itr.remove();
        }
        catch(java.lang.IllegalStateException e)
        {
            ans = true;
        }
        Assertions.assertEquals(true, ans);
	}

	@Test
	public void testIterator014(){
        DoubleLinkedList<String> dll = new DoubleLinkedList<String>();
        dll.add(0, "A");
        dll.add(0, "B");
        dll.add(0, "C");
        dll.add(0, "D");
        java.util.Iterator<String> itr = dll.iterator();
        itr.next();
        itr.remove();
        itr.next();
        itr.remove();
        itr.next();
        itr.remove();
        itr.next();
        itr.remove();
        itr = dll.iterator();
        String str = "";
        while(itr.hasNext()) {
            str += itr.next();
        }
        Assertions.assertEquals("", str);
    }

	@Test
	public void testIterator015(){
        DoubleLinkedList<String> dll = new DoubleLinkedList<String>();
        dll.add(0, "A");
        dll.add(0, "B");
        dll.add(0, "C");
        dll.add(0, "D");
        java.util.Iterator<String> itr = dll.iterator();
        Boolean ans = false;
        try
        {
            itr.next();
            itr.remove();
            itr.remove();
        }
        catch(java.lang.IllegalStateException e)
        {
            ans = true;
        }
        Assertions.assertEquals(true, ans);
    }

	@Test
	public void testIterator016(){
        DoubleLinkedList<String> dll = new DoubleLinkedList<String>();
        java.util.Iterator<String> itr = dll.iterator();
        Boolean ans = false;
        try
        {
            itr.next();
        }
        catch(java.util.NoSuchElementException e)
        {
            ans = true;
        }
        Assertions.assertEquals(true, ans);
    }

	@Test
	public void testIterator017(){
        DoubleLinkedList<String> dll = new DoubleLinkedList<String>();
        dll.add(0, "A");
        java.util.Iterator<String> itr = dll.iterator();
        Boolean ans = false;
        try
        {
            itr.next();
            itr.next();
        }
        catch(java.util.NoSuchElementException e)
        {
            ans = true;
        }
        Assertions.assertEquals(true, ans);
    }

	@Test
	public void testRemove01() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
        for (int i = 1; i <= 10; i++) {
            list.add(i - 1, i);
        }
        for (int i = 10; i > 0; i--) {
            System.out.println(list.size);
            list.remove(i - 1);
        }
        Assertions.assertEquals("[]", list.toString());
    }

	@Test
	public void testRemove02(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
        list.add(0, 10);
        list.remove(0);
        Assertions.assertEquals("[]", list.toString());
    }

	@Test
	public void testRemove03(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
        list.add(0, 10);
        list.add(1, 20);
        list.remove(1);
        Assertions.assertEquals("[10]", list.toString());
    }

	@Test
	public void testRemove04(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
        list.add(0, 10);
        list.add(1, 20);
        list.add(2, 30);
        list.remove(1);
        Assertions.assertEquals("[10, 30]", list.toString());
    }

	@Test
	public void testRemove05() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
        list.add(0, 10);
        list.add(1, 20);
        list.add(2, 30);
        Boolean ans = false;
        try {
            list.remove(-1);
        }
        catch (IndexOutOfBoundsException e) {
            ans = true;
        }
        Assertions.assertEquals(true, ans);
    }

	@Test
	public void testRemove06(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
        list.add(0, 10);
        list.add(1, 20);
        list.add(2, 30);
        Boolean ans = false;
        try
        {
            list.remove(4);
        }
        catch(IndexOutOfBoundsException e)
        {
            ans = true;
        }
        Assertions.assertEquals(true, ans);
    }

	@Test
	public void testSize01(){
        DoubleLinkedList<String> dll = new DoubleLinkedList<String>();
        dll.add(0, "One");
        dll.add(1, "Two");
        dll.add(2, "Four");
        dll.add(2, "Three");
        Assertions.assertEquals(4, dll.size);
    }

	@Test
	public void testSize02(){
        DoubleLinkedList<String> dll = new DoubleLinkedList<String>();
        Assertions.assertEquals(0, dll.size);
    }

	@Test
	public void testToString01(){
        DoubleLinkedList<String> dll = new DoubleLinkedList<String>();
        Assertions.assertEquals("[]", dll.toString());
    }

}
