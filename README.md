# Biblioteca
projeto

Java 1
Spring Boot
Spring Data JPA
H2 Database
Maven

deve criar uma pasta "target" com o pom.xml(tive que remover a pasta pois ela deixa o zip muito pessado pro portal Unipam)
comando que usei para rodar o projeto no codespace(nao sei se vai funcionar de outras formas)

mvn clean install
mvn spring-boot:run
mvn spring-boot:run -Dspring-boot.run.arguments="--spring.h2.console.settings.web-allow-others=true"(foi o que eu usei por garantia de dar certo)

vai aparecer isso quando vc entrar na porta:

https://"SEU-CODESPACE-URL"-8080.app.github.dev

so colocar /h2-console, e logar com

JDBC URL: jdbc:h2:mem:biblioteca
User Name: sa
Password: (vazio)