package text;

public class Mytext {
    public static void main(String[] args) {
//
//          Dog p1 = new Dog();
//          p1.setAge(66);
//          p1.setSex('男');
//          System.out.println(p1.getAge());
//          System.out.println(p1.getSex());
//
//          int[] array={1,2,3,4};
//          for(int i=0;i<=array.length;i++)
//          for(int m=0;m<=array.length;m++)
//          for(int n=0;n<=array.length;n++)
//          if(i!=m&i!=m&m!=n){
//              System.out.println(i+""+m+""+n);
//          }
//       一百以内偶数和
//          int sum=0;
//          for(int i=0;i<=100;i++){
//             if(i%2==0){
//                sum=sum+i;
//             }
//           }
//          System.out.println(sum);
//       m的n次幂
//          int m=8;
//          int n=2;
//          int sum=1;
//          for(int i=1;i<=n;i++){
//              sum*=m;/sum=sum*m
//          }
//          System.out.println(sum);
//      100到999的水仙花数
//          for(int i=100;i<=999;i++){
//              int x=i/100;//商不取余数//
//              int y=i/10%10;
//              int z=i%10;
//              if(x*x*x+y*y*y+z*z*z==i){
//              System.out.println(i);
//           }
//
//       }
        //最大公约数与最小公倍数
        //最大公约数：能同时整除以两个数的最大的数
//              int x=600;
//              int y=256;
//              int max=1;
//              int min=max(x,y);
//              for(int i=1;i<=x&&i<=y;i++){
//                  if(x%i==0&&y%i==0){
//                   max=i;
//                  }
//              }
//              for(int i=min;i<=x*y;i++){
//                  if(i%x==0&&i%y==0){
//                      min=i;
//                   break;
//                  }
//              }
//              System.out.println(max);
//              System.out.println(min);
//                int c =add(1,2);
//                System.out.println(Dog.abc);
            int x=66;
            int y=22;
            int max=1;
            for(int i=1;i<=x&&i<=y;i++){
               if(x%i==0&&y%i==0){
                   max=i;

               }

            }
            System.out.println(max);
        }
//            public static int add(int a, int b){
//            return a+b;
//            }
    }







