/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap_3;

/**
 *
 * @author Tran Nhan Sinh
 */
public class SoSanhTheoDiem implements ISoSanh<SinhVien> {


    @Override
    public int soSanh(SinhVien ss1, SinhVien ss2) {
        if (ss1.getDiemTB() > ss2.getDiemTB()) {
            return 1;
        }
        if (ss1.getDiemTB() < ss2.getDiemTB()) {
            return -1;
        }
        return 0;
    }
    
}