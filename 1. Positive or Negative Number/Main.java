import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n = sc.nextInt();
        if(n>0)
            System.out.println("Number is positive.");
        else if(n<0)
            System.out.println("Number is negative.");
        else
            System.out.println("Number is 0.");
    }
}