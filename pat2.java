package javapractice;

public class pat2 {

    public static void pat(int n){
        int a = 1;
        for(int i =1;i<n;i++){
            // System.out.println(i);
            // int a = 1;
            for(int j = 1 ;j<i+1; j++){
                System.out.print(a+" ");
                a+=1;
            }
            System.out.println();
        }
    }
    public static void main(String a[]){
        pat(6);
    }
}
