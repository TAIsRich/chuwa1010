###### 2. What is MVC pattern?
The Model-View-Controller (MVC) is an architectural pattern that separates an application into three main logical components: the model, the view, and the controller.
Model - The Model component is a container for data. It is used to transfer data from one part of the Spring MVC application to another.
View - The View component is used for all the UI logic of the application. 
Controller - The front controller maps the incoming request to a controller. Controllers contain the business logic of the application. Controller is utilized to handle a user request.
###### 3. What is Front-Controller?
Front Controller is DispatcherServlet. It maps an HTTP request to a certain processing method. 
###### 4. What is DispatcherServlet? please decribe how it works.
DispatcherServlet handles an incoming HTTP request, delegates the request, processes that request and finally responds to the request. 

1. Tomcat receives HTTP request, and DispatchrServlet handles the HTTP request from there. 
2. DispatcherServlet calls HandleMapper, which returns the corresponding controller per requested. 
3. DispatcherServlet calls the methods as per specified by the controller previously returned. To complete the request, service layer, repository layer and database layer will be called. 
4. ModelAndView (MAV) will be returned as a result of the previous call request, and a String(view name) will be returned. Data will be set to the model. 
5. DispatcerServle takes the returned view name and call view Resolver, which helps to find the corresponding view template. 
6. DispatcerServle calls View Engine to put data (within model) into view template, then convert that to HTML format and returned to browser, which is HTTP response.

###### 5. What is JSP and What is ModelAndView？(please google to have a basic knowlege)
JSP stands Java Server Pages. JSP is an advanced version of Servlet Technology and is utilized to create dynamic web content. JSP enables JAVA code to be inserted into HTML pages so that it's easier to read and write from/to databases. 

ModelAndView is a holder for both Model and View in the web MVC framework. ModelAndView merely holds both to make it possible for a controller to return both model and view in a single return value. 
###### 6. Could you please google any other servlets(理解多少是多少，不要花太多时间，知道servlet的名字就⾏。)
- Generic servlets - Are protocol independent. They contain no inherent HTTP support or any other transport protocol.
- HTTP servlets - Have built-in HTTP protocol support and are more useful in a Sun Java System Web Server environment.

###### 7. How many web server do you know? (Tomcat, Jetty, Jboss)
- Apache HTTP Server
- Microsoft Internet Information Services (IIS)
- Nginx
- Lighttpd
- Sun Java System Web Server
