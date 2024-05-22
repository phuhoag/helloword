import java.util.Scanner;
public class Bai03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("nhap a = ");
		double a = sc.nextDouble();
		System.out.print("nhap b = ");
		double b = sc.nextDouble();
		
		
		
		if (a == 0) {
			if (b == 0) {
				System.out.print("phuong trinh vo so nghiem");
			}
			else {
				System.out.print("phuong trinh vo nghiem");
			}
			
		}else {
			double x = -b/a;
			System.out.print("nghiem co phuong trinh la :" + x);
		}

	}

}
