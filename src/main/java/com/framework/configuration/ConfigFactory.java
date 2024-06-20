package com.framework.configuration;

import org.aeonbits.owner.ConfigCache;

public final class ConfigFactory {
    private ConfigFactory(){}

    public static frameworkConfiguration getConfiguration(){
        return ConfigCache.getOrCreate(frameworkConfiguration.class);
    }

}
