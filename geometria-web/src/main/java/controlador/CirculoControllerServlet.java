package controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import modelo.Circulo;


/**
 * Servlet implementation class CirculoControllerServlet
 */
public class CirculoControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CirculoControllerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			
				
				String operacion	= request.getParameter("operacion");
				String diametroStr	= request.getParameter("diametro");
			
				double diametro = Double.parseDouble(diametroStr);
						

				Circulo circulo = new Circulo(diametro);
				if(operacion.equalsIgnoreCase("area")) {
					double area = circulo.calcularArea();
					request.setAttribute("resultado", area);
					request.setAttribute("operacion", "área");
				}else {
					double perimetro = circulo.calcularPerimetro();
					request.setAttribute("resultado", perimetro);
					request.setAttribute("operacion", "perímetro");
				}
							
				
				String JSP = "/WEB-INF/jsp/view/circulo.jsp";
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
