# aws-sam-local-examples
This repository contains code examples for different languages for [aws-sam-local](https://github.com/awslabs/aws-sam-local).

- [python3](python)

### Run

Make sure to install [aws-sam-local](https://github.com/awslabs/aws-sam-local)
```
cd python
aws-sam-local local invoke "HelloWorld" -e event.json
```