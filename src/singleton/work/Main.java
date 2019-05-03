package singleton.work;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bob weighs " + 195 + " pounds and is " + 70 + " inches tall with a BMI of " + ThreadSafeCalcTool.calcBMI(70, 195, MeasurementSystem.ENGLISH));
        System.out.println("Christy weighs " + 84 + " kilograms and is " + 1.7 + " meters tall with a BMI of " + ThreadSafeCalcTool.calcBMI(1.7, 84, MeasurementSystem.METRIC));
        System.out.println("Sue weighs " + 135 + " pounds and is " + 63 + " inches tall with a BMI of " + ThreadSafeCalcTool.calcBMI(63, 135, MeasurementSystem.ENGLISH));
        System.out.println("Ricky weighs " + 141 + " kilograms and is " + 2.1 + " meters tall with a BMI of " + ThreadSafeCalcTool.calcBMI(2.1, 141, MeasurementSystem.METRIC));

        System.out.println("The Average BMI Calcuated in this Run is " + ThreadSafeCalcTool.averageBMI());

        System.out.println("Bob weighs " + 195 + " pounds and is " + 70 + " inches tall with a BMI of " + EnumCalcTool.INSTANCE.calcBMI(70, 195, MeasurementSystem.ENGLISH));
        System.out.println("Christy weighs " + 84 + " kilograms and is " + 1.7 + " meters tall with a BMI of " + EnumCalcTool.INSTANCE.calcBMI(1.7, 84, MeasurementSystem.METRIC));
        System.out.println("Sue weighs " + 135 + " pounds and is " + 63 + " inches tall with a BMI of " + EnumCalcTool.INSTANCE.calcBMI(63, 135, MeasurementSystem.ENGLISH));
        System.out.println("Ricky weighs " + 141 + " kilograms and is " + 2.1 + " meters tall with a BMI of " + EnumCalcTool.INSTANCE.calcBMI(2.1, 141, MeasurementSystem.METRIC));

        System.out.println("The Average BMI Calcuated in this Run is " + ThreadSafeCalcTool.averageBMI());

    }
}
