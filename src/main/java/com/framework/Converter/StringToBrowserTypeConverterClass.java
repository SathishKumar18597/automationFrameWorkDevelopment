package com.framework.Converter;

import com.framework.enums.browserType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class StringToBrowserTypeConverterClass implements Converter<browserType> {

    @Override
    public browserType convert(Method method, String browserName) {
        return browserType.valueOf(browserName.toUpperCase());
    }
}
