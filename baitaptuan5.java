/**
 * Chương trình quản lý sách trong thư viện
 * File duy nhất chứa cả lớp Sach và lớp baitaptuan5 (Test)
 */

// Lớp Sach - Biểu diễn thông tin về một cuốn sách
class Sach {
    // Các thuộc tính private - đóng gói dữ liệu
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;
    
    // Constructor mặc định (không tham số)
    public Sach() {
        this.maSach = "";
        this.tieuDe = "";
        this.tacGia = "";
        this.namXuatBan = 0;
        this.soLuong = 0;
    }
    
    // Constructor có tham số đầy đủ
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
    }
    
    // Constructor với một số tham số
    public Sach(String maSach, String tieuDe, String tacGia) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = 2024;
        this.soLuong = 1;
    }
    
    // Getter methods - truy cập dữ liệu
    public String getMaSach() {
        return maSach;
    }
    
    public String getTieuDe() {
        return tieuDe;
    }
    
    public String getTacGia() {
        return tacGia;
    }
    
    public int getNamXuatBan() {
        return namXuatBan;
    }
    
    public int getSoLuong() {
        return soLuong;
    }
    
    // Setter methods - thay đổi dữ liệu có kiểm tra
    public void setMaSach(String maSach) {
        if (maSach != null && !maSach.trim().isEmpty()) {
            this.maSach = maSach;
        } else {
            System.out.println("Mã sách không hợp lệ!");
        }
    }
    
    public void setTieuDe(String tieuDe) {
        if (tieuDe != null && !tieuDe.trim().isEmpty()) {
            this.tieuDe = tieuDe;
        } else {
            System.out.println("Tiêu đề không hợp lệ!");
        }
    }
    
    public void setTacGia(String tacGia) {
        if (tacGia != null && !tacGia.trim().isEmpty()) {
            this.tacGia = tacGia;
        } else {
            System.out.println("Tác giả không hợp lệ!");
        }
    }
    
    public void setNamXuatBan(int namXuatBan) {
        if (namXuatBan > 0 && namXuatBan <= 2025) {
            this.namXuatBan = namXuatBan;
        } else {
            System.out.println("Năm xuất bản không hợp lệ!");
        }
    }
    
    public void setSoLuong(int soLuong) {
        if (soLuong >= 0) {
            this.soLuong = soLuong;
        } else {
            System.out.println("Số lượng không hợp lệ!");
        }
    }
    
    // Phương thức hiển thị thông tin sách
    public void hienThiThongTin() {
        System.out.println("╔════════════════════════════════════════════════════════════╗");
        System.out.println("║              THÔNG TIN CHI TIẾT SÁCH                       ║");
        System.out.println("╠════════════════════════════════════════════════════════════╣");
        System.out.println("║ Mã sách:        " + String.format("%-42s", maSach) + "║");
        System.out.println("║ Tiêu đề:        " + String.format("%-42s", tieuDe) + "║");
        System.out.println("║ Tác giả:        " + String.format("%-42s", tacGia) + "║");
        System.out.println("║ Năm xuất bản:   " + String.format("%-42d", namXuatBan) + "║");
        System.out.println("║ Số lượng:       " + String.format("%-42d", soLuong) + "║");
        System.out.println("╚════════════════════════════════════════════════════════════╝");
    }
    
    // Các phương thức nghiệp vụ bổ sung
    public void themSach(int soLuongThem) {
        if (soLuongThem > 0) {
            this.soLuong += soLuongThem;
            System.out.println("Đã thêm " + soLuongThem + " cuốn. Số lượng hiện tại: " + this.soLuong);
        } else {
            System.out.println("Số lượng thêm phải lớn hơn 0!");
        }
    }
    
    public boolean muonSach(int soLuongMuon) {
        if (soLuongMuon > 0 && soLuongMuon <= this.soLuong) {
            this.soLuong -= soLuongMuon;
            System.out.println("Mượn thành công " + soLuongMuon + " cuốn. Còn lại: " + this.soLuong);
            return true;
        } else {
            System.out.println("Không đủ sách để mượn hoặc số lượng không hợp lệ!");
            return false;
        }
    }
    
    public void traSach(int soLuongTra) {
        if (soLuongTra > 0) {
            this.soLuong += soLuongTra;
            System.out.println("Đã trả " + soLuongTra + " cuốn. Tổng số: " + this.soLuong);
        } else {
            System.out.println("Số lượng trả phải lớn hơn 0!");
        }
    }
}

