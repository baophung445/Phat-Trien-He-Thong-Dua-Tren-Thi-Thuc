/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author UnmatchedTaiNguyen
 */
public class JobModel {

    public JobModel() {
    }

    public JobModel(String MucDich, String PhanLoai, String DanhGiaBanThan, String UngDungThucTe, String TacGia, String NgonNgu, String Tuoi, String TheLoai) {
        this.MucDich = MucDich;
        this.PhanLoai = PhanLoai;
        this.DanhGiaBanThan = DanhGiaBanThan;
        this.UngDungThucTe = UngDungThucTe;
        this.TacGia = TacGia;
        this.NgonNgu = NgonNgu;
        this.Tuoi = Tuoi;
        this.TheLoai = TheLoai;
    }
    
    private String MucDich;
    private String PhanLoai;
    private String DanhGiaBanThan;
    private String UngDungThucTe;
    private String TacGia;
    private String NgonNgu;
    private String Tuoi;
    private String TheLoai;

    public String getMucDich() {
        return MucDich;
    }

    public void setMucDich(String MucDich) {
        this.MucDich = MucDich;
    }

    public String getPhanLoai() {
        return PhanLoai;
    }

    public void setPhanLoai(String PhanLoai) {
        this.PhanLoai = PhanLoai;
    }

    public String getDanhGiaBanThan() {
        return DanhGiaBanThan;
    }

    public void setDanhGiaBanThan(String DanhGiaBanThan) {
        this.DanhGiaBanThan = DanhGiaBanThan;
    }

    public String getUngDungThucTe() {
        return UngDungThucTe;
    }

    public void setUngDungThucTe(String UngDungThucTe) {
        this.UngDungThucTe = UngDungThucTe;
    }

    public String getTacGia() {
        return TacGia;
    }

    public void setTacGia(String TacGia) {
        this.TacGia = TacGia;
    }

    public String getNgonNgu() {
        return NgonNgu;
    }

    public void setNgonNgu(String NgonNgu) {
        this.NgonNgu = NgonNgu; 
    }

    public String getTuoi() {
        return Tuoi;
    }

    public void setTuoi(String Tuoi) {
        this.Tuoi = Tuoi;
    }

    public String getTheLoai() {
        return TheLoai;
    }

    public void setTheLoai(String TheLoai) {
        this.TheLoai = TheLoai;
    }
    
}
