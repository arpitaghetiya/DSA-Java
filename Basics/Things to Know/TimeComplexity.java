public class TimeComplexity {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};

        //O(1)
        int n=1;
        for(int i=0; i<n; i++){
            System.out.println("Element found at index:" + arr[i]);
        }

        //O(N)
        int m=5;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==m){
            System.out.println("Element found at index:" + arr[i]);
            }
        }

       //O(N^2)
       for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                    System.out.println(arr[i] + " " + arr[j]);
            }
        }
        
        //O(log N)
        int a=20;
        while(a>0){
            System.out.println(a=a/2);
        }
    }
}

