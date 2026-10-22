package com.sky.config;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "baidu")
@Data
public class BaiduMapConfig {
    private String ak;
    private String geocodeUrl;
    private String matrixUrl;
}
