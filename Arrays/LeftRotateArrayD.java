public class LeftRotateArrayD {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int D=2;
        for(int i=0; i<D; i++){
            int first= arr[0];
            for(int j=0; j<arr.length-1; j++){
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=first;
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");   
        }
    }
    
}
