package com.wjg.hy;

/**
 * @Auther:wangjg
 * @Date:2021/4/30 - 04 - 30 - 10:59
 * @Description: com.wjg.hy
 * @version: 1.0
 */
public class Store {
    public static Pizza a(int a){
        Pizza p = null;
        if(a==1){
            p = new Bacon();
        }
        if(a==2){
            p = new Friuit();
        }
        return p;
    }
    /*public static String b(int i){
        String s = " ";
        if(i==1){
            s = "培根";
        }
        if(i==2){
            s = "水果";
        }
        return s;
    }*/

}
