package com.kinath.interwar;

import org.springframework.context.annotation.Configuration;

/**
 * Created by Kinath on 3/15/2017.
 */
@Configuration
public class GroundServiceConfig
{
    private static boolean initialized;

    public GroundServiceConfig()
    {
        if( initialized )
        {
            return;
        }

        initialized = true;

        if( ServiceHandler.getiGroundService() == null )
        {
            ServiceHandler.setiGroundService( new GroundServiceAdapter() );
        }
    }
}
