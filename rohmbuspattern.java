public class rohmbuspattern {
    public static void main(String[] args) {
        int m = 5;
        
        for(int i=1;i<=m;i++){
            for(int j=1;j<=m-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=m;j++){
                System.out.print("*");
            }
               System.out.println();
            
        }
    }
    
}
