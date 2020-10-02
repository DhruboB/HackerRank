package implementation.medium;

public class DayoftheProgrammer {

    public static void main(String[] args) {
//        int year = 1984;
//        int year = 2017;
//        int year = 1800;
        int year = 1918;
//        int year = 2016;
        System.out.println(dayOfProgrammer(year));
    }

    static String dayOfProgrammer(int year){
        String date = "";
        if(year < 1700 || year > 2700 ) {
            return "Wrong year, year should be in range between 1700 and 2700";
        }
        if(year == 1918){
            date = "26.09.1918";
        }
        else if(year <  1918 ) {
            if(year % 4 == 0){
                date = "12.09." + year;
            }else {
                date = "13.09." + year;
            }
        } else {
            if( (year % 4 == 0 && year % 100 != 0 ) || year % 400 == 0 ){
                date = "12.09." + year;
            }else {
                date = "13.09." + year;
            }
        }
            return date;
    }
}
