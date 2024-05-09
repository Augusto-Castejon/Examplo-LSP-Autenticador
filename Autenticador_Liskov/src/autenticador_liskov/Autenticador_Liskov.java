/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package autenticador_liskov;

/**
 *
 * @author Augusto Castejon && Murilo
 */
public class Autenticador_Liskov {

    public static void main(String[] args) {
        GerenciadorUsuarios gerenciador = new GerenciadorUsuarios();

        Usuario usuario1 = new Usuario(
            "1", 
            "João Silva", 
            "joao@example.com", 
            "senha123", 
            "fingerprint_joao", 
            "555-1234"
        );

        gerenciador.cadastrarUsuario(usuario1);

        Autenticacao autenticacaoEmail = new AutenticacaoEmail(gerenciador);
        Autenticacao autenticacaoBiometrica = new AutenticacaoBiometrica(gerenciador);
        AutenticacaoSMS autenticacaoSMS = new AutenticacaoSMS(gerenciador);

        System.out.println("Autenticacao por e-mail: " + autenticacaoEmail.autenticar("joao@example.com", "senha123")); // Verdadeiro
        System.out.println("Autenticacao biometrica: " + autenticacaoBiometrica.autenticar("fingerprint_joao", "token123")); // Verdadeiro
        System.out.println("Autenticacao por SMS: " + autenticacaoSMS.autenticar("555-1234", "1234")); // Verdadeiro
        System.out.println("");
        // Autenticação com credenciais incorretas
        System.out.println("Autenticacao por e-mail (falha): " + autenticacaoEmail.autenticar("joao@example.com", "senhaErrada")); // Falso
        System.out.println("Autenticacao biometrica (falha): " + autenticacaoBiometrica.autenticar("fingerprint_joao", "tokenErrado")); // Falso
        System.out.println("Autenticacao por SMS (falha): " + autenticacaoSMS.autenticar("555-1234", "codigoErrado")); // Falso
    }
    
}
