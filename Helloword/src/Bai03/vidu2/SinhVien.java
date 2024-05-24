package Bai03.vidu2;

public class SinhVien {
	public String hoten;
	public int namsinh;
	public String sdt;

	public String getHoten() {
	return this.hoten;
	
}
	public void setHoten(String name) {
		this.hoten = name;
	} 
	
	public int getNamsinh() {
		return this.namsinh;
	} 
	
	public void setNamsinh(int yob) {
		this.namsinh = yob;
	} 
	
	public String getSDT() {
		return this.sdt;
		
	}
	public void setSDT(String phone) {
		this.sdt = phone;
	} 
	
	
	public String toString()  {
		String result = " Hoten" + this.getHoten() + "Nam sinh" + this.getNamsinh() + "SDT " + this.getSDT();
		return result;
	}
}
