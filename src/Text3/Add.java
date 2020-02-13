package Text3;

public class Add {
    public static void main(String[] args) {
        System.out.println(method(6));
    }


    /**
     * @param n
     * @return
     */
    public static int method(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            int a1=1;
            int a2=1;
            int sum=0;
            for(int i=3;i<=n;i++){
                sum=a1+a2;
                a1=a2;
                a2=sum;
            }
            return a2;
        }

    }

}

