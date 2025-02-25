class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // int i=0,a=1;
        // while(i<temperatures.length){
        //     if(a==temperatures.length){
        //         temperatures[i] = 0;
        //         i++;
        //         a=i+1;
        //     }
        //     else if(temperatures[i]<temperatures[a]){
        //         temperatures[i] = a-i;
        //         i++;a=i+1;
        //     }
        //     else{
        //         a++;
        //     }
        // }
        // return temperatures;
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int idx = stack.pop();
                result[idx] = i - idx;
            }
            stack.push(i);
        }

        return result; 
    }
}