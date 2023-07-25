FROM openjdk:latest
WORKDIR /app
COPY ThreeNumbersSum.java /app
RUN javac ThreeNumbersSum.java
CMD ["java", "ThreeNumbersSum"]