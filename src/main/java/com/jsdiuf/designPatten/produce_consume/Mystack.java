package com.jsdiuf.designPatten.produce_consume;

import java.util.ArrayList;
import java.util.List;

/**
 * @author weicc
 * @create 2018-10-25 14:41
 * 生产者消费者模式
 **/
public class Mystack {


    private List<String> list = new ArrayList<String>();

    public void push() {
        synchronized (this) {
            try {
                while (list.size() == 1) {
                    this.wait();
                }
                String t = new String("things" + Math.random());
                System.out.println("push: " + t);
                list.add(t);
                this.notify();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public void pop() {
        synchronized (this) {
            try {
                while (list.size() == 0) {
                    this.wait();
                }

                System.out.println("pop: " + list.remove(0));
                this.notify();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        Mystack stack = new Mystack();

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    stack.push();
                }

            }
        }.start();


        new Thread() {
            @Override
            public void run() {
                while (true) {
                    stack.pop();
                }

            }
        }.start();


    }
}
