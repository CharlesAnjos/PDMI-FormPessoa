package br.edu.ifto.formpessoa.entities;

import java.util.List;

import br.edu.ifto.formpessoa.enums.EstiloMusical;
import br.edu.ifto.formpessoa.enums.Sexo;

public class Pessoa {
    private String nome;
    private Integer idade;
    private Sexo sexo;
    private List<EstiloMusical> estilosMusicais;

    public Pessoa(String nome, Integer idade, Sexo sexo, List<EstiloMusical> estilosMusicais) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.estilosMusicais = estilosMusicais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public List<EstiloMusical> getEstilosMusicais() {
        return estilosMusicais;
    }

    public void setEstilosMusicais(List<EstiloMusical> estilosMusicais) {
        this.estilosMusicais = estilosMusicais;
    }
}



