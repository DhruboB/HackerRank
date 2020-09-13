package warmap;

public class _6PlusMinus {

    
    
    
    public static void main(String[] args) {
        int[] arr = new int[]{-4,3,-9,0,4,1};
        plusMinus(arr);
    }

    private static boolean plusMinus(int[] arr) {

        int positiveCounter = 0;
        int negativeCounter = 0;
        int zeroCounter = 0;

        for(int val: arr){
            if(val > 0 ){
                ++positiveCounter;
            } else if (val < 0){
                ++negativeCounter;
            }else {
                ++zeroCounter;
            }
        }
        double plusRation = 1.0 * positiveCounter / arr.length;
        double minusRation =1.0 * negativeCounter / arr.length;
        double zeroRation = 1.0 * zeroCounter / arr.length;
        System.out.printf("%.6f", plusRation );
        System.out.printf("\n%.6f", minusRation );
        System.out.printf("\n%.6f", zeroRation );
        return true;
    }


}
