package com.api.borutoserver.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.sql.Clob;
import java.util.List;

@Entity
@Table(name = "HERO_TABLE")
@Getter
@Setter
@NoArgsConstructor
public class HeroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String image;
    @Lob
    private String about;
    private Double rating;
    private Integer power;
    private String month;
    private String day;
    @ElementCollection
    private List<String> family;
    @ElementCollection
    private List<String> abilities;
    @ElementCollection
    private List<String> natureTypes;

}
