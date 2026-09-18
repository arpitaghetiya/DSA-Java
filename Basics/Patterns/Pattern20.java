public class Pattern20 {
    public static void main(String[] args){
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=1;j<=i+1;j++){
                System.out.print("*");
            }
            for(int k=2*(n-i-1);k>0;k--){
                System.out.print(" ");
            }
            for(int l=1;l<=i+1;l++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=n-i-1;j>=0;j--){
                System.out.print("*");
            }
            for(int k=0;k<i*2;k++){
                System.out.print(" ");
            }
            for(int l=n-i-1;l>=0;l--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
