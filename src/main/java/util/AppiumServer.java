package util;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import java.time.Duration;

public class AppiumServer {

    private static AppiumDriverLocalService appiumService;

    public static void startServer() {
        AppiumServiceBuilder builder = new AppiumServiceBuilder()
                .usingPort(4723)
                .withArgument(GeneralServerFlag.SESSION_OVERRIDE)
                .withArgument(GeneralServerFlag.LOG_LEVEL, "error")
                .withArgument(GeneralServerFlag.RELAXED_SECURITY)
                .withArgument(GeneralServerFlag.ALLOW_INSECURE)
//                .withArgument(GeneralServerFlag.WAIT_FOR_APP_SCRIPT)
                .withArgument(GeneralServerFlag.LOCAL_TIMEZONE)
//                .withArgument(GeneralServerFlag.ENABLE_KEYCHAIN_ACCESS)
                .withArgument(GeneralServerFlag.TEMP_DIRECTORY, "./target/tmp");

        appiumService = AppiumDriverLocalService.buildService(builder);
        appiumService.start();
        appiumService.clearOutPutStreams();
//        appiumService.waitUntilServerIsRunning(Duration.ofSeconds(30));
    }

    public static void stopServer() {
        if (appiumService != null && appiumService.isRunning()) {
            appiumService.stop();
        }
    }
}

