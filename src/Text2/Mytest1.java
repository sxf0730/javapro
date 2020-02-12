package Text2;

import java.io.*;

public class Mytest1 {
    public static void main(String[] args) {
        File file=new File("d:/d.java");
//        try {
//            OutputStream  outputStream=new FileOutputStream(file,true);
//            String a="\nskdsakd";
//            outputStream.write(a.getBytes());
//            outputStream.flush();
//            outputStream.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println(file.getName());
//        System.out.println(file.length());
//        System.out.println(file.exists());
//        try {
//            InputStream inputStream = new FileInputStream(file);
//            byte[] a=new byte[200];//当大于200时读到的长度为200，//
//            System.out.println(inputStream.read(a));//读取实际长度//
//            inputStream.close();//输入流结束后必须关闭//
//            System.out.println(new String(a));//输出读取到的字符串的长度//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        InputStream d=null;//安全起见，将InputStream定义在外面//
//        try {
//            d = new FileInputStream(file);
//            byte[] b=new byte[10];//当大于200时读到的长度为200，//
//            int c = d.read(b);
//            while (c!=-1){
//                System.out.println("读取字节数:"+c);
//                System.out.println(new String(b));
//                c=d.read(b);
//            }
//            System.out.println(d.read(b));//读取实际长度//
//            System.out.println(new String(b));//输出读取到的字符串的长度//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                if(d!=null){
//                    d.close();
//                }
//
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        char[] a=new char[10];
//        try {
//            Reader reader=new FileReader(file);
//            int b= reader.read(a);
//            while (b!=-1){
//
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//       char[] a=new char[10];
//       Reader reader=null;
//        try {
//            reader=new FileReader(file);
//           int b= reader.read(a);
//           while (b!=-1){
//               System.out.println("读取字节数："+b);
//               System.out.println(new String(a,0,b));
//                b=reader.read(a);
//           }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            if(reader!=null){
//                try {
//                    reader.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        char[] a=new char[10];
//        Reader reader=null;
//        BufferedReader c=null;
//        try {
//            reader=new FileReader(file);
//            c=new BufferedReader(reader);
//            String s= c.readLine();
//            while (s!=null){
//                System.out.println(s);
//                s=c.readLine();
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                if (c != null) {
//                    c.close();
//                }
//                if (reader != null) {
//                    reader.close();
//                }
//            }catch (IOException e) {
//                    e.printStackTrace();
//                }
    //        }
    //    Writer writer=null;
    //    try {
    //         writer=new FileWriter(file,true);
    //         writer.write("dkadjsk");
    //         writer.flush();
    //    } catch (IOException e) {
    //         e.printStackTrace();
    //    }finally {
    //        try {
    //         if (writer!=null){
    //         writer.close();
    //         }
    //        } catch (IOException e) {
    //         e.printStackTrace();
//              }
//            }
            File from=new File("d:/java视频/6 循环.wmv") ;
            File parent=new File("d:/h");
                if(!parent.exists()){
                    parent.mkdirs();
                }
            File to=new File("d:/h/"+from.getName());
            InputStream s=null;
            OutputStream p=null;
            byte[] b=new byte[1024];
            try {
            s =new FileInputStream(from);
            p=new FileOutputStream(to);
            int length=s.read(b);
            while (length!=-1){
                p.write(b,0,length);
                p.flush();
                length=s.read(b);
            }
            System.out.println("复制完成");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    if(p!=null)
                        p.close();
                    if(s!=null)
                        s.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


