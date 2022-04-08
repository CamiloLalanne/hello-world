# Google Cloud Platform OpenJDK Docker Image
#FROM openjdk:11-jdk-slim
FROM openjdk:8-jdk-slim
# Default to UTF-8 file.encoding
ENV LANG C.UTF-8

# Default copy (Gradle)
COPY ./build/libs/*.jar /api/app.jar

# Default workspace dir
RUN ls /api
WORKDIR /api

# no root execution
USER www-data

ENTRYPOINT [ \
    "java", \
    "-jar", \
    "/api/app.jar" \
]