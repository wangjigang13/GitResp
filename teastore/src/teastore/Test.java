package teastore;
import java.util.Scanner;
/**
 * @Auther:wangjg
 * @Date:2021/4/26 - 04 - 26 - 12:32
 * @Description: teastore
 * @version: 1.0
 */
public class Test {
public static void main(String[] args) {
        System.out.println("请输入你要购买的饮品：1.可乐 2.咖啡 3.奶茶 ");
        Scanner ji = new Scanner(System.in);
        int a = ji.nextInt();
        Drinks d = teastore.gettea(a);
        if(a==1){
            d.name = "可乐";
           // d.price = 10;
        }
        if(a==2){
            d.name = "咖啡";
            //d.price = 11;
        }
        if(a==3){
            //d.price = 15;
            d.name = "奶茶";
        }
        d.a();
        String str  = ji.next();
        System.out.println("选择：1.中杯  2.大杯  3.超大杯");
        int s = ji.nextInt();
        d.price = Drinks.b(s);
        String k = teastore.f(s);
        System.out.println("购买数量：");
        int h = ji.nextInt();
        //String s = teastore.gettea(a);
        System.out.println("订单信息：您购买了"+d.name+":"+str+",购买的"+k+",购买数量"+h+"杯 ,价钱："+d.price+"*"+h+"="+d.price*h+"元");
    }
}
