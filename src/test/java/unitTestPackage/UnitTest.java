package unitTestPackage;

import static org.testng.AssertJUnit.assertTrue;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.testng.Assert;

import servletPackage.UserForm;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




public class UnitTest extends Mockito{
           @Mock
           HttpServletRequest request;
           @Mock
           HttpServletResponse response;
           @Before
           public void setUp() throws Exception {
               MockitoAnnotations.initMocks(this);
           }
           @Test
           public void testUnit() throws IOException, ServletException {
                     HttpServletRequest request = mock(HttpServletRequest.class);       
                  HttpServletResponse response = mock(HttpServletResponse.class); 
                  when(request.getParameter("fullname")).thenReturn("Evert Sanchez");
                  when(request.getParameter("address")).thenReturn("Socrates");
                  when(request.getParameter("age")).thenReturn("18");
                  when(request.getParameter("email")).thenReturn("Evert_Sanchez@infosys.com");
                  

                  StringWriter sw = new StringWriter();
                  PrintWriter pw = new PrintWriter(sw);
                  when(response.getWriter()).thenReturn(pw);
                  UserForm myServlet =new UserForm();
                  myServlet.doPost(request, response);
                  Assert.assertTrue(sw.toString().contains("Evert Sanchez"));
                  Assert.assertTrue(sw.toString().contains("Socrates"));
                  Assert.assertTrue(sw.toString().contains("18"));
                  Assert.assertTrue(sw.toString().contains("Evert_Sanchez@infosys...com"));
                  //assertEquals("Evert_Sanchez@infosys.com", sw.toString("fullname"));
           }
}