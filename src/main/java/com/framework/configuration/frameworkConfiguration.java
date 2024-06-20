package com.framework.configuration;
import com.framework.Converter.StringToBrowserTypeConverterClass;
import com.framework.enums.browserType;
import org.aeonbits.owner.Config;
import org.openqa.selenium.remote.BrowserType;


@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/config.properties"
})
public interface frameworkConfiguration extends Config{
    @DefaultValue("Chrome")
    @ConverterClass(StringToBrowserTypeConverterClass.class)
    browserType browser();



}
