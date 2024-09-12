package com.exemploprojeto2.entidades;

import java.io.Serializable;
import java.util.Objects;

// Essa classe é usada para representar uma chave composta, ou seja, 
// uma chave primária que combina dois atributos: formulario e questao.


public class FormularioQuestaoId implements Serializable {

    private Long formulario;
    private Long questao;

    // Construtores
    public FormularioQuestaoId() {
    }

    public FormularioQuestaoId(Long formulario, Long questao) {
        this.formulario = formulario;
        this.questao = questao;
    }

    // Getters e Setters
    public Long getFormulario() {
        return formulario;
    }

    public void setFormulario(Long formulario) {
        this.formulario = formulario;
    }

    public Long getQuestao() {
        return questao;
    }

    public void setQuestao(Long questao) {
        this.questao = questao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        FormularioQuestaoId that = (FormularioQuestaoId) o;
        return Objects.equals(formulario, that.formulario) &&
                Objects.equals(questao, that.questao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(formulario, questao);
    }
}
