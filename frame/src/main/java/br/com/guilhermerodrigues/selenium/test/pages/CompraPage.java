package br.com.guilhermerodrigues.selenium.test.pages;

import br.com.guilhermerodrigues.selenium.core.driver.BasePage;
import br.com.guilhermerodrigues.selenium.core.utils.enums.Users;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompraPage extends BasePage {

    Faker faker = new Faker();

    @FindBy(xpath = "//*[@id='homefeatured']/li[1]/div/div[2]/div[2]/a[1]")
    private WebElement btnCompraProduto;

    @FindBy(xpath = "/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a")
    private WebElement btnCheckout;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]")
    private WebElement btnCheckoutSum;

    @FindBy(xpath = "//button[@name='processAddress']")
    private WebElement btnContinuar;

    @FindBy(xpath = "//input[@type='checkbox']")
    private WebElement selectCheckBox;

    @FindBy(xpath = "//div[@id='header_logo']")
    private WebElement btnLogo;

    @FindBy(xpath = "//input[@name='email_create']")
    private WebElement txtEmail;

    @FindBy(xpath = "//button[@name='SubmitCreate']")
    private WebElement btnCriar;

    @FindBy(id = "id_gender1")
    private WebElement btnSr;

    @FindBy(id = "customer_firstname")
    private WebElement txtNome;

    @FindBy(id = "customer_lastname")
    private WebElement txtSobre;

    @FindBy(xpath = "//input[@id='passwd']")
    private WebElement txtSenha;

    @FindBy(id = "days")
    private WebElement txtDays;

    @FindBy(id = "months")
    private WebElement txtMes;

    @FindBy(id = "years")
    private WebElement txtAno;

    @FindBy(id = "address1")
    private WebElement txtRua;

    @FindBy(id = "city")
    private WebElement txtCidade;

    @FindBy(xpath = "//*[@id='id_state']/option[2]")
    private WebElement cmbEstado;

    @FindBy(id = "postcode")
    private WebElement txtCodPostal;

    @FindBy(id = "id_country")
    private WebElement txtCodPostal1;

    @FindBy(id = "phone_mobile")
    private WebElement txtCelular;

    @FindBy(id = "submitAccount")
    private WebElement txtProsseguir;


    @FindBy(xpath = "//button[@name='processCarrier']")
    private WebElement btnPag;

    @FindBy(xpath = "//a[@title='Pay by bank wire']")
    private WebElement btnTipoPag;


    public CompraPage() {
    }


    public boolean aguardarPaginaInicialCarregar() {
        super.tirarPrint(btnLogo);
        return super.verificaElementoPresenteTela(btnLogo);
    }

    public void clicarBotaoProduto() {
        super.clicarElemento(btnCompraProduto);
        tirarPrint(btnCompraProduto);
    }

    public void clicoNoBotaoCheckout() {
        super.clicarElemento(btnCheckout);
        tirarPrint(btnCheckout);
    }

    public void clicoNoBotaoCheckoutSum() {
        super.clicarElemento(btnCheckoutSum);
        tirarPrint(btnCheckoutSum);
    }


    public void preencherOEmail() {
        super.digitarTexto(txtEmail, faker.internet().emailAddress());

    }

    public void clicoNoCriar() {
        super.clicarElemento(btnCriar);
        tirarPrint(btnCriar);
    }

    public void preenchoOFormulario() {
        super.clicarElemento(btnSr);
        super.digitarTexto(txtNome, faker.name().firstName());
        super.digitarTexto(txtSobre, faker.name().lastName());
        super.digitarTexto(txtSenha, "1456646");
        super.digitarTexto(txtRua, faker.address().country());
        super.digitarTexto(txtCidade, faker.address().country());
        super.digitarTexto(txtCodPostal, "06555");
        super.digitarTexto(txtCelular, faker.phoneNumber().cellPhone());
        super.clicarElemento(cmbEstado);
        super.clicarElemento(txtProsseguir);
        tirarPrint(txtProsseguir);
    }
    public void clicoEmProsseguir() {
        super.clicarElemento(btnContinuar);
        tirarPrint(btnContinuar);
    }

    public void aceitoOsTermos() {
        super.clicarElemento(selectCheckBox);
        super.clicarElemento(btnPag);
        tirarPrint(btnPag);
    }

    public void selecionoOTipoDePagamentoEFinalizoACompra() {
        super.clicarElemento(btnTipoPag);
        tirarPrint(btnTipoPag);
    }
}
