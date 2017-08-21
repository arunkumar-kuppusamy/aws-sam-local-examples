# aws-sam-local-examples (Java 8)

### Run

Make sure to install [aws-sam-local](https://github.com/awslabs/aws-sam-local)
Make sure to install `mvn`.
```
mvn package
aws-sam-local local invoke -e event.json

##To debug
aws-sam-local local invoke -d 5858 -e event.json
```