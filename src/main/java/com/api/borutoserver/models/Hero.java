package com.api.borutoserver.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Getter
@Setter
public class Hero {

    private int id;
    private String name;
    private String image;
    private String about;
    private Double rating;
    private int power;
    private String month;
    private String day;
    List<String> family;
    List<String> abilities;
    List<String> natureTypes;

}
