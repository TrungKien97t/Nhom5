/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package da_quanlysanpham;

/**
 *
 * @author Hi Windows 10
 */
public class SanPham {

    private String ma, tenSP;
    private double gia;
    private int soLuong;
    private String trangThai;

    public SanPham() {
    }

    public SanPham(String ma, String tenSP, double gia, int soLuong, String trangThai) {
        this.ma = ma;
        this.tenSP = tenSP;
        this.gia = gia;
        this.soLuong = soLuong;
        this.trangThai = trangThai;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
    public static void main(String[] args) {
        System.out.println("TÚ");
    }

}
