package KhanhVySang.demo.Repositories.ThongTinMuaHang;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import KhanhVySang.demo.Model.ThongTinMuaHang.PhieuBanHangModel;

@Repository
public interface PhieuBanHangRepository extends JpaRepository<PhieuBanHangModel, Integer>{
 
    Optional<PhieuBanHangModel> findByMaPhieuBanHang(int maPhieuBanHang);
    List<PhieuBanHangModel> findByNgayBanHang(Date ngayBanHang);
    Optional<PhieuBanHangModel> findByDienThoai(String SDT);
    List<PhieuBanHangModel> findByMaNhanVien(int maNhanVien);
    List<PhieuBanHangModel> findByMaKhachHang(int maKhachHang);
    List<PhieuBanHangModel> findByMaUuDai(int maUuDai);
    
    @Transactional
    @Procedure(procedureName = "SP_Update_tblPhieuBanHang", outputParameterName = "trangThai")
    public boolean updatePhieuBanHang(@Param("maPhieuBanHang") int maPhieuBanHang,
                                      @Param("maTrangThai") int maTrangThai,
                                      @Param("maNhanVien") int maNhanVien);

    @Transactional
    @Procedure(procedureName = "SP_Insert_tblPhieuBanHang", outputParameterName = "trangThai")
    public boolean insertPhieuBanHang(@Param("diaChi") String diaChi,
                                      @Param("dienThoai") String dienThoai,
                                      @Param("maNhanVien") int maNhanVien,
                                      @Param("maKhachHang") int maKhachHang,
                                      @Param("maUuDai") int maUuDai,
                                      @Param("maTrangThai") int maTrangThai);
}
