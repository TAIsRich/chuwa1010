# hw14 MVC
## 1. List all of the annotations you learned from class and homework to annotaitons.md
## 2. What is MVC pattern?
MVC is an architectural pattern consisting of three parts: Model, View, Controller.
- Model: handles data logic.
- View: displays the information form the model to the user. It generates UI or user interface for the user.
- Controller: controls the data flow into a model object and updates the view whenever data changes.

## 3. What is Front-Controller?
The front controller design patter is used to provide a centralized request handling mechanism so that all 
requests will be handled by a single handler. This handler can do the authentication/authorization/logging or tracking
of request and then pass the requests to corresponding handlers. Following are the entities of this type of 
design pattern.
Front controller: single handler for all kinds of requests coming to the application.
Dispatcher: front controller may use a dispatcher object which can dispatch the request to corresponding specific handler.
View: views are the object for which the requests are made.

## 4. What is DispatcherServlet? please decribe how it works.

DispatcherServlet is the front controller in Spring web applications.
How it works:
1. Web server(such as Tomcat) receives http request, and send the request to DispatcherServelt.
2. DispatcherServlet call handlerMapper with the http request.
3. Handler Mapper finds the controller and method for the request, and return the method name to dispatcherServlet.
4. DispatcherServlet call the controller and method.
5. Controller return the ModelAndView as a view name to DispatcherServlet.
6. DispatcherServlet  call viewResolver with the view name.
7. View Resolver find and return the view template based on the view name.
8. Call View engine with the view template and data model. View engine puts the data model into the view template, transfer and return as HTML.
9. Finally, the HTML content will be returned to browser, as http response.

## 5. What is JSP and What is ModelAndView?(please google to have a basic knowlege)
Jakarta Server Pages (formerly JavaServer Pages) is a Java standard technology that developers use to write dynamic, data-driven web pages for Java web applications. JSP is built on top of the Java Servlet (aka Jakarta Servlet) specification and is one of the Java web technologies included for ongoing support and upgrades in Jakarta EE.
ModelAndView is a holder for both **Model** and **View** in the web MVC framework. It holds both to make it possible for a controller to return both model and view in a single return value.
The model is a Map that stores data. The view can be a String view name or a view object that will need to be resolved by View Resolver.

## 6. Could you please google any other servlets(理解多少是多少，不要花太多时间， 知道servlet的名字就行。)
A servlet is a Java programming language class that is used to extend the capabilities of servers that host applications accessed by means of a request-response programming model. Although servlets can respond to any type of request, they are commonly used to extend the applications hosted by web servers. For such applications, Java Servlet technology defines HTTP-specific servlet classes.

we can develop many types of Servlet component like httpservlet, ftpservlet, smtpservlet, etc. Since entire web is running based on protocol “http”, we prefer working with HTTPServlet.

GenericServlet is not a Separate type of Servlet, it is common super class for multiple protocol specific Servlet class. Currently, there is one subclass for GenericServlet, that is HTTPServlet because entire web is running based on protocol “http”.

## 7. How many web server do you know? (Tomcat, Jetty, Jboss)
https://www.milesweb.com/blog/hosting/web-server-types-web-servers/#:~:text=There%20are%20mainly%20four%20types,%2C%20IIS%2C%20Nginx%20and%20LiteSpeed.
There are mainly four types of web servers: Apache, IIS, Nginx, and LiteSpeed.
Apache and Nginx are open source.
Apache Tomcat: is an open source Java servlet container/It functions as a web server.
Wildfly
JBoss
Glassfish
Node.js
Lighttpad

## 8. clone this repo, and run it in you local.
   a. https://github.com/TAIsRich/springmvc5-demo
   b. Notice that you need to configure the Tomcat by yourself. tutorial in
   the slides.
   c. find out the APIs in controlelr and call some APIs, In slides, I also list
   some API.
   d. remember to create a database for this project
   e. all details in the slides.

