FROM openjdk:8-jdk-alpine
MAINTAINER hezhong <hezhong0711@gmail.com>

COPY --from=hengyunabc/arthas:latest /opt/arthas /opt/arthas
RUN apk add --no-cache tini
ENTRYPOINT ["/sbin/tini", "--"]

COPY ./build/libs/gocd-springboot-demo.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch gocd-springboot-demo.jar'

CMD ["java", "-jar", "gocd-springboot-demo.jar"]
