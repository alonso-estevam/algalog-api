# 🤿 AlgaLog API

### 🚧 Em desenvolvimento 🚧 

### 📝 Sobre o projeto:
API REST na linguagem Java, desenvolvida durante o evento "Mergulho Spring Rest" (31/10/2022 a 07/11/2022), da [AlgaWorks](https://www.algaworks.com/). Foi usada como ferramenta principal o Spring Boot e como banco de dados o MySQL. A proposta foi construir uma pequena aplicação de entrega de mercadorias, que permitisse tanto as operações CRUD quanto ações não-CRUD.

### 🛠 Tecnologias utilizadas:
* [Spring Boot](https://spring.io/projects/spring-boot#overview) (v. 2.7.5)
* Spring Web
* Spring Data JPA
* Flyway (v. 8.5.13)
* Lombok (v. 1.18.24)
* Jakarta Bean Validation
* Model Mapper (v. 3.0.0)

### Diagrama UML do projeto:
![image](https://user-images.githubusercontent.com/86576674/200138888-9150bb31-68bb-45e7-bda6-6dfd69858196.png)

### Endpoints implementados:
* GET/clientes
* GET/clientes/{clienteId}
* POST/clientes
* PUT/clientes/{clienteId}
* DELETE/clientes/{clienteId}
* GET/entregas
* GET/entregas/{clienteId}
* POST/entregas
* PUT/entregas/{entregaId}/finalizacao
