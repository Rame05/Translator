package controllers;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import pojos.Order;

@WebServlet(description = "A controller for handling first registration page", urlPatterns = { "/fileUpload" })
public class FileUploadController extends HttpServlet{
	private Order order;
	private HttpSession session;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get our current session
		session = request.getSession();
		order=(Order)session.getAttribute("order");
		if(order==null){
			order=new Order();
			session.setAttribute("order",order);
		}
		boolean isMultipart=ServletFileUpload.isMultipartContent(request);
		if(isMultipart){
			 // Create a factory for disk-based file items
	          FileItemFactory factory = new DiskFileItemFactory();

	          // Create a new file upload handler
	          ServletFileUpload upload = new ServletFileUpload(factory);
	  
	             try {
	              // Parse the request
	     List /* FileItem */ items = upload.parseRequest(request);
	     Iterator iterator = items.iterator();
	                 while (iterator.hasNext()) {
	                     FileItem item = (FileItem) iterator.next();
	                     if (!item.isFormField()) {
	                         String fileName = item.getName();  
	                         String root = getServletContext().getRealPath("/");
	                         File path = new File(root + "/uploads");
	                         if (!path.exists()) {
	                        	 boolean status = path.mkdirs();
	                         }
	  
	                         
//	                         File uploadedFile = new File(path + "/" + fileName);
//	                         System.out.println(uploadedFile.getAbsolutePath());
//	                         item.write(uploadedFile);
	                     }
	                 }
	             } catch (FileUploadException e) {
	                 e.printStackTrace();
	             } catch (Exception e) {
	                 e.printStackTrace();
	             }
		}
	}
}
