public class Pattern17 {
    public static void main(String[] args){
        int n=4;
        for(int i=0; i<=n-1; i++){
            char ch='A';
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=1+i; k++){
                System.out.print(ch++);
            }
            ch--;
            for(int l=2; l<=i+1; l++){
                System.out.print(--ch);
            }
            System.out.println();
        }
    }
}
