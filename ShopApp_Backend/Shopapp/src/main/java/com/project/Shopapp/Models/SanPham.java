package com.project.Shopapp.Models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "SANPHAM")
@Builder
public class SanPham extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int MASANPHAM;

    @Column(name = "TENSANPHAM", nullable = false)
    private String TENSANPHAM;

    @Column(name = "GIA", nullable = false)
    private int GIA;

    @ManyToOne
    @JoinColumn(name = "MATHUONGHIEU")
    private ThuongHieu MATHUONGHIEU;

    private String MOTA;
    private int SOLUONGTONKHO;

    @ManyToOne
    @JoinColumn(name = "MALOAISANPHAM")
    private LoaiSanPham MALOAISANPHAM;

    private String THUMBNAIL;
}
