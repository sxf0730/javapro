package com.neuedu.text;

public class TextBoard {
    public static void main(String[] args) {
        I5 i5 =new I5();
        I7 i7 =new I7();
        MyBoard myBoard=new MyBoard();
        myBoard.setCpu(i5);
        myBoard.method();//主板开机，运行的是i5的cpu的方法，是电脑里面的cpu在运行

    }
}
