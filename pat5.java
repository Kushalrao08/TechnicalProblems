public class pat5 {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == 1) {
                    if (j == cols) {
                        System.out.print(2);
                    } else {
                        System.out.print(1);
                    }
                } else if (i == 2) {
                    if (j == 1) {
                        System.out.print(3);
                    } else {
                        System.out.print(2);
                    }
                } else if (i == 3) {
                    if (j == cols) {
                        System.out.print(4);
                    } else {
                        System.out.print(3);
                    }
                } else if (i == 4) {
                    if (j == 1) {
                        System.out.print(5);
                    } else {
                        System.out.print(4);
                    }
                } else if (i == 5) {
                    if (j == cols) {
                        System.out.print(6);
                    } else {
                        System.out.print(5);
                    }
                }
            }
            System.out.println();
        }
    }
}
