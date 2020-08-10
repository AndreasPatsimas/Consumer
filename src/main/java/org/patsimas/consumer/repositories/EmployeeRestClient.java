package org.patsimas.consumer.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class EmployeeRestClient {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${employee.service.json.uri}")
    private String employeeServiceUri;

    public String getEmployee(String id) {
        String url = employeeServiceUri;
        return restTemplate.getForObject(url, String.class, id);
    }
}
