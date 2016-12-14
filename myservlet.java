/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javafx.scene.text.Text;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class myservlet extends HttpServlet {
    

    protected void processRequest(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
   
{
	        
String id =req.getParameter("Empid");

		
String name =req.getParameter("EmpName");

		
int age =Integer.parseInt(req.getParameter("EmpAge"));
		
		
float sal =Float.parseFloat(req.getParameter("EmpSal"));

		
String ph =req.getParameter("EmpPh");

		
String email =req.getParameter("EmpEmail");

String cz =req.getParameter("EmpCitizen");

  PrintWriter out=res.getWriter();

  res.setContentType("Text/html");
  
out.println("Employee ID is:"+id);;
 out.println("<br/>");

out.println("Employee Name is:"+name);
out.println("<br/>");
out.println("Employee Age is:"+age);
 out.println("<br/>");

out.println("Employee sal is:"+sal);
out.println("<br/>");
 
out.println("Employee phone number is:"+ph);
out.println("<br/>");  

out.println("Employee email id is:"+email);
out.println("<br/>"); 

if(age > 30)
{
  sal=sal+3500;
  out.println("Employee sal   after adding amount"+sal);
}

if(!email.contains("niit.com"))
{
 out.println("Not valid Email Id "+email);
}

if(!cz.equals("Indian"))
{
 float fl=sal*(0.90f);
 out.println("Employee Sal after  deducting the tax"+sal);
}

}
}

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        processRequest(req, res);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
