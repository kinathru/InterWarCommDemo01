package com.kinath.interwar;

/**
 * Created by Kinath on 3/15/2017.
 */
public class ServiceHandler
{
    private static IGroundService iGroundService;

    public static IGroundService getiGroundService()
    {
        return iGroundService;
    }

    public static void setiGroundService( IGroundService groundService )
    {
        iGroundService = groundService;
    }
}
