package com.principls.compositereuse.high;

public class FileSystem extends StandardDirectory {
    public FileSystem(String name) {
        super(name);
    }
    @Override
    public String getDisplayType() {
        return "StandardFile System";
    }

}
