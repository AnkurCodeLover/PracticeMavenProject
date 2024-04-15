package PracticeJavaQuestions;

public class ConvertIntegerToMinutes {


    public static void main(String[] args) {

                int x = 928;

                // Extract hours and minutes
                int hours = x / 100; // Integer division removes the minutes part
        System.out.println(hours);
                int minutes = x % 100; // Remainder gives the minutes part
        System.out.println(minutes);

                // Convert hours to minutes and add to the total
                int totalMinutes = hours * 60 + minutes;

                System.out.println("Total minutes: " + totalMinutes);
            }
}
