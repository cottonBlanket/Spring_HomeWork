package com.homework.homework.controllers.dto.response;

import com.homework.homework.controllers.dto.request.InfoRequest;
import lombok.Builder;
import lombok.Value;

import java.util.Date;
import java.util.Random;

@Value
@Builder
public class InfoResponse {

    public int id;

    public Date date;

    public InfoResponse(InfoRequest request) {
        this.date = request.getDate();
        var r = new Random();
        this.id = r.nextInt(1000000);
    }
}
