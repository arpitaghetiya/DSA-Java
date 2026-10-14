class Solution {
    public int findGCD(int[] nums) {
       int smallest= nums[0];
       int largest= nums[0];

       for(int i=0; i<nums.length; i++){
        if(smallest> nums[i]){
         smallest= nums[i];
       }
       if(largest<nums[i]){
        largest=nums[i];
       }
       }

       int a=largest;
       int b=smallest;

       while(b!=0){
        int rem=a%b;
        a=b;
        b=rem;
       }
       return a;
    }
}