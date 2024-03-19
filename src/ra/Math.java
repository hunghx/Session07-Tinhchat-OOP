package ra;

public class Math {
    // thuộc về lớp
    // thuộc tính tĩnh
    public int count; // taaoj ra đối tượng - cấp phát động - new
    public static final double PI = 3.14;

    static {
        // chạy ngay sau khi khởi tạo các thành phần tĩnh khác và chạy trươc hàm main
        System.out.println("Bắt đầu chạy khối static");
//        PI =1000;
        double sum = sum(2, 3);
        System.out.println("Kết thúc static");

    }

    // phương thức tĩnh
    public static double sum(final double a, final double b) {
        return a + b;
    }

    public static double sum(final byte a, final double b) {
        return a + b;
    }

    public static double sum(final int a, final double b) {
        return a + b;
    }
    // Ctrl+ Alt +L

    public static double sum(final short a, final double b) {
        return a + b;
    }

    public static double sum(final long a, final double b) {
        return a + b;
    }

    public static double sum(final double a, final long b) {
        return a + b;
    }

    public static class SubClass {
        public int size;
    }
}
