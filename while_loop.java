public class while_loop {
    public static void main(String a[]){

        String b = "hi";
        int i =0;
        while(i <= 10){
            System.out.println(i+":"+b);
            i++; 
        }


        int l = 1;
        while(l<4){
            System.out.println("l"+":"+l);
            int m = 1;
            while(m<4){
                System.out.println("m"+":"+m);
                m++;
            }
            l++;
        }
    }
}
