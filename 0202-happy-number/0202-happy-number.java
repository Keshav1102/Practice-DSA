class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(n>0){
            n = sumSqrt(n);
            if(set.contains(n)){
                return false;
            }
            if(!set.contains(n)) {
                set.add(n);
            }
            if(n==1) return true;
        }
        return true;
        
    }
    public int sumSqrt(int n){
        int sum =0;
        while(n>0){
            int rem = n%10;
            sum+= rem*rem;
            n/=10;
        }
        return sum;
    }
}