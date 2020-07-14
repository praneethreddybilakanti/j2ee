

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet3 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	ServletContext ctx=getServletContext();
	String qunty=(String) ctx.getAttribute("qunty");
	
	out.println("quntity is :" +"\t"+ qunty);
	RequestDispatcher rd=request.getRequestDispatcher("login.html");
	rd.include(request, response);
	}

}
