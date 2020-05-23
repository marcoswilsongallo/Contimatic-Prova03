package br.com.contmatic.FixtureTemplate;

import java.util.Random;

import org.joda.time.DateTime;

import br.com.contimatic.model.Empresa;
import br.com.contimatic.model.Endereco;
import br.com.contimatic.model.Telefone;
import br.com.contmatic.enums.TipoEndereco;
import br.com.contmatic.enums.TipoTelefone;
import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;

import br.com.six2six.fixturefactory.loader.TemplateLoader;

public class TemplateEmpresa implements TemplateLoader {

    public static void EnderecoTemplate() {
        System.out.println("ENDERECOTEMPLATE");
        Fixture.of(Endereco.class).addTemplate("TemplEnderecoSP", new Rule() {
            {
                add("logradouro", random("Av Paulista", "Rua Emilio Serrano", "vdo Sta Efigenia"));
                add("numero", random(1,2,3));
                add("bairro", random("Bela Vista", "Itaquera", "Centro"));
                add("cidade", "São Paulo");
                add("uf", "SP");
                add("cep", random("01000-000", "08250-000", "01500-500"));
                add("tipoendereco", TipoEndereco.values()[new Random().nextInt(TipoEndereco.values().length - 1)]);
            }
        }).addTemplate("TemplEnderecoRJ", new Rule() {
            {
                add("logradouro", random("Av Copacabana", "Rua do Pau Ferro", "Av Atlantica"));
                add("numero", random(1,2,3));
                add("bairro", random("Copacabana", "Barra da Tijuca", "Ipanema"));
                add("cidade", "Rio de Janeiro");
                add("uf", "RJ");
                add("cep", random("02000-300", "02300-400", "02500-500"));
                add("tipoendereco", TipoEndereco.values()[new Random().nextInt(TipoEndereco.values().length - 1)]);
            }
        });
    };

    public static void TelefoneTemplate() {
        System.out.println("TELEFONETEMPLATE");

        Fixture.of(Telefone.class).addTemplate("TemplTelefone", new Rule() {
            {
                add("ddd", random("11", "21", "72"));
                add("numero", random("2123-3231", "96834-5313", "72312-3332"));
                add("tipotelefone", TipoTelefone.values()[new Random().nextInt(TipoTelefone.values().length - 1)]);
            }
        });
    }

    public static void EmpresaTemplate() {
        final DateTime datetime =new DateTime() ;
        System.out.println("EMPRESATEMPLATE");

        Fixture.of(Empresa.class).addTemplate("TemplEmpresa", new Rule() {

            {
                add("id", random(100,200,300,400));
                add("nome", random("Gallo Cons", "Contmatic", "NetGlober", "Billi kids"));
                add("razaosocial", random("Gallo Consultoria", "Contmatic Software LTDA", "Glober Comercio ME", "Billi Serviços SA"));
                add("cnpj", random("01.002.003/0001-00", "04.005.006/0001-01", "07.008.009/0001-02", "10.200.300/0001-03"));
                add("ie", random("ISENTO", "123.123.123", "83.018.78-0", "74.200.35-4"));
                add("email", random("gallo@gmail.com", "contmatic@gmail.com", "glober@gmail.com", "billi@gmail.com"));
                add("site", random("www.gallo.com.br", "www.contmatic.com.br", "www.glober.com.br", "www.billi.com.br"));
                add("datacadastro", datetime.toDateTime());
                add("telefone", one(Telefone.class, "TemplTelefone"));
                add("endereco", one(Endereco.class, "TemplEnderecoSP"));
            }
        });
    }

    public void load() {
        EnderecoTemplate();
        TelefoneTemplate();
        EmpresaTemplate();

    }

}
