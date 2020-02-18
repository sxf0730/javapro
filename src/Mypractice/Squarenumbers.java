package Mypractice;

public class Squarenumbers {
    public static void main(String[] args) {
        for(int i=1;i<=1000;i++){
            int x= (int) Math.sqrt(i+100);
            int y= (int) Math.sqrt(i+100+165);
            if(i+100==x*x&&i+100+165==y*y){
                System.out.println(i);
            }
        }
    }
}
