package util;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class AppiumServerManager {
    private AppiumDriverLocalService service;
    private AppiumServiceBuilder builder;

    public void startServer() throws InterruptedException {
        //Set Capabilities
        builder = new AppiumServiceBuilder();
        builder.withIPAddress("127.0.0.1");
        builder.usingPort(4723);
        builder.withArgument(GeneralServerFlag.SESSION_OVERRIDE);
        builder.withArgument(GeneralServerFlag.LOG_LEVEL,"error");

        //Start the server with the builder
        service = AppiumDriverLocalService.buildService(builder);
        service.start();
        System.out.println("Appium server started...");

        //Wait until the server is running
        Thread.sleep(5000);
//        service.waitForServerToStart();
        System.out.println("Appium server is running...");
    }

    public void stopServer() {
        service.stop();
        System.out.println("Appium server stopped...");
    }
}

