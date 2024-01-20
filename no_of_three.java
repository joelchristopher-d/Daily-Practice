package javapractice;
import java.util.Scanner;

public class no_of_three {
    public static void main(String[] args) {
		int n = 30;
		int m = 40;
		int count = 0;
		
		for(int i=n;i<=m;i++) {
            int j =i;
			while(j!=0) {
				int temp = j%10;
				j/=10;
				if (temp == 3){
					count+=1;
				}
				
						
			}
		}
		System.out.println(count);
	}
    
}
