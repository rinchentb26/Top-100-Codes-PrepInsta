import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int fact = 1;
        for (int i = n; i > 1; i--) {
            fact = fact * i;
        }
        System.out.println(fact);
        sc.close();
    }
}