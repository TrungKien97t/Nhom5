/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package da_quanlysanpham;

import java.util.ArrayList;

/**
 *
 * @author Hi Windows 10
 */
public class QLSP {

    ArrayList<SanPham> listSP = new ArrayList<>();

    public QLSP() {
        listSP.add(new SanPham("SP001", "Bia Hà Nội", 12000.0, 73, "Cũ"));
        listSP.add(new SanPham("SP002", "Mì 3 Miền", 3500.0, 370, "Cũ"));
        listSP.add(new SanPham("SP003", "Mì Kokomi", 3000.0, 100, "Mới"));
        listSP.add(new SanPham("SP004", "Sữa Ông Thọ", 24000.0, 23, "Cũ"));
        listSP.add(new SanPham("SP005", "Sữa Tươi TH", 6000.0, 144, "Mới"));
        listSP.add(new SanPham("SP006", "Khăn Giấy Ướt", 30000.0, 20, "Mới"));
        listSP.add(new SanPham("SP007", "Bánh Cosy", 45000.0, 50, "Mới"));
        listSP.add(new SanPham("SP008", "Bánh Gạo", 25000.0, 35, "Cũ"));
        listSP.add(new SanPham("SP009", "Bim Bim", 5000.0, 90, "Mới"));
        listSP.add(new SanPham("SP010", "Dầu Ăn Simply", 50000.0, 40, "Mới"));
    }

    ArrayList<SanPham> getListSP() {
        return listSP;
    }

    Boolean themSP(SanPham sp) {
        listSP.add(sp);
        return true;
    }

    Boolean suaSP(int i, SanPham spNew) {
        listSP.set(i, spNew);
        return true;
    }

    Boolean xoaSP(int viTri) {
        listSP.remove(viTri);
        return true;
    }

    ArrayList<SanPham> search(String maCanTim) {
        ArrayList<SanPham> listKetQua = new ArrayList<>();
        for (SanPham sp : listSP) {
            if (sp.getMa().equals(maCanTim)) {
                listKetQua.add(sp);
            }
        }
        return listKetQua;
    }
}
