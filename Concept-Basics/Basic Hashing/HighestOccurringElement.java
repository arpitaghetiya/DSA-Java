import java.util.HashMap;
import java.util.Map;
public class HighestOccurringElement{
    public static void main(String args[]){
        int arr[]={1,2,3,1,2,1};
        HashMap<Integer, Integer> map=new HashMap<>();

        for(int i=0; i<arr.length; i++){
            int num=arr[i];
            if(map.containsKey(num))
                map.put(num, map.get(num)+1);
            else
                map.put(num,1);
        }
        int maxFreq = 0;
        int maxNum = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();

            if (freq > maxFreq) {
                maxFreq = freq;
                maxNum = num;
            }
        }

        System.out.println("Highest occurring element: " + maxNum);
        System.out.println("Frequency: " + maxFreq);
    }
}