package com.example.mirry.chat.bean;

import com.example.mirry.chat.utils.PinyinUtil;

/**
 * Created by Mirry on 2017/3/8.
 */

public class Friend implements Comparable<Friend>{
    private String name;
    private String pinyin;
    private String id;
    private int type;
    private String msg;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Friend(String name) {
        this.name = name;
        this.pinyin = PinyinUtil.getPinyin(name);
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Friend another) {
        return this.getPinyin().compareTo(another.getPinyin());
    }
}
