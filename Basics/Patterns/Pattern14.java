public class Pattern14 {
    public static void main(String[] args){
        int n=5;
        for(int i=0;i<n;i++){
            char ch='A';
            for(int j=1;j<=i+1;j++){
                System.out.print(ch++);
                
            }
            System.out.println();
        }
    }
}
