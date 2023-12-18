public class PrintDayInWord {
    public static void main(String args[]) {
        for (int dayNumber = 0; dayNumber < 8; dayNumber++) {
            PrintDayInWordsUsingNestedIf(dayNumber);
        }
    }

    public static void PrintDayInWordsUsingNestedIf(int dayNumber) {
        if (dayNumber == 0) {
            System.out.println("Sunday");
        } else if (dayNumber == 1) {
            System.out.println("Monday");
        } else if (dayNumber == 2) {
            System.out.println("Tueday");
        } else if (dayNumber == 3) {
            System.out.println("Wednesday");
        } else if (dayNumber == 4) {
            System.out.println("Thursday");
        } else if (dayNumber == 5) {
            System.out.println("Friday");
        } else if (dayNumber == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Not A Valid Day");
        }
    }

}
