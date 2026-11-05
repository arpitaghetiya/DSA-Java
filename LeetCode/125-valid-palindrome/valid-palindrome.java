class Solution 
{
    public boolean isPalindrome(String s) 
    { String s1 = s.toLowerCase();
        int l = 0 ;
        int r = s.length()-1;
        while( l<=r)
        { 
            if ( Character.isLetterOrDigit(s1.charAt(l))&& Character.isLetterOrDigit(s1.charAt(r)))
            {
                if ( s1.charAt(l)!=s1.charAt(r))
                {
                 return false ;
                }
                l++;
                r--;
            }
            else if(Character.isLetterOrDigit(s1.charAt(l))==false)
             l++;
             else 
            r--;
        }
        return true ;
    }
}