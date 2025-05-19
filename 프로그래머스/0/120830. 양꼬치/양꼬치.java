class Solution {
    public int solution(int n, int k) {
        final int LAMB_PRICE = 12000;
        final int BEVERAGE_PRICE = 2000;
        
        int serviceCnt = n / 10;
        
        int totalPrice = n * LAMB_PRICE + (k - serviceCnt) * BEVERAGE_PRICE;
        
        return totalPrice;
    }
}