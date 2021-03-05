import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for(;;){
            System.out.println("Введите число а");
            Scanner sc=new Scanner(System.in);


        int a = sc.nextInt();
            System.out.println("Введите число б");
        long b = sc.nextLong();
        long c = a + b;
        System.out.println(c);}
    }
}
