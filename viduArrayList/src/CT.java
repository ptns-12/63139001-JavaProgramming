import java.util.ArrayList;

public class CT {

	public static void main(String[] args) {
		// khai bao danh sach san pham
		ArrayList<SanPham> dsSanPham;
		//xin moi
		dsSanPham = new ArrayList<SanPham>();
		
		//nhap 3 san pham
		SanPham sp1 = new SanPham(0, "Kem", "Giai khat", null);
		SanPham sp2 = new SanPham(1, "Com", "Do an", null);
		SanPham sp3 = new SanPham(2, "Pho", "Do an", null);
		
		// them vao arraylist
		dsSanPham.add(new SanPham(0, "Kem", "Giai Khat", null));
		dsSanPham.add(sp2);
		dsSanPham.add(sp3);
		
		//for(SanPham x: dsSanPham)
		//	System.out.println(x.toString());
		
		for(int i = 0; i<dsSanPham.size(); i++) {
			SanPham sp = dsSanPham.get(i);
			System.out.println(sp.toString());
		}
	}

}
