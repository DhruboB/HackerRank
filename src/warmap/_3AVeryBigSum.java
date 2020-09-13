package warmap;

public class _3AVeryBigSum {

    public static void main(String[] args) {
        long[] values  = new long[]{3,2,4,5};
        System.out.println("Enter integers with space > ");

        System.out.println("Sum of the numbers is " + sum(values));
    }

    static long sum(long[] ar){
        long sum = 0;
        for(long value: ar){
            sum += value;
        }
        return sum;
    }
}
