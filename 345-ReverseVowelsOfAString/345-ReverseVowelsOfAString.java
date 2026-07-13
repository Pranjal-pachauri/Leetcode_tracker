// Last updated: 7/13/2026, 10:09:49 AM
class Solution {
    public String reverseVowels(String s) {
        char str[]=s.toCharArray();
    int i=0,j=str.length-1;

    while(i<j){
        if(isVowel(str[i]) && isVowel(str[j])){
            char temp = str[i];
                str[i] = str[j];
                str[j] = temp;
                i++;
                j--;
        }
        if(!isVowel(str[i]) )   i++;
        if(!isVowel(str[j]) )   j--;
    }
    return new String(str); }

   public static boolean isVowel(char ch) {
        if((ch=='a' || ch=='e' || ch =='i' || ch=='o' || ch=='u') || 
        (ch=='A' || ch=='E' || ch =='I' || ch=='O' || ch=='U')){
            return true;
        }
        return false;
}

}