package com.api.borutoserver.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Getter
@Setter
public class ApiResponse {

    private boolean success;
    private String message;
    private int prevPage;
    private int nextPage;
    private List<Hero> heroes;

}
