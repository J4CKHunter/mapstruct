package com.erdemnayin.modelmapper.config;

import java.util.UUID;

public class MappingUtils {

    public static final String GENERATE_UUID_EXPRESSION = "java(com.erdemnayin.modelmapper.config.MappingUtils.generateUUID())";

    public static String generateUUID() {
        return UUID.randomUUID().toString();
    }
}
