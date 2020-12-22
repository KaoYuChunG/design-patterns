package com.creational.prototype.deep;

import java.io.*;

public class Deep implements Serializable, Cloneable {

    public String name;
    public DeepClone deepClone;

    public Deep() {
       super();
    }

    //method 1 use clone
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        deep = super.clone();
        Deep deepPrototype = (Deep) deep;
        deepPrototype.deepClone = (DeepClone)deepClone.clone();
        return deepPrototype;
    }

    //method 2
    public Object deepClonee() {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            Deep deep = (Deep)ois.readObject();

            return deep;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (Exception e2) {
                System.out.println(e2.getMessage());
            }
        }

    }
}
