package com.sdatesthomework3.controller;

import com.sdatesthomework3.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author StanislavR
 */
@Controller
public class ReservationController {

    private final ReservationService service;

    public ReservationController(ReservationService service) {
        this.service = service;
    }

    @RequestMapping(value = "/success")
    public @ResponseBody String reserved() {
        return service.reserve();
    }
}
