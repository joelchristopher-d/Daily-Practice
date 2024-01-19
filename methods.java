public class methods {


    static void method(){
        System.out.println("christopher");
    }

     static int add(int a,int b){
        System.out.println("joel");
        return a + b;
    }

    static char minus(){
        return 'l';
    }

    static String str(){

        return "joel";
    }


    static int gcd(int a, int b)
    {
        // if b=0, a is the GCD
        if (b == 0)
            return a;
 
        // call the gcd() method recursively by
        // replacing a with b and b with
        // modulus(a,b) as long as b != 0
        else
            return gcd(b, a % b);}
    public static void main(String a[]){

        int n1 = 10;
        int n2 = 99;
        
        method();
        add(n1,n2);
        System.out.println(add(n1,n2));
        System.out.println(minus());
        System.out.println(str());
        System.out.println(gcd(90,20000));
        System.out.println(2%5);
    }
}
