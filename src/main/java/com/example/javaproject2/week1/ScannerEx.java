package com.example.javaproject2.week1;

import java.util.Scanner;

public class ScannerEx {
    public void plusTwoNumbers(int val1, int val2){

    }
    public void readTwoNumbersAndPlus(){
        Scanner sc = new Scanner(System.in);
        System.out.println("두개의 숫자를 입력하세요. 입력 후 엔터");
        System.out.println("첫번째 숫자 : ");
        System.out.println("첫번째 숫자는 " + sc.nextInt() + "(을)를 입력했습니다.");
        System.out.println("두번째 숫자 : ");
        System.out.println("두번째 숫자는 " + sc.nextInt() + "(을)를 입력했습니다.");
    }

}
