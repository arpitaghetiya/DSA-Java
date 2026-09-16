public class Pattern19 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i < n; i++) {
            for(int j = n-i-1; j >= 0; j--) {
                System.out.print("*");
            }
            for(int k = 0; k < i*2; k++) {
                    System.out.print(" ");
            }
            for(int l = n-i-1; l >=  0; l--) {
                System.out.print("*");
            }
                System.out.println();
        }

        for(int m = 0; m < n; m++) {
            for(int a = 1; a <= m+1; a++) {
                System.out.print("*");
            }
            for(int o = 2*n-2-2*m; o >= 1; o--) {
                System.out.print(" ");
            }
            for(int p = 1; p <= m+1; p++) {
                System.out.print("*");
            }
            System.out.println();
    }
}
}