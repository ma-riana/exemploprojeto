package com.exemploprojeto2.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "resposta_formulario")
public class RespostaFormulario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRespostaFormulario;

    @ManyToOne
    @JoinColumn(name = "id_formulario")
    private Formulario formulario;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    private LocalDateTime dataResposta;

    public RespostaFormulario() {
    }

    public Long getIdRespostaFormulario() {
        return idRespostaFormulario;
    }

    public void setIdRespostaFormulario(Long idRespostaFormulario) {
        this.idRespostaFormulario = idRespostaFormulario;
    }

    public Formulario getFormulario() {
        return formulario;
    }

    public void setFormulario(Formulario formulario) {
        this.formulario = formulario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDateTime getDataResposta() {
        return dataResposta;
    }

    public void setDataResposta(LocalDateTime dataResposta) {
        this.dataResposta = dataResposta;
    }
}
