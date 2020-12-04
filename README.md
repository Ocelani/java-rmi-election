# Java RMI - Election System
Otávio Celani - 30 de Agosto de 2020

[TOC]


## Exercicio
Desenvolver um sistema para o serviço Election utilizando o Java RMI.


### 1. Requisitos

#### 1.1. Funcionais
- [ ] **RF.01** - Os registros devem permanecer consistentes para acesso simultâneo de vários clientes.
- [ ] **RF.02** - Todos os votos devem ser armazenados com segurança, mesmo quando o processo no servidor falhar.
- [ ] **RF.03** - Os **identificadores de eleitor** devem ser gerados a partir de uma **função MD5** do **nome completo do eleitor**.


#### 1.2. Não funcionais
- [ ] **RNF.01** - Utilizar a tecnologia Java RMI com semântica at-most-once.
- [ ] **RNF.02** - Implementar um mecanismo de recuperação de falha no cliente que consiga obter uma semântica exactly-once para o caso do serviço ser interrompido por um tempo inferior a 30 segundos.


### 2. Informações

#### 2.1. Interface Election
Fornece dois métodos remotos:


##### - vote ( )
Possui dois parâmetros fornecidos pelo cliente:
-  <u>Nome de um Candidato</u> : *String*
- <u>Identificador de Eleitor</u> : *MD5hash*


##### - result ( )
Possui dois parâmetros fornecidos pelo servidor para o cliente:
- <u>**Nome** de um Candidato</u> : *String*
- <u>Votos desse Candidato</u> : *Int*


