package com.online.bookreservation;

import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookReservationController {

    @RequestMapping(value = "/reserve/{bname}" , method = RequestMethod.GET)
    public String reserveBook(@PathVariable("bname") String bname){
         return bname+" is Reserved Successfully!!";
    }

}
