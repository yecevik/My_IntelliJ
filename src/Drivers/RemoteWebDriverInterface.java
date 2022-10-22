package Drivers;

public interface RemoteWebDriverInterface extends WebDriverInterface,TakeScreenShotInterface{
    void navigate();

    @Override
    void close();

    @Override
    void open();
    String getTitle();
void getScreenshot();

}
