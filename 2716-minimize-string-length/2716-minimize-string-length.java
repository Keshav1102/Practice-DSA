class Solution {
    public int minimizedStringLength(String s) {
        char[] ch = new char[s.length()];
        for(int i=0;i<ch.length;i++){
            ch[i] = s.charAt(i);
        }
        Arrays.sort(ch);
        int j=1;
        for(int i=0; i<ch.length-1; i++){
            if(ch[i] != ch[i+1]){
                ch[j] = ch[i+1];
                j++;
            }
        }
        return j;
    }
}