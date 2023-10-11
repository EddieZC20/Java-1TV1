package p03iii;

public class P03III {

    public static void main(String[] args) {
        int Tablero[][]={{1,0,0,0,1,0,0,0},
                        {0,0,0,0,1,0,0,0},
                        {0,0,0,0,1,0,0,0},
                        {0,0,0,0,1,0,0,0},
                        {0,0,0,0,1,0,0,0},
                        {0,0,0,0,1,0,0,0},
                        {0,0,0,0,1,0,0,0},
                        {0,0,0,0,1,0,0,0}};
        
        int DI[], DD[];
        DI=new int[15];
        DD=new int[15];
        
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (Tablero[i][j]==1) {
                    DI[i+j]++;
                    DD[i-j+7]++;
                    
                }
                
            }
        }
        
        for (int i = 0; i < 15; i++) {
            System.out.print(DD[i]+" ");
            
        }
        System.out.println("");
        
        for (int i = 0; i < 15; i++) {
            System.out.print(DI[i]+" ");
            
        }
        
        
                
        
    }
}
