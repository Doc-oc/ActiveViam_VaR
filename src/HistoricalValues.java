import java.util.ArrayList;
import java.util.Scanner;

public class HistoricalValues {
    // Scanner definition
    Scanner scn = new Scanner(System.in);

    public void setHistoricalValues(ArrayList<Float> historicalValues) {
        this.historicalValues = historicalValues;
    }
    ArrayList<Float> historicalValues = new ArrayList<>();

    public ArrayList<Float> getHistoricalValues(){
        int dayNumber = 1;
        System.out.println("Enter Value Assets previous 5 day");

        for(int i=0;i<5;i++) {
            System.out.println("Day " + dayNumber + ": ");
            dayNumber++;
            float val = scn.nextFloat();
            historicalValues.add(val);
        }

        setHistoricalValues(historicalValues);
        return historicalValues;
    }


}
