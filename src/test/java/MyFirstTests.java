import org.junit.Test;
import static org.junit.Assert.*;
public class MyFirstTests {
    private final Calculator calculator=new Calculator();

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

}
