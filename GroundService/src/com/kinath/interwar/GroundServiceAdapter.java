package com.kinath.interwar;

import java.lang.reflect.Method;

/**
 * Created by Kinath on 3/15/2017.
 */
public class GroundServiceAdapter implements IGroundService
{
    public String getMessage()
    {
        return GroundService.getInstance().getMessage();
    }
}
