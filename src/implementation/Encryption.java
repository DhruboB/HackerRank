package implementation;

public class Encryption {

    public static void main(String[] args) {
//        String str = "haveaniceday"; // hae and via ecy
//        String str = "feedthedog"; // fto ehg ee dd
        String str = "chillout"; // clu hlt io

        System.out.println(encryption(str));
    }

    public static String  encryption(String s){
        // assuming s cannot be NULL based on criteria
        s = s.trim();
        s = s.replaceAll(" ","");
        int length = s.length();
        double sqrt = Math.sqrt(length);
        double row = Math.floor(sqrt);
        double col = Math.ceil(sqrt);
        System.out.println(row + " " + col);
        while(row*col < length){
            row++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0 ; i < col; i++){
            for(int j=0 ; j < row; j++){
                int index = (int)(i + j *col);
                if( index < length ){
                    sb.append(s.charAt(index));
                }
            }
            sb.append(" ");
        }
        return sb.toString();
    }

}
