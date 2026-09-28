class Solution {
    public int maxDepth(String s) {
        int isEmpty = 0;
        int max=0,count=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(isEmpty==0){

                count =0;
            }
            if(ch==')') isEmpty--;
            else if(ch=='(') {
                count++;
                isEmpty++;
                max = Math.max(max,isEmpty);

            }
            else continue;
        }
        return max;
    }
}