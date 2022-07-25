package br.com.dio.desafio;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;


@Getter
@Setter
@EqualsAndHashCode
public class Dev {
    private String name;
    private Set<Content> subscribeContents = new LinkedHashSet<>();
    private Set<Content> completeContents = new LinkedHashSet<>();

    public void subscribe (Bootcamp bootcamp){
        this.subscribeContents.addAll(bootcamp.getContents());
        bootcamp.getDevs().add(this);
    }
    public void progress(){
        Optional<Content> first = this.subscribeContents.stream()
                                                        .findFirst();
        if(first.isPresent()){
                this.completeContents.add(first.get());
                this.subscribeContents.remove(first.get());
        }
        else
            System.out.println("Você não está matriculado em nenhum conteúdo.");

    }

    public double xpCalculate(){
        return this.completeContents.stream()
                                    .mapToDouble(Content::xpCalculate)
                                    .sum();
//        return this.completeContents.stream().mapToDouble(content -> content.xpCalculate()).sum();
    }
}
