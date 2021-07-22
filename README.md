# API Controle de Pontos - Bootcamp Santander DigitalInnovationOne

## Sobre o sistema 📋
 
Sistema desenvolvido no modulo "Construindo um sistema de controle de ponto e acesso com Spring Boot", no
Bootcamp Santander Dio. A implementação encontrada neste repositório apresenta algumas particularidades adicionais ao que foi realizado na aula.

Nesta implementação foi adicionado o padrão de projeto DTO, tornando o código mais encapsulado e seguro. 
Para utilizar o padrão DTO, foi adicionado ao projeto o Mapstruc que usa a anotação @Mapper e cria uma interface
para poder implementar a conversão automatica do objeto DTO para o objeto modelo. 

Foi implementado o CRUD para JornadaTrabalho de acordo com o apresentado nas aulas. Fica em aberto no projeto 
a implementação dos demais CRUD's da regra de negocio. 

Conforme apresentado na aula, neste projeto também foi utilizado o Hibernate Envers para realização de auditoria 
nas tabelas do banco. Abaixo é possível verificar a criação das tabelas auditáveis no banco H2.

Também conforme apresentando na aula, foi utilizado na implementação a configuração do Swagger. Ao executar o projeto,
basta acessar o endereço http://localhost:8080/swagger-ui.html para analisar o que foi apresentado pelo Swagger.

## Funcionamento do projeto 

Para utilizar a API, você deverá baixar esse repositório para sua máquina local. Você precisa ter configurado o
Java JDK 11 e o Gradle 7.1.1 ou superior em sua estação. 

Vale ressaltar também que o projeto utiliza diversas ferramentas e frameworks, como por exemplo o Spring Web, Mapstruct, Lombok, JPA, etc. 
Portanto, é necessário estar atento caso ocorra um problema de dependencia que tenha que ser resolvido nas configurações de sua estação.

Será necessário também realizar um build do Gradle para poder utilizar o sistema. 

Qualquer dúvida, contactar o responsável por este repositório. 