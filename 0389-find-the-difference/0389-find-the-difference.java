class Solution {
    public char findTheDifference(String s, String t) {
        int[] arr = new int[26];
        int len = s.length();
        for(int i=0;i<len;i++){
            arr[s.charAt(i)-'a'] += 1;
            arr[t.charAt(i)-'a'] -= 1;
        }
        arr[t.charAt(len)-'a'] -=1;
        for(int i=0;i<26;i++){
            if(arr[i]!=0){
                return (char)(i+97);
            }
        }
        return 'a';
    }
}