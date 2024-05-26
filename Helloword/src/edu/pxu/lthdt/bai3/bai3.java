package edu.pxu.lthdt.bai3;

public class bai3 { 
	private String hangxe;
	private int namsanxuat;
	private String dongco;
	public String getHangxe() {
		return hangxe;
	}
	public void setHangxe(String hangxe) {
		this.hangxe = hangxe;
	}
	public int getNamsanxuat() {
		return namsanxuat;
	}
	public void setNamsanxuat(int namsanxuat) {
		if (namsanxuat <= 1900) {
			System.out.print("nam sinh" + namsanxuat + "khong hop le");
		} else {
			this.namsanxuat = namsanxuat;
		}
		
		this.namsanxuat = namsanxuat;
	}
	public String getDongCo() {
		return dongco;
	}
	public void setDongCo(String dongco) {
		this.dongco = dongco;
	}
	@Override
	public String toString() { 
		
		if (this.namsanxuat == 0 ) {
			return "XeOto [hangxe=" + hangxe + ", namsanxuat=" + namsanxuat + ", dongco=" + dongco + "]";
		}
		return "XeOto [hangxe=" + hangxe + ", namsanxuat=" + namsanxuat + ", dongco=" + dongco + "]";
	}
	
	
	
	

}
