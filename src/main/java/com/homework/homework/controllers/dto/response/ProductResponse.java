package com.homework.homework.controllers.dto.response;

import com.homework.homework.controllers.dto.request.ProductRequest;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ProductResponse {

    public double price;

    public InfoResponse info;

    public ProductResponse(ProductRequest request) {
        this.price = request.price;
        this.info = new InfoResponse(request.info);
    }
}
