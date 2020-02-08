# Swagger
spec 主要放在swagger/spec.yaml內,
為了節省code sync的時間, codegen.jar不進版,
要自己抓來放在swagger/內

## code gen
要根據你spec的版本去使用相對應的codegen.
這邊使用的版本是openAPI 3.0
swagger-codegen-cli-3.0.16.jar

### gen code指令
直接執行codege.sh

```
sh codegen.sh
```

### config
放在swagger/config.json內

初次執行時使用以下設定:
```
{
  "apiPackage": "com.ceiere.app.controller",
  "modelPackage": "com.ceiere.app.model",
  "configPackage": "com.ceiere.app.config.swagger",
  "groupId": "com.ceiere",
  "artifactId": "app"
}
```
會幫你產生:
- api interface
- controller
- model
- swagger api documentation
- application.properties
- main file

