package model;

public class DadosOscar {
    private int id;
    private int ano;
    private int idade;
    private String nome;
    private String filme;

    public DadosOscar(int id, int ano, int idade, String nome, String filme) {
        this.id = id;
        this.ano = ano;
        this.idade = idade;
        this.nome = nome;
        this.filme = filme;
    }

    public int getId() {
        return id;
    }

    public int getAno() {
        return ano;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getFilme() {
        return filme;
    }
}
