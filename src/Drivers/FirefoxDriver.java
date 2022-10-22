package Drivers;

public class FirefoxDriver implements RemoteWebDriverInterface{
    @Override
    public void navigate() {
        System.out.println("Firefox navigates the web");
    }

    @Override
    public void close() {
        System.out.println("Firefox closed");
    }

    @Override
    public void open() {
        System.out.println("Firefox opened");
    }

    @Override
    public String getTitle() {
        System.out.println("Firefox");
        return null;
    }

    @Override
    public void getScreenshot() {
        System.out.println("Firefox Takes Screen Shot");
    }
}
