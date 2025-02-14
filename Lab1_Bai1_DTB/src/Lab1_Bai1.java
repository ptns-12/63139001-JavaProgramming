
import java.util.Scanner;

public class Lab1_Bai1 {

	public static void main(String[] args) {
		// Khoi tao Scanner de nhap du lieu tu ban phim 
		Scanner scanner = new Scanner(System.in);
		
		// Nhap ho va ten sinh vien
		System.out.print("Họ và tên: ");
		String hoten = scanner.nextLine();
		
		//Nhap diem trung binh 
		System.out.print("Điểm TB: ");
		double diemTB = scanner.nextDouble();
		
		//xuat thong tin ra man hinh
		System.out.printf("%s %.2f điểm\n", hoten, diemTB);
		
		//dong Scanner
		scanner.close();
	}

}
