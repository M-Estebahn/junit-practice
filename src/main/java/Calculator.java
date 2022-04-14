import java.text.DecimalFormat;

public class Calculator {
    private static final DecimalFormat df = new DecimalFormat("0.00");


    public int addition(int num1,int num2){
        return num1+num2;
    }

    public double calculateTip(double bill,double tipPercent){
        double tip=bill*tipPercent;
        System.out.println("the tip amount is");
        System.out.println(df.format(tip));
        System.out.println("Total amount for new bill is");
        System.out.println(df.format(bill+tip));
        return (bill+tip);
    }

    public int[] addInArray(int num,int[] arr){

        for(int i=0;i<arr.length;++i){
             arr[i]+=num;
        }return arr;

    }
}
