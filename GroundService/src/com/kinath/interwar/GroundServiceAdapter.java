package com.kinath.interwar;

import org.springframework.context.annotation.Configuration;

/**
 * Created by Kinath on 3/15/2017.
 */
@Configuration
public class GroundServiceAdapter implements IGroundService
{
    public String getMessage()
    {
        return GroundService.getInstance().getMessage();
    }
}
