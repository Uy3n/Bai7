import java.util.Scanner;

public class Exercise {

    /*
    Cho ma trận a kích thước m x n:
    1. Tìm xem a có chứa phần tử x không?
    2. Ma trận a có phải toàn các số nguyên tố không?
    3. Tìm max
    4. Tính tổng các phần tử trên
        4.1. Dòng d, cột c.
        4.2. Đường chéo chính, chéo phụ (mt vuông)
        4.3. Nửa trên/dưới đường chéo chính (mt vuông)
        4.4. Nửa trên/dưới đường chéo phụ (mt vuông)
     */
    public static void main(String[] args) {

        int[][] a = inputMatrix();
        printMatrix(a);
//        System.out.println(findElement(a));
//        System.out.println(isPrimeMatrix(a));
//        System.out.println(findMax(a));
//        System.out.println(sumRow(a));
//        System.out.println(sumColumn(a));
    }

    public static int[][] inputMatrix() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Số dòng: ");
        int d = sc.nextInt();

        System.out.print("Số cột: ");
        int c = sc.nextInt();

        int[][] ret = new int[d][c];

        for (int i = 0; i < d; i++) {
            for (int j = 0; j < c; j++) {
                System.out.format("a[%d][%d] = ", i, j);
                ret[i][j] = sc.nextInt();
            }
        }
        return ret;
    }

    public static void printMatrix(int[][] a) {
        for (int i = 0, d = a.length; i < d; i++) {
            for (int j = 0, c = a[0].length; j < c; j++) {
                System.out.format("   %-5d ", a[i][j]);
            }
            System.out.println();
        }
    }

    public static boolean findElement(int[][] a) {
        Scanner sc = new Scanner(System.in);
        boolean result = false;

        System.out.println("Nhap x: ");
        int x = sc.nextInt();

        for (int i = 0, d = a.length; i < d; i++) {
            for (int j = 0, c = a[0].length; j < c; j++) {
                if (a[i][j] == x) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }

    public static boolean isPrimeMatrix(int[][] a) {
        boolean primeMatrix = true;

        for (int i = 0, d = a.length; i < d; i++) {
            for (int j = 0, c = a[0].length; j < c; j++) {
                if (a[i][j] < 2) {
                    primeMatrix = false;
                    break;
                } else {
                    for (int x = 2; x <= (int) ((a[i][j]) / 2); x++) {
                        if (a[i][j] % x == 0) {
                            primeMatrix = false;
                            break;
                        }
                    }
                }
            }
        }
        return primeMatrix;
    }

    public static int findMax(int[][] a) {
        int max = a[1][1];
        for (int i = 0, d = a.length; i < d; i++) {
            for (int j = 0, c = a[0].length; j < c; j++) {
                if (max < a[i][j]) {
                    max = a[i][j];
                }
            }
        }
        return max;
    }

    public static int sumRow(int[][] a) {
        int sumRow = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vị trí dòng: ");
        int x = sc.nextInt();

        if (x >= a.length) {
            sumRow = 0;
        } else {
            for (int j = 0, c = a[0].length; j < c; j++) {
                sumRow += a[x][j];
            }
        }
        return sumRow;
    }

    public static int sumColumn(int[][] a) {
        int sumColumn = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vị trí cột: ");
        int y = sc.nextInt();

        if (y > a[0].length) {
            sumColumn = 0;
        } else {
            for (int i = 0, d = a.length; i < d; i++) {
                sumColumn += a[i][y];
            }
        }
        return sumColumn;
    }

}
