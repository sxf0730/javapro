package Text2;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyBookMain {
    public static MyBook[] books = new MyBook[200];
    public static List<MyBook> list=new ArrayList<>();
    public static void main(String[] args) {
    inputData(list);
    menu();
//    searchName(list,"书名28");
//    deleteName(list,"书名15");
    addBook(list);
    print(list);
    }
    public static void menu(){
        System.out.println("输出菜单并选择要进行的操作（请输入1-4中的任意一个数字）：");
        System.out.println("1：添加图书");
        System.out.println("2：删除图书");
        System.out.println("3：查找图书");
        System.out.println("4：查看所有");
        System.out.println("5：退出");
        Scanner scanner=new Scanner(System.in);
        int i=scanner.nextInt();
        switch (i){
            case 1:
                addBook(list);
                break;
            case 2:
                System.out.println("请输入要删除的书名");
                String deleteName=scanner.next();
                deleteName(list,deleteName);
                break;
            case 3:
                System.out.println("请输入要查看的书名");
                String searchName=scanner.next();
                searchName(list,searchName);
                break;
            case 4:
                print(list);
                break;default:
                    System.exit(1);
                    break;
        }
    }
    public static void inputData(List<MyBook> books){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=0;i<=n;i++){
            MyBook myBook=new MyBook("书名"+i,Double.valueOf(String.valueOf(i)),"出版社","作者","ISBN"+i);
            books.add(myBook);
        }

    }
    public static void print(List<MyBook> books){
        for(int i=0;i<books.size();i++){
            System.out.println(books.get(i));
        }
    }
    public static void searchName(List<MyBook> books,String name){
        for(int i=0;i<books.size();i++){
            MyBook myBook=books.get(i);
            if(myBook.getName().equals(name)){
                System.out.println(myBook);
                menu();
                return;
            }
        }
    System.out.println("此书不存在");
        menu();
    }
    public static void deleteName(List<MyBook> books,String name){
      for(int i=0;i<books.size();i++){
          MyBook myBook=books.get(i);
          if(myBook.getName().equals(name)){
              books.remove(i);
              System.out.println("删除成功");
              menu();
              return;
          }
      }
    System.out.println("此书不存在，删除失败");
    menu();
    }
    public static void addBook(List<MyBook> books){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入书名");
        String name=scanner.next();
        System.out.println("请输入价格");
        Double price=scanner.nextDouble();
        System.out.println("请输入出版社");
        String press=scanner.next();
        System.out.println("请输入作者");
        String author=scanner.next();
        System.out.println("请输入ISBN");
        String bookISBN=scanner.next();
        MyBook myBook= new MyBook(name,price,press,author,bookISBN);
        books.add(myBook);
        menu();
    }
}
