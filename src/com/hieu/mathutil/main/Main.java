/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hieu.mathutil.main;

import com.hieu.mathutil.MathUtility;

/**
 *
 * @author DELL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //tui muon test xem 5! co bang 120 hem
        long expected =120;     //tui hy vong 120 la gia tri tra? ve
        int n=5;                //neu tui tinh 5!
        long actual= MathUtility.getFactoral(n); //actual: cai value ham thuc su tra ve
        //ta di so sanh= mat de luan xem ham ta viet chay dung hay khong
        System.out.println("5!: Expected: "+ expected + "; Actual: " + actual);
        //Tinh huong test so 2, 0! xem sao?
        //TINH HUONG TEST, TINH XUONG XAI, GOI LA TEST CASE
        n=0;                //tui muon tinh 0!
        expected=1;         //hy vong nhan ve 1
        actual=MathUtility.getFactoral(n); //con thuc te la
        //dung` mat' de so sanh, luan ket qua again
        System.out.println("0!: Expected: "+ expected + "; Actual: " + actual);   
    }
    
}

//Trong quy trinh lap trinh chuyen nghiep/ o cac cty; dac biet lam cho JP
//moi ham/class ban viet ra deu phai dc test ki cang truoc khi ghep no
//vao trong cac cum tinh nang, va ghep voi UI, Back-end
//Lam sao de test cac ham, cac class
//Dan dev co nhieu cach
//1.Cach 1: sout(ket qua xu li cua ham)
//2.Cach 2: JOptionPane(pop-up len ket qua xu li ham) ben Java Desktop
//3.Cach 3:Ghi vao LOG file trong mon java web, hay in ket qua xu li ra 1 trang web tam nao do
//Voi 3 CACH NAY, ta goi ham, nhin ket qua tra ve cua ham-ACTUAL VALUE
//  va ta ngam` so sanh voi cac ket qua ma ta tu tinh toan truoc do
//  khi chua goi ham- ta goi la GIA TRI KI VONG-EXPECTED vALUE
// neu EXPECTED VALUE==ACTUAL VALUE(thuc te va ki vong khop nhau)
//A DU, HAM CHAY DUNG'
//neu khong bang, DU`, HAM XU LI SAI
//3 CACH TREN DOI` HOI DEV PHAI DUNG MAT DE LUAN KET QUA DUNG SAI
//nhieu test case can phai test, ta rat de bo sot, nhin sai ket qua
//KI THUAT TEST NHU TREN GOI LA MANUAL TEST
//TEST KHI CODE VUA MOI XONG TUNG HAM GOI LA UNIT TEST

//CON CACH XIN XO THU 4
//TA KHONG CAN NHIN =MAT' TUNG TRUONG HOP SU DUNG HAM
//TA NHO` MAY' SO SANH DUM ACTUAL VOI EXPECTED LUON
//VA NEU TAT CA TINH HUONG DEU KHOP, BANG NHAU, NEM RA 1 MAU XANH
//NEU HAU HET DEU KHOP, CHI CO IT NHAT 1 CAI KHONG KHOP, HAM KHONG ON DINH
//NEM RA MAU DO -> CANH BAO DAN DEV CODE CO TRUC TRAC
//VAY LUC NAY TA CHI NHIN MAU LA DU, KHONG CAN LUAN TUNG KET QUA
//KI THUAT NAY GOI LA TEST DRIVEN DEVELOPMENT+ TEST AUTOMATION
//vua viet code vua test                       tu dong hoa viet test

//MUON LAM DUOC DIEU NAY, TA CAN THEM THU VIEN PHU TRO DE TUNG RA MAU~
//THU VIEN NAY DEU CO TUONG UNG O CAC NGON NGU LAP TRINH
//Java: JUnit, TestNG...
//C#: NUit, xUnit, MSTest
//PHP: PHPUnit
//....
