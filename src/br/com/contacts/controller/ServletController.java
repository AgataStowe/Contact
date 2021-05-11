package br.com.contacts.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.contacts.interfaces.Logic;


public class ServletController extends HttpServlet{

	private static final long serialVersionUID = -881750205658850130L;

	protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String parametro = request.getParameter("logic");
        String nomeDaClasse = "br.com.contacts.controller." + parametro;

        try {
        	Class<?> classe = Class.forName(nomeDaClasse);
            Logic logic = (Logic) classe.newInstance();
            
            String pagina = logic.execute(request, response);

            request.getRequestDispatcher(pagina).forward(request, response);

        } catch (Exception e) {
            throw new ServletException(
              "A lógica de negócios causou uma exceção", e);
        }
    }

}
