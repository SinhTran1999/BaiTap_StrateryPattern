/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap_3;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Tran Nhan Sinh
 */
public class MainClass3 {
  public static void main(String[] args) throws ParseException {
      
       // tạo đối tượng quản lý danh sách sinh viên
        QLSV QLDS = new QLSV();
        
        // tạo sinh viên
        SinhVien SV1 = new SinhVien("Trần Nhân Sinh",new SimpleDateFormat("dd/MM/yy").parse("10/09/1999"), 7);
        SinhVien SV2 = new SinhVien("Nguyễn Văn Tiến",new SimpleDateFormat("dd/MM/yy").parse("20/10/1999"), 9);
        SinhVien SV3 = new SinhVien("Võ Tiến Phúc",new SimpleDateFormat("dd/MM/yy").parse("01/01/1999"), 8);
        SinhVien SV4 = new SinhVien("Võ Thị Kim Ái",new SimpleDateFormat("dd/MM/yy").parse("12/04/1999"), 6);
        
        // thêm sinh sinh vào đối tượng quản lý
        QLDS.them(SV1);
        QLDS.them(SV2);
        QLDS.them(SV3);
        QLDS.them(SV4);
        
        System.out.println("\n Danh sách sinh viên ban đầu lúc chưa sắp xếp:");
        QLDS.inDs();
        
        ISoSanh soSanhTheoDiem = new SoSanhTheoDiem();
        ISoSanh soSanhTheoTen = new SoSanhTheoTen(); 
        
        QLDS.setSoSanh(soSanhTheoTen);
        QLDS.sapXep();
        System.out.println("\nDanh sách sinh viên (sắp xếp theo tên)");
        QLDS.inDs();
        
        QLDS.setSoSanh(soSanhTheoDiem);
        QLDS.sapXep();
        System.out.println("\nDanh sách sinh viên (sắp xếp theo điểm TB)");
        QLDS.inDs();
    }  
}
