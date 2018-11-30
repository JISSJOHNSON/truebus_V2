<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" import="test.Connect"%>
<%
    String date1 = request.getParameter("opt1");
    String busid = request.getParameter("opt2");
    String BusName = "";
    String BusRoute = "";
    int MaxSeats = 0;
    
    Connect makeConnect = new Connect();
    Connection con = makeConnect.makeConnection();
    ResultSet rs,rs1;
    Statement st, st2;
    st = con.createStatement();
    st2 = con.createStatement();

    rs = st.executeQuery("SELECT * FROM bus WHERE Id = '"+busid+"'");
    if(rs.next()){
        BusName = rs.getString(2);
        BusRoute = rs.getString(5);
        MaxSeats = rs.getInt(3);
    }
    else{
    }
    rs1 = st2.executeQuery("SELECT COUNT(*) FROM booking WHERE Date = '"+date1+"' and Bname = '"+BusName+"' and BRoute = '"+BusRoute+"' and Status = 1");
    if(rs1.next()){
        int BookedSeats = rs1.getInt(1);
        int TotalSeats = MaxSeats-BookedSeats;
        out.println(TotalSeats);
        
        System.out.println("Bus = "+rs.getString(2));
        System.out.println("Route = "+rs.getString(5));
        System.out.println("MaxSeats = "+rs.getString(3));
        System.out.println("BookedSeats = "+rs1.getInt(1));
        System.out.println("Available Seats = "+TotalSeats);
        
    }
%>