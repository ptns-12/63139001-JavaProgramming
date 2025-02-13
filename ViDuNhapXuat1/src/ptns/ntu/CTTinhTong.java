package ptns.ntu;

import java.util.Scanner;

public class CTTinhTong {

	public static void main(String[] args) {
		//In ra một dòng tiêu đề app
		System.out.print("CT Tinh tong \n");
		//Chuẩn bị cho việc nhập
		Scanner banPhim = new Scanner(System.in);
		//In dong huong dan moi nhap A
		System.out.println("Moi nhap a: ");
		double a = banPhim.nextDouble();
		System.out.println("Moi nhap b: ");
		double b = banPhim.nextDouble();
		//tinh toan
		double tong = a+b;
		System.out.print("Tong la: ");
		System.out.print(tong);
	}

}
