package com.wenqi.bootwebdemo.controller;

import com.wenqi.bootwebdemo.model.DummyDTO;
import com.wenqi.bootwebdemo.model.DummyResponse;
import com.wenqi.bootwebdemo.service.DummyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DummyController {
    @Autowired
    DummyService dummyService;

    @PostMapping(value="/dummy")
    private String createDummy(){
//        WebClient client = WebClient.create("https://dummy.restapiexample.com/api/v1");
//        WebClient.UriSpec<WebClient.RequestBodySpec> uriSpec = client.post();
//        WebClient.RequestBodySpec bodySpec = uriSpec.uri(URI.create("/create"));

        // {"name":"greatCarrot","salary":"1234","age":"22"}
//        String inputJsonStr = "{\"name\":\"greatCarrot\",\"salary\":\"1234\",\"age\":\"22\"}";
        String resourceUrl = "https://dummy.restapiexample.com/api/v1/create";
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<DummyDTO> request = new HttpEntity<>(new DummyDTO("Carol","13579","400"));
        ResponseEntity<DummyResponse> response = restTemplate
                .exchange(resourceUrl, HttpMethod.POST, request, DummyResponse.class);

        DummyResponse dummyResponse = response.getBody();
        return dummyResponse.toString();

//        WebClient.RequestHeadersSpec<?> headersSpec = bodySpec.bodyValue(inputJsonStr);
//        WebClient.ResponseSpec responseSpec = headersSpec.header(
//                        HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
//                .accept(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML)
//                .acceptCharset(StandardCharsets.UTF_8)
//                .ifNoneMatch("*")
//                .ifModifiedSince(ZonedDateTime.now())
//                .retrieve();
//        Mono<String> responseMono = headersSpec.exchangeToMono(response -> {
//            if (response.statusCode().equals(HttpStatus.OK)) {
//                return response.bodyToMono(String.class);
//            } else if (response.statusCode().is4xxClientError()) {
//                return Mono.just("Error response");
//            } else {
//                return response.createException()
//                        .flatMap(Mono::error);
//            }
//        });
//        return "Dummy post api called. Response: ";
    }
}
