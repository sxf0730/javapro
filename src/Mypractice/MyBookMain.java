package Mypractice;

import Text2.MyBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyBookMain {
    public static MyBook[] books=new MyBook [200];
    public static List<MyBook> list=new ArrayList<>();
    public static void main(String[] args) {

    }
    public static void inputData(List<MyBook> books){
        Scanner scanner=new Scanner(System.in);//从键盘输入变量//
        int n=scanner.nextInt();//从键盘输入整形变量的值//
        for(int i=0;i<=n;i++){
            MyBook myBook=new MyBook("书名"+i,Double.valueOf(String.valueOf(i)),"出版社","作者","书的INSN号"+i);
            books.add(myBook);
        }

    }

}
