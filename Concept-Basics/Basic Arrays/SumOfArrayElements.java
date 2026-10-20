public class SumOfArrayElements{
    public static void main(String[] args) {
        int arr[]={1,2,33,4};
        int n=arr.length;
        int res=arr[0];

        for(int i=1; i<n; i++){
            res=res+arr[i];
        }    
        System.out.println(res);
    }
}