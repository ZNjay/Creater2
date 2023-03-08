package com.example.creater;

public class Arrs {
    private String name;
    private String huibao;
    private String neirong;
    private String shijian;

    public Arrs(String name, String huibao, String neirong, String shijian) {
        this.name = name;
        this.huibao = huibao;
        this.neirong = neirong;
        this.shijian = shijian;
    }
    public Arrs(String name2, String huibao2, String shijian2) {
        this.name = name2;
        this.huibao = huibao2;
        this.shijian = shijian2;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHuibao() {
        return huibao;
    }

    public void setHuibao(String huibao) {
        this.huibao = huibao;
    }

    public String getNeirong() {
        return neirong;
    }

    public void setNeirong(String neirong) {
        this.neirong = neirong;
    }

    public String getShijian() {
        return shijian;
    }

    public void setShijian(String shijian) {
        this.shijian = shijian;
    }

}
