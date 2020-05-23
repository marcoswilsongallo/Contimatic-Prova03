package br.com.contimatic.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import br.com.contmatic.enums.TipoTelefone;

/**
 * Classe para objetos Telefone, onde serão contidos, valores e métodos para o mesmo.
 * 
 * @author Marcos Gallo
 * @version 1.00
 * @since Release 01 da aplicação
 */

public class Telefone {
    @NotNull
    @Size(max = 2, min = 2, message = "O ddd deve ter 2 digitos")
    private String ddd;
    @NotNull
    @Pattern(regexp = "\\d{4,5}\\-\\d{4}")
    private String numero;
    @NotNull
    private TipoTelefone tipotelefone;

    /**
     * Método para retorno do Objeto Telefone
     * 
     * @return Objeto Telefone
     */
    public Telefone(String ddd, String numero, TipoTelefone tipotelefone) {
        super();
        this.ddd = ddd;
        this.numero = numero;
        this.tipotelefone = tipotelefone;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public TipoTelefone getTipotelefone() {
        return tipotelefone;
    }

    public void setTipotelefone(TipoTelefone tipotelefone) {
        this.tipotelefone = tipotelefone;
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
