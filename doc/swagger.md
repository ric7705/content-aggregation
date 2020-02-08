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
  "artifactId": "app",
  "hideGenerationTimestamp": true
}
```
會幫你產生:
- api interface
- controller
- model
- swagger api documentation
- application.properties
- main file

之後為了避免某些檔案被override, 我們需要更改設定,
只需要產生interface, model.
其餘application.properties, controller, main file 這邊我們想要自己控制
因此可以改成如下

```
{
  "apiPackage": "com.ceiere.app.controller",
  "modelPackage": "com.ceiere.app.model",
  "configPackage": "com.ceiere.app.config.swagger",
  "groupId": "com.ceiere",
  "artifactId": "app",
  "hideGenerationTimestamp": true,
  "interfaceOnly": true
}
```
多了interfaceOnly後, 只會gen interface和model

另外發現連pom.xml也會被蓋, 因此在.swagger-codegen-ignore直接ignore掉

```
pom.xml
```