FROM clojure:lein-2.7.1

COPY src /app/src
COPY project.clj /app/

WORKDIR /app

RUN lein with-profile production deps

EXPOSE 80

CMD ["lein" "run"]
