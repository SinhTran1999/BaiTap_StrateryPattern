/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap_1;
/**
 *
 * @author Tran Nhan Sinh
 */
public class Chia implements ITinh{

    @Override
    public float tinh(float a, float b) {
        if(b == 0)
        {
            System.out.println("b phải != 0=> phép toán không thực hiện được");
            return 0;
        }
        else
            return a / b;
    }
    
}

