package KhanhVySang.demo.Model.ThongTinSanPham;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tblSanPham")
public class SanPhamModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maSanPham;
    @Column(name = "tenSanPham", nullable = false, unique = true, length = 50)
    private String tenSanPham;
    @Column(name = "gia", nullable = false)
    private float gia;
    @Column(name = "soLuong")
    private int soLuong;
    @Column(name = "moTa", length = 30)
    private String moTa;
    @Column(name = "hinhAnh", nullable = false, length = 150)
    private String hinhAnh;
    @Column(name = "maLoaiSanPham", nullable = false)
    private int maLoaiSanPham;
    @Column(name = "maUuDai", nullable = true)
    private Integer maUuDai;

    public SanPhamModel() {}

    public SanPhamModel(String tenSanPham, float gia, String moTa, String hinhAnh,
                        int maLoaiSanPham, Integer maUuDai) {
        this.tenSanPham = tenSanPham;
        this.gia = gia;
        this.moTa = moTa;
        this.hinhAnh = hinhAnh;
        this.maLoaiSanPham = maLoaiSanPham;
        this.maUuDai = maUuDai;
    }

    public int getMaSanPham() {
        return this.maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return this.tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public float getGia() {
        return this.gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public String getMoTa() {
        return this.moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getHinhAnh() {
        return this.hinhAnh;
    }

    public void setHinhAnh(String anhDaiDien) {
        this.hinhAnh = anhDaiDien;
    }

    public int getMaLoaiSanPham() {
        return this.maLoaiSanPham;
    }

    public void setLoaiSanPham(int maLoaiSanPham) {
        this.maLoaiSanPham = maLoaiSanPham;
    }

    public Integer getMaUuDai(){
        return this.maUuDai;
    }

    public void setMaUuDai(Integer maUuDai) {
        this.maUuDai = maUuDai;
    }

}
