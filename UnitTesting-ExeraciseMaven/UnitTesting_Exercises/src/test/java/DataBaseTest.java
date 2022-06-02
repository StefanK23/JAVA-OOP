import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import p01_Database.Database;

import javax.naming.OperationNotSupportedException;

public class DataBaseTest {

    private Database dataBase;
    private static final Integer[] NUMBERS = {5, 8, 20, 67, 98};

    @Before
    public void prepareDatabase() throws OperationNotSupportedException {
        dataBase = new Database(NUMBERS);
    }

    //test constructor
    //1. дали ми създава правилно обект
    @Test
    public void TestConstructorHasToCreateValidObject() {
        //трябва да взема елементите на дадения обект и да проверя дали са същите, които зададох
        Integer[] dataBaseElements = dataBase.getElements();
        //проверихме дали броят на елементите е еднакъв
        Assert.assertEquals(dataBaseElements.length, NUMBERS.length);
        for (int i = 0; i < dataBaseElements.length; i++) {
            Assert.assertEquals(NUMBERS[i], (dataBaseElements[i]));

        }
    }

    // 2. елементите ако са над 16
    @Test(expected = OperationNotSupportedException.class)
    public void TestConstructorThrowWhenUseMoreThanSixteenElements() throws OperationNotSupportedException {
        Integer[] numbers = new Integer[17];
        new Database(numbers);
    }

    //3. ако елементите са < 1;
    @Test(expected = OperationNotSupportedException.class)
    public void TestConstructorThrowWhenUseLessThanOneElements() throws OperationNotSupportedException {
        Integer[] numbers = new Integer[0];
        new Database(numbers);
    }


    //тестваме метод  Add
    //1.ако елементът е null
    @Test(expected = OperationNotSupportedException.class)
    public void TestAddShouldThrowWhenParamNull() throws OperationNotSupportedException {
        dataBase.add(null);
    }
    //2. ако подаденият не е null -> успешно го дабавя към списъка
    @Test
    public void TestAddShouldAddElement() throws OperationNotSupportedException {
        dataBase.add(7);
        Assert.assertEquals(dataBase.getElements().length, 6);
        Assert.assertEquals(dataBase.getElements()[dataBase.getElements().length-1], Integer.valueOf(7));
    }

    //тестваме метод Remove
    //1. да нямаме елементи в масива
    @Test(expected =  OperationNotSupportedException.class)
    public  void TestRemoveShouldTrowWithEmptyData() throws OperationNotSupportedException {
        //delete all elements
        for (int i = 0; i <NUMBERS.length ; i++) {
            dataBase.remove();
        }
        // empty []
        //trying to add again elements
        dataBase.remove();
    }
    //2.дали правилно премахва елемент
    @Test
    public void TestRemoveLastElement() throws OperationNotSupportedException {
        dataBase.remove();
        Integer[]elementsInDataBase = dataBase.getElements();
        Assert.assertEquals(elementsInDataBase.length, NUMBERS.length -1 );
        Assert.assertEquals(elementsInDataBase[3],Integer.valueOf(67));
    }


}
