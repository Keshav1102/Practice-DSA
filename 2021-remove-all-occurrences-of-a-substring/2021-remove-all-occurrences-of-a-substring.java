class Solution {
    public String removeOccurrences(String s, String part) {
        int j=s.indexOf(part), len2=part.length();
        if(s.length()<len2){
            return s;
        }
        StringBuilder str = new StringBuilder(s);
        while(j!=-1){
            str.delete(j,len2+j);
            j=str.indexOf(part);
        }
        return str.toString();
    }
}