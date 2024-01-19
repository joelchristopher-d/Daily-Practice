class Calculator{

    public int add(int a,int b){
        return a + b;
    }

    public int add(int a,int b,int c){
        return a + b + c;
    }

}


public class methodoverloading {

    public static void main(String a[]){

     Calculator obj = new Calculator();
        
    int i =  obj.add(1,2);
    int j = obj.add(1,2,3);

    System.out.println(i+"\n"+j);

    }
}
