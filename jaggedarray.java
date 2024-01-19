public class jaggedarray {
    public static void main(String[] args){

        int array_1[][] = new int[3][];

        array_1[0] = new int[4];
        array_1[1] = new int[5];
        array_1[2] = new int[2];

        System.out.println(array_1.length);


        for(int i=0; i<array_1.length; i++){
            for(int j=0; j<array_1[i].length; j++){

                array_1[i][j] = (int)(Math.random() * 10);
            }
        }
        for(int i=0; i<array_1.length; i++){
            for(int j=0; j<array_1[i].length; j++){
                System.out.print(array_1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
