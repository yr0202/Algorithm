class Solution {
    public double solution(int[] numbers) {
        int arrLength = numbers.length;
        int sum = 0;
        for(int i : numbers){
            sum += i;
        }
        double answer = (double) sum/arrLength;
        return answer;
    }
}