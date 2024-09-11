package com.exemploprojeto2.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "opcoes")
public class Opcao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_opcao;

    @ManyToOne
    @JoinColumn(name = "id_questao", nullable = false)
    private Questao questao;

    private String descricao_opcao;
    private Integer ordem;

    public Opcao() {
        // Construtor vazio
    }

    // Getters e Setters

    public Long getId_opcao() {
        return id_opcao;
    }

    public void setId_opcao(Long id_opcao) {
        this.id_opcao = id_opcao;
    }

    public Questao getQuestao() {
        return questao;
    }

    public void setQuestao(Questao questao) {
        this.questao = questao;
    }

    public String getDescricao_opcao() {
        return descricao_opcao;
    }

    public void setDescricao_opcao(String descricao_opcao) {
        this.descricao_opcao = descricao_opcao;
    }

    public Integer getOrdem() {
        return ordem;
    }

    public void setOrdem(Integer ordem) {
        this.ordem = ordem;
    }
}
