package com.example.creater;

import java.util.List;

public class AccountInfo {
    private int MESS_1;

    public int getMESS_1() {
        return MESS_1;
    }

    public void setMESS_1(int MESS_1) {
        this.MESS_1 = MESS_1;
    }

    private boolean state;
    private String title;
    private String desc;
    public String txt_view;

    public String getTxt_view() {
        return txt_view;
    }

    public void setTxt_view(String txt_view) {
        this.txt_view = txt_view;
    }

    private List<contentData> data;

    public AccountInfo() {
    }

    public AccountInfo(String txt_view) {
        this.txt_view = txt_view;
    }
    public AccountInfo(int MESS_1, boolean state, String title, String desc) {
        this.MESS_1 = MESS_1;
        this.state = state;
        this.title = title;
        this.desc = desc;
    }

    public AccountInfo(int MESS_1, String title, List<contentData> data) {
        this.MESS_1 = MESS_1;
        this.title = title;
        this.data = data;
    }



    public AccountInfo(int MESS_1, String title, String desc, List<contentData> data) {
        this.MESS_1 = MESS_1;
        this.title = title;
        this.desc = desc;
        this.data = data;
    }

    public AccountInfo(int MESS_1, boolean state, String title, String desc, List<contentData> data) {
        this.MESS_1 = MESS_1;
        this.state = state;
        this.title = title;
        this.desc = desc;
        this.data = data;
    }

    public boolean isState() {
        return state;
    }

    public int isPan() {
        return MESS_1;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


    public List<contentData> getData() {
        return data;
    }

    public void setData(List<contentData> data) {
        this.data = data;
    }

    public static class contentData {
        private String key;
        private String value;
private int ban;

        public int getBan() {
            return ban;
        }
public int isBan(){
            return ban;
}
        public void setBan(int ban) {
            this.ban = ban;
        }

        public contentData() {
        }

        public contentData(String key, String value) {
            this.key = key;
            this.value = value;
        }
        public contentData(String key, String value,int ban) {
            this.key = key;
            this.value = value;
            this.ban=ban;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
