# lsp_Example
Projeto simples que ilustra a aplicação da Substituição de Liskov, feito para a Matéria Padrões de Projeto
# Resumo do Projeto
O projeto é um sistema de autenticação que oferece várias formas de autenticação: por e-mail, biometria e SMS. Para alcançar isso, definimos uma interface chamada Autenticacao, que é implementada por três classes diferentes: AutenticacaoEmail, AutenticacaoBiometrica, e AutenticacaoSMS. Também criamos uma classe GerenciadorUsuarios para gerenciar um conjunto de usuários no sistema, além de métodos para cadastrar e buscar usuários. Finalmente, temos uma classe Usuario para representar os usuários no sistema.

# Princípio da Substituição de Liskov (LSP)
O LSP faz parte dos princípios SOLID e afirma que classes derivadas (subclasses) devem ser substituíveis por suas classes base (superclasses) sem quebrar a integridade do sistema. Em outras palavras, um programa que usa uma classe base deve poder usar qualquer uma de suas subclasses sem problemas inesperados.

# Onde o LSP é aplicado neste código
Interface Autenticacao: Esta interface define um método comum de autenticação. Ao criar várias classes que implementam essa interface, você garante que qualquer implementação pode ser usada sem alterar a lógica do código que faz a autenticação. Isso cumpre o LSP porque qualquer classe que implementa Autenticacao pode ser usada de forma intercambiável.
Classes de autenticação (AutenticacaoEmail, AutenticacaoBiometrica, AutenticacaoSMS): Cada uma dessas classes implementa a interface Autenticacao. Como elas seguem a mesma interface, todas podem ser usadas onde Autenticacao é esperada. Por exemplo, no trecho de teste, criamos instâncias dessas classes e as usamos de forma intercambiável para autenticar os usuários.
Substituição segura: Como cada implementação de autenticação tem seu próprio método para verificar a autenticidade do usuário, você pode trocar um tipo de autenticação por outro sem afetar o funcionamento do sistema. Isso cumpre o LSP porque o comportamento geral do sistema não é alterado quando uma implementação é substituída por outra.
Por que o LSP é importante?
Seguir o LSP permite que o código seja mais flexível e extensível, facilitando a manutenção e atualização do sistema. Quando você pode adicionar novas funcionalidades ou substituir implementações existentes sem quebrar o código existente, você obtém um sistema mais robusto e resiliente a mudanças.

Neste projeto, a aplicação do LSP possibilita que você adicione outros métodos de autenticação no futuro sem a necessidade de modificar o código existente. Desde que a nova implementação siga a interface Autenticacao, ela pode ser usada no lugar das outras sem problemas, garantindo uma evolução do sistema sem criar riscos de falha ou comportamento inesperado.
