<%@page import="java.sql.*" import="test.Connect"%>

<style>
    .addbus{
        height: 100%;
        max-width: 800px;
        margin: auto;
    }
    table {
        width: 100%;
    }
    thead {
        height: 50px;
        text-align: center;
        font-weight: bold;
        vertical-align: middle;
    }
    tbody{
        height: 40px;
        text-align: center;
        vertical-align: middle;
    }
    thead td{
        background: #101010;
        color: white;
    }
    tr{
        height: 40px;
    }
    td{
        /*width: 100px;*/
    }
    tr:hover {background-color: #f2f3ff;}
    /*tr:nth-child(even) {background-color: #f5f5f5;}*/
</style>

<%
    Connect makeConnect = new Connect();
    Connection con = makeConnect.makeConnection();
    Statement st;
    ResultSet rs;
    st = con.createStatement();
    rs = st.executeQuery("SELECT * FROM booking");
%>

<div class="row">
    <div class="col-sm-12">
        <div class="addbus" style="max-height:500px;overflow-y:auto;">
            <table>
                <thead>
                    <td>User</td>
                    <td>Bus</td>
                    <td>Route</td>
                    <td>Bus Type</td>
                    <td>Booked On</td>
                    <td>Price</td>
                    <td>Status</td>
                </thead>
                <tbody>
                
                    <%
                        while(rs.next()){
                          %><tr>
                              <td><%= rs.getString(2)%></td>
                              <td><%= rs.getString(3)%></td>
                              <td><%= rs.getString(4)%></td>
                              <td><%= rs.getString(5)%></td>
                              <td><%= rs.getString(6)%></td>
                              <td><%= rs.getString(7)%></td>
                              <td>
                                  <%
                                      int Flag = rs.getInt(8);
                                      String Bcolor = "color:green";
                                      String Ccolor = "color:red";
                                      if(Flag == 1){
                                          out.println("<span style="+Bcolor+">Booked</span>");
                                      }
                                      else{
                                          out.println("<span style="+Ccolor+">cancelled</span>");
                                      }
                                  %>
                              </td>
                            </tr><%
                        }
                    %>
                </tbody>
            </table>
        </div>
    </div>
</div>