package com.av.api;

import feign.Feign;
import feign.Logger;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;
import feign.slf4j.Slf4jLogger;

public class AppConfig {
    public static final String API = "NE4sB1BKUU8tN7V2oZv62iRGlRsq7egT5HUhDtjc57cv";
    public static final String BASE_URL = "https://api.rentcode.net/";

    public static <T> T getService(Class<T> clazz) {
        return Feign.builder()
                .client(new OkHttpClient())
                .encoder(new GsonEncoder())
                .decoder(new GsonDecoder())
                .target(clazz, BASE_URL);
    }
}
