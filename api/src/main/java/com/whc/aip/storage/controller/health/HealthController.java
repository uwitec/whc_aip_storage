package com.whc.aip.storage.controller.health;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Copyright© 2013-2017 AutoChina International Ltd. All rights reserved.</p>
 */
@RestController
@RequestMapping("/Controller")
public class HealthController {

    private static final Logger logger= LoggerFactory.getLogger(HealthController.class);

    @RequestMapping("/health")
    public String heath(){
        logger.info("--------health check-------");
        return "Ok!";
    }
}
