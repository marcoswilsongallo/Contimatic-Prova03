package br.com.contmatic.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import br.com.contimatic.model.Endereco;
import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;

public class EnderecoTest {

   @BeforeAll
    public static void deve_carregar_templetes_empresa() {
        FixtureFactoryLoader.loadTemplates("br.com.contmatic.FixtureTemplate");
    };

   @Test
    public void deve_receber_cenarios_de_endereco_de_sao_paulo() {
       System.out.println("TESTE ENDERECO");
        Endereco endereco = Fixture.from(Endereco.class).gimme("TemplEnderecoSP");
        System.out.println( endereco.toString());
        Assertions.assertNotNull(endereco, "Endereço não pode ser Null");
        Assertions.assertTrue( endereco.getNumero() > 0,"O numero do endereco tem que ser maior que zero");

    }

//    @Test
//    public void deve_receber_cenarios_de_endereco_de_rio_Janiro() {
//        Endereco endereco = Fixture.from(Endereco.class).gimme("TemplEnderecoRJ");
//        Assertions.assertNotNull(endereco, "Endereço não pode ser Null");
//        Assertions.assertTrue(endereco.getNumero() > 0, "O numero do endereco tem que ser maior que zero");
//    }

}
