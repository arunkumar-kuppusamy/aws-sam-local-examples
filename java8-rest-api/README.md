# aws-sam-local-examples (Java 8)

### Run

Make sure to install [aws-sam-local](https://github.com/awslabs/aws-sam-local)
```
./gradlew build
aws-sam-local local start-api
curl -i http://localhost:3000/books
```