/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.DaiLyThongKe;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author vu.vuong
 */
public class ThongKeDAO {
    private Connection con;
    private String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private String DATABASE_URL = "jdbc:mysql://localhost/thongke";
    
    
    public Connection getConnection(){
        try {
            Class.forName(JDBC_DRIVER);
            
            con=DriverManager.getConnection(DATABASE_URL,"root","");
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ThongKeDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ko the ket noi csdl");
        } catch (SQLException ex) {
            Logger.getLogger(ThongKeDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ko the ket noi csdl");
        }
        
        return con;
    }
    
    public ArrayList<DaiLyThongKe> thongKeDaiLy(String ngayBatDau, String ngayKetThuc){
        ArrayList<DaiLyThongKe> listDaiLy = new ArrayList<>();
        try {
            
            con = this.getConnection();
            String sql = "SELECT tbldaily.*, SUM(tblphieuxuat.dongia*tblphieuxuat.soluong) AS tongtien "
                    + "FROM tbldaily INNER JOIN tblphieuxuat ON tbldaily.id = tblphieuxuat.dailyid WHERE tblphieuxuat.ngayxuat >='"
                    + ngayBatDau + "' AND tblphieuxuat.ngayxuat <= '"+ngayKetThuc+"' GROUP BY tbldaily.id ORDER BY tongtien DESC";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                DaiLyThongKe daiLy = new DaiLyThongKe();
                daiLy.setId(rs.getInt("id"));
                daiLy.setDiaChi(rs.getString("diaChi"));
                daiLy.setSoDt(rs.getString("soDt"));
                daiLy.setTen(rs.getString("ten"));
                daiLy.setTongTien(rs.getFloat("tongtien"));
                listDaiLy.add(daiLy);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ThongKeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listDaiLy;
    }
    
}
