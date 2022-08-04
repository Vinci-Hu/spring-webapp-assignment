# spring-webapp-assignment
## Task list
1. Build a springboot maven application…
2. Application should compile and build using maven command…
3. Application can start locally…
4. Application contains 3 tiers (controller, service and repository)…
5. Use annotation based spring bean approach…
6. Change application behavior through application.properties configurations…

7. Install MySQL locally and setup a local DB…
8. Connect spring application to DB and perform basic CRUD operations

---
# 4 separate modules:
### Basic dependencies:
* Spring Boot
* Spring Web
* log4j

## 1. Welcome module
### Objectives
* Get familiar with Spring Boot application.
* Use web functionalities (local tomcat server).
* Get parameter via url.
* Display webpage using jasper.
* Property injection to change web behavior.

### Functionalities
* Recognize localhost directories "/" and "/name".
* Pass a name via typing `/name?name=YOURNAME` and you will be welcomed.
* Change `reverse-name` to true in "application.properties" file to see the reversed version of your name. Otherwise, the name will be displayed normally.

### Related JAVA classes
controller/HomeController
service/NameService

### Additional dependencies
* jsp support(tomcat-jasper)

## 2. Dummy module (external post api call)
### Objectives
* Call an external post api, and wrap with own api.
* JSON familiarization, try ObjectMapper.
* Use Postman as a tool to test out api usability.

### Functionalities
* Access via "/dummy", POST method, request body JSON example:
```json
{
    "name": "ExampleName",
    "salary": "999",
    "age": "30"
}
```
    Note that all fields are passed as String. 
* If the call is success, an object like this is returned:
```json
{
    "status": "success",
    "data": {
        "name": "ExampleName",
        "salary": "999",
        "age": "30",
        "id": 5639
    },
    "message": "Successfully! Record has been added."
}
```
    Note that the external dummy post api has an access frequency limit. 
    Don't call too many times. 
    If return is 500 Internal server error, please try again later.

### Related JAVA classes
controller/DummyController
model/DummyData

### Additional dependencies
* jackson-core
* jackson-databind
* lombok

## 3. JFY (external HTTP url call)
### Objectives
* Call an external HTTP url and get data.
* Wrap with own GET api.
* Personalize input parameters.
* Practice JSON-POJO conversion.

### Functionalities

## 4. Person (own get and post apis)


---
# Web app tips
### Default localhost url
http://localhost:8080

If it is too slow to run, try to refer to [localhost slow post](https://stackoverflow.com/questions/33289695/inetaddress-getlocalhost-slow-to-run-30-seconds) to check pc localhost settings.
