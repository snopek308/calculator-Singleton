package singleton.work;

public class ThreadSafeCalcTool {

    private static ThreadSafeCalcTool instance = null;

    private static int totalBMICalculated = 0;
    private static int numberOfCaculations = 0;

    public static double calcBMI(double height, double weight, MeasurementSystem measurementSystem) {
        double bmi = weight / Math.pow(height, 2);
        if (measurementSystem == MeasurementSystem.ENGLISH) {
            bmi *= 703;
        }
        totalBMICalculated += bmi;
        numberOfCaculations++;

        return bmi;
    }

    public static double averageBMI() {
        return totalBMICalculated / numberOfCaculations;
    }

    public static ThreadSafeCalcTool getInstance() {
        // Double locking
        if (instance == null) {
            synchronized (CalcTool.class) {
                if (instance == null) {
                    instance = new ThreadSafeCalcTool();
                }
            }
        }

        return instance;
    }
}
