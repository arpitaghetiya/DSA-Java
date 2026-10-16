class Solution {
    public String gcdOfStrings(String str1, String str2) {

        if(!(str1+str2).equals(str2+str1)){
        return "";
        }

        int s1=str1.length();
        int s2=str2.length();

        while(s2!=0){
            int rem=s1%s2;
            s1=s2;
            s2=rem;
        }

        return str2.substring(0,s1);
    }
}