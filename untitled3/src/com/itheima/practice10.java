package com.itheima;

public class practice10 {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7};
        StringBuilder sb=new StringBuilder("[");
        int i;
        for(i=0; i<arr.length-1; i++){
            sb.append(arr[i]).append(",");
        }
        sb.append(arr[i]).append("]");
        System.out.println(sb.toString());
    }
}
