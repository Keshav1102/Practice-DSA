class Solution {
    public int[] getNoZeroIntegers(int n) {
        int a = 1;
        int b = n-a;
        while(a<=b){
            if(containZero(a)&&containZero(b)){
                return new int[]{a,b};
            }
            a++;b--;
        }
        return new int[]{-1,-1};
        
    }
    public boolean containZero(int n){
        while(n>0){
            int rem = n%10;
            if(rem==0) return false;
            n/=10;
        }
        return true;
    }
}