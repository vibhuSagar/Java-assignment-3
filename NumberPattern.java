public class NumberPattern
{
    
    public void printPattern(int n){
        
        int i,j;
        
        for(i=0;i<n;i++){
            for(j=0;j<=i;j++){
                System.out.print(i+1);
            }
        
            System.out.println();
        
        }
   
        for(i=n-1;i>0;i--){
            for(j=i;j>0;j--){
                System.out.print(i);
            }
            
            System.out.println();
        }
    }
   
   
    public static void main(String[] args) {
        
        int n=5;
        
        NumberPattern p=new NumberPattern();
        p.printPattern(n);
    
   
    }
}
