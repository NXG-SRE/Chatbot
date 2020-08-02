# Chatbot API
Application create for interact with users, send messages and receive messages.
![Architecture Design](doc/Chatbot.svg)

## How to
For use build this project you'll need gradle and Java 11+ on your workstation. For run inside docker, you can run the command `docker build chatbot-api:latest .` and run the container with builded image.
- For Example:
```
docker build -t chatbot-api:latest .
docker run -it --rm <image-name>
```

## License
The license used for this project is MIT