FROM maven

# working directory for gatling
WORKDIR /app

RUN mkdir -p /app

COPY . /app