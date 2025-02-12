FROM openjdk:8-jdk-alpine
COPY build/libs/*.jar app.jar
ENTRYPOINT ["java","-jar", "-Duser.timezone=Asia/Seoul", "/app.jar", "--spring.profiles.active=D"]