public class typecoversion {
    public static void main(String args[]){
        
        byte b = 127;
        

        // b = a;(range is big for byte) 
       int a = b; //implicit conversion(converting)
        System.out.println(b);
        //-----------------------------------//
        byte x;
        int y = 12;

        x = (byte)y; //explicit conversion(casting)

        System.out.println(x);
        //-----------------------------------//

        int l = 259; //259%256==3
        byte bh = (byte)l;

        System.out.println(bh);

        //-----------------------------------//

        float f = 9.9f;
        int t = (int)f;
        System.out.println(t);

        int i = 9;
        float j = (float)i;
        System.out.println(j);

        //--------------------------------------//

        byte p = 10;
        byte q = 30;

        int res = p*q;
        System.out.println(res);



    }
}
