FROM gradle:6.3-jdk14 AS build
WORKDIR /opt/app
COPY . ./

RUN gradle -q build --debug
VOLUME /home/gradle/.gradle/

FROM gradle:6.3-jre14
WORKDIR /opt/app
COPY --from=build /opt/app/entrypoint.sh /opt/app/build/libs/*.jar ./

RUN rm ./*-javadoc.* \
    && mv *.jar app.jar \
    && ls -la

ENTRYPOINT ["./entrypoint.sh"]