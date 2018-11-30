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
    ResultSet rs ,rs2;
    Statement st ,st2;
    Connect makeConnect = new Connect();
    Connection con = makeConnect.makeConnection();
    int MaxSeats;
    st = con.createStatement();
    st2 = con.createStatement();
    rs = st.executeQuery("SELECT * FROM bus");
    rs2 = st2.executeQuery("SELECT COUNT(*) as nos FROM booking where Status = 1");
    if(rs2.next()){
        System.out.println("Date Status=1 = "+rs2.getInt(1));
    }
%>

<div class="row">
    <div class="col-sm-12">
        <div class="addbus">
            <table>
                <thead>
                        <td>Name</td>
                        <td>Seats Available</td>
                        <td>Price</td>
                        <td>Route</td>
                        <td>Type</td>
                </thead>
                <tbody>
                    <%
                        while(rs.next()){
                            MaxSeats = rs.getInt(3);
                            System.out.println("MaxSeats of "+rs.getString(2)+" = "+MaxSeats);
                            %><tr id="<%= rs.getString(1)%>">
                              <td><%= rs.getString(2)%></td>
                              <td id="seats"><%= rs.getString(3)%></td>
                              <td><%= rs.getString(4)%></td>
                              <td><%= rs.getString(5)%></td>
                              <td>
                                  <%// String type = resultset.getString(6);
                                    // Statement st2 = con.createStatement();
                                    // ResultSet resultset2 = st2.executeQuery("SELECT * FROM businfo where BTId = '"+type+"'");
                                  %>
                                  <%= rs.getString(6)%>
                              </td>
                            </tr><%
                        }
                    %>
                </tbody>
            </table>
        </div>
    </div>
</div>