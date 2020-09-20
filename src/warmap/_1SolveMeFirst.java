package warmap;

public class _1SolveMeFirst {

    public static void main(String[] args) {
        int[] values  = new int[]{3,2,4,5};
        System.out.println("Enter integers with space > ");

        System.out.println("Sum of the numbers is " + sum(values));
    }

    static int sum(int[] values){
        int sum = 0;
        for(int value: values){
            sum += value;
        }
        return sum;
    }
}
