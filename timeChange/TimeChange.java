public class TimeChange{

    private void Calculation() {
        int SummerTime = 3;
        int WinterTime = 2;

        for (int i = 0; i <= 21; i++) {
            SummerTime++;
            WinterTime++;

            System.out.println("SummerTime: " + SummerTime + " WinterTime " + WinterTime);
        }
    }

    public static void main(String[] args){
        TimeChange timeChange = new TimeChange();
        timeChange.Calculation();
    }
}