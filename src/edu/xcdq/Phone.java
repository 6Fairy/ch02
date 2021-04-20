package edu.xcdq;

public class Phone {
    public double width;
    public double high;
    public int weight;
    public String color;

    /**
     * 构造方法：没有返回值 方法的名字和类名需要完全一致
     * 通过构造方法，可以创建对象
     */

    public  Phone(){
    System.out.println("我被创建了");
    }

    /*
     构造方法
     含有全部的参数
     */
    /*public  Phone(double kuan,double gao, int zhongliang,String yanse){
        width= kuan;
        high = gao;
        weight = zhongliang;
        color = yanse;
    }
    */
    public  Phone(double width,double high, int weight,String color){
        this.width= width;
         this.high = high;
        this.weight = weight;
         this.color = color;
    }
    /*
    构造函数
    部分含有参数
     */
    public  Phone(double kuan ,double gao,int zhongliang){
        width = kuan;
        high = gao;
        weight = zhongliang;
    }
    public  void kaiji(){
        System.out.println("手机正在开机");
    }
    public void guanji(){
        System.out.println("手机正在关机");
    }
}
