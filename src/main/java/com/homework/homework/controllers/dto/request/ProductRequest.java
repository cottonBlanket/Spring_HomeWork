package com.homework.homework.controllers.dto.request;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ProductRequest {

    public double price;

    public InfoRequest info;

}

