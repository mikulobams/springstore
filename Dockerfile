FROM ubuntu:latest
LABEL authors="mikul"

ENTRYPOINT ["top", "-b"]