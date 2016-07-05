package com.github.seratch.jslack.api.methods.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DndSetSnoozeRequest {

    private String token;
    private Integer numMinutes;
}