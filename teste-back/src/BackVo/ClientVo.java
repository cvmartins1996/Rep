/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackVo;

/**
 *
 * @author felipe
 */
public class ClientVo {
    private int idCustomer;
    private String cpfCnpj;
    private String nmCustomer;
    private boolean isActive;
    private double vlTotal;

    public ClientVo(int idCustomer, String cpfCnpj, String nmCustomer, boolean isActive, double vlTotal) {
        this.idCustomer = idCustomer;
        this.cpfCnpj = cpfCnpj;
        this.nmCustomer = nmCustomer;
        this.isActive = isActive;
        this.vlTotal = vlTotal;
    }

    public ClientVo() {
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getNmCustomer() {
        return nmCustomer;
    }

    public void setNmCustomer(String nmCustomer) {
        this.nmCustomer = nmCustomer;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public double getVlTotal() {
        return vlTotal;
    }

    public void setVlTotal(double vlTotal) {
        this.vlTotal = vlTotal;
    }
    
    
}
