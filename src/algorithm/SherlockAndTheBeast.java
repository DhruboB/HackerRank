package algorithm;

public class SherlockAndTheBeast {
    public static void main(String[] args) {
        int k = 22;

        decentNumber(k);
    }

    // Complete the decentNumber function below.
    static void decentNumber(int n) {
        if (n < 3 || n == 4) {
            System.out.println(-1);
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (n % 3 == 0) {
            for (int i = 0; i < n; i++) {
                sb.append("5");
            }
            System.out.println(sb.toString());
            return;
        }
        int digit5 =-1;
        for(int i=0; n - i > 0 ; i += 5) {
            if ((n - i) % 3 == 0) {
                digit5 = n - i;
                break;
            }
        }
        if (digit5 != -1 && digit5 % 3 == 0) {
            for (int i = 0; i < digit5; i++) {
                sb.append("5");
            }
            for (int i = 0; i < n - digit5; i++) {
                sb.append("3");
            }
            System.out.println(sb.toString());
            return;
        }
        int digit3 =-1;
        for(int i=0; n - i > 0 ; i += 3) {
            if ((n - i) % 5 == 0) {
                digit3 = n - i;
                break;
            }
        }
        if (digit3 != -1 && digit3 % 5 == 0) {
            for (int i = 0; i < n - digit3; i++) {
                sb.append("5");
            }
            for (int i = 0; i < digit3; i++) {
                sb.append("3");
            }
        } else {
            System.out.println(-1);
            return;
        }
        System.out.println(sb.toString());
    }
}
