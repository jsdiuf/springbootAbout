package com.jsdiuf.designPatten.proxy;

/**
 * @author weicc
 * @create 2018-10-10 9:51
 * 代理模式 proxy
 **/
public class ProxyImage implements Image{
    RealyImage realyimage;
    String filename;
    public ProxyImage(String filename) {
        this.filename=filename;
    }

    @Override
    public void display() {
        if (realyimage==null){
            realyimage=new RealyImage(filename);
        }
        realyimage.display();
    }

    public static void main(String[] args) {
        int h;
        System.out.println((h=1)^h>>>16);
        //Image image=new ProxyImage("ddd");
        //image.display();

        //image.display();
       Class cls= ProxyImage.class;

       Class cls2=new ProxyImage("").getClass();
        try {
            Class cls3=Class.forName("com.jsdiuf.designPatten.proxy.ProxyImage");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}