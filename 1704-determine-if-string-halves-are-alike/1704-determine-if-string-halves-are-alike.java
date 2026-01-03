class Solution {
    static{
        for(int i=0;i<200;i++){
            halvesAreAlike(" ");
        }
    }
    public static boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        int n = s.length()/2;
        int fvowel = 0;
        int svowel = 0;
        for(int i=0;i<n;i++)
        {
            char ch = s.charAt(i);
            if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u')
            {
                fvowel++;
            }
        }

        for(int i=n;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u')
            {
                svowel++;
            }
        }
        return fvowel == svowel;
    }
}