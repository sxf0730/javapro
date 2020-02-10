package text;

public class My {
    public static void main(String[] args) {
       int[] array={1,2,3,4};
        for(int a=1;a<=array.length;a++)
            for(int b=1;b<=array.length;b++ )
                for(int c=1;c<=array.length;c++)
                    if(a !=b&b!=c&c!=a){
                        System.out.println(a+""+b+""+c);
                    }

    }
}
