class Solution {
    public long distributeCandies(int n, int limit) {
        return totalCount(n) - 3*totalCount(n-(limit+1)) +3*totalCount(n-2*(limit+1)) - totalCount(n-3*(limit+1));
    }
    public long totalCount(long num){
        if(num<0) return 0;
        return ((num+2)*(num+1))/2;
    }
}