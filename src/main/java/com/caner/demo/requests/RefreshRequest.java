package com.caner.demo.requests;

import lombok.Data;

@Data
public class RefreshRequest {

    Long userId;
    String refreshToken;
}
