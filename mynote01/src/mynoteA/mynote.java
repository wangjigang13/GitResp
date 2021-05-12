package mynoteA;

public class mynote {
    public static void main(String[] args) {
        int[][] arr=new int[3][];
        int[] a={1,2,3};
        arr[0]=a;                //arr[0]=new int[]{1,2,3};
        arr[1]=new int[]{4,5,6};
        arr[2]=new int[]{7,8,9};
        //外面for循环里面for循环
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        //外面for循环里面增强for循环
        for (int i = 0; i <arr.length ; i++) {
            for(int b:arr[i]){
                System.out.print(b+"\t");
            }
        }
        //外面增强for循环里面增强for循环
        for(int[] c:arr){
            for(int d:c){
                System.out.print(d+"\t");
            }
            System.out.println();
        }
    }
}
