package icisacultive.devweb.projet.servlets;

import icisacultive.devweb.projet.entities.Panier;
import icisacultive.devweb.projet.managers.PanierLibrary;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/accueil")
public class AccueilServlet extends GenericServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        WebContext context = new WebContext(req, resp, req.getServletContext());

        List<Panier> listPanier = PanierLibrary.getInstance().listPanier();
        context.setVariable("listPanier", listPanier);

        TemplateEngine templateEngine = createTemplateEngine(req.getServletContext());
        templateEngine.process("index", context, resp.getWriter());
    }
}

