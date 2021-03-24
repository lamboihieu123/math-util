/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hieu.mathutil;

/**
 *
 * @author DELL
 */
public class MathUtility {

    //Class nay chua cac ham toan hoc fake lai class chuan JDK
    //java.util.Math ben trong chua cac ham toan hoc sqrt(),abs(),sin()
    //cai gi ma dung chung cho moi noi, thi ta se dat la static
    public static final double PI = 3.1415;

    //ham dung chung tinh giai thua()
    //quy uoc n!=1.2.3.4....n
    //0!=1!=1
    //khong co giai thua so am
    //giai thua tang rat nhanh,20! vua khop kieu long
    //21! tran long, bi sai neu rang' luu bien long
    //long: 10^18 18 con so 0
    public static long getFactoral(int n) {
        if (n < 0 || n > 20) 
            throw new IllegalArgumentException("Invalid argument. N must between 0..20");
        //CPU chay den day, sure n tu 0..20
        if (n == 0 || n == 1) 
            return 1;
        //CPU chay den day, sure n=2.,20;
        long result = 0; //co' tinh`
        for (int i = 2; i <= n; i++) 
            result *= i;
        return result;
    }
}
