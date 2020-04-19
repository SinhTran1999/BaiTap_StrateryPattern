/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap_1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class MainClass1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào phần tử a = ");
        float a = sc.nextFloat();
        System.out.println("Mời bạn nhập vào phần tử b = ");
        float b = sc.nextFloat();
        
        context phepCong = new context();
        ITinh cong = new Cong();
        phepCong.setTinhToan(cong);
        System.out.println("Kết quả phép tính cong: ");
        System.out.println(phepCong.tinh(a, b));
        
        context phepTru = new context();
        ITinh tru = new Tru();
        phepTru.setTinhToan(tru);
        System.out.println("Kết quả phép tính tru: ");
        System.out.println(phepTru.tinh(a, b));
        
        context phepNhan = new context();
        ITinh nhan = new Nhan();
        phepNhan.setTinhToan(nhan);
        System.out.println("Kết quả phép tính nhan: " );
        System.out.println( phepNhan.tinh(a, b));
        
        context phepChia = new context();
        ITinh chia = new Chia();
        phepChia.setTinhToan(chia);
        System.out.println("Kết quả phép tính chia: " );
        System.out.println( phepChia.tinh(a, b));
    }
    
}
