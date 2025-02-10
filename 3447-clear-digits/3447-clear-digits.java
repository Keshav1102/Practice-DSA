class Solution {
    public String clearDigits(String s){
        StringBuilder str = new StringBuilder(s);
        int index, i=0;
        while(i<str.length()){
            char ch = str.charAt(i);
            if(ch>47 && ch<58){
                index = nearest(str, i-1);
                if(index>-1) {
                    str.deleteCharAt(i);
                    str.deleteCharAt(index);
                    i=index;
                }
            }else{
                i++;
            }
        }
        return str.toString();
    }
    public int nearest(StringBuilder s, int x){
        while(x>=0){
            char ch = s.charAt(x);
            if (ch>96 && ch<123) {
                return x;
            }
            x--;
        }
        return -1;
    }
}