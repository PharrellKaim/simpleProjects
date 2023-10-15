public class TimeChange{
    private void Calculation() {
        int SummerTime = 0;
        int WinterTime = 0;
        int dayHoursSummer = 0; //Normal Hours are 24h a day
        int dayHoursWinterChange = 0; //At the date of the change there are 25h for that one Date

        for (int i = 0; i < 24; i++) {
            SummerTime++;
            WinterTime++;
            dayHoursSummer++;
            dayHoursWinterChange++;

            if (SummerTime == 3){
                WinterTime = WinterTime - 1; //-1 Because at SummerTime 3AM the time at the Time Change day goes back to 2AM
                dayHoursWinterChange = dayHoursWinterChange + 1; //+1 because Winter Time does have 2Times 2 o`clock
            }

            System.out.println("SummerTime: " + SummerTime + " WinterTime " + WinterTime);
        }
        System.out.println("Day Hours of Summer/Normal: "+dayHoursSummer+" Day Hours of WinterTime Change Day: "+dayHoursWinterChange);
    }

    public static void main(String[] args){
        TimeChange timeChange = new TimeChange();
        timeChange.Calculation();
    }
}