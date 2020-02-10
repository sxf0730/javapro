package com.neuedu.text;
import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Date;
import java.util.List;
public class Mytext3 {
    public static void main(String[] args) {
        List arraylist=new ArrayList();
        List linkedlist=new LinkedList();
        Date startarray=new Date();
        for (int i=0;i<100000;i++){
//            arraylist.add(i);//
            arraylist.add(0,i);
        }
        Date endtarray=new Date();
        System.out.println("ArrayList添加时间"+(endtarray.getTime()-startarray.getTime()));
        Date startlinked=new Date();
        for (int i=0;i<100000;i++){
//            linkedlist.add(i);
            linkedlist.add(0,i);
        }
        Date endlinked=new Date();
        System.out.println("LinkedList添加时间"+(endlinked.getTime()-startlinked.getTime()));
        Date startreadarray=new Date();
        for (int i=0;i<arraylist.size();i++){
            Object object=arraylist.get(i);
        }
        Date endreadarray=new Date();
        System.out.println("ArrayList读取时间"+(endreadarray.getTime()-startreadarray.getTime()));
        Date startreadlinked=new Date();
        for (int i=0;i<linkedlist.size();i++){
            Object object=linkedlist.get(i);
        }
        Date endreadlinked=new Date();
        System.out.println("LinkedList读取时间"+(endreadlinked.getTime()-startreadlinked.getTime()));

    }
}
