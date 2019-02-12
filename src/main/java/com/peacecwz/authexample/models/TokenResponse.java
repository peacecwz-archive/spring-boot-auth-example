package com.peacecwz.authexample.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class TokenResponse implements Serializable {
    private String accessToken;
}
