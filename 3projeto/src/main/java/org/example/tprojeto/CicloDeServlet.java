package org.example.tprojeto;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ciclo-de-vida")

public class CicloDeServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        //instaciar alguns recursos
        //e invocada apenas uma vez

        System.out.println("invocou o metodo init");
    }

    @Override
    public void service (HttpServletRequest req, HttpServletResponse res) throws ServletException{


        System.out.println("invocou o metodo Service vezes");

    }

    @Override
    public void destroy(){
        //Serve para fechar
        System.out.println("invocou o metodo destroy vezes");
    }

}
