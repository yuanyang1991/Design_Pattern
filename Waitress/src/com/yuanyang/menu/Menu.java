package com.yuanyang.menu;


import com.yuanyang.MenuItem;

import java.util.Iterator;

public interface Menu {

    /**
     * 获取迭代器
     * @return
     */
    Iterator<MenuItem> createIterator();

    void addItem(String name, boolean isVega);

}
