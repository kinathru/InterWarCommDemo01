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
@RequestMapping("/frontservice")
public class FronRestController
{
    @RequestMapping(value = "/frontmessage",method = RequestMethod.GET)
    public String getFrontMessage()
    {
        return ServiceHandler.getiGroundService().getMessage();
    }
}
