/**
 * Chương trình quản lý tạp chí trong thư viện
 * File duy nhất chứa cả lớp TapChi và lớp QuanLyTapChi (Test)
 */

// Lớp TapChi - Biểu diễn thông tin về một tạp chí
class TapChi {
    // Các thuộc tính private - đóng gói dữ liệu
    private String maTapChi;
    private String tenTapChi;
    private String nhaXuatBan;
    private int soPhatHanh;
    private int namPhatHanh;
    private int soLuong;

    // Constructor mặc định
    public TapChi() {
        this.maTapChi = "";
        this.tenTapChi = "";
        this.nhaXuatBan = "";
        this.soPhatHanh = 0;
        this.namPhatHanh = 0;
        this.soLuong = 0;
    }

    // Constructor đầy đủ tham số
    public TapChi(String maTapChi, String tenTapChi, String nhaXuatBan, int soPhatHanh, int namPhatHanh, int soLuong) {
        this.maTapChi = maTapChi;
        this.tenTapChi = tenTapChi;
        this.nhaXuatBan = nhaXuatBan;
        this.soPhatHanh = soPhatHanh;
        this.namPhatHanh = namPhatHanh;
        this.soLuong = soLuong;
    }

    // Constructor một phần tham số
    public TapChi(String maTapChi, String tenTapChi, String nhaXuatBan) {
        this.maTapChi = maTapChi;
        this.tenTapChi = tenTapChi;
        this.nhaXuatBan = nhaXuatBan;
        this.soPhatHanh = 1;
        this.namPhatHanh = 2025;
        this.soLuong = 1;
    }

    // Getter methods
    public String getMaTapChi() { return maTapChi; }
    public String getTenTapChi() { return tenTapChi; }
    public String getNhaXuatBan() { return nhaXuatBan; }
    public int getSoPhatHanh() { return soPhatHanh; }
    public int getNamPhatHanh() { return namPhatHanh; }
    public int getSoLuong() { return soLuong; }

    // Setter methods
    public void setMaTapChi(String maTapChi) {
        if (maTapChi != null && !maTapChi.trim().isEmpty()) this.maTapChi = maTapChi;
        else System.out.println("Mã tạp chí không hợp lệ!");
    }

    public void setTenTapChi(String tenTapChi) {
        if (tenTapChi != null && !tenTapChi.trim().isEmpty()) this.tenTapChi = tenTapChi;
        else System.out.println("Tên tạp chí không hợp lệ!");
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        if (nhaXuatBan != null && !nhaXuatBan.trim().isEmpty()) this.nhaXuatBan = nhaXuatBan;
        else System.out.println("Nhà xuất bản không hợp lệ!");
    }

    public void setSoPhatHanh(int soPhatHanh) {
        if (soPhatHanh > 0) this.soPhatHanh = soPhatHanh;
        else System.out.println("Số phát hành không hợp lệ!");
    }

    public void setNamPhatHanh(int namPhatHanh) {
        if (namPhatHanh > 0 && namPhatHanh <= 2025) this.namPhatHanh = namPhatHanh;
        else System.out.println("Năm phát hành không hợp lệ!");
    }

    public void setSoLuong(int soLuong) {
        if (soLuong >= 0) this.soLuong = soLuong;
        else System.out.println("Số lượng không hợp lệ!");
    }

    // Hiển thị thông tin
    public void hienThiThongTin() {
        System.out.println("╔════════════════════════════════════════════════════════════╗");
        System.out.println("║              THÔNG TIN CHI TIẾT TẠP CHÍ                   ║");
        System.out.println("╠════════════════════════════════════════════════════════════╣");
        System.out.println("║ Mã tạp chí:     " + String.format("%-42s", maTapChi) + "║");
        System.out.println("║ Tên tạp chí:    " + String.format("%-42s", tenTapChi) + "║");
        System.out.println("║ Nhà xuất bản:   " + String.format("%-42s", nhaXuatBan) + "║");
        System.out.println("║ Số phát hành:   " + String.format("%-42d", soPhatHanh) + "║");
        System.out.println("║ Năm phát hành:  " + String.format("%-42d", namPhatHanh) + "║");
        System.out.println("║ Số lượng:       " + String.format("%-42d", soLuong) + "║");
        System.out.println("╚════════════════════════════════════════════════════════════╝");
    }

    // Các chức năng nghiệp vụ
    public void themTapChi(int soLuongThem) {
        if (soLuongThem > 0) {
            this.soLuong += soLuongThem;
            System.out.println("Đã thêm " + soLuongThem + " bản. Số lượng hiện tại: " + this.soLuong);
        } else {
            System.out.println("Số lượng thêm phải lớn hơn 0!");
        }
    }

    public boolean muonTapChi(int soLuongMuon) {
        if (soLuongMuon > 0 && soLuongMuon <= this.soLuong) {
            this.soLuong -= soLuongMuon;
            System.out.println("Mượn thành công " + soLuongMuon + " bản. Còn lại: " + this.soLuong);
            return true;
        } else {
            System.out.println("Không đủ tạp chí để mượn hoặc số lượng không hợp lệ!");
            return false;
        }
    }

    public void traTapChi(int soLuongTra) {
        if (soLuongTra > 0) {
            this.soLuong += soLuongTra;
            System.out.println("Đã trả " + soLuongTra + " bản. Tổng số: " + this.soLuong);
        } else {
            System.out.println("Số lượng trả phải lớn hơn 0!");
        }
    }
}

// Lớp kiểm thử
public class QuanLyTapChi {
    public static void main(String[] args) {
        System.out.println("\n▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
        System.out.println("     CHƯƠNG TRÌNH QUẢN LÝ TẠP CHÍ TRONG THƯ VIỆN");
        System.out.println("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬\n");

        TapChi tc1 = new TapChi("TC001", "Khoa học & Công nghệ", "NXB Khoa học", 5, 2023, 20);
        TapChi tc2 = new TapChi("TC002", "Tạp chí Toán học", "NXB Giáo dục");
        TapChi tc3 = new TapChi();

        System.out.println(">>> 1. Tạp chí đầy đủ thông tin:");
        tc1.hienThiThongTin();

        System.out.println("\n>>> 2. Tạp chí với thông tin một phần:");
        tc2.hienThiThongTin();

        System.out.println("\n>>> 3. Tạp chí mặc định:");
        tc3.hienThiThongTin();

        System.out.println("\n>>> 4. Cập nhật thông tin cho tạp chí 3:");
        tc3.setMaTapChi("TC003");
        tc3.setTenTapChi("Tạp chí Văn hóa");
        tc3.setNhaXuatBan("NXB Văn hóa");
        tc3.setSoPhatHanh(2);
        tc3.setNamPhatHanh(2024);
        tc3.setSoLuong(12);
        tc3.hienThiThongTin();

        System.out.println("\n>>> 5. Kiểm tra validation:");
        tc1.setNamPhatHanh(2030);
        tc1.setSoLuong(-10);
        tc1.setTenTapChi("");

        System.out.println("\n>>> 6. Chức năng nghiệp vụ:");
        tc1.themTapChi(5);
        tc1.muonTapChi(3);
        tc1.traTapChi(2);
        tc1.muonTapChi(100);

        System.out.println("\n>>> 7. Thông tin cuối cùng:");
        tc1.hienThiThongTin();

        System.out.println("\n▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
        System.out.println("              CHƯƠNG TRÌNH HOÀN TẤT!");
    }
}