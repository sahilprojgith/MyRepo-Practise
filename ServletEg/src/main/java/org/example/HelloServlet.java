package org.example;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class HelloServlet extends HttpServlet {

    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException { // a method which gets executed whenever you send a request.
        System.out.println("In Service");

        //response.getWriter().println("Hello Sahil"); // another option below
        PrintWriter printWriter = response.getWriter();
        printWriter.println("Hello Buddy");
    }


}
