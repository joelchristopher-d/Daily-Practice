class Class1{

    static String str (int a){

        if (a>8){
            return "joe";
        }

        return "sach";
        
    }
}



public class methods1 {

    public static void main (String a[]){

        Class1 c = new Class1();
        String r = c.str(0);
        System.out.println(r);
    }
}
