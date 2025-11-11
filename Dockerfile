FROM ubuntu:latest
LABEL authors="lisaf"

ENTRYPOINT ["top", "-b"]