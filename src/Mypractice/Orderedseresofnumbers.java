package Mypractice;

public class Orderedseresofnumbers {
    public static void main(String[] args) {
        System.out.println(method(20));
    }
    public static int method(int n){
        if(n==1||n==2){
            return 1;
        }else{
            int a=1;
            int b=1;
            int sum;
            for(int i=3;i<=n;i++){
                sum=a+b;
                a=b;
                b=sum;
            }
            return b;
        }
    }
}

