# API Controle de Pontos - Bootcamp Santander DigitalInnovationOne

## Sobre o sistema 📋
 
Sistema desenvolvido no modulo "Construindo um sistema de controle de ponto e acesso com Spring Boot", no Bootcamp Santander Dio.

A implementação encontrada neste repositório apresenta algumas particularidades adicionais ao que foi realizado na aula.

Nesta implementação foi adicionado o padrão de projeto DTO, tornando o código mais encapsulado e seguro. 

Para utilizar o padrão DTO, foi adicionado ao projeto o Mapstruc que usa a anotação @Mapper e cria uma interface para poder implementar a conversão automatica do objeto DTO para o objeto modelo. 

Foi implementado o CRUD para JornadaTrabalho de acordo com o apresentado nas aulas. Fica em aberto no projeto a implementação dos demais CRUD's da regra de negocio. 

Conforme apresentado na aula, neste projeto também foi utilizado o Hibernate Envers para realização de auditoria nas tabelas do banco. Abaixo é possível verificar a criação das tabelas auditáveis no banco H2.

![HibernateEnvers](https://user-images.githubusercontent.com/32941370/126690911-7b98b1a3-8e62-4f8a-b9d3-7e467d3730fc.JPG)

Também conforme apresentando na aula, foi utilizado na implementação a configuração do Swagger. Ao executar o projeto,
basta acessar o endereço http://localhost:8080/swagger-ui.html para analisar o que foi apresentado pelo Swagger.

![Swagger](https://user-images.githubusercontent.com/32941370/126690929-d7434b75-62ae-4585-9055-f362de314f14.JPG)

## Detalhes da implementação ⚙️

As entidades implementadas são as mesmas constuidas na aula da Dio, conforme modelo abaixo: 

![image](https://user-images.githubusercontent.com/32941370/126691533-0c4f76f9-4cb0-4c56-b999-2a00b51ab7d9.png)

A API possui no caminho \src\main\resources 3 arquivos do tipo .properties que são responsáveis por definir perfis de desenvolvimento. O arquivo application-dev.properties define as configurações do banco local H2 que é utilizado no perfil de desenvolvimento. Para o perfil de produção, o arquivo application-prod.properties define as configurações do banco de dados PostgreSQL.

## Demais informações sobre o projeto 🛠️

Para utilizar a API, você deverá baixar esse repositório para sua máquina local. Você precisa ter configurado o
Java JDK 11 e o Gradle 7.1.1 ou superior em sua estação. 

Ao baixar execute o build do Gradle para poder construir os pacotes e porder executar o sistema.

Vale ressaltar também que o projeto utiliza diversas ferramentas e frameworks, como por exemplo o Spring Web, Mapstruct, Lombok, JPA, Hibernate Envers, Swagger, etc. 
Portanto, é necessário estar atento caso ocorra um problema de dependencia que tenha que ser resolvido nas configurações de sua estação.
 

Qualquer dúvida, contactar o responsável por este repositório. 
