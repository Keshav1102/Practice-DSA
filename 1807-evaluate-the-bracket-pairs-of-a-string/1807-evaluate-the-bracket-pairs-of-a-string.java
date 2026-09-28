class Solution {
    public String evaluate(String s, List<List<String>> K) {
        HashMap<String, String> map = new HashMap<>();
        StringBuilder str = new StringBuilder();
        for(var v:K){
            map.put(v.get(0),v.get(1));
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                int j = s.indexOf(')',i+1);
                str.append(map.getOrDefault(s.substring(i+1,j),"?"));
                i=j;
            }
            else{
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
}