# spring-oauth2-demo

### Step01 - 获取Authorization code
```
http://localhost:8081/authserver/oauth/authorize?client_id=oauth2_client&redirect_uri=http://localhost:8090/showEmployees&response_type=code&scope=read
```

### Step02 - 获取access token
```
curl -v -X POST http://localhost:8081/authserver/oauth/token -d code=hZT4Vi -d redirect_uri=http://localhost:8090/showEmployees -d grant_type=authorization_code -d client_id=oauth2_client -d username=user -d password=654321 -H 'Authorization: Basic b2F1dGgyX2NsaWVudDpvYXV0aDJfY2xpZW50X3NlY3JldA=='
```

### Step03 - 请求资源api
```
curl -v -X GET http://localhost:8081/authserver/user/getEmployeesList -H 'Authorization: Bearer 2fb8f235-e8bc-49c5-98eb-996740b9bf4e'
```

```
curl -v -X GET http://localhost:8082/resource/note -H 'Authorization: Bearer 2fb8f235-e8bc-49c5-98eb-996740b9bf4e'
```
