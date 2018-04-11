package icisacultive.devweb.projet.servlets;

import icisacultive.devweb.projet.managers.SeanceDistributionLibrary;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/ajouterSeance")
public class AjouterSeanceDistribServlet extends GenericServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        WebContext context = new WebContext(req, resp, req.getServletContext());

        TemplateEngine templateEngine = createTemplateEngine(req.getServletContext());
        templateEngine.process("ajoutSeanceDistrib", context, resp.getWriter());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String date =  req.getParameter("dateSeance");
        System.out.println("Date avant le parse: "+date);
        SeanceDistributionLibrary.getInstance().ajouterSeance(date);

        resp.sendRedirect("gestionAdmin");
    }
}
