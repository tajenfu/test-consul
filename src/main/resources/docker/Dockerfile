FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp

ADD test-consul-0.1.0.jar app.jar

#RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""
#ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]

#ENV SPRING_PROFILES_ACTIVE docker
#EXPOSE 8443
#ENTRYPOINT ["java", "-Djava.security.edg=file:/dev/./urandom", "-jar", "/app.jar"]

