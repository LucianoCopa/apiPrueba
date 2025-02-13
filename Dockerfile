# 1️⃣ Imagen base ligera con JDK 17
FROM amazoncorretto:17

# 2️⃣ Establecer el directorio de trabajo dentro del contenedor
WORKDIR /app

# 3️⃣ Copiar el JAR generado en el contenedor
COPY target/data-jpa-0.0.1-SNAPSHOT.jar app.jar

# 4️⃣ Definir el puerto en el que corre la aplicación (Render lo usa)
EXPOSE 8080

# 5️⃣ Ejecutar la aplicación cuando el contenedor inicie
ENTRYPOINT ["java", "-jar", "app.jar"]