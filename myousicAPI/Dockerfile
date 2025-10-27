# ========================
# Etapa 1 — Build da aplicação
# ========================
FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app

# Copia apenas o pom.xml e baixa dependências (para usar cache)
COPY pom.xml .
RUN mvn dependency:go-offline

# Copia o código-fonte e constrói o .jar
COPY src ./src
RUN mvn clean package -DskipTests

# ========================
# Etapa 2 — Imagem final
# ========================
FROM eclipse-temurin:21-jre-jammy

# Cria um usuário não-root
RUN useradd -m myousicuser
USER myousicuser

WORKDIR /app
COPY --from=build /app/target/*.jar app.jar

# Porta padrão do Spring Boot
EXPOSE 8080

# Permite definir configurações adicionais via variáveis
ENV JAVA_OPTS=""

# Comando de inicialização
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar app.jar"]