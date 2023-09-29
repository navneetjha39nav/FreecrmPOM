package com.crm.baseclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class TestBaseClass {
    static WebDriver Driver;
    static Properties Prop;

    public TestBaseClass() throws IOException {

        Properties Prop = new Properties();
        FileInputStream Fis = new FileInputStream("C:\\Users\\NAVNEET KUMAR JHA\\IdeaProjects\\FreeCrmTest\\src\\main\\java\\com\\crm\\config\\propities");
        Prop.load(Fis);

    }


    public static void Readfile() {
        String Browser1 = Prop.getProperty("Browser");
        if (Browser1.equals("chrome")) {
            Driver = new ChromeDriver();
        } else if (Browser1.equals("FirefoxDriver")) {
            Driver = new FirefoxDriver();

        } else if (Browser1.equals("EdgeDriver")) {
            Driver = new EdgeDriver();
        } else {
            System.out.println("plese select proper browser name");
        }
        Driver.manage().window().maximize();

        Driver.get(Prop.getProperty("url"));
    }
}
