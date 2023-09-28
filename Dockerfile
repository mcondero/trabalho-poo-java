FROM openjdk
WORKDIR /app
COPY ./source/ /app
RUN javac *.java
CMD ["java", "Main"]