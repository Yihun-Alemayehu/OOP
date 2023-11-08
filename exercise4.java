import java.util.ArrayList;

public class exercise4 {
    public static void main(String[] args) {
        // Sum of numbers 1 to 100 and their Average using for each loop
        ArrayList<Integer> numberList = new ArrayList<>();

        for (int i = 0; i < 101; ++i) {
            numberList.add(i);
        }
        int sum = 0;
        for (int x : numberList) {
            sum += x;
        }
        float average = sum / 100;
        System.out.println("The sum of 1 to 100 = " + sum);
        System.out.println("Average = " + average);
    }
}