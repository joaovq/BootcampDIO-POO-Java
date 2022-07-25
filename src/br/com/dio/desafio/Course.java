package br.com.dio.desafio;

import lombok.*;

@Getter
@Setter
@ToString
public class Course extends Content{
    private int   workload;


    @Override
    public double xpCalculate() {
        return XP_PADRAO + workload;
    }
}
