package br.com.dio.desafio;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode
public class Bootcamp {
    private String name;
    private  String description;
    private LocalDate initialDate = LocalDate.now();
    private LocalDate finishDate = initialDate.plusDays(45);
    private Set<Dev> devs = new HashSet<>();
    private Set<Content> contents = new LinkedHashSet<>();

}
