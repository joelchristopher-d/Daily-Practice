public class if_elseif {
    public static void main(String a[]){

        int x = 10;
        int y = 100;

        if (x>y && x == 10){
            System.out.println("if");
        }
        else if(x<y && x == 10){
            System.out.println("elseif");
        }
        else{
            System.out.println("else");
        }

    }
}
