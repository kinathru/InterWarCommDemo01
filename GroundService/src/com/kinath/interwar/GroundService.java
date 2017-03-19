package com.kinath.interwar;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Kinath on 3/15/2017.
 */
@CrossOrigin
@RestController
@RequestMapping("/groundservice")
public class GroundService
{
    private static GroundService instance;

    public static GroundService getInstance()
    {
        if( instance == null )
        {
            instance = new GroundService();
        }
        return instance;
    }

    @RequestMapping(value = "/message", method = RequestMethod.GET)
    public String getMessage()
    {
        return "Message from Ground Service";
    }
}
