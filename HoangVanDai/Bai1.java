package bai1;

/**
 * Class khởi tạo 2 phương thức
 *
 * @author Đại Hoàng
 */
public class Bai1 {

    /**
     * Phương thức tìm ước chung lớm nhất của 2 số nguyên
     *
     * @param a số thứ nhất
     * @param b số thứ hai
     * @return ước chung lớn nhất của 2 số nguyên a, b
     */
    public int timUocChungLonNhat(int a, int b) {
        int tam = 0;

        if ((a == 0) && (b == 0)) {
            System.err.println("Khong co uoc chung lon nhat thoa man");
            return -1;
        } else {
            while (b != 0) {
                tam = a % b;
                a = b;
                b = tam;
            }
            if (a < 0) {
                return -a;
            } else {
                return a;
            }
        }
    }

    /**
     * Phương thức tính Fibonacci của 1 số nguyên dương
     *
     * @param n là nguyên cần tính Fibonacci
     * @return Fibonacci của số nguyên dương n
     */
    public int tinhFibonacci(int n) {
        if (n < 0) {
            System.err.println("Dau vao khong hop le");
            return -1;
        } else if (n <= 1) {
            return n;
        } else {
            return tinhFibonacci(n - 1) + tinhFibonacci(n - 2);
        }
    }
}
