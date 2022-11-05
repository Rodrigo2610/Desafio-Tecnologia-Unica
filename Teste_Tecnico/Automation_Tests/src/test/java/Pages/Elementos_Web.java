package Pages;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Navegadores.Navegador;

public class Elementos_Web { 

    private static WebElement element = null;
    

    public static WebElement Input_pesquisa (WebDriver driver){
   	  
 	WebDriverWait wait = new WebDriverWait(driver, 30);
 	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-search")));
 	
 	 element = driver.findElement(By.id("input-search"));  
        return element;
}
    
    public static WebElement Btn_pesquisa (WebDriver driver){
     	  
 	WebDriverWait wait = new WebDriverWait(driver, 30);
 	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/main/section[1]/div[2]/header/div/div[2]/div[1]/div/div[1]/svg")));
 	
 	 element = driver.findElement(By.xpath("/html/body/div[1]/div/main/section[1]/div[2]/header/div/div[2]/div[1]/div/div[1]/svg"));  
        return element;
}
    
    public static WebElement Produto (WebDriver driver){
   	  
 	WebDriverWait wait = new WebDriverWait(driver, 30);
 	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Autorizar Selecionadas')]")));
 	
 	 element = driver.findElement(By.xpath("//*[contains(text(),'Autorizar Selecionadas')]"));  
        return element;
}
    
    public static WebElement Btn_Confirmar (WebDriver driver){
     	  
 	WebDriverWait wait = new WebDriverWait(driver, 30);
 	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),' Confirmar ')]")));
 	
 	 element = driver.findElement(By.xpath("//*[contains(text(),' Confirmar ')]"));  
        return element;
}
    
    public static WebElement Detalhes_produto (WebDriver driver){
   	  
 	WebDriverWait wait = new WebDriverWait(driver, 30);
 	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#__next > div > main > section:nth-child(4) > div.sc-eDvSVe.fldrdv > h1")));
 	
 	 element = driver.findElement(By.cssSelector("#__next > div > main > section:nth-child(4) > div.sc-eDvSVe.fldrdv > h1"));  
        return element;
}
    
    public static WebElement Btn_comprar (WebDriver driver){
     	  
 	WebDriverWait wait = new WebDriverWait(driver, 30);
 	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Comprar Agora')]")));
 	
 	 element = driver.findElement(By.xpath("//*[contains(text(),'Comprar Agora')]"));  
        return element;
}
    
    public static WebElement Btn_ir_para_sacola (WebDriver driver){
   	  
 	WebDriverWait wait = new WebDriverWait(driver, 30);
 	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Ir para sacola')]")));
 	
 	 element = driver.findElement(By.xpath("//*[contains(text(),'Ir para sacola')]"));  
        return element;
}
    public static WebElement Btn_entendi_e_fechar (WebDriver driver){
     	  
 	WebDriverWait wait = new WebDriverWait(driver, 30);
 	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/div/main/div[1]/div[2]/button")));
 	
 	 element = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div[1]/div[2]/button"));  
        return element;
}
    
    public static WebElement home (WebDriver driver){
   	  
 	WebDriverWait wait = new WebDriverWait(driver, 120);
 	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[1]/div/div[1]/div/a")));
 	
 	 element = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[1]/div/a"));  
        return element;
}
    
    public static WebElement carrinho (WebDriver driver){
     	  
 	WebDriverWait wait = new WebDriverWait(driver, 120);
 	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/main/section[1]/div[2]/header/div/div[2]/a[2]e")));
 	
 	 element = driver.findElement(By.xpath("/html/body/div[1]/div/main/section[1]/div[2]/header/div/div[2]/a[2]"));  
        return element;
}
    
    public static WebElement Iten_carrinho (WebDriver driver){
   	  
 	WebDriverWait wait = new WebDriverWait(driver, 120);
 	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/a/p")));
 	
 	 element = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/a/p"));  
        return element;
}
   
    public static WebElement loading (WebDriver driver){
   	  
 	WebDriverWait wait = new WebDriverWait(driver, 120);
 	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[4]/svg")));
 	
 	 element = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/svg"));  
        return element;
}
    
}

