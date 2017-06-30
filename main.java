
import DAO.ThongKeDAO;
import Model.DaiLyThongKe;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vu.vuong
 */
public class main {
    public static void main(String[] args) throws SQLException {
        ThongKeDAO dao = new ThongKeDAO();
        dao.getConnection();
        ArrayList<DaiLyThongKe> daiLy = dao.thongKeDaiLy("2017-06-05", "2017-06-30");
        System.out.println("asf");
    }
}
