import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter your number : ");
            int num = sc.nextInt();
            int original_num = num;

            int reverseNum = 0;
            while(num > 0){
                reverseNum *=  10;
                reverseNum += num%10;
                num/=10;
            }
            System.out.println("Revers Number of a Given Number "+ original_num + " = " + reverseNum );
        }
    }
}