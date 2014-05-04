/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;

/**
 *
 * @author Jony Fernando Schulz
 * Tia: 31336256
 * 
 * SuperClasse @abstract que conterá os atributos que suas SubClasses erdarão.
 * 
 */
public abstract class Pessoa {
    
    private char sex;
    private String name;
    private String adress;
    private String email;
    private long cep;
    private long cpf;
    private long phone;
    private long dateBirth;
    
    /** Método: recupera o valor da variável sex */
    public char getSex() {
        return sex;
    }

    /** Método: Inserir via Set o valor da variável sex */
    public void setSex(char sex) {
        this.sex = sex;
    }

    /** Método: recupera o valor da variável name */
    public String getName() {
        return name;
    }

    /** Método: Inserir via Set o valor da variavel name */
    public void setName(String name) {
        this.name = name;
    }

    /** Método: recupera o valor da variável Adress */
    public String getAdress() {
        return adress;
    }

    /** Método: Inserir via Set o valor da variável Adress */
    public void setAdress(String adress) {
        this.adress = adress;
    }

    /** Método: recupera o valor da variável Email */
    public String getEmail() {
        return email;
    }

    /** Método: Inserir via Set o valor da variável Email */
    public void setEmail(String email) {
        this.email = email;
    }

    /** Método: recupera o valor da variável Cep */
    public long getCep() {
        return cep;
    }

    /** Método: Inserir via Set o valor da variável Cep */
    public void setCep(long cep) {
        this.cep = cep;
    }

    /** Método: recupera o valor da variável Cpf */
    public long getCpf() {
        return cpf;
    }

    /** Método: Inserir via Set o valor da variável Cpf */
    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    /** Método: recupera o valor da variável Phone */
    public long getPhone() {
        return phone;
    }

    /** Método: Inserir via Set o valor da variável Phone */
    public void setPhone(long phone) {
        this.phone = phone;
    }

    /** Método: recupera o valor da variável dateBirth */
    public long getDateBirth() {
        return dateBirth;
    }

    /** Método: Inserir via Set o valor da variável dateBirth */
    public void setDateBirth(long dateBirth) {
        this.dateBirth = dateBirth;
    }

}
