FROM openjdk:8-jdk
WORKDIR /app
COPY . /app
RUN javac *.java
CMD ["java", "Main"]