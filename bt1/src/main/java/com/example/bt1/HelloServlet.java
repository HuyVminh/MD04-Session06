package com.example.bt1;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "ProductDiscountCalculator", value = "/display-discount")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String description = req.getParameter("description");
        float price = Float.parseFloat(req.getParameter("price"));
        int percent = Integer.parseInt(req.getParameter("percent"));

        float discount_amount = (float) (price * percent * 0.01);

        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<h1>Product Description: " + description + "</h1>");
        writer.println("<h1>List Price: " + price + "</h1>");
        writer.println("<h1>Discount Percent: " + percent + "</h1>");
        writer.println("<h1>Discount Amount: " + discount_amount + "</h1>");
        writer.println("<h1>Discount Price: " + (price-discount_amount) + "</h1>");
        writer.println("</html>");
    }
}