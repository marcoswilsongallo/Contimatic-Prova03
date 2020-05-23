package br.com.contmatic.model;

import static org.junit.Assert.assertNotNull;

import java.util.Random;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;

import br.com.contmatic.enums.TipoTelefone;
import br.com.contimatic.model.Telefone;
import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;

public class TelefoneTest {
    
    @BeforeAll
    public static void deve_carregar_templetes_empresa() {
        FixtureFactoryLoader.loadTemplates("br.com.contmatic.FixtureTemplate");
    }; 
    
    @Test
    public void deve_receber_cenarios_de_telefone() {
        System.out.println("TELEFONE");
        Telefone telefone = Fixture.from(Telefone.class).gimme("TemplTelefone");
        System.out.println(telefone.toString());
        assertNotNull("Telefone não pode ser null", telefone);
    }

}
