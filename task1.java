package technoHacks;

import java.util.*;

public class task1 {
    /*
     * Calculator
     * Create a basic calculator that can perform
     * basic arithmetic operations such as addition,
     * subtraction, multiplication, and division.
     */

    class calculator{
        private static int add(int a,int b){
            return a+b;
        }
        private static int sub(int a,int b){
            return a-b;
        }
        private static double div(int a,int b){
            return a/b;
        }
        private static long multi(int a,int b){
            return a*b;
        }
        private static int mod(int a,int b){
            return a%b;
        }

        public static void main(String []args){
            try(Scanner scanner = new Scanner(System.in)){
                System.out.println("enter two numbers to perform some basic methods on it:");
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int result1 = add(a,b);
                int result2 = sub(a,b);
                double result3 = div(a,b);
                long result4 = multi(a,b);
                int result5 = mod(a,b);
                System.out.println("result after performing addition method : " +result1);
                System.out.println("result after performing subtract method : " +result2);
                System.out.println("result after performing divide method : " +result3);
                System.out.println("result after performing multiply method : " +result4);
                System.out.println("result after performing modulus method : " +result5);

            }
        }
    }
}
