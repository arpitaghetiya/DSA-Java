public class MoveZerostoEnd{
    public static void main(String args[]){
        int arr[]={2,0,3,0,4,5,0};
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                for(int j=i; j<arr.length-1; j++){
                    arr[j]=arr[j+1];
                }
                arr[arr.length-1] = 0;
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}