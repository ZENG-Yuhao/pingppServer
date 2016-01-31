package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PageJump
 */
@WebServlet("/PageJump")
public class PageJump extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String target = request.getParameter("btn");
		target = "/"+target;
		String content = "This message comes from servlet " + target;
		request.setAttribute("content", content);
		request.getRequestDispatcher(target).forward(request, response);
		
	} //end service
}
