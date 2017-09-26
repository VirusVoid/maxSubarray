import java.util.Arrays;

class priceMas {
    static int[] subMas(int Price[]) {
        int Delta[] = new int[Price.length - 1];
        for (int i = 0; i < Price.length - 1; i++) {
            Delta[i] = Price[i + 1] - Price[i];
        }
        return Delta;
    }

    static void prn(int a[]) {
        System.out.println(Arrays.toString(a));
    }

    static void searchSubmas(int Price[], int Delta[]) {
        int maxSum = 0;
        int curSum = 0;
        int begin = 0;
        int end = 0;
        int a = 0;
        for (int i = 0; i < Delta.length; i++) {
            curSum += Delta[i];
            if (curSum > maxSum) {
                maxSum = curSum;
                begin = a + 1;
                end = i;
            }

            if (curSum < 0) {
                curSum = 0;
                a = i;
            }
        }
        for (int i = begin; i <= end + 1; i++)
            System.out.print(Price[i] + " ");
        System.out.println();
        System.out.println(maxSum);
    }
}
