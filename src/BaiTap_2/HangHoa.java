/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap_2;

/**
 *
 * @author Tran Nhan Sinh
 */
public class HangHoa {
    String tenHH;
    int gia;
    String moTa;

    public HangHoa(String tenHH, int gia, String moTa) {
        this.tenHH = tenHH;
        this.gia = gia;
        this.moTa = moTa;
    }
   
    public String getTenHH() {
        return tenHH;
    }

    public void setTenHH(String tenHH) {
        this.tenHH = tenHH;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }   
    
    public void hienthi(){
        System.out.println("Tên hàng hóa: " + tenHH);
        System.out.println("Giá tiền : " + gia);
        System.out.println("Mô tả loại hàng hóa: " + moTa);
    }
}
