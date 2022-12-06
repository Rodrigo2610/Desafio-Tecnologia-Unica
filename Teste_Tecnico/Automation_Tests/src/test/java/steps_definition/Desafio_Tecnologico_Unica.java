package steps_definition;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Data.TestData;
import Navegadores.Navegador;
import Pages.Elementos_Web;
import Runner.Testrunner;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Desafio_Tecnologico_Unica extends Testrunner implements TestData {

	public static ChromeOptions option;
	public static String jsonAsString;	
	
	@Given("^que eu acesse o portal do \"([^\"]*)\"$")
	public void que_eu_acesse_o_portal_do(String URL) throws Throwable {
		
		Navegador.Chrome(URL);
	    
	}

	@Then("^devera ser validado o titulo \"([^\"]*)\"$")
	public void devera_ser_validado_o_titulo(String Titulo) throws Throwable {
		
		assertEquals(Titulo, Navegador.driver.getTitle());

	}

	@Given("^eu informe um produto \"([^\"]*)\" para pesquisar$")
	public void eu_informe_um_produto_para_pesquisar(String Produto) throws Throwable {
		
		Elementos_Web.Input_pesquisa(Navegador.driver).sendKeys(Produto);
	    
	}

	@When("^eu clicar em buscar$")
	public void eu_clicar_em_buscar() throws Throwable {
		
		Thread.sleep(1000);
		Elementos_Web.Input_pesquisa(Navegador.driver).sendKeys(Keys.ENTER);
		
	}

	@Then("^o \"([^\"]*)\" devera ser retornado com sucesso$")
	public void o_devera_ser_retornado_com_sucesso(String Produto) throws Throwable {
		
		Thread.sleep(2000);
		assertEquals(Produto,Navegador.driver.findElement(By.xpath("//*[contains(text(), '"+Produto+"')]")).getText());
	    
	}

	@Given("^eu clique no \"([^\"]*)\" escolhido$")
	public void eu_clique_no_escolhido(String Produto) throws Throwable {
		
		WebElement produto = Navegador.driver.findElement(By.xpath("//*[contains(text(), '"+Produto+"')]"));
		((JavascriptExecutor) Navegador.driver).executeScript("arguments[0].scrollIntoView(true);",produto);
		
		Navegador.driver.findElement(By.xpath("//*[contains(text(), '"+Produto+"')]")).click();  
	   
	}

	@When("^abrir a pagina de detalhes do \"([^\"]*)\"$")
	public void abrir_a_pagina_de_detalhes_do(String Produto) throws Throwable {
		
		assertEquals(Produto,Elementos_Web.Detalhes_produto(Navegador.driver).getText());
	    
	}

	@Then("^devera ser exibido os detalhes do \"([^\"]*)\" escolhido$")
	public void devera_ser_exibido_os_detalhes_do_escolhido(String Produto) throws Throwable {
		
		assertEquals(Produto,Elementos_Web.Detalhes_produto(Navegador.driver).getText());
	    
	}

	@Given("^eu adicione o \"([^\"]*)\" ao carrinho$")
	public void eu_adicione_o_ao_carrinho(String Produto) throws Throwable {
		
		Elementos_Web.Btn_entendi_e_fechar(Navegador.driver).click();
		
		Thread.sleep(2000);
		WebElement Btn_comprar = Navegador.driver.findElement(By.xpath("//*[contains(text(),'Comprar Agora')]"));;
		((JavascriptExecutor) Navegador.driver).executeScript("arguments[0].scrollIntoView(true);",Btn_comprar);
		
		Elementos_Web.Btn_comprar(Navegador.driver).click();
	    
		WebElement Btn_sacola = Elementos_Web.Btn_ir_para_sacola(Navegador.driver);
		((JavascriptExecutor) Navegador.driver).executeScript("arguments[0].scrollIntoView(true);",Btn_sacola);
		
		Elementos_Web.Btn_ir_para_sacola(Navegador.driver).click();
	}

	@When("^abrir a pagina do carrinho$")
	public void abrir_a_pagina_do_carrinho() throws Throwable {
		
		WebDriverWait wait = new WebDriverWait(Navegador.driver, 250);
	 	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("LoadingBackground")));
		
	 	Thread.sleep(9000);
		Elementos_Web.home(Navegador.driver).click();
//		Thread.sleep(2000);
		Navegador.driver.get("https://sacola.magazineluiza.com.br/#/");
	    
	}

	@Then("^devera ser exibido o \"([^\"]*)\" adicionado$")
	public void devera_ser_exibido_o_adicionado(String Produto) throws Throwable {
		
		assertEquals(Produto, Elementos_Web.Iten_carrinho(Navegador.driver).getText());
	    
	}
	
}
