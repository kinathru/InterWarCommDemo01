package com.kinath.interwar;

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
