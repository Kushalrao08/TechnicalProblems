public class housSteal {

    public static int maxSteal(int[] val) {
        int n = val.length;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return val[0];
        }
        int[] max = new int[n];
        max[0] = val[0];
        max[1] = Math.max(val[0], val[1]);
        for (int i = 2; i < n; i++) {
            max[i] = Math.max(max[i - 1], max[i - 2] + val[i]);
        }
        return max[n - 1];
    }

    public static void main(String[] args) {
        int[] val = { 6, 7, 1, 3, 8, 2, 5 };
        System.out.println("Maximum amount: " + maxSteal(val));
    }
}
