package implementation;

public class StrangeCounter {

    public static void main(String[] args) {
        System.out.println(strangeCounter(17));
    }

    // Complete the strangeCounter function below.
    static long strangeCounter(long t) {
        int cycle  = 0;
        long num = 1;
        long prev = num;

        while(num < t){
            prev = num;
            num  += (long)Math.pow(2,cycle) * 3;
            cycle++;
        }
        return t != num ? (long)Math.pow(2,cycle-1) * 3 - (t-prev) : (long)Math.pow(2,cycle) * 3;
    }
}
