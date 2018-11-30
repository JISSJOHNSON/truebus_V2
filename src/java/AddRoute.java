import test.Connect;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/AddRoute"})
public class AddRoute extends HttpServlet {
    
    Connect makeConnect = new Connect();
    Connection con ;
    PreparedStatement pst;
    ResultSet rs;
    Statement st;
    String routename;
    boolean b;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        con = makeConnect.makeConnection();
//        String rname = request.getParameter("rname");
        String source = request.getParameter("source");
        String destination = request.getParameter("destination");
        String source1 = source.substring(0, 5);
        String destination1 = destination.substring(0, 5);
        routename = source1+"_"+destination1;

        if(!routename.equals(0)){
            try {
                b = insertData(routename,source,destination);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            if(b){
                out.println("registered");
                response.sendRedirect("./dash.jsp");
            }
            else{
                out.println("Something wrong");
            }
        }
        else{
            out.println("dont match");
        }
    }
    boolean validate(String rname){
        String qry = "select * from busroute where  Route_Name ='"+routename+"'";

          try {
            st=con.createStatement();
            rs=st.executeQuery(qry);
            if(rs.next()){
                return true;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
    boolean insertData(String routename,String source,String destination) throws SQLException{
        boolean b;
        if(!validate(routename)){
           String sql = "insert into busroute values(NULL,?,?,?)";
           pst = con.prepareStatement(sql);
           pst.setString(1, routename);
           pst.setString(2, source);
           pst.setString(3, destination);
           
           int val = pst.executeUpdate();
           if(val == 1){b = true;}
           else{b =  false;}
        }
        else{
            b= false;
        }
        return b;
    }
}