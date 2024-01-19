public class threedimensionalarray {
    public static void main(String args[]){
        
        int array_3[][][] = new int[3][3][5];
        int a = 0;
        for(int i=0;i<array_3.length;i++){
            for(int j=0;j<array_3[i].length;j++){
                for(int k=0;k<array_3[i][j].length;k++){
                    System.out.print(i+""+j+""+k+" ");
                    array_3[i][j][k]=a;
                    a++;
                }
                a=0;
                System.out.println();
            }
            // System.out.println();
        }
        for(int i[][]:array_3){
            for(int j[]:i){
                for(int k : j){
                
                    System.out.print(k);
                }
                System.out.println();
            }
        }
    }
    
}
