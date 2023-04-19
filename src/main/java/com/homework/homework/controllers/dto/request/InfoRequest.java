package com.homework.homework.controllers.dto.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Value;

import java.util.Date;

@Value
@Builder
public class InfoRequest {
    Date date;

    public Date getDate() {
        return date;
    }
}
