import java.util.*;
public class Sum {
    public static void main(String args[]) {
         Scanner in= new Scanner(System.in);
         System.out.print("enter value for a:");
         int a=in.nextInt();
         System.out.print("enter value for b:");
         int b=in.nextInt();
         System.out.print("enter value for c:");
         int c=in.nextInt();

         int sum=a+b+c;
         System.out.println("final answer is  "+sum);
         
    }
}