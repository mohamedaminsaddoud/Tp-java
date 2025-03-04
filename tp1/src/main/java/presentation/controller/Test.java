package presentation.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.app.DAO.gestionProduitDAO;
import com.app.metier.Produit;

@WebServlet("/Test")
public class Test extends HttpServlet{
    public void service(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        new gestionProduitDAO().supprimerProduit(1);
        ArrayList<Produit> produits= new gestionProduitDAO().getProduits();
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet hello_servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>bonjour RT</h1>");


        for (int i=0; i<=produits.size(); i++) {

            out.println("<p>"+ produits.get(i).getName()+"</p>");}
        out.println("</body>");
        out.println("</html>");




    }
}

