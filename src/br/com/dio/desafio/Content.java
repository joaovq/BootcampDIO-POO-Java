package br.com.dio.desafio;


public abstract class Content {
    public static final double XP_PADRAO = 10d;

    private String title;
    private String description;

    public  abstract  double xpCalculate();


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
