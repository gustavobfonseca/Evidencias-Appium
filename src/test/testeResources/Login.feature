# language: pt
Funcionalidade: Login

  Cenario: 03 Login com usuario bloqueado
    Dado que estou na area nao logada do app
    Quando insiro o cpf bloqueado "73040542559"
    E preencho com qualquer senha dentro dos criterios de aceite {Senha1234@}
    E clico no botao de entrar
    Entao visualizo o modal com a mensagem de conta bloqueada
    E fecho o modal
    E permaneço na tela inicial
    