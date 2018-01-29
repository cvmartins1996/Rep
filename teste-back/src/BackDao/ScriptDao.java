/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackDao;

import BackVo.ClientVo;
import Conections.ConnectionBack;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author felipe
 */
public class ScriptDao {


    public boolean insertIntoScript() {
        boolean statusRetorno = false;
        try {
            PreparedStatement ps = ConnectionBack.conectarBdBack().prepareStatement(BackString.INSERT_SCRIPT);
            
            ps.setInt(1, 1);
            ps.setString(2, "22255560001");
            ps.setString(3, "Rogerio de Paiva");
            ps.setBoolean(4, true);
            ps.setDouble(5, 60.66);
            ps.addBatch();

            ps.setInt(1, 2);
            ps.setString(2, "22255560002");
            ps.setString(3, "Rogerio de Almeida");
            ps.setBoolean(4, true);
            ps.setDouble(5, 100.66);
            ps.addBatch();

            ps.setInt(1, 3);
            ps.setString(2, "22255560003");
            ps.setString(3, "Marcos da Silva");
            ps.setBoolean(4, true);
            ps.setDouble(5, 600.66);
            ps.addBatch();

            ps.setInt(1, 4);
            ps.setString(2, "22255560004");
            ps.setString(3, "Paulo de Paiva");
            ps.setBoolean(4, true);
            ps.setDouble(5, 780.66);
            ps.addBatch();

            ps.setInt(1, 5);
            ps.setString(2, "22255560005");
            ps.setString(3, "Jr de Paiva");
            ps.setBoolean(4, true);
            ps.setDouble(5, 200.66);
            ps.addBatch();

            ps.setInt(1, 6);
            ps.setString(2, "22255560006");
            ps.setString(3, "Paula de Paiva Jr");
            ps.setBoolean(4, true);
            ps.setDouble(5, 20.76);
            ps.addBatch();

            ps.setInt(1, 7);
            ps.setString(2, "22255560007");
            ps.setString(3, "Caio de Paiva Jr");
            ps.setBoolean(4, true);
            ps.setDouble(5, 20.76);
            ps.addBatch();

            ps.setInt(1, 2479);
            ps.setString(2, "22255562479");
            ps.setString(3, "Juliana");
            ps.setBoolean(4, true);
            ps.setDouble(5, 1500.76);
            ps.addBatch();              
            
            ps.setInt(1, 2650);
            ps.setString(2, "22255562650");
            ps.setString(3, "João de Paiva Juarez");
            ps.setBoolean(4, true);
            ps.setDouble(5, 2000.76);
            ps.addBatch();    
            
            ps.setInt(1, 2655);
            ps.setString(2, "22255562655");
            ps.setString(3, "Beatriz");
            ps.setBoolean(4, true);
            ps.setDouble(5, 2600.76);
            ps.addBatch();   
            
            ps.setInt(1, 2800);
            ps.setString(2, "22255562800");
            ps.setString(3, "Beatriz");
            ps.setBoolean(4, true);
            ps.setDouble(5, 2677.76);
            ps.addBatch();            
            
            ps.executeBatch();
            //ConnectionBack.conn.commit();
            System.out.println("Registros inseridos com sucesso!");
            statusRetorno = true;
        } catch (SQLException sql) {
            System.out.println(sql.getMessage());
        }
        return statusRetorno;
    }

    public ArrayList searchCustomers() {
        ArrayList<ClientVo> arrayCli = new ArrayList();
        try {
            PreparedStatement ps = ConnectionBack.conectarBdBack().prepareStatement(BackString.SEARCH_CLIENTS);
            ResultSet rs = ps.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    ClientVo cli = new ClientVo();
                    cli.setIdCustomer(rs.getInt("id_customer"));
                    cli.setCpfCnpj(rs.getString("cpf_cnpj"));
                    cli.setNmCustomer(rs.getString("nm_customer"));
                    cli.setIsActive(rs.getBoolean("is_active"));
                    cli.setVlTotal(rs.getDouble("vl_total"));
                    arrayCli.add(cli);
                }
                ps.close();
            } else {
                System.out.println("rs está null");
            }
        } catch (SQLException e) {
            int code = e.getErrorCode();
            String msg = e.getMessage();
            System.out.println("Erro code Nº: " + code + "\n" + "ErrorMSG: " + msg);
        }
        return arrayCli;
    }

}
