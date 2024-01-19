

public class array {
    public static void main(String a[]){

        int array_1[] = {1,2,3,4,5};

        // System.out.println(array_1[1]);

        array_1[4] = 99;

        // System.out.println(array_1[4]);

        for(int i=0;i<5;i++){
            System.out.println(array_1[i]);
            
        }

        int array_2[] = new int[9];
        int j = 9;

        for(int i=0;i<9;i++){
            array_2[i] = j;
            j++;
        }
        for(int i=0;i<9;i++){
            System.out.println(array_2[i]);
        }

        
    }
    
}
