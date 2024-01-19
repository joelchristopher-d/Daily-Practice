public class multidimensionalarray {
    public static void main(String a[]){
        int m_array[][] = new int[3][4];
        int arr = {1,2,3};

        for(int i=0;i<3;i++){

            for (int j= 0;j<4;j++){
                
                m_array[i][j] = (int)(Math.random() * 10);
            }
        }


        // for(int i=0;i<3;i++){

        //     for (int j= 0;j<4;j++){
                
        //       System.out.print(m_array[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        for(int n[] : m_array){
            
            for(int y : n){
                
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}
