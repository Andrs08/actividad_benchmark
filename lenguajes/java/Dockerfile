# Usa la imagen oficial de OpenJDK
FROM openjdk:11-jdk-slim

# Copia el archivo Java al contenedor
COPY Main.java /Main.java

# Compila el código
RUN javac /Main.java

# Ejecuta el código y guarda el resultado
CMD ["/bin/sh", "-c", "mkdir -p /benchmark/lenguajes/java && java -cp / Main > /benchmark/lenguajes/java/resultado.txt && cat /benchmark/lenguajes/java/resultado.txt"]

 
