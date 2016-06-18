package juicynet.servlets;

import juicynet.utils.ConnectionsPool;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

//@WebServlet("/simple")
public class SimpleList extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text / html;charset=UTF-8");
        PrintWriter pw = resp.getWriter();
        try {
            CharSequence s = ConnectionsPool.getInstance().getTestDates();
            //CharSequence s = ConnectionsPoolWithAnnotation.getTestDatesWithAnnot();
            /*for (Iterator it = l.iterator(); it.hasNext();) {
                Group gr = (Group) it.next();
                pw.println("<tr>");
               *//* pw.println("<td>" + gr.getGroupId() + "</td>");
                pw.println("<td>" + gr.getNameGroup() + "</td>");
                pw.println("<td>" + gr.getCurator() + "</td>");
                pw.println("<td>" + gr.getSpeciality() + "</td>");*//*
                pw.println("</tr >");
            }*/
            pw.println(s);
        } catch (SQLException e) {
            throw new ServletException(e);
        }

    }
}
