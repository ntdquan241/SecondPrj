package iuh.fit.se;

    import java.util.Scanner;

    public class TestRectangle {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Nhập giá trị chiều dài và chiều rộng từ người dùng
            System.out.print("Enter the length : ");
            double length = scanner.nextDouble();
            System.out.print("Enter the width: ");
            double width = scanner.nextDouble();

            // Tạo đối tượng Rectangle
            Rectangle rectangle = new Rectangle(length, width);

            // In ra chu vi, diện tích và biểu diễn hình chữ nhật dạng chuỗi
            System.out.println("Chu vi: " + rectangle.ChuVi());
            System.out.println("Dientich: " + rectangle.Dientich());
            System.out.println("Bieu dien hinh chu nhat: " + rectangle.toString());

            scanner.close();
        }
}
