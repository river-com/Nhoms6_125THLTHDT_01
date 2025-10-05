import java.util.Scanner;

import java.util.Scanner;

class Sach { 
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;

    public Sach() {}

    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
    }

    public String getMaSach() { return maSach; }
    public String getTieuDe() { return tieuDe; }
    public String getTacGia() { return tacGia; }
    public int getNamXuatBan() { return namXuatBan; }
    public int getSoLuong() { return soLuong; }

    public void setMaSach(String maSach) { this.maSach = maSach; }
    public void setTieuDe(String tieuDe) { this.tieuDe = tieuDe; }
    public void setTacGia(String tacGia) { this.tacGia = tacGia; }
    public void setNamXuatBan(int namXuatBan) { this.namXuatBan = namXuatBan; }
    public void setSoLuong(int soLuong) { this.soLuong = soLuong; }

    public void hienThiThongTin() { 
        System.out.println("==== Thông tin sách ====");
        System.out.println("Mã sách      : " + maSach);
        System.out.println("Tiêu đề      : " + tieuDe);
        System.out.println("Tác giả      : " + tacGia);
        System.out.println("Năm xuất bản : " + namXuatBan);
        System.out.println("Số lượng     : " + soLuong);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sach sach = new Sach();

        System.out.print("Nhập mã sách: ");
        sach.setMaSach(scanner.nextLine());

        System.out.print("Nhập tiêu đề: ");
        sach.setTieuDe(scanner.nextLine());

        System.out.print("Nhập tác giả: ");
        sach.setTacGia(scanner.nextLine());

        System.out.print("Nhập năm xuất bản: ");
        sach.setNamXuatBan(scanner.nextInt());

        System.out.print("Nhập số lượng: ");
        sach.setSoLuong(scanner.nextInt());

        System.out.println();
        sach.hienThiThongTin();
    }
}
