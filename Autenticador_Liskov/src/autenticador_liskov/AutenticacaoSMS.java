/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autenticador_liskov;

/**
 *
 * @author IFTM
 */
public class AutenticacaoSMS implements Autenticacao{
    private GerenciadorUsuarios gerenciador;

    public AutenticacaoSMS(GerenciadorUsuarios gerenciador) {
        this.gerenciador = gerenciador;
    }

    @Override
    public boolean autenticar(String numeroTelefone, String codigoSMS) {
        Usuario usuario = gerenciador.encontrarPorNumeroTelefone(numeroTelefone);
        if (usuario == null) {
            return false;
        }
        return "1234".equals(codigoSMS); // No mundo real, isso seria um código enviado por SMS.
    }
}
