/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.servlet;

import com.cice.negocio.Calculadora;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author NYL
 */
public class Calculos extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        //aquí recibo las peticiones
        String  operacion = req.getParameter("operacion");
        String numero1 = req.getParameter("numero1");
        String numero2 = req.getParameter("numero2");
        
       
        
        //Compruebo que realmente son números
        try {
            int num1 = Integer.parseInt(numero1);
            int num2 = Integer.parseInt(numero2);
            int resultado = Calculadora.calcular(num1, num2, operacion);
            resp.sendRedirect("Resultado.jsp?resultado="+resultado);
        } catch (NumberFormatException e) {
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST);
        }
            
        
            
    }

    
}
