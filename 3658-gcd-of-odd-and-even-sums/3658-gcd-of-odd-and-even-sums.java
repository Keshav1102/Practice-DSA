class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd=0,sumEven=0;
        for(int i=1;i<=n*2;i++){
            if(i%2!=0){
                sumOdd+=i;
            }
            else sumEven+=i;
        }
        int x=Math.min(sumEven,sumOdd);
        while(x>0){
            if(sumEven%x==0 && sumOdd%x==0){
                break;
            }
            x--;
        }
        return x;
    }
}