import java.util.Scanner;

public class Delta {

	public static void main(String[] args) {
		// khoi tao scanner de nhap du lieu tu ban phim 
		Scanner scanner = new Scanner(System.in);
		
		// nhap he so a, b, c cua phuong trinh bac 2 
		System.out.print("Nhap he so a: ");
		double a = scanner.nextDouble();
		System.out.print("Nhap he so b: ");
		double b = scanner.nextDouble();
		System.out.print("Nhap he so c: ");
		double c = scanner.nextDouble();
		
		//tinh delta
		double delta = Math.pow(b, 2) - 4 * a * c;
		
		// Xuất thông tin ra màn hình
        System.out.printf("Delta: %.2f\n", delta);
        
        // Kiểm tra giá trị của delta
        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm do delta âm.");
        } else {
            double canDelta = Math.sqrt(delta);
            System.out.printf("Căn delta: %.2f\n", canDelta);
        }
		
		//dong Scanner
		scanner.close();
	}

}
