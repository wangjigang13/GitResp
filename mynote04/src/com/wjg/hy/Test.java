package com.wjg.hy;

import java.util.Scanner;

/**
 * @Auther:wangjg
 * @Date:2021/4/29 - 04 - 29 - 20:15
 * @Description: com.wjg.hy
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("请选择想要制作的披萨：1.培根披萨 2.水果披萨：");
        Scanner ji=new Scanner(System.in);
        int a = ji.nextInt();
        Pizza P = Store.a(a);
        P.b();
        int l = 0;
        String k = " ";
        if(a==1){
            P.name = "培根";
            l =ji.nextInt();
        }
        if(a==2){
            P.name = "水果";
            k = ji.next();
        }
        System.out.println("请输入披萨的大小：");
        P.size = ji.nextInt();
        System.out.println("请输入披萨的价格：");
        P.price = ji.nextInt();
        //String s = Store.b(a);
        System.out.println("名称："+P.name+"披萨"+"\n"+"价格："+P.price+"元"+"\n"+"大小："+P.size+"寸");
        /*if (a==1){
            System.out.println("培根克数："+i+"g");
        }
        if (a==2){
            System.out.println("配料水果："+i);
        }*/
        if (a==1){
            P.d(l);
        }
        if (a==2){
            P.c(k);
        }
    }
}
