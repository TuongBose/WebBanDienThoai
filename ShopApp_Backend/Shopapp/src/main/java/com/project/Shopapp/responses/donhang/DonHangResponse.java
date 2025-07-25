package com.project.Shopapp.responses.donhang;

import com.project.Shopapp.models.DonHang;
import com.project.Shopapp.responses.ctdh.CTDHResponse;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DonHangResponse {
    private int MADONHANG;
    private int USERID;
    private String FULLNAME;
    private String EMAIL;
    private String SODIENTHOAI;
    private String DIACHI;
    private String GHICHU;
    private String TRANGTHAI;
    private LocalDate NGAYDATHANG;
    private BigDecimal TONGTIEN;
    private String PHUONGTHUCTHANHTOAN;
    private boolean IS_ACTIVE;
    private List<CTDHResponse> ctdhList;

    public static DonHangResponse fromDonHang(DonHang donHang, List<CTDHResponse> ctdhList) {
        return DonHangResponse.builder()
                .MADONHANG(donHang.getMADONHANG())
                .USERID(donHang.getUSERID().getUSERID())
                .FULLNAME(donHang.getFULLNAME())
                .EMAIL(donHang.getEMAIL())
                .SODIENTHOAI(donHang.getSODIENTHOAI())
                .DIACHI(donHang.getDIACHI())
                .GHICHU(donHang.getGHICHU())
                .TRANGTHAI(donHang.getTRANGTHAI())
                .NGAYDATHANG(donHang.getNGAYDATHANG())
                .TONGTIEN(donHang.getTONGTIEN())
                .PHUONGTHUCTHANHTOAN(donHang.getPHUONGTHUCTHANHTOAN())
                .IS_ACTIVE(donHang.isIS_ACTIVE())
                .ctdhList(ctdhList)
                .build();
    }
}
