class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int i=0, len = bits.length;
        while(i<len){
            if(bits[i]==1 && i!=len-2) i+=2;
            else if(i==len-2 && bits[i]==1){
                return false;
            }
            else{i++;}
        }
        return true;
    }
}