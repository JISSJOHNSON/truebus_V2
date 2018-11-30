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
    tr:hover {background-color: #f2f3ff;}
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
        <div class="addbus" style="max-height:500px;overflow-y:auto;">
            <table >
                <thead>
                        <td>Name</td>
                        <td>Seats</td>
                        <td>Price</td>
                        <td>Route</td>
                        <td>Type</td>
                        <td>Travel Date</td>
                </thead>
                <tbody>
                    <%
                        while(rs.next()){
                            MaxSeats = rs.getInt(3);
                            System.out.println("MaxSeats of "+rs.getString(2)+" = "+MaxSeats);
                          %><tr id="<%= rs.getString(1)%>">
                              <td><%= rs.getString(2)%></td>
                              <td id="<%= rs.getString(1)%>seats"><%= rs.getString(3)%></td>
                              <td><%= rs.getString(4)%></td>
                              <td><%= rs.getString(5)%></td>
                              <td><%= rs.getString(6)%></td>
                              <td>
                                  <form action="BookBus" method="POST">
                                    <%HttpSession mysession = request.getSession();%>
                                    <input type="text" name="uid" value="<%= mysession.getAttribute("userid")%>" hidden="true">
                                    <input type="text" id="<%= rs.getString(1)%>date" onchange="seatResult(<%= rs.getString(1)%>)" class="ui-datepicker-calendar" name="Tdate"  placeholder="yyyy-mm-dd" autocomplete="off" required>
                                    <button value="<%= rs.getString(1)%>" name="bid">Book</button>
                                  </form>
                              </td>
                            </tr>
                      <%}%>
                </tbody>
            </table>
                <div id="testdiv">--</div>
        </div>
                
    </div>
</div>
<script>
    function seatResult(busid){
        var opt1 = document.getElementById(busid+"date").value;
        
        var xhttp;
        xhttp = new XMLHttpRequest();
        xhttp.onreadystatechange = function(){
            if (this.readyState == 4 && this.status == 200)
                document.getElementById(busid+"seats").innerHTML = this.responseText;
        }
        xhttp.open("GET", "./user/dateres.jsp?opt1="+opt1+"&opt2="+busid, true);
        xhttp.send();
    };

    $(function(){$("input[name=Tdate]").datepicker({ minDate: 0, dateFormat: "yy-mm-dd"});});
    
</script>