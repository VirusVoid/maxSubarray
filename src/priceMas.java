public class PriceMas {
    public int[] searchSubmas(int price[]) {
        int maxSum = 0;
        int curSum = 0;
        int begin = 0;
        int end = 0;
        int startPoint = -1;
        int k = 0;
        for (int i = 0; i < price.length; i++) {
            curSum += price[i];
            if (curSum > maxSum) {
                maxSum = curSum;
                begin = startPoint + 1;
                end = i;
            }

            if (curSum < 0) {
                curSum = 0;
                startPoint = i;
            }
        }
        int result[] = new int[end - begin + 1];
        for (int i = begin; i <= end; i++) {
            result[k] = price[i];
            k++;
        }
        return result;
    }
}