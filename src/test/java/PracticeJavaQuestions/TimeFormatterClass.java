package PracticeJavaQuestions;

public class TimeFormatterClass {

        public static void main(String[] args) {
            int totalSeconds = 3725; // Example: 3725 seconds

            int hours = totalSeconds / 3600; // 3600 seconds in an hour
            int remainingSeconds = totalSeconds % 3600;
            int minutes = remainingSeconds / 60; // 60 seconds in a minute
            int seconds = remainingSeconds % 60;

            System.out.println("Formatted Time: " + hours + "h " + minutes + "m " + seconds + "s");
        }
}
