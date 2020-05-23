package br.com.contimatic.model;

import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.Email;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PastOrPresent;
import org.joda.time.DateTime;

/**
 * Classe para objetos Empresa, onde serão contidos, valores e métodos para o mesmo.
 * 
 * @author Marcos Gallo
 * @version 1.00
 * @since Release 01 da aplicação
 */
public class Empresa {
    @NotNull
    @Positive
    private int id;
    @NotNull(message = "O nome da empresa deve ser preenchido")
    @Size(min = 3, max = 50, message = "O tamanho minimo da razão social é 3 e a maxima 50")
    private String nome;
    @NotNull(message = "A razão social da empresa deve ser preenchido")
    @Size(min = 3, max = 50, message = "O tamanho minimo da razão social é 3 e a maxima 50")
    private String razaosocial;
    @NotBlank
    @Pattern(regexp = "/^\\d{2}\\.\\d{3}\\.\\d{3}\\/\\d{4}\\-\\d{2}$/")
    private String cnpj;
    private String ie;
    @Email(message = "Email invalido")
    private String email;
    @NotBlank
    private String site;
    @NotNull
    @PastOrPresent
    private DateTime datacadastro;
    
    private Telefone telefone;
    
    private Endereco endereco;

    /**
     * Método para retorno do Objeto Empresa
     * 
     * @return Objeto Empresa
     */
    
    
    
    public Empresa(int id, String nome, String razaosocial, String cnpj, String ie, String email, String site, DateTime datacadastro, Telefone telefone, Endereco endereco) {
        super();
        this.id = id;
        this.nome = nome;
        this.razaosocial = razaosocial;
        this.cnpj = cnpj;
        this.ie = ie;
        this.email = email;
        this.site = site;
        this.datacadastro = datacadastro;
        this.telefone = telefone;
        this.endereco = endereco;

    }
 

    /**
     * Método para retorno do Telefone
     * 
     * @return Telefone da empresa
     */
    public Telefone getTelefone() {
        return telefone;
    }

    /**
     * Método para alterar o telefone da empresa
     * 
     * @return novo valor para o telefone da empresa
     */
    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    /**
     * Método para retorno do endereço da empresa
     * 
     * @return Endereço da empresa
     */
    public Endereco getEndereco() {
        return endereco;
    }

    /**
     * Método para Alterar o endereço da empresa
     * 
     * @return Novo endereço da empresa
     */

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    /**
     * Método para retorno do e-Mail da empresa
     * 
     * @return e-Mail da empresa
     */

    public String getEmail() {
        return email;
    }

    /**
     * Método para retorno do e-Mail da empresa
     * 
     * @return Novo e-Mail da empresa
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Método para retorno do site da empresa
     * 
     * @return Site da empresa
     */

    public String getSite() {
        return site;
    }

    /**
     * Método para Alterar o site da empresa
     * 
     * @return Novo site da empresa
     */
    public void setSite(String site) {
        this.site = site;
    }

    /**
     * Método para retorno da data de cadastro da empresa
     * 
     * @return Data cadastro da empresa
     */
    public DateTime getDatacadastro() {
        return datacadastro;
    }

    /**
     * Método para alterar o cadastro da empresa
     * 
     * @return Nova data de cadastro da empresa
     */
    public void setDatacadastro(DateTime datacadastro) {
        this.datacadastro = datacadastro;
    }

    /**
     * Método para retorno do id da empresa
     * 
     * @return Id da empresa
     */
    public int getId() {
        return id;
    }

    /**
     * Método para alterar o id da empresa
     * 
     * @return Novo id da empresa
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Método para retorno do nome da empresa
     * 
     * @return Nome da empresa
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método para alterar o nome da empresa
     * 
     * @return Novo nome da empresa
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método para retorno da razão social da empresa
     * 
     * @return Razão social da empresa
     */
    public String getRazaosocial() {
        return razaosocial;
    }

    /**
     * Método para alterar a razão social da empresa
     * 
     * @return Nova razão social da empresa
     */
    public void setRazaosocial(String razaosocial) {
        this.razaosocial = razaosocial;
    }

    /**
     * Método para retorno do CNPJ da empresa
     * 
     * @return CNPJ da empresa
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * Método para alterar o CNPJ da empresa
     * 
     * @return Novo CNPJ da empresa
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * Método para retorno da inscrição estadual da empresa
     * 
     * @return Inscrição estadual da empresa
     */
    public String getIe() {
        return ie;
    }

    /**
     * Método para alterar a Inscrição estadual da empresa
     * 
     * @return Nova inscrição estadual da empresa
     */
    public void setIe(String ie) {
        this.ie = ie;
    }

    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }

    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
