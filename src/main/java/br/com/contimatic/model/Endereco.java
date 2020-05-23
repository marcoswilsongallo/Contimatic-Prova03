package br.com.contimatic.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import br.com.contmatic.enums.TipoEndereco;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.PositiveOrZero;

public class Endereco {
    @NotNull
    private String logradouro;
    @NotNull
    @PositiveOrZero 
    private int numero;
    @NotNull
    @Size(min = 3, max = 30, message = "O nome do bairro tem que ter no minimo 3 caracteres e no maxino 30")
    private String bairro;
    @NotNull
    @Size(min = 3, max = 30, message = "O nome da cidade tem que ter no minimo 3 caracteres e no maxino 30")
    private String cidade;
    @NotNull
    @Size(min = 2, max = 2, message = "A UF do estado tem que ter 2 caracteres")
    private String uf;
    @NotNull
    @Size(min = 2, max = 2, message = "A UF do estado tem que ter 2 caracteres")
    private String cep;
    
    private TipoEndereco tipoendereco;
    
    public Endereco(String logradouro, int numero, String bairro, String cidade, String uf, String cep, TipoEndereco tipoendereco) {
        super();
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.tipoendereco = tipoendereco;
    }



    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public TipoEndereco getTipoendereco() {
        return tipoendereco;
    }

    public void setTipoendereco(TipoEndereco tipoendereco) {
        this.tipoendereco = tipoendereco;
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
