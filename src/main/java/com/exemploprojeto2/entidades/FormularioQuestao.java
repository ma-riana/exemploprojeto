package com.exemploprojeto2.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "formularios_questoes")
@IdClass(FormularioQuestaoId.class)
public class FormularioQuestao {

    @Id
    @ManyToOne
    @JoinColumn(name = "id_formulario")
    private Formulario formulario;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_questao")
    private Questao questao;

    private Integer ordem;

    // Getters e Setters
    public Formulario getFormulario() {
        return formulario;
    }

    public void setFormulario(Formulario formulario) {
        this.formulario = formulario;
    }

    public Questao getQuestao() {
        return questao;
    }

    public void setQuestao(Questao questao) {
        this.questao = questao;
    }

    public Integer getOrdem() {
        return ordem;
    }

    public void setOrdem(Integer ordem) {
        this.ordem = ordem;
    }
}
