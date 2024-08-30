// Import các thư viện Java tiêu chuẩn
import java.util.Scanner; // Dùng để đọc dữ liệu từ người dùng
import java.util.Date;    // Dùng để lấy thời gian hiện tại
import java.text.SimpleDateFormat; // Dùng để định dạng ngày tháng

public class HelloWorld {

    // Phương thức chính, là điểm khởi đầu của chương trình
    public static void main(String[] args) {
        // In ra dòng chữ "Hello, World!" lên màn hình console
        System.out.println("Hello, World!");

        // Gọi một phương thức khác trong lớp
        greet("Alice");

        // Đọc dữ liệu từ người dùng
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

        // In lời chào cá nhân hóa
        greet(userName);

        // Hiển thị thời gian hiện tại
        showCurrentTime();
    }

    // Phương thức để in lời chào
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Phương thức để hiển thị thời gian hiện tại
    public static void showCurrentTime() {
        // Lấy thời gian hiện tại
        Date now = new Date();

        // Định dạng thời gian
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = formatter.format(now);

        // In ra thời gian hiện tại
        System.out.println("Current time: " + formattedDate);
    }
}
