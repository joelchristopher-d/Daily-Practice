package javapractice;
import java.util.Scanner;

public class strong {
    public static void main(String a[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int  n = scanner.nextInt();
        scanner.close();
        int m = n;
        int b=0;
        int c=1;
        while(n!=0){
            int temp = n%10;
            n/=10;
            for(int i=1;i<=temp;i++){
                c*=i;
            }
            b+=c;
            c=1;

        }
        if(m==b){
            System.out.println("output:"+b+" is equal to input:"+m);
        }
        else{
            System.out.println("output:"+b+" is not equal to input:"+m);
        }
    }   
}
