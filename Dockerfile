FROM openjdk:8-jdk
WORKDIR /app
COPY . /app
RUN javac Carro.java CarroEsportivo.java
CMD ["java", "CarroEsportivo"]