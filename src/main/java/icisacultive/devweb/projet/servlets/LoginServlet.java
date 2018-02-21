package icisacultive.devweb.projet.servlets;

import icisacultive.devweb.projet.managers.UtilisateurLibrary;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends GenericServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        WebContext context = new WebContext(req, resp, req.getServletContext());

        TemplateEngine templateEngine = createTemplateEngine(req.getServletContext());
        templateEngine.process("login", context, resp.getWriter());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String identifiant = request.getParameter("inputEmail1");
        String motDePasse = request.getParameter("inputPassword1");
        try{
            if (UtilisateurLibrary.getInstance().validerMotDePasse(identifiant, motDePasse)) {
                request.getSession().setAttribute("utilisateur", UtilisateurLibrary.getInstance().getUtilisateur(identifiant));
            }
        }
        catch (IllegalArgumentException e) {

        }
        response.sendRedirect("accueil");
    }
}

