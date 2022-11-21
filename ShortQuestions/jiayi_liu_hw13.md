1. **List all of the annotations you learned from class and homework to annotaitons.md**

   Please see in annotations.md

   

2. **What is MVC pattern?**

   MVC(Model-VIew-Controller) pattern is the original web framework on the servlet API and has been included in the Spring Framework from the very beginning.

   

   **Controllers** contain the business logic of the application and also **handle request** and **perform marshaling/unmarshalling**. (Marshalling is the process of transforming Java objects into XML documents. Unmarshalling is the process of reading XML documents into Java objects) Controller also **places data in the model**, which is a container of data and **returns the model(containing data) back to front controller**.

   

   **Model** is a container of data, which is used to transfer data. Controller populates the **model** with data from a form or database or a web service.

   

   **View (template)** Spring MVC support a number of view templates, and the most commonly used are JSP or JSTL(JSP Standard Tag Library).

   

3. **What is Front-Controller?**

   A Front-controller processes a request by mapping it to a relevant API controller and returns a complete response to the front end after the view is populated with model data.

   

4. **What is DispatcherServlet? please decribe how it works.**

   DispatcherServlet is front controller.

   1. Tomcat(or other **web server**) send request to **dispatcherServlet**.

   2. **DispatcherServlet** handles the request to call **Handler Mapper** to know which controller and its method should be used.

   3. **DispatcherServlet** got the specific controller and method to call them

   4. Data is retrived from data base and returned as a DTO with a view name

   5. **Dispatcher** calls **ViewResolver** with the view name and **ViewResolver** finds the corresponding view template

   6. **DispatcherServlet** receives a view template from **ViewResolver**

   7. **DispatcherServlet** sends the view template and data to **view enginer**, view engineer will put data into view template and then transfer to HTML format and finnally the HTTP will back to browser.

      

5. **What is JSP and What is ModelAndView?(please google to have a basic knowlege)**

   **JSP**

   - It stands for **Java Server Pages**.
   - It is a server side technology.
   - It is used for creating web application.
   - It is used to create dynamic web content.
   - In this JSP tags are used to insert JAVA code into HTML pages.
   - It is an advanced version of Servlet Technology.
   - It is a Web based technology helps us to create dynamic and platform independent web pages.
   - In this, Java code can be inserted in HTML/ XML pages or both.
   - JSP is first converted into servlet by JSP container before processing the client’s request.

   **ModelAndView**

   ​	ModelAndView is an object under Spring Web MVC framework that sends a simple string as model and delegates it 	with a specifed jsp view to front end.

   

6. **Could you please google any other servlets(理解多少是多少，不要花太多时间， 知道servlet的名字就行。)**

   GenericServlet defines general-usage, protocol-independent servlet. HttpServlet provides http specific servlet.

   

7. **How many web server do you know? (Tomcat, Jetty, Jboss)**

   Apache HTTP Server, Aoache Tomcat, NGINX, Node.js, Jboss, Wildfly, Glassfish

   

8. **clone this repo, and run it in you local.**

   - **https://github.com/TAIsRich/springmvc5-demo**

   - **Notice that you need to configure the Tomcat by yourself. tutorial in**

     **the slides.**

   - **find out the APIs in controlelr and call some APIs, In slides, I also list**

     **some API.**

   - **remeber to create a database for this project**

   - **all details in the slides.**