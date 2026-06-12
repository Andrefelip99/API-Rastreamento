# 📦 API de Rastreamento

## 📋 Sobre o Projeto

Sistema de rastreamento de encomendas desenvolvido em Java com foco na modelagem de entidades e no gerenciamento de informações logísticas.

O projeto simula o funcionamento básico de uma empresa de entregas, permitindo o cadastro de clientes, encomendas, transportadoras e registros de rastreamento.

Além disso, o sistema mantém um histórico de movimentações das encomendas, possibilitando a consulta de eventos registrados durante o processo de entrega.

---

## 🚀 Tecnologias Utilizadas

* Java
* Collections Framework
* LocalDateTime
* Programação Orientada a Objetos (POO)

---

## ⚙️ Funcionalidades

### Clientes

* Cadastro de clientes
* Consulta de clientes
* Atualização de informações

### Encomendas

* Cadastro de encomendas
* Associação com clientes
* Atualização de status
* Consulta por identificador

### Rastreamento

* Registro de movimentações
* Histórico de rastreamento
* Consulta de eventos registrados

### Transportadoras

* Cadastro de transportadoras
* Atualização de dados
* Listagem de transportadoras cadastradas

---

## 🏗️ Estrutura do Projeto

```text
API-Rastreamento/
│
├── Cliente.java
├── Encomenda.java
├── Rastreamento.java
├── Transportadora.java
└── Main.java
```

---

## 🔗 Relacionamento Entre Entidades

```text
Cliente
   │
   ▼
Encomenda
   │
   ▼
Rastreamento

Transportadora
```

Cada encomenda pertence a um cliente e pode possuir diversos registros de rastreamento ao longo do processo de entrega.

---

## 📚 Conceitos Praticados

### Orientação a Objetos

* Classes e Objetos
* Encapsulamento
* Construtores
* Getters e Setters
* Sobrescrita de métodos (`toString`)
* Associação entre objetos

### Estruturas de Dados

* ArrayList
* List
* Collections

### Data e Hora

* LocalDateTime

### Boas Práticas

* Separação de responsabilidades
* Organização por entidades
* Controle de histórico utilizando coleções imutáveis

---

## ▶️ Como Executar

### Compilar

```bash
javac *.java
```

### Executar

```bash
java Main
```

---

## 💻 Exemplo de Saída

```text
Rastreamento da encomenda RAST123 registrado com sucesso.

Encomendas cadastradas:
Encomenda{id=1, codigoRastreio='RAST123', descricao='Produto A'}

Transportadoras cadastradas:
Transportadora{id=1, nome='Correios'}

Histórico de rastreamentos:
Rastreamento{id=1, localizacao='Localização A'}
```

---

## 🎯 Objetivo do Projeto

Praticar conceitos fundamentais de Programação Orientada a Objetos através da construção de um sistema de rastreamento de encomendas.

O projeto serviu como exercício de modelagem de entidades, relacionamentos entre objetos e gerenciamento de informações utilizando Java puro.

---

## 🔮 Possíveis Melhorias Futuras

* Persistência em banco de dados
* API REST com Spring Boot
* Integração com PostgreSQL
* CRUD completo
* Interface Web
* Sistema de autenticação
* Consulta de rastreamento por código

---

## 👨‍💻 Autor

André Felipe da Silva Leal

Estudante de Análise e Desenvolvimento de Sistemas e desenvolvedor em formação com foco em Backend Java.
