def hello_world(event, context):
    message = 'Hello {} {} from Python lambda!'.format(event['first_name'],
                                    event['last_name'])
    return {'message' : message}
