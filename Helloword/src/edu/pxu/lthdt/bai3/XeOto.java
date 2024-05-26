package edu.pxu.lthdt.bai3;

public class XeOto {

	private String hangxe;
    private int namsanxuat;
    private float dongco;

   

    public String getHangxe() {
        return hangxe;
    }

    public int getNamsanxuat() {
        return namsanxuat;
    }

    public float getDongco() {
        return dongco;
    }

    public String setHangxe(String hangxe) {
        this.hangxe = hangxe;
        
        return hangxe;
    }

    public int setNamsanxuat(int namsanxuat) {
        this.namsanxuat = namsanxuat;
        return namsanxuat;
    }

    public float setDongco(float dongco) {
        if (dongco <= 0) {
            System.out.println("Dong co khong the co cong suat la " + dongco + "kW");
        } else {
            this.dongco = dongco;
        }
        
        return dongco;
    } 
    
    @Override
    public String toString() {
        return "XeOto{" + "hangxe=" + hangxe + ", namsanxuat=" + namsanxuat + ", dongco=" + dongco + '}';
    } 

    
    
    public XeOto(String hangxe, int namsanxuat, float dongco) {
        this.hangxe = setHangxe(hangxe);
        this.namsanxuat = setNamsanxuat(namsanxuat);
        this.dongco = setDongco(dongco);
    }
		
	}


