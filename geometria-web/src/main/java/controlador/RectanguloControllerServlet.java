package controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.Rectangulo;

import java.io.IOException;

/**
 * Servlet implementation class RectanguloControllerServlet
 */
public class RectanguloControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RectanguloControllerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
				String operacion	= request.getParameter("operacion");
				String baseStr	= request.getParameter("base");
				String alturaStr = request.getParameter("altura");
				
				
				int base = Integer.parseInt(baseStr);
				int altura = Integer.parseInt(alturaStr);
				
				
				Rectangulo rectangulo = new Rectangulo(base, altura);
				if(operacion.equalsIgnoreCase("area")) {
					int area = rectangulo.calcularArea();
					request.setAttribute("resultado", area);
					request.setAttribute("operacion", "área");
				}else {
					int perimetro = rectangulo.calcularPerimetro();
					request.setAttribute("resultado", perimetro);
					request.setAttribute("operacion", "perímetro");
				}
							
				
				String JSP = "/WEB-INF/jsp/view/rectangulo.jsp";
				
				request.getRequestDispatcher(JSP).forward(request, response);
				
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
