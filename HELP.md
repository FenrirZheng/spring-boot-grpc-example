# CMD client 驗證 Grpc

```shell
grpcurl -d '{"name":"Hi"}' -plaintext localhost:9090 Simple.SayHello | jq -r '.'

```

response:

```json
{
  "message": "Hello ==> Hi"
}

```
