import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N = 2;
        while (N < 100) {

            if (demo(N)) {
                System.out.println(N);
            }
            N++;
        }
    }

    public static boolean demo(int n) {
        boolean check = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                check = false;
            }

        }
        if(check) return true;
        else return false;
    }
}


