package org.example;

import java.io.File;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws LifecycleException, InterruptedException {
        System.out.println( "Hello World!" );
        Tomcat tomcat = new Tomcat();


        //Context context = tomcat.addContext("",null); // default directory //error line
        Context context = tomcat.addContext("", new File(".").getAbsolutePath());
        ///This line adds a context (web application) to the embedded Tomcat.
        //A "context" in Tomcat is like a web application root (like a folder under webapps/).
        //It's the base path for your servlet URLs.

        //"" → means the root context (http://localhost:8080/)


        /*
        null means “no base directory” — which breaks the internal routing in Tomcat.
    new File(".").getAbsolutePath() points to the current working directory,
     and Tomcat needs a valid path to create the web app structure,
     even if you're not using any static content.
         */

        Tomcat.addServlet(context,"HelloServlet",new HelloServlet());//doing the mapping here.
        //adding the servlet above,


        context.addServletMappingDecoded("/hello", "HelloServlet");//Don't confuse the name of servlet with actual servlet
        // The name of Servlet is HelloServlet- can mention anything,




        tomcat.start(); // should not be before the code blocks
        tomcat.getServer().await(); //to keep the tomcat running



    }
}
