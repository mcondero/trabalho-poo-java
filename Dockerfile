FROM openjdk:8-jdk
WORKDIR /app
COPY ./source/ /app
RUN javac *.java
CMD ["java", "Main"]