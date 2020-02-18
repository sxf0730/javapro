package Web;

import Pojo.Student;
import Service.IsstudentService;
import Service.StudentService;

import java.util.List;
import java.util.Scanner;

public class StudentWeb {
    IsstudentService studentService=new StudentService();
    public void showmain(){
        System.out.println("-------------------------");
        System.out.println("1--------------------查询");
        System.out.println("2--------------------添加");
        System.out.println("3--------------------修改");
        System.out.println("4--------------------删除");
        System.out.println("5--------------------退出");
        System.out.println("-------------------------");
    }
    public void input(){
        Scanner scanner=new Scanner(System.in);
        int i=scanner.nextInt();
        if(i==1){
            query();
        }else if(i==2){
            add(scanner);
        }else if(i==3){
            update(scanner);
        }else if(i==4){
            delete(scanner);
        }else{
            System.exit(0);//结束进程//
        }
    }
    private void query(){
       //在此要调用 服务器提供的方法访问数据库
        List<Student> list=studentService.query();
        for(Student student:list){
            System.out.println(student);
        }
    }
    private void add(Scanner scanner){
        System.out.println("请输入要添加的名字");
        String name=scanner.next();
        System.out.println("请输入要添加的性别");
        String ssex=scanner.next();
        System.out.println("请输入要添加的年龄");
        int sage=scanner.nextInt();
        System.out.println("请输入要添加的院系");
        String sdept=scanner.next();
        Student student=new Student(name,ssex,sage,sdept);
        studentService.add(student);
        query();
    }
    private void update(Scanner scanner){
        System.out.println("请输入要修改的sno");
        int sno=scanner.nextInt();
        System.out.println("请输入要修改的名字");
        String name=scanner.next();
        System.out.println("请输入要修改的性别");
        String ssex=scanner.next();
        System.out.println("请输入要修改的年龄");
        int sage=scanner.nextInt();
        System.out.println("请输入要修改的院系");
        String sdept=scanner.next();
        Student student=new Student(sno,name,ssex,sage,sdept);
        studentService.update(student);
        query();
    }
    private void delete(Scanner scanner){
        System.out.println("请输入要删除的sno");
        int sno=scanner.nextInt();
        studentService.delete(sno);
        query();
    }
}
