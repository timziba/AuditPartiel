package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ensup.master.serviceImpl.StudentService;

/**
 * Servlet implementation class EtudiantServlet
 */
//@WebServlet("/Etudiant")
public class EtudiantServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StudentService studentService;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EtudiantServlet() {
		studentService = new StudentService();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	String action = request.getServletPath();
//	switch (action) {
//	case "/delete":
//		delete(request, response);
//		break;
//	case "/update":
//		modify(request, response);
//		break;
//	default:
//		list(request, response);
//		break;
//	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}
	
//	protected void select(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		int id = Integer.parseInt(request.getParameter("id"));
//		Student etudiant = studentService.selectEtudiantById(id);
//		RequestDispatcher dispatcher = request.getRequestDispatcher("etudiantAjout.jsp");
//		request.setAttribute("etudiant", etudiant);
//		dispatcher.forward(request, response);
//	}
//
//	protected void delete(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		
//		int id = Integer.parseInt(request.getParameter("id"));
//		studentService.deleteEtudiant(id);
//		response.sendRedirect("/list");
//	}
//
//	protected void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//	
//		List<Student> listEtudiant = studentService.lireEtudiant();
//		RequestDispatcher dispatcher = request.getRequestDispatcher("etudiant.jsp");
//		request.setAttribute("listEtudiant", listEtudiant);
//		dispatcher.forward(request, response);
//	}
//
//	protected void modify(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		select(request, response);
//	}
}
