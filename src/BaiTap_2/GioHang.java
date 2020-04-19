/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap_2;

import java.util.ArrayList;

/**
 *
 * @author Tran Nhan Sinh
 */
public class GioHang implements IThanhToan{
    IThanhToan hinhThucTT;
    ArrayList<HangHoa> danhSachHH = new ArrayList<>();

    
    public void setHinhThucTT(IThanhToan thanhToan) {
        this.hinhThucTT = thanhToan;
    }
     
    @Override
    public double thanhToan(int tienHang) {
        return hinhThucTT.thanhToan(tienHang);
    }
    
    public void themHH(HangHoa HH){
        danhSachHH.add(HH);
    }
    
    public void hienthiDSHH(){
        int i = 0;
        for(i = 0; i < danhSachHH.size(); i++)
            danhSachHH.get(i).hienthi();
    }
    public int tinhtien(){
        int tong  = 0;
        for(int i = 0; i < danhSachHH.size(); i++)
            tong += danhSachHH.get(i).getGia();
        return tong;
    }
}

