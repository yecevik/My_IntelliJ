package Drivers;

public class TestDriver {
    public static void main(String[] args) {
        RemoteWebDriverInterface[] webs = {new ChromeDriver(), new FirefoxDriver(), new SafariDriver()};
        for (RemoteWebDriverInterface a : webs) {



        a.navigate();
        a.open();
        a.close();
        a.getScreenshot();
        a.getTitle();




    }

}}