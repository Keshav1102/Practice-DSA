class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<>();
        String[] arr = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        for(String s:words){
            String str = " ";
            for(int i=0;i<s.length();i++){
                str+=arr[s.charAt(i)-'a'];
            }
            set.add(str.trim());
        }
        return set.size();

    }
}