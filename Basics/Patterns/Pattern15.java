public class Pattern15 {
    public static void main(String[] args){
        int n=5;
        for(int i=0;i<n;i++){
            char ch='A';
            for(int j=n-i;j>=1;j--){
                System.out.print(ch++);
                
            }
            System.out.println();
        }
    }
}
