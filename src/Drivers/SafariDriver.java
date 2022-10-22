package Drivers;

public class SafariDriver implements RemoteWebDriverInterface{
    @Override
    public void navigate() {
        System.out.println("Safari navigates the web");
    }

    @Override
    public void close() {
        System.out.println("Safari closed");
    }

    @Override
    public void open() {
        System.out.println("Safari opened");
    }

    @Override
    public String getTitle() {
        System.out.println("Safari");
        return null;
    }

    @Override
    public void getScreenshot() {
        System.out.println("Safari Takes Screen Shot");
    }
}
