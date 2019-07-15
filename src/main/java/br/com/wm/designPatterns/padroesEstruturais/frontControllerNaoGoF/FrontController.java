package br.com.wm.designPatterns.padroesEstruturais.frontControllerNaoGoF;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;

//executar a seguinte requisição de teste exemplo no browser
//http://localhost:8080/design-patterns/br/com/wm/design-patterns/padroesEstruturais/frontControllerNaoGoF/Teste/teste.k19

@WebServlet("*.k19")
public class FrontController extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        String[] split = req.getRequestURI().split("/");

        String controllerName = split[8]; //2
        String actionName = split[9].split("\\.")[0]; //3

        System.out.println(controllerName);
        System.out.println(actionName);

        try {
            //controllers.
            Class<?> controllerClass = Class.forName("br.com.wm.designPatterns.padroesEstruturais.frontControllerNaoGoF."
                    + controllerName);
            Method method = controllerClass.getDeclaredMethod(actionName);

            Object controller = controllerClass.newInstance();
            method.invoke(controller);

            RequestDispatcher dispatcher = req.getRequestDispatcher("/"
                    + controllerName.toLowerCase() + "/" + actionName + ".jsp");

            dispatcher.forward(req, res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
