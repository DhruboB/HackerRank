package implementation;

public class DesignerPDFViewer {

    public static void main(String[] args) {
        int[] heights = {1,3,1,3,1,4,1,3,2,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,7};
        String word = "zaba";
        System.out.println(designerPdfViewer(heights,word));
    }

    // Complete the designerPdfViewer function below.
    static int designerPdfViewer(int[] heights, String word) {
        int maxHeight = Integer.MIN_VALUE ;
        int len = word.length();
        for(int i = 0; i < len ; i++){
            int chr = word.charAt(i);
            int height = heights[chr - 'a'] ;
            if(maxHeight < height){
                maxHeight = height;
            }
        }
        return maxHeight * len;
    }
}
