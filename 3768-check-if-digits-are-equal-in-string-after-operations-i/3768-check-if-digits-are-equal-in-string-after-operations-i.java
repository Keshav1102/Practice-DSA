class Solution {
    public boolean hasSameDigits(String s) {
        if(s.length()==2){
            return s.charAt(0)==s.charAt(1);
        }
        StringBuilder str = new StringBuilder();
        for(int i=0;i<s.length()-1;i++){
            int a = s.charAt(i), b=s.charAt(i+1);
            a = (a+b)%10;
            str.append(String.valueOf(a));
        }
        return hasSameDigits(str.toString());
    }
}