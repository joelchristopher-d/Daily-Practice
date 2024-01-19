public class assigmentoperators {
    public static void main(String a[]){

        int num1 = 7;
        int num2 = 5;
        //----arithmetic operators---------//

        int result1 = num1 +num2;
        int result2 = num1-num2;
        int result3 = num1/num2;
        int result4 = num1 % num2;
        System.out.println(result1);
        num1 += 1;
        num2 -= 2;
        num1 *= 2;
        num1 /= 9;

        num1++; //post increment
        num1--;
        --num1; //pre increment
        ++num1;


        int num = 10;
        int numb = 10;

        int r1 = num++; //asssign 1st and increment 2nd
        int r2 = ++numb; // increment 1st and assign 2nd

        System.out.println(r1+"\n"+r2);

    }
}
