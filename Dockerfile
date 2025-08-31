FROM ubuntu:latest
LABEL authors="dmytro"

ENTRYPOINT ["top", "-b"]