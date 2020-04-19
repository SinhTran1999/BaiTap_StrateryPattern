/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap_2;

import java.util.Scanner;

/**
 *
 * @author Tran Nhan Sinh
 */
public class MainClass2 {
    
public static void main(String[] args) {
        
        HangHoa hangHoa1 = new HangHoa("Sam Sung Galayxy A50 ", 3600000, "Điện thoại đang giảm giá");
        HangHoa hangHoa2 = new HangHoa("Oppo F1", 6000000, "Điện thoại mua nhiều nhất");
        HangHoa hangHoa3 = new HangHoa("Huawei P9", 3000000, "Điện thoại mới cập nhật ");
   
        GioHang gioHang1 = new GioHang();
        GioHang gioHang2 = new GioHang();
        
        
        gioHang1.themHH(hangHoa1);
        gioHang1.themHH(hangHoa2);
        gioHang2.themHH(hangHoa3);
        gioHang2.themHH(hangHoa2);
        
        
        IThanhToan thanhToanOnline = new ThanhToanOnline();
        gioHang1.setHinhThucTT(thanhToanOnline);
        System.out.println("Hiển thị danh sách hàng hóa giỏ hàng thứ 1: ");
        gioHang1.hienthiDSHH();
        System.out.println("Tổng số tiền có trong giỏ hàng : ");
        System.out.println(gioHang1.tinhtien());
        System.out.println("Tổng số tiền được khách hàng trả trực tiếp online: " );
        System.out.println(gioHang1.thanhToan(gioHang1.tinhtien()));
        

        
        IThanhToan thanhToanCOD = new  ThanhToanCOD();
        gioHang2.setHinhThucTT(thanhToanCOD);
        System.out.println("Hiển thị danh sách hàng hóa giỏ hàng thứ 2: ");
        gioHang2.hienthiDSHH();
        System.out.println("Tổng số tiền có trong giỏ hàng: " );
        System.out.println( gioHang2.tinhtien());
        System.out.println("Tổng số tiền được khách hàng trả trực tiếp online: ");
        System.out.println(gioHang2.thanhToan(gioHang2.tinhtien()));
    }
}
