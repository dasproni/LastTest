package stepdefs;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import cucumber.api.java.ru.Допустим;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class MyStepdefs {
    @Допустим("открыть сайт Ланит и пройти авторизацию")
    public void открыть_сайт_Ланит_и_пройти_авторизацию() {
        open("https://dev.n7lanit.ru/");
        $(By.xpath("//div[@class='nav nav-guest']/button[@class='btn navbar-btn btn-default btn-sign-in']")).click();
        //Thread.sleep(2000);
        Configuration.timeout = 3000;
        $(By.xpath("//div[@class='control-input']/input[@id='id_username']")).shouldHave(Condition.appear).val("dasproni");
        Configuration.timeout = 3000;
        $(By.xpath("//div[@class='control-input']/input[@id='id_password']")).shouldHave(Condition.appear).val("Cosmopolitanzxcv123456789").pressEnter();
        Configuration.timeout = 6000;

    }

    @Допустим("проверить, что авторизация выполнена успешно")
    public void проверить_что_авторизация_выполнена_успешно() {
        $(By.xpath("//div[@id='user-menu-mount']//li[@class='dropdown']/a/img")).shouldBe(Condition.visible);
        Configuration.timeout = 10000;

    }

    @Допустим("на главной странице выбрать неактивную тему и нажать на кнопку для подписки")
    public void на_главной_странице_выбрать_неактивную_тему_и_нажать_на_кнопку_для_подписки() {
        $(By.xpath("//div[@id='page-mount']/div/div[2]/div[2]/ul/li[4]/div[2]/div[3]/div/div/div/div/button/span[2]")).click();
        Configuration.timeout = 10000;

    }

    @Допустим("в меню нажать кнопку Подписаться")
    public void в_меню_нажать_кнопку_Подписаться() {
        $(By.xpath("//div[@id='page-mount']/div/div[2]/div[2]/ul/li[4]/div[2]/div[3]/div/div/div/div/ul/li[2]/button")).click();
        Configuration.timeout = 10000;

    }

    @Допустим("выбрать еще тему и подписаться")
    public void выбрать_еще_тему_и_подписаться() {
        $(By.xpath("//div[@id='page-mount']/div/div[2]/div[2]/ul/li[3]/div[2]/div[3]/div/div/div/div/button/span[2]")).click();
        Configuration.timeout = 6000;
        $(By.xpath("//div[@id='page-mount']/div/div[2]/div[2]/ul/li[3]/div[2]/div[3]/div/div/div/div/ul/li[2]/button")).click();// Write code here that turns the phrase above into concrete actions

    }

    @Допустим("нажать на кнопку Подписки")
    public void нажать_на_кнопку_Подписки() {
        $(By.xpath("//a[contains(text(),'Подписки')]")).click();
        Configuration.timeout = 6000;

    }

    @Допустим("проверить подписанные выше темы")
    public void проверить_подписанные_выше_темы() {


    }

    @Допустим("отписаться от них")
    public void отписаться_от_них() {
        $(By.xpath("(//button[@type='button'])[9]")).click();
        Configuration.timeout = 6000;
        $(By.xpath("//div[@id='page-mount']/div/div[2]/div[2]/ul/li/div[2]/div[3]/div/div/div/div/ul/li/button")).click();
        Configuration.timeout = 6000;
        $(By.xpath("(//button[@type='button'])[13]")).click();
        Configuration.timeout = 6000;
        $(By.xpath("//div[@id='page-mount']/div/div[2]/div[2]/ul/li[2]/div[2]/div[3]/div/div/div/div/ul/li/button")).click();
        Configuration.timeout = 6000;

    }
}