// Lớp Test - Kiểm thử các chức năng của lớp Sach
public class baitaptuan5 {
    public static void main(String[] args) {
        System.out.println("\n▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
        System.out.println("     CHƯƠNG TRÌNH QUẢN LÝ SÁCH TRONG THƯ VIỆN");
        System.out.println("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬\n");
        
        // ========== YÊU CẦU 3 & 4: TẠO ĐỐI TƯỢNG VỚI CÁC CONSTRUCTOR ==========
        
        System.out.println(">>> 1. Tạo đối tượng bằng Constructor đầy đủ tham số:");
        Sach sach1 = new Sach("S001", "Lập trình Java cơ bản", "Nguyễn Văn A", 2023, 15);
        sach1.hienThiThongTin();
        
        System.out.println("\n>>> 2. Tạo đối tượng bằng Constructor một phần tham số:");
        Sach sach2 = new Sach("S002", "Cấu trúc dữ liệu và giải thuật", "Trần Thị B");
        sach2.hienThiThongTin();
        
        System.out.println("\n>>> 3. Tạo đối tượng bằng Constructor mặc định:");
        Sach sach3 = new Sach();
        System.out.println("(Đối tượng được tạo với giá trị mặc định)");
        sach3.hienThiThongTin();
        
        // ========== YÊU CẦU 5: THỂ HIỆN TÍNH ĐÓNG GÓI ==========
        
        System.out.println("\n>>> 4. Sử dụng SETTER để cập nhật thông tin (Tính đóng gói):");
        System.out.println("Cập nhật thông tin cho sách 3...");
        sach3.setMaSach("S003");
        sach3.setTieuDe("Thiết kế hướng đối tượng");
        sach3.setTacGia("Lê Văn C");
        sach3.setNamXuatBan(2024);
        sach3.setSoLuong(10);
        System.out.println("\nSau khi cập nhật:");
        sach3.hienThiThongTin();
        
        System.out.println("\n>>> 5. Sử dụng GETTER để truy xuất dữ liệu (Tính đóng gói):");
        System.out.println("Mã sách: " + sach1.getMaSach());
        System.out.println("Tiêu đề: " + sach1.getTieuDe());
        System.out.println("Tác giả: " + sach1.getTacGia());
        System.out.println("Năm xuất bản: " + sach1.getNamXuatBan());
        System.out.println("Số lượng: " + sach1.getSoLuong());
        
        // ========== KIỂM TRA TÍNH ĐÓNG GÓI VỚI VALIDATION ==========
        
        System.out.println("\n>>> 6. Kiểm tra validation khi cập nhật dữ liệu không hợp lệ:");
        System.out.println("Thử set năm xuất bản = 2030 (không hợp lệ):");
        sach1.setNamXuatBan(2030);
        
        System.out.println("\nThử set số lượng = -5 (không hợp lệ):");
        sach1.setSoLuong(-5);
        
        System.out.println("\nThử set tiêu đề rỗng (không hợp lệ):");
        sach1.setTieuDe("");
        
        // ========== DEMO CÁC PHƯƠNG THỨC NGHIỆP VỤ ==========
        
        System.out.println("\n>>> 7. Các chức năng nghiệp vụ:");
        System.out.println("\n--- Thêm sách vào kho ---");
        sach1.themSach(5);
        
        System.out.println("\n--- Mượn sách ---");
        sach1.muonSach(3);
        
        System.out.println("\n--- Trả sách ---");
        sach1.traSach(2);
        
        System.out.println("\n--- Thử mượn quá số lượng ---");
        sach1.muonSach(100);
        
        System.out.println("\n--- Thông tin cuối cùng của sách 1 ---");
        sach1.hienThiThongTin();
        
        // ========== TỔNG KẾT ==========
        
        System.out.println("\n╔════════════════════════════════════════════════════════════╗");
        System.out.println("║              TỔNG KẾT CÁC YÊU CẦU ĐÃ HOÀN THÀNH            ║");
        System.out.println("╠════════════════════════════════════════════════════════════╣");
        System.out.println("║ ✓ Yêu cầu 1: Tạo lớp Sach với các thuộc tính              ║");
        System.out.println("║ ✓ Yêu cầu 2: Phương thức hienThiThongTin()                ║");
        System.out.println("║ ✓ Yêu cầu 3: Lớp Test tạo đối tượng                        ║");
        System.out.println("║ ✓ Yêu cầu 4: Các Constructor khởi tạo đối tượng           ║");
        System.out.println("║ ✓ Yêu cầu 5: Tính đóng gói (Encapsulation)                ║");
        System.out.println("║   - Thuộc tính private                                     ║");
        System.out.println("║   - Getter/Setter methods                                  ║");
        System.out.println("║   - Validation trong Setter                                ║");
        System.out.println("╚════════════════════════════════════════════════════════════╝");
        
        System.out.println("\n▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
        System.out.println("              CHƯƠNG TRÌNH HOÀN TẤT!");
        System.out.println("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬\n");
    }
}