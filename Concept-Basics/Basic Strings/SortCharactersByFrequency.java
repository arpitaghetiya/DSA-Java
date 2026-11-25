import java.util.*;

class Solution {
    public List<Character> frequencySort(String s) {

        int arr[] = new int[26];

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            arr[ch - 'a']++;
        }

        List<Character> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) {
                list.add((char)(i + 'a'));
            }
        }

        list.sort((a, b) -> {
            if(arr[a - 'a'] != arr[b - 'a']) {
                return arr[b - 'a'] - arr[a - 'a'];
            }
            return a - b;
        });

        return list;
    }
}