package implementation.easy;

public class AppleAndOrange {

    public static void main(String... args){
//        int[] apples = new int[]{-2,2,1};
        int[] apples = new int[]{2,3,-4};
//        int[] oranges = new int[]{5, -6};
        int[] oranges = new int[]{3,-2,-4};
//        countAppleAndOranges(7,11,5,15, apples , oranges);
        countAppleAndOranges(7,10,4,12, apples , oranges);
    }

    private static void countAppleAndOranges(int s, int t, int a , int b, int[] apples, int[] oranges){

        int appleCounter = 0;
        int orangeCounter = 0;

        int[] appleCoordinates = new int[apples.length];
        for(int i = 0; i < apples.length ; i++){
            int temp = apples[i] + a;
            if(temp >= s && temp <= t){
                appleCounter++;
            }
        }

        int[] orangeCoordinates = new int[oranges.length];
        for(int i = 0; i < oranges.length ; i++){
            int temp =  oranges[i] + b;
            if(temp >= s && temp <= t){
                orangeCounter++;
            }
        }
        System.out.println(appleCounter);
        System.out.println(orangeCounter);
    }
}
