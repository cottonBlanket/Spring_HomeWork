package com.homework.homework.controllers.dto.request;

import lombok.Builder;
import lombok.Value;

import java.util.Date;

@Value
@Builder
public class InfoRequest {
    public Date date;
}
