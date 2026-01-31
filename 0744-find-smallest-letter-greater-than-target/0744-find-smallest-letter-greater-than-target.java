class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int s=0, r=letters.length-1;
        while(s<=r){
            int mid = (s+r)/2;
            if(letters[mid]>target){
                r = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        return letters[s%letters.length];
    }
}