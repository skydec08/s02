public class Main {
    public static void main(String[] args) {
        int count = 0;
        int count1 = (int)5.7; //無條件捨去
        int count2 = 15/2; //結果會無條件捨去
        double count3 = 15/2; //依然無條捨去
        double count4 = 15/(double)2; //產生7.5，(double)可放前或後
        int x = 2;
        int y = 2* (++x); //x必會加1 =3，但y會受++在前或後影響
        int z = 2* (x++);
        double doubleVar = 2.0; //浮點數
        double A;
        double B;
        count +=2;
        A = doubleVar--; //因為由左至右，所以A會等於doubleVar，--沒有用
        B = --doubleVar; //因為先看到--所以doubleVar會減1，--有效果
        System.out.println(A);
        System.out.println( x + ";" + y );//
        System.out.println(z);
    }
}