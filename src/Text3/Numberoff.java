package Text3;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
//题目要求：n个人围坐一圈，从1开始报数，报到3的人离开，每个人可以重复报，最后剩下的是第几个人
public class Numberoff {
    public static void main(String[] args) {
        System.out.println(baoshu(5));
    }
    public static int baoshu(int n){
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(i);
        }
        int m=1;
        while (list.size()>1){
            if(m!=3){
                int first=list.remove(0);
                list.add(first);
                m++;
            }else{
                list.remove(0);
                m=1;
            }
        }
        return list.get(0);
    }

}
