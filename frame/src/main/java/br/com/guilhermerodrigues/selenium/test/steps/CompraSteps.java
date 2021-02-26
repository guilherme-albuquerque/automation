package br.com.guilhermerodrigues.selenium.test.steps;

import br.com.guilhermerodrigues.selenium.test.pages.CompraPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

public class CompraSteps {

    protected CompraPage compraPage = new CompraPage();

    @Dado("que eu acesso o site")
    public void queEuAcessoOSite() {
        Assert.assertTrue(compraPage.aguardarPaginaInicialCarregar());
    }

    @E("clico no produto desejado")
    public void clicoNoProdutoDesejado() {
        compraPage.clicarBotaoProduto();

    }

    @E("clico em checkout")
    public void clicoEmCheckout() {
        compraPage.clicoNoBotaoCheckout();
    }
    @E("clico em checkout Sumario")
    public void clicoEmCheckoutSumario() {
        compraPage.clicoNoBotaoCheckoutSum();
    }

    @E("verifico se e o produto")
    public void verificoSeEOProduto() {
        Assert.assertTrue(compraPage.verificaElementoPresenteTela("Faded Short Sleeve T-shirts"));

    }

    @Quando("preencher o email")
    public void preencherOEmail() {
        compraPage.preencherOEmail();
    }


    @E("clico em criar conta")
    public void clicoEmCriarConta() {
        compraPage.clicoNoCriar();
    }


    @E("preencho o formulario")
    public void preenchoOFormulario() {
        compraPage.preenchoOFormulario ();
    }

    @E("clico em prosseguir")
    public void clicoEmProsseguir() {
        compraPage.clicoEmProsseguir();
    }

    @E("aceito os termos")
    public void aceitoOsTermos() {
        compraPage.aceitoOsTermos();
    }

    @Então("seleciono o tipo de pagamento e finalizo a compra")
    public void selecionoOTipoDePagamentoEFinalizoACompra() {
        Assert.assertTrue(compraPage.verificaElementoPresenteTela("$19.25"));
        compraPage.selecionoOTipoDePagamentoEFinalizoACompra();
    }
}
