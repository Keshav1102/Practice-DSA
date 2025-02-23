class Solution {
    public char findTheDifference(String s, String t) {
        int[] arr = new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a'] += 1;
            arr[t.charAt(i)-'a'] -= 1;
        }
        arr[t.charAt(t.length()-1)-'a'] -=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                return (char)(i+97);
            }
        }
        return 'a';
    }
}