# spring-webapp-assignment
## Task list
1. Build a <mark>springboot</mark>  maven application…
2. Application should compile and build using <mark>maven</mark>  command…
3. Application can start locally…
4. Application contains 3 tiers (<mark>controller, service and repository</mark>)…
5. Use <mark>annotation</mark> based spring bean approach…
6. Change application behavior through <mark>application.properties configurations</mark>…

7. Install MySQL locally and setup a <mark>local DB</mark>…
8. Connect spring application to DB and perform basic <mark>CRUD</mark> operations

---
# 5 modules:
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
* Property injection to change app behavior.

### Functionalities
* Recognize localhost directories "/" and "/name".
* Pass a name via typing `/name?name=YOURNAME` and you will be welcomed.
* Change `reverse-name` to true in "application.properties" file to see the reversed version of your name. Otherwise, the name will be displayed normally.
  
```java
@Value("${reverse-name:true}")
boolean reverseFlag;
```

### Related JAVA classes
controller/HomeController  
service/NameService

### Additional dependencies
* jsp support(tomcat-jasper)

## 2. Dummy module (external post api call)
### Objectives
* Call an external post api, and wrap with own api.
* JSON familiarization.
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
Used the following to get the response:
```java
restTemplate.postForEntity()
```
### Related JAVA classes
controller/DummyController  
model/DummyData

### Additional dependencies
* jackson-core
* jackson-databind
* lombok

## 3. JFY module (external HTTP url call)
### Objectives
* Call an external HTTP url and get data.
* Wrap with own GET api.
* Personalize input parameters.
* Practice JSON-POJO conversion.
* Try JSON ObjectMapper.
* Familiarize Controller-Service-Repository 3 layer design.
* Use JDBCTemplate to interact with database.

### Functionalities
* Get call (via "/jfy")by parameters. 
The table below is a set of sample values for the params

| appid | scene | user_id | pageSize |
|-------|-------|---------|----------|
| 31576 | 21201 | 7263422 | 36       |
* API returns a list of Item objects (can view as JSON format). 
Here is an example item
```json
{
        "itemId": 385164519,
        "title": "Primera Light Brandy 750ml",
        "price": 111.0,
        "sold": 11,
        "stock": 0,
        "url": "some.url.com",
        "shopId": 448106
}
```
* Note: Access db by localhost:8080/h2-console, see related properties in application.properties. 
This call will insert the items into Item table.

### Related JAVA classes
controller/JFYController  
service/JFYService  
dao/JFYRepo  
model/Item  
(additional)util/JsonUtility
(additional)model/Response  
(additional)model/Result  
(additional)model/ExtendedItemInfo

### Additional dependencies
* h2
* jpa
* unirest
* jsonschema2pojo

## 4. Person module(own get and post apis)
### Objectives
* Create own GET api and POST api
* Try to handle exceptions
* JUnit tests experiments

### Functionalities
* "/persons" (method: GET) returns all persons
* "/person/{id}" (method: GET) returns the specific person's greeting.
Note that when server starts 9 persons are created beforehand, available ids are 1-9. 
Other ids would invoke PersonNotFoundException.
* "/person/add" (method: POST) requires a request body in JSON like the example below:
```json
{
  "aid": 11,
  "aname": "Spaghetti",
  "lang": "Italian"
}
```
    A successfully added response will look like this:

```json
{
  "status": "success",
  "person": {
    "aid": 11,
    "aname": "Spaghetti",
    "lang": "Italian"
  },
  "greeting": "Ciao! sono Spaghetti."
}
```

### Related JAVA classes
controller/PersonController  
service/PersonService  
dao/PersonRepo  
model/Creature  
model/Person  
model/PersonResponseDTO  
configuration/PersonDbConfiguration (unused)  
exception/PersonNotFoundException  

### Additional dependencies
none

## 5. MultiThreadCall module(explore on multi threading)
### Objectives
* Open concurrent threads and make api call
* Create a list of response objects

### Functionalities
* ("/multi") calls JFY in 3 concurrent threads (thread_cnt property won't work though)

| appid | scene | user_id | pageSize | thread_cnt |
|-------|-------|---------|----------|------------|
| 31576 | 21201 | 7263422 | 36       | 3          |
* returns the list of 3 responses in json

### Related JAVA classes
controller/MultiThreadCallController
model/MultiThreadCallRequest
model/MultiResponseDTO  
model/MultiResult  
model/MultiExtendedItemInfo

### Additional dependencies
* java.util.concurrent.CompletableFuture
* ObjectMapper(in json databind)

---
# Web app tips
### Default localhost url
http://localhost:8080

If it is too slow to run, try to refer to [localhost slow post](https://stackoverflow.com/questions/33289695/inetaddress-getlocalhost-slow-to-run-30-seconds) to check pc localhost settings.

### About logging
Log file is in logs/ folder

### Feedback
cache, async  
hsf  
database IO no for loop  
reduce IO operations