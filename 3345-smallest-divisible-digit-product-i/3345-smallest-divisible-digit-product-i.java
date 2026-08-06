class Solution {
    public int smallestNumber(int n, int t) {
        while (true) {
            if (isDivisible(n, t)) {
                return n;
            }
            n++;
        }
    }

    private boolean isDivisible(int num, int t) {
        int product = 1;
        int temp = num;

       
        while (temp > 0) {
            int digit = temp % 10;
            product *= digit;
            temp /= 10;
        }

        return product % t == 0;
    }
}
