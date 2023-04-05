import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RestartInternet {
   public static void main(String[] args) throws InterruptedException {
      // Define o caminho para o executável do driver do Chrome
      System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

      // Define as opções para abrir uma nova janela do Chrome sem exibir a interface gráfica do usuário
      ChromeOptions options = new ChromeOptions();
      options.addArguments("--headless");
      
      // Cria uma nova instância do driver do Chrome
      WebDriver driver = new ChromeDriver(options);

      // Navega até o endereço do roteador e clica no botão de reiniciar a conexão
      driver.get("http://192.168.1.1/");
      driver.findElement(By.id("restart_button")).click();

      // Fecha o navegador e encerra o driver
      driver.quit();
   }
}
