/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackDao;

/**
 *
 * @author felipe
 */
public class BackString {
    
    public static final String INSERT_SCRIPT
            = " insert into tb_customer_account (id_customer,cpf_cnpj,nm_customer,is_active,vl_total) "
            + " values(?,?,?,?,?);";
    
    public static final String SEARCH_CLIENTS
            = "select * from tb_customer_account where vl_total > 560  and vl_total >= 1500 and vl_total <=2700 order by vl_total desc;";
}
