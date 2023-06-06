package config;

import org.aeonbits.owner.Config;

@Config.Sources(
        "classpath:properties/emulator.properties"
)

public interface EmulatorConfig extends Config {

    @Config.Key("deviceName")
    @Config.DefaultValue("Pixel 4 API 30")
    String getDeviceName();

    @Config.Key("platformVersion")
    @Config.DefaultValue("11.0")
    String getPlatformVersion();

    @Config.Key("appPackage")
    @Config.DefaultValue("org.wikipedia.alpha")
    String appPackage();

    @Config.Key("appActivity")
    @Config.DefaultValue("org.wikipedia.main.MainActivity")
    String appActivity();

    @Config.Key("serverUrl")
    @Config.DefaultValue("http://localhost:4723/wd/hub")
    String serverUrl();
}
