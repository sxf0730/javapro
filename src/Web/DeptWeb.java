package Web;

import Pojo.Dept;
import Service.DeptService;
import Service.IsdeptService;


import java.util.List;
import java.util.Scanner;

public class DeptWeb {
    IsdeptService deptService=new DeptService();
    public void showmain(){
        System.out.println("-----------------");
        System.out.println("1------------查询");
        System.out.println("2------------添加");
        System.out.println("3------------修改");
        System.out.println("4------------删除");
        System.out.println("-----------------");
    }
    public void input(){
        Scanner scanner=new Scanner(System.in);
        int i=scanner.nextInt();
        if( i==1){
            query();
        }else if(i==2){
            add();
        }else if(i==3){
            update();
        }else if(i==4){
            delete();
        }
    }
    public void query(){
        List<Dept> list= deptService.query();
        for(Dept dept:list){
            System.out.println(dept);
        }
    }
    private void add(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入要添加的名字");
        String dname=scanner.next();
        System.out.println("请输入要添加的地点");
        String loc=scanner.next();
        Dept dept=new Dept(dname,loc);
        deptService.add(dept);
        query();
    }
    private void update(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入要修改的部门编号");
        int deptno=scanner.nextInt();
        System.out.println("请输入要修改的部门");
        String dname=scanner.next();
        System.out.println("请输入要修改的地点");
        String loc=scanner.next();
        Dept dept=new Dept(deptno,dname,loc);
        deptService.update(dept);
        query();
    }
    public void delete(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入要删除的部门编号");
        int deptno=scanner.nextInt();
        deptService.delete(deptno);
    }
}
