import java.util.Scanner;
public class Factorial {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("choose a number");
       int num = sc.nextInt();
       int fact = Calculate(num);
       System.out.print("Result of " + num + " is " + fact);
   }
    public static int Calculate(int num){
        if(num == 0){
            return 1;
        }
        return num * Calculate(num-1);
    }
}
