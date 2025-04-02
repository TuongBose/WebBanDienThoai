package com.project.Shopapp.Services;

import com.project.Shopapp.DTOs.LoaiSanPhamDTO;
import com.project.Shopapp.Models.LoaiSanPham;
import com.project.Shopapp.Repositories.LoaiSanPhamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LoaiSanPhamService implements ILoaiSanPhamService {
    private final LoaiSanPhamRepository loaiSanPhamRepository;

    @Override
    public LoaiSanPham createLoaiSanPham(LoaiSanPhamDTO loaiSanPhamDTO) {
        LoaiSanPham newLoaiSanPham = LoaiSanPham.builder().TENLOAISANPHAM(loaiSanPhamDTO.getTENLOAISANPHAM()).build();
        return loaiSanPhamRepository.save(newLoaiSanPham);
    }

    @Override
    public LoaiSanPham getLoaiSanPhamByMASANPHAM(int id) {
        return loaiSanPhamRepository.findById(id).orElseThrow(() -> new RuntimeException("Khong tim thay loai san pham"));
    }

    @Override
    public List<LoaiSanPham> getAllLoaiSanPham() {
        return loaiSanPhamRepository.findAll();
    }

    @Override
    public LoaiSanPham updateLoaiSanPham(int id, LoaiSanPhamDTO loaiSanPhamDTO) {
        LoaiSanPham existingLoaiSanPham = getLoaiSanPhamByMASANPHAM(id);
        existingLoaiSanPham.setTENLOAISANPHAM(loaiSanPhamDTO.getTENLOAISANPHAM());
        loaiSanPhamRepository.save(existingLoaiSanPham);
        return existingLoaiSanPham;
    }

    @Override
    public void deleteLoaiSanPham(int id) {
        loaiSanPhamRepository.deleteById(id);
    }
}
