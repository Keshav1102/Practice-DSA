class Solution {
    public long sumAndMultiply(int n) {
        long x=0,sum=0;
        while(n>0){
            long rem = n%10;
            if(rem!=0){
                x*=10;
                x+=rem;
                sum+=rem;
            }
            n/=10;
        }
        while(x>0){
            long rem = x%10;
            n*=10;
            n+=rem;
            x/=10;
        }
        return n*sum;
    }
}