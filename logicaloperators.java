
  // & - AND
  // | - OR
  // ! - NOT



public class logicaloperators {
    public static void main(String a[]){

        int aa = 9;
        int b = 10;

        boolean bo = aa < b && aa > b;
        boolean bo1 = aa < b || aa > b;

        System.out.println(bo);
        System.out.println(bo1);
        System.out.println(!bo1);

    }
}
