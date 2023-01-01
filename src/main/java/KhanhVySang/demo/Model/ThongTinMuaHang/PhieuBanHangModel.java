package KhanhVySang.demo.Model.ThongTinMuaHang;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tblPhieuBanHang")
public class PhieuBanHangModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maPhieuBanHang;
    @Column(name = "ngayBanHang", nullable = false)
    private Date ngayBanHang;
    @Column(name = "diaChi", nullable = false, length = 100)
    private String diaChi;
    @Column(name = "dienThoai", unique = true, nullable = false, length = 20)
    private String dienThoai;
    @Column(name = "maNhanVien", nullable = false)
    private Integer maNhanVien;
    @Column(name = "maUuDai")
    private int maUuDai;
    @Column(name = "maKhachHang")
    private int maKhachHang;
    @Column(name = "maTrangThai", nullable = false)
    private int maTrangThai;


    public PhieuBanHangModel() {}

    public PhieuBanHangModel(Date ngayBanHang, String diaChi, String dienThoai, int trangThai, 
                             int maNhanVien, int maKhachHang, int maUudai) {
        this.ngayBanHang = ngayBanHang;
        this.diaChi = diaChi;
        this.dienThoai = dienThoai;
        this.maTrangThai= trangThai;
        this.maNhanVien = maNhanVien;
        this.maKhachHang = maKhachHang;
        this.maUuDai = maUudai;
    }

    public int getMaPhieuBanHang() {
        return this.maPhieuBanHang;
    }

    public void setMaPhieuBanHang(int maPhieuBanHang) {
        this.maPhieuBanHang = maPhieuBanHang;
    }

    public Date getNgayBanHang() {
        return this.ngayBanHang;
    }

    public void setNgayBanHang(Date ngayBanHang) {
        this.ngayBanHang = ngayBanHang;
    }

    public String getDiaChi() {
        return this.diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getDienThoai() {
        return this.dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public int getMaTrangThai() {
        return this.maTrangThai;
    }

    public void setMaTrangThai(int maTrangThai) {
        this.maTrangThai= maTrangThai;
    }

    public int getMaNhanVien() {
        return this.maNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public int getMaKhachHang() {
        return this.maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang= maKhachHang;
    }
}
