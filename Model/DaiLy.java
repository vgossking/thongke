/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author vu.vuong
 */
public class DaiLy {
    protected int id;
    protected String ten;
    protected String diaChi;
    protected String soDt;

    public DaiLy() {
    }

    public DaiLy(int id, String ten, String diaChi, String soDt) {
        this.id = id;
        this.ten = ten;
        this.diaChi = diaChi;
        this.soDt = soDt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDt() {
        return soDt;
    }

    public void setSoDt(String soDt) {
        this.soDt = soDt;
    }
    
    
            
}
