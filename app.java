import java.util.Scanner;

public class app {
    public static void main (String[] args) {
        System.out.println("Enter a Number :");
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt();
        for (int i=1; i<=x; i++) {
            System.out.println(i+": Let's CODE");
        }
    }
}