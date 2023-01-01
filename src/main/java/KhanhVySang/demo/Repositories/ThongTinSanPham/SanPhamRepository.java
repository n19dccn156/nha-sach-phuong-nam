package KhanhVySang.demo.Repositories.ThongTinSanPham;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import KhanhVySang.demo.Model.ThongTinSanPham.SanPhamModel;

@Repository
public interface SanPhamRepository extends JpaRepository<SanPhamModel, Integer>{
    List<SanPhamModel> findAll();
    Optional<SanPhamModel> findByMaSanPham(int maSanPham);
    Optional<SanPhamModel> findByTenSanPham(String tenSanPham);
    List<SanPhamModel> findByGia(float gia);
    List<SanPhamModel> findByMaLoaiSanPham(int maLoaiSanPham);

    @Transactional
    @Procedure(procedureName = "SP_Update_tblSanPham", outputParameterName = "trangThai")
    public boolean updateSanPham(@Param("maSanPham") int maSanPham,
                                 @Param("tenSanPham") String tenSanpham,
                                 @Param("gia") Float gia,
                                 @Param("moTa") String moTa,
                                 @Param("hinhAnh") String hinhAnh,
                                 @Param("maLoaiSanPham") Integer maLoaiSanpham,
                                 @Param("maUuDai") int maUuDai);

    @Transactional
    @Procedure(procedureName = "SP_Insert_tblSanPham", outputParameterName = "trangThai")
    public boolean insertSanPham(@Param("tenSanPham") String tenSanpham,
                                 @Param("gia") Float gia,
                                 @Param("moTa") String moTa,
                                 @Param("hinhAnh") String hinhAnh,
                                 @Param("maLoaiSanPham") Integer maLoaiSanpham,
                                 @Param("maUuDai") int maUuDai);
                                     
}
