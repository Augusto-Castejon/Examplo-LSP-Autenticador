/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autenticador_liskov;

/**
 *
 * @author IFTM
 */
public class AutenticacaoEmail implements Autenticacao{
    private GerenciadorUsuarios gerenciador;

    public AutenticacaoEmail(GerenciadorUsuarios gerenciador) {
        this.gerenciador = gerenciador;
    }

    @Override
    public boolean autenticar(String email, String senha) {
        Usuario usuario = gerenciador.encontrarPorEmail(email);
        if (usuario == null) {
            return false;
        }
        return usuario.getSenha().equals(senha);
    }
}
