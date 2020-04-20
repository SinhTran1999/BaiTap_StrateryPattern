/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap_3;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Tran Nhan Sinh
 */
public class SinhVien {
    private final String hoTen;
    private final Date ngaySinh;
    private final float diemTB;

    /**
     *
     * @param hoTen
     * @param ngaySinh
     * @param diemTB
     */
    public SinhVien(String hoTen, Date ngaySinh, float diemTB) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemTB = diemTB;
    }

    public String getHoTen() {
        return hoTen;
    }

    public float getDiemTB() {
        return diemTB;
    }
    
    public String getThongTin() {
        SimpleDateFormat formaterDate = new SimpleDateFormat("dd/MM/yyy");
        return "Họ tên: " + this.hoTen + ", Ngày sinh: " + formaterDate.format(this.ngaySinh) + ", Điểm TB: " + this.diemTB;
    }
}

