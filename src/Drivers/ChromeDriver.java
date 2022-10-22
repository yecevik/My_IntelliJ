package Drivers;

public class ChromeDriver implements RemoteWebDriverInterface {
    @Override
    public void navigate() {
        System.out.println("Chrome navigates the web");
    }

    @Override
    public void close() {
        System.out.println("Chrome closed");
    }

    @Override
    public void open() {
        System.out.println("Chrome opened");
    }

    @Override
    public String getTitle() {
        System.out.println("Chrome");

        return null;
    }

    @Override
    public void getScreenshot() {
        System.out.println("Chrome Takes Screen Shot");
    }
}
