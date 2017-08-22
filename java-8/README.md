# aws-sam-local-examples (Java 8)

### Run

Make sure to install [aws-sam-local](https://github.com/awslabs/aws-sam-local)
Make sure to install `mvn`.
```
mvn package
aws-sam-local local invoke -e event.json

# debug
aws-sam-local local invoke -d 5858 -e event.json

# Package
$ sam package --template-file sam.yaml --s3-bucket mybucket --output-template-file packaged.yaml

# Deploy packaged SAM template
$ sam deploy --template-file ./packaged.yaml --stack-name mystack --capabilities CAPABILITY_IAM

```