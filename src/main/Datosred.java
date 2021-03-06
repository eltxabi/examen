package main;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Datosred
 */
@WebServlet("/")
public class Datosred extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Datosred() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		RequestDispatcher despachador = null;
		/*
		 HashMap<String, String> datos = new HashMap<String, String>();
		 
		 InetAddress ip;
		 ip = InetAddress.getLocalHost();
		 Calendar c = Calendar.getInstance();
		 TimeZone tz = c.getTimeZone();
		 Date date = new Date();
		 	
		 datos.put("HostName", ip.getHostName());
		 datos.put("HostAddress", ip.getHostAddress());
		 datos.put("OS Name", System.getProperty("os.name").toLowerCase());
		 datos.put("OS Arch", System.getProperty("os.arch").toLowerCase());
		 datos.put("OS Version", System.getProperty("os.version").toLowerCase());
		 datos.put("Date", date.toString());
		 datos.put("TimeZone", tz.getDisplayName());
		 datos.put("User Name", System.getProperty("user.name").toLowerCase());
		 datos.put("User Home", System.getProperty("user.home").toLowerCase());
		 datos.put("User Dir", System.getProperty("user.dir").toLowerCase());
		 datos.put("Java Vendor", System.getProperty("java.vendor").toLowerCase());
		 datos.put("Java Version", System.getProperty("java.version").toLowerCase());
			
		 
		 request.setAttribute("datos",datos);*/
		 request.setAttribute("error","error");
		 
		 despachador = request.getServletContext().getRequestDispatcher("/inicio.jsp");
		 despachador.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
