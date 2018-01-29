/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackBo;

import BackDao.ScriptDao;
import BackVo.ClientVo;
import java.util.ArrayList;

/**
 *
 * @author felipe
 */
public class ScriptBo {

    ScriptDao dao = new ScriptDao();
    double sum = 0;
    int qtd = 0;

    public void regra() {
        boolean statusInsert = dao.insertIntoScript();
        searchCustomers(statusInsert);
    }

    public void average(int qtd, double sum) {
        double average=0;
        if (qtd != 0) {                       
            System.out.println("*****************Average*****************");
            average = sum / qtd;
            System.out.println("Sum = " + sum);
            System.out.println("Qtd = " + qtd);
            System.out.println("Average = " + average);
        } else {
            System.out.println("quantidade =  " + qtd);
        }
    }

    public void searchCustomers(boolean statusInsert) {
        if (statusInsert) {
            ArrayList<ClientVo> arrayCli;
            arrayCli = dao.searchCustomers();
            System.out.println("****************Clients******************");
            for (ClientVo cli : arrayCli) {
                qtd++;
                sum = sum + cli.getVlTotal();
                System.out.println("IdCustomer: " + cli.getIdCustomer());
                System.out.println("Name: " + cli.getNmCustomer());
                System.out.println("Cpf/Cnpj: " + cli.getCpfCnpj());
                System.out.println("Active: " + cli.getIsActive());
                System.out.println("Value: " + cli.getVlTotal());
                System.out.println("");
            }
            average(qtd,sum);
        } else {
            System.out.println("Sem novos valores para o  BD");
        }
    }

}
