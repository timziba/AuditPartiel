package servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ensup.master.daoImpl.IStudentDao2;
import com.ensup.master.daoImpl.StudentDao2;
import com.ensup.master.metier.Student;
import com.ensup.master.serviceImpl.CourseService;
import com.ensup.master.serviceImpl.IStudentService;
import com.ensup.master.serviceImpl.StudentService;

/**
 * Servlet implementation class EditerEtudiantServlet
 */
public class EditerEtudiantServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IStudentDao2 studentdao = new StudentDao2();
	private IStudentService studentService;
	private RequestDispatcher dispatcher = null;

	/**
	 * Default constructor.
	 */
	public EditerEtudiantServlet() {
		studentService = new StudentService(studentdao);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		methode(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void methode(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		String object = request.getParameter("id");
		int id = Integer.valueOf(object);
				
		Student student = studentService.getStudent(id);

		dispatcher = request.getRequestDispatcher("etudiantModif.jsp");

		session.setAttribute("student", student);
		
		dispatcher.forward(request, response);
	}

	
}
