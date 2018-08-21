package servletPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserForm
 */
@WebServlet("/UserForm")
public class UserForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserForm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head></head>");         
        out.println("<body>");
        out.println("Full Name:");
        String fullname=request.getParameter("fullname");
        out.println(fullname);
        out.println("<br>");
        out.println("Address:");
        String address=request.getParameter("address");
        out.println(address);
        out.println("<br>");
        out.println("Age:");
        String age=request.getParameter("age");
        out.println(age);
        out.println("<br>");
        out.println("Email:");
        String email=request.getParameter("email");
        out.println(email);
        out.println("</body>");
        out.println("</html>");  
	}
}