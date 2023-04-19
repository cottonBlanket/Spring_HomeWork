package com.homework.homework.controllers.dto.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Value;

@Value
@Builder
@Getter
public class ProductRequest {

    double price;

    InfoRequest info;

    public double getPrice() {
        return price;
    }

    public InfoRequest getInfo() {
        return info;
    }
}

