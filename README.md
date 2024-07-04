
# mySimpleBank

![GitHub repo size](https://img.shields.io/github/repo-size/johnbitu/mysimplebank?style=for-the-badge)
![GitHub language count](https://img.shields.io/github/languages/count/johnbitu/mysimplebank?style=for-the-badge)
![GitHub forks](https://img.shields.io/github/forks/johnbitu/mysimplebank?style=for-the-badge)


### Ajustes e melhorias

O projeto ainda está em desenvolvimento e as próximas atualizações serão voltadas nas seguintes tarefas:

  Comunicação com o banco e dados:

- [x] Iniciando o projeto Java (JPA, PostgresSQL, Validator, OpenFeign)
- [x] Configurando o PostgresSQL no Docker
- [x] Configurando a comunicacao do Spring Boot com o PostgresSQL

  Funcionalidade de Cadastro de Usuario:

- [ ]  Mapear as entidades (User, UserType)
- [ ]  Criar inicialização de UserType no banco de dados
- [ ]  Criar a funcionalidade de cadastro de User
            1° Validação dos dados únicos
            2° Inserção na base
- [ ]  Criar tratamento de exceções com ProblemDetails e RestExceptionHandler
- [ ]  Criar validação de dados de entrada
- [ ]  Ajustar tratamento de exceções
- [ ]  Testar a API e validar no banco de dados

Funcionalidade de Transferência:

- [ ]  Mapear a entidade (Transaction)
- [ ]  Criar os mocks do Autorizador e Notificador Externo (https://designer.mocky.io/)
- [ ]  Criar o serviço que irá consultar o autorizador externo
- [ ]  Criar o serviço que irá notificar o recebimento da transferência
- [ ]  Criar a funcionalidade de transação
            1° Validar o tipo da carteira
            2° Validar o saldo
            3° Consultar autorizador externo
            4° Realizar a transferência
            5° Enviar notificação para o recebedor (CompletableFuture)
- [ ]  Validar o tratamento de exceções com RestExceptionHandler
- [ ]  Testar a API e validar no banco de dados

## 💻 Pré-requisitos

Antes de começar, verifique se você atendeu aos seguintes requisitos:

- Você instalou `<Java 17 / JPA, PostgresSQL, Validator, OpenFeign / PostgresSQL, Docker, Java>`
- Você tem uma máquina `<Windows / Linux / Mac>`.
