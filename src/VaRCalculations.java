import java.util.ArrayList;

public class VaRCalculations extends HistoricalValues {

    public float singleCalculation() {
        HistoricalValues hV = new HistoricalValues();
        float todayVal = 415.21f;
        float dailyReturn;
        ArrayList<Float> histValues = hV.getHistoricalValues();

        for (float value : histValues){
            System.out.println("Calculation: (" + todayVal + "-" + value + ")/" + value);
            dailyReturn = ((todayVal-value)/value);
            todayVal = value;
            System.out.println("Daily Return: " + dailyReturn);
        }

        return todayVal;
    }
}
