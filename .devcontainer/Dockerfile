FROM mcr.microsoft.com/devcontainers/java:21

WORKDIR /collections

RUN apt-get update -y && \
    apt-get install -y git && \
    apt-get clean && \
    mkdir -p bin && \
    rm -rf /var/lib/apt/lists/*