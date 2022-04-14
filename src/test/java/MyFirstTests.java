import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
public class MyFirstTests {
    private final Calculator calculator=new Calculator();
    ArrayList<Integer> arrayList1 = new ArrayList<>();
    ArrayList<Integer> arrayList2 = new ArrayList<>();
    ArrayList<Integer> arrayList3 = new ArrayList<>();
    @Before public void setUp(){

        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);
        arrayList2.add(1);
        arrayList2.add(2);
        arrayList2.add(3);
        arrayList3.add(5);
        arrayList3.add(6);
        arrayList3.add(7);

    }

    @Test
    public void testAdditionsMethod(){
        int input1=5;
        int input2=12;
        int expectedSum=17;

        assertEquals(expectedSum,calculator.addition(input1,input2));
    }
    @Test
    public void testCalculateTip(){
        double cost= 22.56;
        double tipPercent= .15;
        double totalCost=25.94;

        assertEquals(totalCost,calculator.calculateTip(cost,tipPercent), 0.01);
    }
    @Test
    public void  testArrayEquality(){
        int[] startArray={1,2,3,4};
        int[] endArray={2,3,4,5};
        int[] endArray2={11,12,13,14};


        assertArrayEquals(endArray,calculator.addInArray(1,startArray));
        startArray= new int[]{1, 2, 3, 4};
        assertArrayEquals(endArray2, calculator.addInArray(10,startArray));

    }
    @Test
    public void testObjectSameness(){
        assertSame(arrayList1,arrayList2);
    }

}
