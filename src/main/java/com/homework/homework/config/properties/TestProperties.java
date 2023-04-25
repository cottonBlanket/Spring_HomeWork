package com.homework.homework.config.properties;

import lombok.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

import java.util.List;

@Value
@ConstructorBinding
@ConfigurationProperties("test")
public class TestProperties {
    String evn;
    String name;
    List<String> list;
}
