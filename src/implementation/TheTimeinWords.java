package implementation;

public class TheTimeinWords {

    public static void main(String[] args) {
        int hour = 1;
        int minutes = 1;

        System.out.println(timeInWords(hour,minutes));
    }

    // Complete the timeInWords function below.
    static String timeInWords(int h, int m) {
        String[] hours = {"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve"};
        if(m == 0){
            return hours[h-1] + " o' clock";
        }

        if(m <= 30){
            if( m == 15){
                return "quarter past " + hours[h-1];
            }else if( m == 30){
                return "half past " + hours[h-1];
            }else{
                String minuteStr = m == 1 ? "minute" : "minutes";
                return changeToWord(m) + " " + minuteStr +" past " + hours[h-1];
            }
        }

        if( m == 45){
            return "quarter to " + hours[h];
        }

        return changeToWord(60 - m) + " minutes to " + hours[h];
    }

    private static String changeToWord(int n)
    {
        String ans = "";
        String one[] = { " ", "one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
                "nineteen" };

        String ten[] = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

        if (n > 19){
            ans = ten[n / 10] + " " + one[n % 10];
        }else {
            ans = one[n];
        }
        return ans;
    }
}
