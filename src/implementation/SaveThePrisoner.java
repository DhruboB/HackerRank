package implementation;

public class SaveThePrisoner {

    public static void main(String[] args) {
        int n = 352926151;
        int m = 380324688;
        int s = 94730870;

        System.out.println(saveThePrisoner(n,m,s));
    }

    // Complete the saveThePrisoner function below.
    static int saveThePrisoner(int n, int m, int s) {
        return ((m- 1) + (s - 1)) % n + 1;
    }
}
