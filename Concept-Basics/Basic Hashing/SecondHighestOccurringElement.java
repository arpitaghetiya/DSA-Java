import java.util.HashMap;
public class SecondHighestOccurringElement {
    public static void main(String args[]){
        int arr[]={1,2,3,1,2,1};
        HashMap<Integer, Integer> map=new HashMap<>();

        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }

        int maxFreq=0;
        int secMax=0;
        for(int num: map.keySet()){
            int freq=map.get(num);

            if (freq > maxFreq) {
                secMax = maxFreq;
                maxFreq = freq;
            }else if (freq < maxFreq && freq > secMax) {
                secMax = freq;
            }
        }
        System.out.println(secMax);
    }
}
