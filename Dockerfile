# Usamos una imagen base de Java 17
FROM openjdk:17-jdk-slim

# Directorio dentro del contenedor
VOLUME /tmp

# Nombre del archivo JAR generado
ARG JAR_FILE=target/FacturacionSecureAPI-0.0.1-SNAPSHOT.jar

# Copiamos el JAR al contenedor
COPY ${JAR_FILE} app.jar

# Puerto de exposición
EXPOSE 9898

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "/app.jar"]
