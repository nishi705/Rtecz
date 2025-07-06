package com.Rtecz.api.controller;


import com.Rtecz.domain.model.Vehicle;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Service
@RequestMapping("/api")
public class VehicleUpdateResource {


    @PostMapping("/vehicleupdate")
    public void saveInDB(@RequestBody Vehicle vehicle){
        System.out.println(vehicle);

    }
}
