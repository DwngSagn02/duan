package com.example.duan1.model;

public class thanhvien {
    private String ten;
    private String ma;
    private String chucvu;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public thanhvien() {
    }

    public thanhvien(String ten, String ma, String chucvu) {
        this.ten = ten;
        this.ma = ma;
        this.chucvu = chucvu;
    }
}
