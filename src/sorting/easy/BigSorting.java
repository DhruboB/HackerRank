package sorting.easy;

import java.math.BigInteger;

public class BigSorting {

    public static void main(String[] args) {
//        String[] values = new String[]{"31415926535897932384626433832795","1","3","10","3","5"};
        String[] values = new String[]{"8","1","2","100","12303479849857341718340192371","3084193741082937","3084193741082938","111","200"};
        // selection
        for(String str: bigSortingSelection(values)) {
            System.out.println(str);
        }
        // Bubble
        for(String str: bigSortingBubble(values)) {
            System.out.println(str);
        }
        // Merge
        for(String str: bigSortingMerge(values)) {
            System.out.println(str);
        }
    }

//    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
//
//        //int n = scanner.nextInt();
//        int n = Integer.parseInt(input.readLine().trim());
//        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        String[] unsorted = new String[n];
//
//        for (int i = 0; i < n; i++) {
//            //String unsortedItem = scanner.nextLine();
//            String unsortedItem = input.readLine();
//            unsorted[i] = unsortedItem;
//        }
//
//        String[] result = bigSorting(unsorted);
//
//        for (int i = 0; i < result.length; i++) {
//            bufferedWriter.write(result[i]);
//
//            if (i != result.length - 1) {
//                bufferedWriter.write("\n");
//            }
//        }
//
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        //scanner.close();
//        input.close();
//    }


    // Merge Sort O(NlogN)
    static String[] bigSortingMerge(String[] unsorted) {
        sort(unsorted, 0 , unsorted.length-1);
        return unsorted;
    }

    // recursing sort by splitting in half
    static void sort(String[] arr, int left, int right){
        int middle = ( left + right ) / 2;
        if( left < right ){
            sort(arr, left , middle);
            sort(arr, middle+1, right);

            merge(arr, left, middle, right);
        }
    }
    // actual merging for recursive sort method
    static void merge(String[] arr, int left, int middle, int right){
        int ln = middle - left + 1;
        int rn = right - middle;

        String[] L = new String[ln];
        String[] R = new String[rn];

        for(int i = 0 ; i < ln ; i++){
            L[i] = arr[ left + i];
        }
        for(int i = 0 ; i < rn ; i++){
            R[i] = arr[ middle + 1 + i];
        }
        // initial index of first two sub arrays and merged array
        int i = 0, j = 0, k = left;
        // merging starting from left index to right index by comparing from each other
        while( i < ln && j < rn){
            if(compare(L[i],R[j]) != 1){
                arr[k] = L[i];
                i++;
            }else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        // adding any remaining in left array
        while(i < ln){
            arr[k++] = L[i++];
        }
         // adding any remaining in right array
        while( j < rn){
            arr[k++] = R[j++];
        }
    }

    static int compare(String a, String b){
        if(a.length() > b.length()){
            return 1;
        }
        if(a.length() < b.length()){
            return -1;
        }else{
            for(int c = 0; c < a.length(); c++){
                if(a.charAt(c) > b.charAt(c)){
                    return 1;
                }
                if(a.charAt(c) < b.charAt(c)){
                    return -1;
                }
            }
        }
        return 0;
    }


    // Bubble Sort O(N^2) with little optimized
    static String[] bigSortingBubble(String[] unsorted) {
        // bubble sort
        String temp = "";
        boolean isSwapped;
        for(int i = 0 ; i < unsorted.length ; i++){
            isSwapped = false;
            for(int j=0; j < unsorted.length -1 ; j++){
                BigInteger iValue = new BigInteger(unsorted[j]);
                BigInteger jValue = new BigInteger(unsorted[j+1]);
                if( jValue.compareTo(iValue) == -1 ){
                    temp = unsorted[j];
                    unsorted[j] = unsorted[j+1];
                    unsorted[j+1] = temp;
                    isSwapped = true;
                }
            }
            if(!isSwapped){
                break;
            }
        }
        return unsorted;
    }

    // Selection Sort O(N^2)
    static String[] bigSortingSelection(String[] unsorted) {
        // bubble sort
        String temp = "";
        for(int i = 0 ; i < unsorted.length -1 ; i++){
            for(int j=i+1; j < unsorted.length ; j++){
                BigInteger iValue = new BigInteger(unsorted[i]);
                BigInteger jValue = new BigInteger(unsorted[j]);
                if( jValue.compareTo(iValue) == -1 ){
                    temp = unsorted[i];
                    unsorted[i] = unsorted[j];
                    unsorted[j] = temp;
                }
            }
        }
        return unsorted;
    }
}
