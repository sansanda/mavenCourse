package pe.com.devcode.controller;

import java.io.IOException;
import java.util.List;

import javax.jws.WebService;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pe.com.devcode.servicio.ArticuloService;
import pe.com.devcode.models.Articulo;


@WebServlet("/articuloController")
public class ArticulosController extends HttpServlet{

	private static final long serialVersionUID = 1L;

	public ArticulosController() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action");
		System.out.println(action);
		switch(action) {
			case "index":
				index(request,response);
				break;
			case "mostrar":
				mostrar(request,response);
				break;
			default:
				break;
			
		}
	}

	private void mostrar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/vista/todos.jsp");
		List<Articulo> listaArticulos = new ArticuloService().listarArticulos();
		request.setAttribute("listaArticulos", listaArticulos);
		dispatcher.forward(request, response);
		
	}

	private void index(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request,response);
	}
	
	
}
