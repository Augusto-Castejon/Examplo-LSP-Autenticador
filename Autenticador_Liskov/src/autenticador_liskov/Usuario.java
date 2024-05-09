/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autenticador_liskov;

import java.util.Objects;

/**
 *
 * @author IFTM
 */
public class Usuario {
    private String id;
    private String nome;
    private String email;
    private String senha;
    private String identificadorBiometrico;
    private String numeroTelefone;

    public Usuario(String id, String nome, String email, String senha, String identificadorBiometrico, String numeroTelefone) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.identificadorBiometrico = identificadorBiometrico;
        this.numeroTelefone = numeroTelefone;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public String getIdentificadorBiometrico() {
        return identificadorBiometrico;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    // Comparação e hash code para simplificar a busca
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(id, usuario.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
