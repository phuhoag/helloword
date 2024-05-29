package edu.pxu.lthdt.bai3;
import java.time.LocalDate;
public class XeOto {

private String hangxe;
private int namsanxuat;
private float dongco;
public XeOto(String hangxe, int namsanxuat, float dongco) {
	super();
	this.setHangxe(hangxe);
	this.setNamsanxuat(namsanxuat);
	this.setDongco(dongco);
}
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
	LocalDate ngayht = LocalDate.now();
	int namhientai = ngayht.getYear();
	if((namsanxuat < 1885) || (namsanxuat > namhientai)) {
		System.out.println("Nam san xuat khong phu hop");
	}else {
		this.namsanxuat = namsanxuat;
	}
}
public float getDongco() { 
	return dongco;
}
public void setDongco(float dongco) { 
	if (dongco <= 0) {
        System.out.println("Dong co khong the co cong suat la " + dongco + "kW");
    } else {
        this.dongco = dongco;
    }
	
	this.dongco = dongco;
}
@Override
public String toString() {

	if (namsanxuat == 0 || dongco == 0){
            return "XeOto{" + "hangxe=" + hangxe + '}';
        } else if (namsanxuat == 0) {
            return "XeOto{" + "hangxe=" + hangxe + ", dongco=" + dongco + '}';
        } else if (dongco == 0) {
            return "XeOto{" + "hangxe=" + hangxe + ", namsanxuat=" + namsanxuat + '}';
        } else {
            return "XeBus{" + "hangxe=" + hangxe + ", namsanxuat=" + namsanxuat + ", dongco=" + dongco + '}';
        }
} 
}


		
	


