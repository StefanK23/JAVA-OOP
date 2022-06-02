import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import p03_IteratorTest.ListIterator;

import javax.naming.OperationNotSupportedException;
import javax.xml.crypto.Data;

public class TestListIterator {
    private ListIterator listIterator;
    private static final String[] DATA = {"Stefan", "Desi", "Ivo", "Vladislav", "Eli"};

    @Before
    public void setUp() throws OperationNotSupportedException {
        listIterator = new ListIterator(DATA);

    }

    //конструктор
    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorWithNullParam() throws OperationNotSupportedException {
        new ListIterator(null);
    }

    @Test
    public void TestHasNExtAndMOve(){
        Assert.assertTrue(listIterator.hasNext());
        Assert.assertTrue(listIterator.move());

        Assert.assertTrue(listIterator.hasNext());
        Assert.assertTrue(listIterator.move());

        Assert.assertTrue(listIterator.hasNext());
        Assert.assertTrue(listIterator.move());

        Assert.assertTrue(listIterator.hasNext());
        Assert.assertTrue(listIterator.move());

        Assert.assertFalse(listIterator.hasNext());
        Assert.assertFalse(listIterator.move());
    }

    @Test (expected = IllegalStateException.class)
    public void TestPrintEmptyList() throws OperationNotSupportedException {
        ListIterator listIterator = new ListIterator();
        listIterator.print();

    }
    @Test
    public void testPrintCorrectly(){
        int index = 0;
        while(listIterator.hasNext()){
            Assert.assertEquals(listIterator.print(), DATA[index]);
            index++;
            listIterator.move();
        }
    }
}


