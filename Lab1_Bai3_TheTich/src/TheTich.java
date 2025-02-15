import java.util.Scanner;

public class TheTich {

	public static void main(String[] args) {
		// Khoi tao scanner de nhap du lieu tu ban phim 
		Scanner scanner = new Scanner(System.in);
		
		//nhap canh cua khoi lap phuong
		System.out.print("Nhap canh cua khoi lap phuong: ");
		double canh = scanner.nextDouble();
		
		//tinh the tich khoi lap phuong 
		double theTich = Math.pow(canh, 3);
		
		//xuat thong tin ra man hinh
		System.out.printf("The tich khoi lap phuong: %.2f\n", theTich);
		
		//dong scanner
		scanner.close();
	}

}
