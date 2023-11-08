public class exersice3 {
    public static void main(String[] args) {
        // Sum of numbers 1 to 100 and their Average using while loop
        int sum = 0, i = 1;
        do {
            sum += i;
            ++i;
        } while (i < 101);
        float average = sum / 100;
        System.out.println("The sum of 1 to 100 = " + sum);
        System.out.println("Average = " + average);
    }
}