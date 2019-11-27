public class Pattern
{
    
    public void printPattern(int n){
        
        int i,j;
        
        for(i=0;i<n;i++){
            for(j=0;j<=i;j++){
                System.out.print("*");
            }
        
            System.out.println();
        
        }
   
        for(i=n-1;i>0;i--){
            for(j=i;j>0;j--){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
   
   
    public static void main(String[] args) {
        
        int n=5;
        
        Pattern p=new Pattern();
        p.printPattern(n);
    
   
    }
}
