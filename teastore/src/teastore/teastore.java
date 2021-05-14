package teastore;

/**
 * @Auther:wangjg
 * @Date:2021/4/26 - 04 - 26 - 12:55
 * @Description: teastore
 * @version: 1.0
 */
public class teastore {
    /*public static String gettea(int g){
        String str = " ";
        if(g==1){
            str = "可乐";
        }
        if(g==2){
            str = "咖啡";
        }
        if(g==3){
            str = "奶茶";
        }
        return str;
    }*/
    public static Drinks gettea(int g){
        Drinks q = null;
        if(g==1){
            q = new Coke();
        }
        if(g==2){
            q = new Coffee();
        }
        if(g==3){
            q = new Tea();
        }
       return q;
    }
    public static String f(int f){
        String l = " ";
        if(f==1){
            l="中杯";
        }
        if(f==2){
            l="大杯";
        }
        if(f==3){
            l="超大杯";
        }
        return l;
    }
}
