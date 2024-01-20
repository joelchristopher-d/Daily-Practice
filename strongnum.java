package javapractice;

public class strongnum {
    public static void main(String a[]){
       String str = "153";
       int c =1;
        int b = 0;
        // System.out.println(str.charAt(1));
       for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            // System.out.println(ch);
        for(int j=1;j<=Integer.parseInt(String.valueOf(ch));j++){
            c*=j;

        }
        b+=c;
        c=1;

        
          
       }
       System.out.println(b);
       if(Integer.parseInt(str) == b){
        System.out.println(b+" is a strong num");

       }
       else{
        System.out.println(str+" is not a strong num");
       }
            
    }
}
