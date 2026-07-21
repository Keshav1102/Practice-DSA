class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        k = k%(m--*n--);
        while(k>0){
            List<Integer> list = new ArrayList<>();
            for(int i=m;i>=0;i--){
                list.add(grid[i][n]);
                for(int j=n;j>0;j--){
                    grid[i][j] = grid[i][j-1];
                }
            }
            grid[0][0] = list.get(0);
            list.remove(0);
            for(int i=m;i>0;i--){
                grid[i][0] = list.get(0);
                list.remove(0);
            }
            
            
            k--;
        }
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i <= m; i++) {
            list.add(new ArrayList<>());
            for (int j = 0; j <= n; j++) {
                list.get(i).add(grid[i][j]);
            }
        }
        return list;
    }
}