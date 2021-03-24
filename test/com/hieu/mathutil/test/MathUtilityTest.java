/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hieu.mathutil.test;

import com.hieu.mathutil.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DELL
 */
public class MathUtilityTest {

    //Ta se viet nhung doan code o day de test cai ham chinh .getFactorial ben MathUtility coi chay co dung khong
    //viet code de test code chinh
    //dung sai o day chung toi dung mau sac XANH DO
    @Test //bien ham thuong thanh ham main()
    //Shift-F6 de chay
    public void testFactorialGivenRightArgumentReturnsGoodResult() {
        int n = 5;   //tui muon tinh 5!
        long expected = 120; //tui hy vong tra ve 120
        long actual = MathUtility.getFactoral(n);
        assertEquals(expected, actual);
        //khop thi mau xanh, sai lenh thi mau do
        //mauu xanh xuat hien khi tat ca cac tinh huong xai ham` 
        //test case deu xanh
        //mau do xuat hien khi co it nhat 1 thang do?.
        //                 mot testcase sai, tat ca bo? di
        //an? y': ham` da~ dung' thi` phai dung' cho tat ca cac case
        //minh test

        assertEquals(720, MathUtility.getFactoral(6)); //6! co' dung' la` 720 khong
        assertEquals(24, MathUtility.getFactoral(4));
        assertEquals(6, MathUtility.getFactoral(3));
        assertEquals(2, MathUtility.getFactoral(2));
        assertEquals(1, MathUtility.getFactoral(1));
        assertEquals(1, MathUtility.getFactoral(0));
        //khi mau do? thi co 2 tinh huong:
        //  Ham ban tinh sai khong nhu ky` vong
        //  Ham tinh dung, ban ki vong sai
    }
    //Ta se di test ham co nem' ra ngoai le nhu thiet ke hay khong
    //Ham duoc thiet ke rang: Dua tham so n 0..20 -> tinh dung n!
    //Ham duoc thiet ke rang: Dua tham so n<0 || n>20 nem' ra ngoai le canh bao sai tham so', sai mien` gia tri tinh!
    //chot: dua tham so ca` chon' thi phai nem ra ngoai le
    //      neu thay dung la nem' ve` ngoai le khi dua tham so ca` chon'
    //      thi` ket qua ham` dung', XANH
    //thay' ngoai le khi dua n ca` chon', mung roi nuoc mat vi ham chay dung' nhu thiet ke'
    //ngoai le xuat hien khi -5! thi ham dung ma
    //ngoai le thi khong phai la gia tri de? so sanh kieu assertEquals()
    //vay ta phai? dung` kieu khac!!!
    //@Test(expected=Exception.class)   //Khong nen bat muc cao nhat mac du` khong sai
    @Test(expected = IllegalArgumentException.class)
    public void getFactorialGivenWrongArgumentThrowsException(){
        MathUtility.getFactoral(40);
        MathUtility.getFactoral(-40);
        //2 thang nay phai nem ve ngoai le IllegalArgumentException
        
    }
}
