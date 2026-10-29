import java.util.HashMap;

public class SumOfHighestAndLowestFrequency {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3};

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }

        int maxFreq=0;
        int lowFreq=Integer.MAX_VALUE;

        for(int num: map.keySet()){
            int freq=map.get(num);

            if(freq>maxFreq){
                maxFreq=freq;
            }
            if(freq<lowFreq){
                lowFreq=freq;
            }
        }
        int sum= maxFreq+lowFreq;
        System.out.println(sum);
    }
}