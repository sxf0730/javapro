package Text3;

public class Square {
    public static void main(String[] args) {
//        int i=0,c=1;
//        while (c!=0){
//            int x= (int) Math.sqrt(i+100);
//            int y=(int) Math.sqrt(i+100+168);
//            if (i + 100 == x * x && i + 100 + 168 == y * y) {
//                System.out.println(i);
//                c=0;
//            }
//          i++;
//        }
        for(int i=1;i<=1000;i++){
            int x= (int) Math.sqrt(i+100);
            int y= (int) Math.sqrt(i+100+168);
            if(i+100==x*x&&i+100+168==y*y){
                System.out.println(i);
            }
        }
    }


}
