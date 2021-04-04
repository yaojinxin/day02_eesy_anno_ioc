package com.aeolia.demo;

import java.util.Random;

/**
 * @ClassName： Count
 * @Description： TODO   模拟拼多多砍价
 * @Author： 姚金鑫
 * @Date： 2021/3/31 14:33
 * @Version： 1.0
 **/
public class Count {

    public static void main(String[] args) {
        int sale=1500;
        int temp,count = 0;
        Random random=new Random();
        while (sale>0){
            int anInt = random.nextInt(sale);
            if (sale<=1){
                int anInt1 = random.nextInt(10);
                System.out.println(anInt1);
                if (anInt1>=8){
                    anInt=1;
                }
            }
            sale-=anInt;
            count++;
            System.out.println("第"+ count+"次砍价");
            System.out.println("砍了"+anInt+"元");
            System.out.println("剩余价格："+sale);
            System.out.println("========================");
        }
        System.out.println("一共砍了"+count);
    }
}
