package javapractice;
import java.util.Scanner;

public class pattern {

    
    public static void patter (int n) {
		int x = 10;
       
        for(int i =0;i<n;i++) {
                
            for(int j =0;j<i+1;j++) {

                System.out.print("  ");
            }
                

            for(int k = n;k>i;k--){

                System.out.print("* ");
            }

            System.out.println(" ");

            }
            
        }
    


    public static void main(String a[]){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

    int num = myObj.nextInt();
        patter(num);
        }
    }

