/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autenticador_liskov;

/**
 *
 * @author IFTM
 */
public class AutenticacaoBiometrica implements Autenticacao{
    private GerenciadorUsuarios gerenciador;

    public AutenticacaoBiometrica(GerenciadorUsuarios gerenciador) {
        this.gerenciador = gerenciador;
    }

    @Override
    public boolean autenticar(String identificadorBiometrico, String token) {
        Usuario usuario = gerenciador.encontrarPorIdentificadorBiometrico(identificadorBiometrico);
        if (usuario == null) {
            return false;
        }
        // Aqui, o token pode ser algo diferente, como uma senha, mas vamos considerar que é uma autenticação por token simples.
        return "token123".equals(token);
    }
}
