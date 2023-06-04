FROM maven:3.8.4-openjdk-17-slim AS builder

COPY . /app
WORKDIR /app

RUN mvn clean package -DskipTests

FROM openjdk:17-slim
COPY --from=builder /app/target/my-app.jar /app.jar

EXPOSE 8080

CMD ["java", "-jar", "/app.jar"]