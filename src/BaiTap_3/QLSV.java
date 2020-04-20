/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap_3;

import java.util.ArrayList;

/**
 *
 * @author Tran Nhan Sinh
 */
public class QLSV {
    ArrayList<SinhVien> dsSinhVien = new ArrayList<>();
    ISoSanh soSanh;

    public void setSoSanh(ISoSanh soSanh) {
        this.soSanh = soSanh;
    }
    
    // thêm sinh viên vào danh sách
    public void them(SinhVien sv) {
        dsSinhVien.add(sv);
    }
    // sắp xếp danh sách sinh viên (sắp xếp tăng dần theo tiêu chí)
    public void sapXep() {
        dsSinhVien.sort((a, b) -> soSanh.soSanh((SinhVien)a, (SinhVien)b));
    }
    // in danh sach sinh viên
    public void inDs() {
        dsSinhVien.forEach(sv -> System.out.println("Sinh viên: " + sv.getThongTin()));
    }
}

