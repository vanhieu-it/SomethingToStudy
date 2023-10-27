package com.hido.somethingtostudy.JavaAndJava.P05_Inheritance.model;

import java.util.Scanner;

public class SchoolBook extends Library {
    private int soTrang;
    private String tinhTrang;
    private int soLuongMuon;

    public SchoolBook() {
    }

    public SchoolBook(String maSach, String tenSach, String nhaXuatBan, int namXuatBan, int soLuong, Location viTri, int soTrang, String tinhTrang, int soLuongMuon) {
        super(maSach, tenSach, nhaXuatBan, namXuatBan, soLuong, viTri);//Các thuộc tính của lớp cha Library
        this.soTrang = soTrang;
        this.tinhTrang = tinhTrang;
        this.soLuongMuon = soLuongMuon;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public int getSoLuongMuon() {
        return soLuongMuon;
    }

    public void setSoLuongMuon(int soLuongMuon) {
        this.soLuongMuon = soLuongMuon;
    }

    @Override
    public String toString() {
        return "SchoolBook{" +
                "soTrang=" + soTrang +
                ", tinhTrang='" + tinhTrang + '\'' +
                ", soLuongMuon=" + soLuongMuon +
                "} " + super.toString();
    }

    public int tonKho() {
        return getSoLuong() - soLuongMuon;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so trang: ");
        soTrang = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap tinh trang: ");
        tinhTrang = sc.nextLine();
        System.out.println("Nhap so luong muon: ");
        soLuongMuon = sc.nextInt();
    }
}
