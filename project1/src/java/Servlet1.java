/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lacs.lab
 */
public class Servlet1 extends HttpServlet {

    public int hitcount;
    public void init()
    {
        hitcount = 0;
    }
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        hitcount++;
        PrintWriter out = response.getWriter();
        out.println("<html>\n"+"<head><title>Hit Counter</title></head>\n"+"<body>\n"+
                "<h1 align=center>Total number of hits"+"</h1><h3 align=center>"+hitcount+"</h3></body>"+
                "</html>");
    }

    
}
