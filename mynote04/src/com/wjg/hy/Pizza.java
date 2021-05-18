package com.wjg.hy;

/**
 * @Auther:wangjg
 * @Date:2021/4/29 - 04 - 29 - 20:15
 * @Description: com.wjg.hy
 * @version: 1.0
 */
public abstract class Pizza {
    String name;
    int price;
    int size;
    public abstract void b();
    public void c(String s){
        System.out.println("配料水果："+s);
    }
    public void d(int i){
        System.out.println("培根克数："+i+"g");
    }
}
