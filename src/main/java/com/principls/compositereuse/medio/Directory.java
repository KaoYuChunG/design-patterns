package com.principls.compositereuse.medio;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Directory extends AbstractItem {
    private LinkedList<Item> items = new LinkedList<>();

    public Directory(String name) {
        super(name);
    }


    @Override
    public List<Item> search(String name) {
        List<Item> results = new ArrayList<>();

        for (Item file : getChildren()) {  //然後要求每一個子檔案或資料夾也搜尋，達成深度優先搜尋
            if (file.getName().contains(name))
                results.add(file);
            results.addAll(file.search(name));
        }
        return results;
    }

    public void addChild(Item child) {
        if (!contains(child.getName()))
        {
            items.add(child);
            child.setParent(this);
        }
    }
    public boolean contains(String name) {
        for (Item item : items) {
            if (name.equals(item.getName()))
                return true;
        }
        return false;
    }

    public Item getChild(String name) {
        for (Item file : getChildren()) {
            if (name.equals(file.getName()))
                return file;
        }
        throw new FileSystemException("The file " + name + " is not found.");
    }

    public List<Item> getChildren() {
        return items;
    }

    @Override
    public String getDisplayType() {
        return "Directory";
    }


}
