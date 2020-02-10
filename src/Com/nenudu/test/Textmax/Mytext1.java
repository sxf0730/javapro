package com.neuedu.text;

public class Mytext1 {
    public static void main(String[] args) {
//        int[] array = {1, 25, 3, 55, 44, 52, 12, 7, 15, 56, 99};
//        for (int i = 1; i < array.length - 1; i++) {
//            for(int j=0;j<array.length-1;j++){
//                if (array[j] > array[j + 1]) {
//                    int sum = array[j];
//                    array[j] = array[j+1];
//                    array[j+1]=sum ;
//            }
//            }
//
//        }
//        for (int a : array) {
//            System.out.println(a);
//        }
//   int[] array={12,2,8,4,55,89,74,22,5,17};
//    for(int i=0;i<array.length-1;i++){
//       for(int j=i+1;j<array.length;j++){
//           if(array[i]>array[j]){
//               int temp=array[i];
//               array[i]=array[j];
//               array[j]=temp;
//           }
//       }
//    }
////    一个个的拿出来进行比较//
//   for(int a:array){
//       System.out.println(a);
//   }
//     二分搜索
        int[] array = new int[2000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        int a = 300;
        int index = search(array, a);
        System.out.println(index);
    }

//    public static int find(int[] array, int value) {
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            count++;
//            if (array[i] == value) {
//                System.out.println("查找了" + count + "次");
//                return i;
//
//            }
//        }
//
//        return -1;
//    }


public static int search(int[] array,int value) {
    int min = 0;
    int max = array.length - 1;
    int mid;
    int count = 0;
    while (min <= max) {
        count++;
        mid = (max + min) / 2;
        if (value == array[mid]) {
            System.out.println("查找了"+count+"次");
            return mid;
        } else if (value < array[mid]) {
            max = mid - 1;
        } else {
            min = mid + 1;
        }
    }
    return -1;
}
}