package com.creational.prototype.deep;

import java.io.Serializable;

public class DeepClone implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;

    private String clonename;

    private String cloneClass;

    public DeepClone(String clonename, String cloneClass) {
        this.clonename = clonename;
        this.cloneClass = cloneClass;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
