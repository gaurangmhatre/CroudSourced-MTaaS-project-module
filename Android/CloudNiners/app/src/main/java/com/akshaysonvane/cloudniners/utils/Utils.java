package com.akshaysonvane.cloudniners.utils;

/**
 * Created by Akshay on 05/08/2017.
 */

public class Utils
{
    private static Utils utils = null;
    public String base_url = "http://ec2-107-23-226-13.compute-1.amazonaws.com:3000/login.html";

    public static Utils getInstance()
    {
        if (utils == null)
        {
            utils = new Utils();
        }

        return utils;
    }
}
