FROM maven:3.6.3-jdk-11

# working directory for gatling
WORKDIR /app

RUN mkdir -p /app

COPY . /app

ENV aws_cli=2.1.27

RUN apt-get update && apt-get install -y jq python-pip python-dev

# Install AWS-CLI
RUN pip install awscli