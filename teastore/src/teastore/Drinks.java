package teastore;

/**
 * @Auther:wangjg
 * @Date:2021/4/26 - 04 - 26 - 12:31
 * @Description: teastore
 * @version: 1.0
 */
public abstract class Drinks {
    String size;
    String name;
    int price;
    public abstract void a();
    public static int b(int i){
        int price = 0;
        if(i==1){
           price = 10;
        }
        if(i==2){
            price = 11;
        }
        if(i==3){
            price = 15;
        }
        return price;
    }
}
