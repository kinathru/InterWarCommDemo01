package com.kinath.interwar;

/**
 * Created by Kinath on 3/15/2017.
 */
public class GroundServiceConfig
{
    public GroundServiceConfig()
    {
        if( ServiceHandler.getiGroundService() == null )
        {
            ServiceHandler.setiGroundService( new GroundServiceAdapter() );
        }
    }
}
