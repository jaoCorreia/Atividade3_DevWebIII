package org.example.tprojeto;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/redirecionar")


public class ColetandoDadosServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String texto = req.getParameter("campo_texto");

        RequestDispatcher dispatcher = req.getRequestDispatcher("/index.jsp");

        dispatcher.forward(req, resp);

        texto = resp.toString();

        System.out.println(texto);

        resp.sendRedirect("http://localhost:8080/tprojeto_war_exploded/");
    }
}
