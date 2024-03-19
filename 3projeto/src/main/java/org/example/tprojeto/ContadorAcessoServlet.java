package org.example.tprojeto;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/contador")
public class ContadorAcessoServlet extends HttpServlet {
    Integer contador;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException{
        contador++;
        System.out.println(contador+"acessos");
    }
}
