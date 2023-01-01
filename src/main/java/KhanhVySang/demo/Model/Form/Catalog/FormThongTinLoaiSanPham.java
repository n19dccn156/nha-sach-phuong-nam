package KhanhVySang.demo.Model.Form.Catalog;

import javax.annotation.concurrent.Immutable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Subselect;

@Entity
@Immutable
@Table(name = "Form_ThongTinLoaiSanPham")
@Subselect("select uuid() as id, LSP.* FROM Form_ThongTinLoaiSanPham LSP")
public class FormThongTinLoaiSanPham {
    
    @Id
    private String id;
    private String tenLoaiSanPham;
    private boolean trangThai;
    private String tenDanhMuc;

    public FormThongTinLoaiSanPham() {}

    public FormThongTinLoaiSanPham(String tenLoaiSanPham, boolean trangThai, String tenDanhMuc) {
        this.tenLoaiSanPham = tenLoaiSanPham;
        this.trangThai = trangThai;
        this.tenDanhMuc = tenDanhMuc;
    }

    public String getTenLoaiSanPham() {
        return this.tenLoaiSanPham;
    }

    public void setTenLoaiSanPham(String tenLoaiSanPham) {
        this.tenLoaiSanPham = tenLoaiSanPham;
    }

    public boolean getTrangThai() {
        return this.trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public String getTenDanhMuc() {
        return this.tenDanhMuc;
    }

    public void setTenDanhMuc(String tenDanhMuc) {
        this.tenDanhMuc = tenDanhMuc;
    }

}
