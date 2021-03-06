package exercicio3;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex3")
public class Servlet3 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Nome n1 = new Nome();
		n1.primeiroNome = "Edson";
		n1.ultimoNome = "Angoti Jr";

		Nome n2 = new Nome();
		n2.primeiroNome = "Anna";
		n2.ultimoNome = "Godoy";

		Nome n3 = new Nome();
		n3.primeiroNome = "Arnaldo";
		n3.ultimoNome = "Antunes";

		ArrayList<Nome> lista = new ArrayList<Nome>();

		lista.add(n1);
		lista.add(n2);
		lista.add(n3);

		request.setAttribute("x", lista);
		RequestDispatcher despacho = getServletContext().getRequestDispatcher("/ex3.jsp");
		despacho.forward(request, response);
	}

}
