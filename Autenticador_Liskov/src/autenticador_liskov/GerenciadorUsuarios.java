/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autenticador_liskov;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Augusto Castejon && Murilo
 */
public class GerenciadorUsuarios {
    private final List<Usuario> usuarios = new ArrayList<>();

    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Usuario encontrarPorEmail(String email) {
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equals(email)) {
                return usuario;
            }
        }
        return null;
    }

    public Usuario encontrarPorIdentificadorBiometrico(String identificadorBiometrico) {
        for (Usuario usuario : usuarios) {
            if (usuario.getIdentificadorBiometrico().equals(identificadorBiometrico)) {
                return usuario;
            }
        }
        return null;
    }

    public Usuario encontrarPorNumeroTelefone(String numeroTelefone) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNumeroTelefone().equals(numeroTelefone)) {
                return usuario;
            }
        }
        return null;
    }
}
