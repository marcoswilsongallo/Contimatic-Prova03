package br.com.contmatic.model;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import br.com.contimatic.model.Empresa;
import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;

public class EmpresaTest {


    @BeforeAll
    public static void deve_carregar_templetes_empresa() {
        FixtureFactoryLoader.loadTemplates("br.com.contmatic.FixtureTemplate");
    }; 
    

    @Test
    public void deve_receber_cenarios_de_empresa() {
        System.out.println("TESTE EMPRESA");
        Empresa empresa = Fixture.from(Empresa.class).gimme("TemplEmpresa");
        System.out.println(empresa.toString());
        assertNotNull("A empresa não pode ser null", empresa);
        assertNotNull("A empresa tem que ter telefone", empresa.getTelefone());
        assertNotNull("A empresa tem que ter endereço", empresa.getEndereco());
        
    }

}
