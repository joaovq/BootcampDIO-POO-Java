package br.com.dio.desafio;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class Mentors  extends Content{
    private LocalDate date;

    @Override
    public double xpCalculate() {
        return XP_PADRAO + 20d;
    }


}
