class Counter {
    static int count = 0;

    public void printCounter() {
        count++;
        System.out.println(count);
    }
}

public class predict {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        c1.printCounter();
        Counter c2 = new Counter();
        c2.printCounter();
        System.out.println(Counter.count);
    }
}
