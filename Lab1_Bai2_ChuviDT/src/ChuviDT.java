import java.util.Scanner;

public class ChuviDT {

	public static void main(String[] args) {
		// khoi tao Scanner de nhap du lieu tu ban phim
		Scanner scanner = new Scanner(System.in);
		
		//nhap chieu dai va chieu rong
		System.out.print("Chiều dài: ");
		double dai = scanner.nextDouble();
		System.out.print("Chiều rộng: ");
		double rong = scanner.nextDouble();
		
		//tinh chu vi, dien tich va canh nho nhat
		double chuVi = (dai + rong) * 2;
		double dienTich = dai * rong;
		double canhNhoNhat = Math.min(dai, rong);
		
		//xuat thong tin ra man hinh 
		System.out.printf("Chu vi: %.2f\n", chuVi);
		System.out.printf("Diện tích: %.2f\n", dienTich);
		System.out.printf("Cạnh nhỏ nhất: %.2f\n", canhNhoNhat);
		
		//dong Scanner
		scanner.close();

	}

}
