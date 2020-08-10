package org.patsimas.consumer.controllers;

import lombok.extern.slf4j.Slf4j;
import org.patsimas.consumer.repositories.EmployeeRestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RequestMapping(value = "/employees")
@RestController
@Slf4j
public class EmployeeController {

    @Autowired
    private EmployeeRestClient employeeRestClient;

    @GetMapping("/{id}")
    String fetchEmployeeById(@PathVariable String id) {
        log.info("Fetch Employee[id: {}]", id);
        return employeeRestClient.getEmployee(id);
    }
}
