# mYOUsic – API de recomendação musical baseada em emoções

## 💬 Descrição

- A mYOUsic API é uma aplicação desenvolvida em Spring Boot que sugere frases músicas.
- A API retorna citações ou recomendações musicais que ajudam a refletir, compreender ou aliviar sentimentos.

## ⚙️ Tecnologias usadas

- Java 21
- Spring Boot 3
- Spring Data JPA
- PostgreSQL (H2 em ambiente local)
- Docker
- Maven

## 🧩 Funcionalidades

- Cadastro e consulta de citações/músicas relacionadas a emoções
- Estrutura pronta para integração com banco de dados relacional
- Configuração separada para ambientes dev e prod
- Pronta para containerização com Docker

## 🚀 Como rodar localmente
```bash
# Clone o repositório
git clone https://github.com/seuusuario/myousic-api.git
cd myousic-api

# Build do projeto
mvn clean package -DskipTests

# Rodar com Docker
docker build -t myousic-api .
docker run -p 8080:8080 myousic-api
```

A aplicação ficará disponível em:
👉 http://localhost:8080

💡 Ideia por trás

A proposta do projeto é unir emoções e música — transformar sentimentos em trilhas sonoras personalizadas, ajudando o usuário a encontrar algo que ressoe com o que ele sente no momento.
