package com.jsdiuf.jsdiuf.designPatten.prototype;

/**
 * @author weicc
 * @create 2018-09-26 16:36
 **/
public abstract class Shape implements Cloneable {
    String id;
    String type;
    abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
