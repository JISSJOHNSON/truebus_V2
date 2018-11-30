<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.text.SimpleDateFormat" %>
<%
    HttpSession mysession = request.getSession(false);
    
    java.util.Date date = new java.util.Date();
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-YYYY | hh:mm:ss a");
    String dt = formatter.format(date);
    
    Cookie[] list = request.getCookies();
    boolean flag = false;
    
    Cookie temp;
    if(list != null){
        for(int i = 0; i < list.length;i++){
            if(list[i].getName().equals("lastdate")){
                temp = list[i];
                mysession.setAttribute("lastdate1", temp.getValue());
                flag = true;
                break;
                
            }
        }
        
        if(flag){
//            mysession.setAttribute("lastdate1", temp.getValue());
        }else{
            mysession.setAttribute("lastdate1", "First Login");
        }
    }
    
    
//    Create a new cookie to Store the Current Login and Username;
    Cookie user = new Cookie("Username", mysession.getAttribute("email").toString());
    Cookie lastlogin = new Cookie("lastdate", dt);
    lastlogin.setMaxAge(60*60*24);
    user.setMaxAge(60*60*24);
    
    response.addCookie(lastlogin);
    response.addCookie(user);
//    Move the Old Cookie to Session.
    mysession.setAttribute("lastdate", dt);
    
//    Delete the Old Cookie which has been stored into session
    lastlogin.setMaxAge(0);
    user.setMaxAge(0);
    
    
    
    if(mysession != null){
        if(mysession.getAttribute("name") != null && mysession.getAttribute("usertype") != null){
            if(mysession.getAttribute("usertype").toString().equals("1")){
                response.sendRedirect("./dash.jsp");
            }
            else if(mysession.getAttribute("usertype").toString().equals("2")){
                response.sendRedirect("./home.jsp");
            }
            else{
                response.sendRedirect("./usertype.jsp");
            }
        }
        else{
            System.out.println("Session Fail");
        }
    }
    else{
        response.sendRedirect("./index.jsp");
    }
%>
