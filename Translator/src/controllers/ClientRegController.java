package controllers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import pojos.Order;

import com.google.gson.Gson;

@WebServlet(description = "A controller for handling first registration page", urlPatterns = { "/clientReg" })
public class ClientRegController extends HttpServlet {
	private HttpSession session; 
	private Order order;
	private String url="registrCl.jsp";
	//@SuppressWarnings("deprecation")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		session = request.getSession();
		order=(Order)session.getAttribute("order");
		if(order==null){
		}
		else{
			Gson jOrder=new Gson();
			String JSON = jOrder.toJson(order);
			response.setContentType("application/json");
			//System.out.println(JSON);
			PrintWriter out=response.getWriter();
			out.print(JSON);
			out.flush();
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get our current session
		session = request.getSession();
		order=(Order)session.getAttribute("order");
		if(order==null){
			order=new Order();
			session.setAttribute("order",order);
		}
		
		StringBuilder sb = new StringBuilder();
	    BufferedReader br = request.getReader();
	    String str;
	    while( (str = br.readLine()) != null ){
	        sb.append(str);
	    }    
	    try {
	    	JSONObject jObj=null,lang=null;
			jObj = new JSONObject(sb.toString());
			lang= jObj.getJSONObject("languages");
			String src=lang.getString("source");
			JSONArray tarObj=lang.getJSONArray("target");
			List<String> tarStr=new ArrayList<>();
			for(int i=0;i<tarObj.length();i++)
				tarStr.add(tarObj.getString(i));
			String them=jObj.get("theme").toString();
			String type=jObj.get("type").toString();
			order.setSource(src);
			order.setTarget(tarStr);
			order.setTheme(them);
			order.setType(type);
	    } catch (JSONException e) {
			// TODO Auto-generated catch block
			
		}
	    
		
	    
		System.out.println(order);
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}
	public ClientRegController() {
		// TODO Auto-generated constructor stub
		super();
	}
	
}
