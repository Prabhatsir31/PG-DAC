# JDBC & Transaction Management

## Introduction to JDBC API

**Java Database Connectivity (JDBC)** is a standard Java API for interacting with relational databases. It allows developers to execute SQL statements, retrieve results, and manage database connections.

### Key Features:
- Platform-independent connectivity.
- Supports CRUD (Create, Read, Update, Delete) operations.
- Facilitates transaction management and batch processing.
- Extensible through various JDBC drivers.

### JDBC Workflow:
1. Load the JDBC Driver.
2. Establish a connection to the database.
3. Create and execute SQL queries.
4. Process the results.
5. Close the resources.

---

## JDBC Architecture

JDBC architecture consists of two layers:

1. **JDBC API Layer:**
   - Provides methods and classes for interacting with databases.
2. **JDBC Driver Layer:**
   - Translates JDBC calls into vendor-specific database calls.

### Diagram:

```plaintext
Application
    |
    v
JDBC API
    |
    v
JDBC Driver Manager
    |
    v
Database-Specific Driver
    |
    v
Database
```

---

## JDBC Drivers

JDBC drivers act as an interface between the Java application and the database.

### Types of Drivers:

1. **Type 1: JDBC-ODBC Bridge Driver**
   - Uses ODBC drivers for database communication.
   - Pros: Easy to use.
   - Cons: Slower and platform-dependent.

2. **Type 2: Native-API Driver**
   - Uses native libraries of the database.
   - Pros: Faster than Type 1.
   - Cons: Platform-dependent.

3. **Type 3: Network Protocol Driver**
   - Communicates with middleware for database access.
   - Pros: Platform-independent, suitable for multi-tier applications.
   - Cons: Middleware required.

4. **Type 4: Thin Driver**
   - Directly converts JDBC calls to database-specific protocol.
   - Pros: Fast, platform-independent.
   - Cons: Requires a separate driver for each database.

### Table Comparison:

| Type    | Speed     | Platform Dependency | Middleware Required |
|---------|-----------|---------------------|---------------------|
| Type 1  | Slow      | Yes                 | No                  |
| Type 2  | Moderate  | Yes                 | No                  |
| Type 3  | Moderate  | No                  | Yes                 |
| Type 4  | Fast      | No                  | No                  |

---

## JDBC Classes & Interfaces

### Key Components:

1. **Driver**
   - Loads database-specific driver.
   - Example: `DriverManager.registerDriver(new MySQLDriver());`

2. **Connection**
   - Represents a connection to the database.
   - Example:

```java
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "user", "password");
```

3. **Statement**
   - Executes SQL queries.
   - Example:

```java
Statement stmt = conn.createStatement();
ResultSet rs = stmt.executeQuery("SELECT * FROM employees");
```

4. **PreparedStatement**
   - Precompiled SQL statements to prevent SQL injection.
   - Example:

```java
PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM employees WHERE id = ?");
pstmt.setInt(1, 101);
ResultSet rs = pstmt.executeQuery();
```

5. **ResultSet**
   - Retrieves query results.
   - Example:

```java
while (rs.next()) {
    System.out.println("Name: " + rs.getString("name"));
}
```

---

## Stored Procedures and Functions Invocation

Stored procedures and functions are precompiled SQL statements stored in the database. JDBC allows invoking them using the `CallableStatement` interface.

### Example:

#### Stored Procedure (MySQL):
```sql
DELIMITER //
CREATE PROCEDURE getEmployeeName(IN empId INT, OUT empName VARCHAR(50))
BEGIN
    SELECT name INTO empName FROM employees WHERE id = empId;
END //
DELIMITER ;
```

#### Java Code:
```java
CallableStatement cstmt = conn.prepareCall("{CALL getEmployeeName(?, ?)}");
cstmt.setInt(1, 101);
cstmt.registerOutParameter(2, Types.VARCHAR);
cstmt.execute();
System.out.println("Employee Name: " + cstmt.getString(2));
```

---
![jdbc overview](https://github.com/user-attachments/assets/cf445ea6-f2b1-492e-8c07-6a5d8c5d8e6c)

## SQL Injection Overview and Prevention

### SQL Injection:
A security vulnerability where attackers inject malicious SQL queries to manipulate the database.

### Example:
#### Vulnerable Code:
```java
String query = "SELECT * FROM users WHERE username = '" + userInput + "'";
Statement stmt = conn.createStatement();
ResultSet rs = stmt.executeQuery(query);
```

#### Malicious Input:
```plaintext
' OR '1'='1
```

### Prevention:
1. Use `PreparedStatement`:
```java
PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM users WHERE username = ?");
pstmt.setString(1, userInput);
ResultSet rs = pstmt.executeQuery();
```

2. Validate user inputs.
3. Use stored procedures.
4. Implement ORM frameworks (e.g., Hibernate).

---

## Design Pattern: Data Access Object (DAO) Pattern

The DAO pattern abstracts and encapsulates data access logic, separating it from business logic.

### Structure:

```plaintext
Controller -> Service -> DAO -> Database
```

### Example:

#### User.java (POJO):
```java
public class User {
    private int id;
    private String name;

    // Getters and Setters
}
```

#### UserDAO Interface:
```java
public interface UserDAO {
    User getUserById(int id);
    void saveUser(User user);
}
```

#### UserDAOImpl:
```java
public class UserDAOImpl implements UserDAO {
    private Connection conn;

    public UserDAOImpl(Connection conn) {
        this.conn = conn;
    }

    @Override
    public User getUserById(int id) throws SQLException {
        String query = "SELECT * FROM users WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setInt(1, id);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            User user = new User();
            user.setId(rs.getInt("id"));
            user.setName(rs.getString("name"));
            return user;
        }
        return null;
    }

    @Override
    public void saveUser(User user) throws SQLException {
        String query = "INSERT INTO users (name) VALUES (?)";
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setString(1, user.getName());
        pstmt.executeUpdate();
    }
}
```

### Benefits:
- Simplifies data access logic.
- Promotes separation of concerns.
- Easy to test and maintain.

```
```


# J2EE Overview

Java 2 Platform, Enterprise Edition (J2EE), now known as Java EE (Enterprise Edition), is a set of specifications and technologies that enable the development of enterprise-level applications in Java. It provides a platform for building and deploying distributed, multi-tiered, and transactional web-based applications.

### Key Components of J2EE:
1. **Servlets**: A Java class used to extend the capabilities of servers hosting applications accessed by users.
2. **JSP (JavaServer Pages)**: A technology used for creating dynamic web pages with Java.
3. **EJB (Enterprise JavaBeans)**: A server-side component used for business logic.
4. **JDBC (Java Database Connectivity)**: A Java API that allows interaction with databases.
5. **JMS (Java Message Service)**: A messaging standard for sending messages between applications.
6. **JTA (Java Transaction API)**: A standard interface for managing transactions.

J2EE applications typically consist of components like web components (Servlets and JSPs) and enterprise components (EJBs, JCA, etc.).

---

## J2EE Container

A J2EE container is a runtime environment for J2EE components, managing the life cycle, security, transactions, and many other services of the components within an application.

### Types of Containers:
1. **Web Container**: Manages the execution of web components such as Servlets and JSPs.
2. **EJB Container**: Manages the execution of enterprise beans, including session beans, entity beans, and message-driven beans.
3. **Application Client Container**: Manages the execution of Java application clients that interact with the enterprise server.

### Responsibilities of the Container:
- **Component Management**: Creating, loading, and managing component lifecycle.
- **Security Management**: Managing access control and user authentication.
- **Transaction Management**: Coordinating transaction activities within components.
- **Resource Management**: Managing external resources like databases and messaging systems.

**Diagram**:
```
+---------------------------------------+
|            J2EE Application          |
|                                       |
|   +-----------+    +---------------+  |
|   | Web       |    | EJB           |  |
|   | Container |    | Container     |  |
|   +-----------+    +---------------+  |
|          |               |           |
|   +------------------+    |           |
|   | Servlet/JSP      |    |           |
|   +------------------+    |           |
|                          |           |
|   +------------------+    |           |
|   | Enterprise Bean  |    |           |
|   +------------------+    |           |
+---------------------------------------+
```

---

## Packaging Web Applications

Web applications in J2EE are packaged into **WAR (Web Archive)** files. A WAR file is a compressed archive that contains all the files required for a web application, such as HTML, JSP, Servlets, and other resources.

### Structure of a WAR File:
```
my-web-app.war
├── WEB-INF/
│   ├── classes/                # Compiled Java classes
│   ├── lib/                    # Libraries (JAR files)
│   ├── web.xml                 # Deployment descriptor (web.xml)
│   └── tlds/                   # Tag Library Descriptors (for custom tags)
├── index.html                  # Static HTML page
└── images/                     # Images and other static resources
```

- **WEB-INF/web.xml**: The deployment descriptor for a web application. It configures the servlets, servlet mappings, and other resources for the application.

---

## J2EE Compliant Web Application

A J2EE-compliant web application adheres to the Java EE specifications and can run on any application server that supports J2EE. This includes having the proper directory structure, deployment descriptors, and required libraries.

### Characteristics:
- It must have a `web.xml` descriptor under the `WEB-INF` directory.
- Should be packaged as a WAR file.
- Can use J2EE technologies like Servlets, JSP, EJBs, JDBC, and more.
- Must conform to security, transaction, and session management protocols defined by Java EE.

---

## Deployment Tools

Deployment tools are used to deploy J2EE applications to an application server or a cloud environment.

### Common Tools:
- **Ant**: A build tool used for automating the deployment process of web applications.
- **Maven**: A build and dependency management tool that can also deploy applications.
- **EJB Deployment Tool**: A tool to deploy EJB components to the EJB container.
- **J2EE Deployment Descriptor**: The `web.xml` (for web applications) and `ejb-jar.xml` (for EJBs) files provide the necessary configuration for the deployment.

### Deployment Process:
1. **Compile** the source code.
2. **Package** the application into a WAR or EAR file.
3. **Deploy** the packaged file to the application server (e.g., JBoss, GlassFish).
4. **Start** the application using the deployment tools or application server console.

---

## Web Application Life Cycle

The web application life cycle defines the phases that a web application goes through during its existence. It involves the management of requests, sessions, and responses.

### Phases:
1. **Initialization**: When the servlet is loaded into memory by the web container.
2. **Request Handling**: The servlet or JSP processes client requests.
3. **Response Generation**: The servlet or JSP generates the response (usually HTML).
4. **Destruction**: When the servlet is unloaded and the container shuts down.

### Flowchart:

```
+------------------+      +--------------------+      +-------------------+
|    Initialization| ---> |  Request Handling   | ---> |  Response Generation|
+------------------+      +--------------------+      +-------------------+
                                      |
                                      v
                                +------------------+
                                |    Destruction   |
                                +------------------+
```

---

## Deploying Web Applications

Web applications are deployed on J2EE-compliant servers like Tomcat, JBoss, or GlassFish. The deployment process typically involves:

1. **Create a WAR file**: Package the application.
2. **Upload the WAR file**: Upload to the application server's web deployment directory.
3. **Configure the server**: Ensure the server is configured for the correct deployment, including context path and resource mapping.
4. **Start the application**: Start the server, and the application will be available for users.

### Deployment Descriptor (`web.xml`):
```xml
<web-app>
    <servlet>
        <servlet-name>helloServlet</servlet-name>
        <servlet-class>com.example.HelloServlet</servlet-class>
    </servlet>
    <servlet-mapping>
        <servlet-name>helloServlet</servlet-name>
        <url-pattern>/hello</url-pattern>
    </servlet-mapping>
</web-app>
```

---

## Web Services Support

J2EE provides support for building and deploying web services, enabling communication between distributed applications over the internet. Web services in J2EE are typically implemented using SOAP or REST protocols.

### SOAP-based Web Services:
- SOAP (Simple Object Access Protocol) is a protocol for exchanging XML-based messages.
- JAX-RPC (Java API for XML-Based RPC) and JAX-WS (Java API for Web Services) are used for implementing SOAP services.

### RESTful Web Services:
- REST (Representational State Transfer) is an architectural style based on HTTP.
- JAX-RS (Java API for RESTful Web Services) is used to develop RESTful web services.

### Web Service Deployment:
1. **Create a WSDL (Web Service Definition Language)** document for SOAP.
2. **Publish the service** on the application server.
3. **Consume the service** from a client application.

### Diagram:
```
+-------------------------+
|    Web Service Consumer |
| (Client Application)    |
+-------------------------+
            |
            v
+-------------------------+
|   Web Service Endpoint  |
| (Server-Side Service)   |
+-------------------------+
            |
            v
+-------------------------+
|    SOAP or REST API     |
| (Communication Layer)   |
+-------------------------+
```



# Servlets: A Comprehensive Guide

## 1. Servlets: Dynamic Content Generation
Servlets are Java programs that run on a server and generate dynamic content in response to client requests, typically through HTTP. They are a crucial part of Java EE for building web applications.

### Features of Servlets:
- **Platform Independent**: Written in Java, making them portable across platforms.
- **Dynamic Content Generation**: Handles user input to produce dynamic responses like HTML, JSON, or XML.
- **Efficient and Scalable**: Eliminates the overhead of process creation, as they operate within a single JVM.

### Basic Example:
```java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Hello, World!</h1>");
    }
}
```

### Flowchart:
1. **Request**: Client sends an HTTP request.
2. **Servlet Container**: Passes the request to the servlet.
3. **Processing**: Servlet processes the request and generates a response.
4. **Response**: Sent back to the client.

---

## 2. Advantages of Servlets over CGI
| Feature                 | Servlets                                   | CGI (Common Gateway Interface)                  |
|-------------------------|--------------------------------------------|------------------------------------------------|
| **Performance**         | High, as servlets run in the JVM and reuse threads. | Low, as each request spawns a new process.     |
| **Scalability**         | Excellent, as they handle multiple requests in threads. | Poor, limited by process creation overhead.    |
| **Portability**         | Platform-independent (Java).              | Platform-dependent (based on language used).   |
| **Security**            | Integrated with Java security APIs.       | Limited security.                              |
| **Maintenance**         | Easier with centralized Java code.        | Harder due to script-based implementation.     |

---

## 3. Servlet Life Cycle
The servlet lifecycle is defined by the **javax.servlet.Servlet** interface.

### Stages:
1. **Loading and Instantiation**:
   - Servlet class is loaded into the JVM by the servlet container.
   - A single instance of the servlet is created.

2. **Initialization (`init` method)**:
   - Invoked once after instantiation.
   - Used for initialization code, such as setting up resources.
   ```java
   public void init(ServletConfig config) throws ServletException {
       super.init(config);
   }
   ```

3. **Request Handling (`service` method)**:
   - Handles client requests by calling `doGet`, `doPost`, etc.
   ```java
   public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
       // Dynamic content generation logic
   }
   ```

4. **Destruction (`destroy` method)**:
   - Cleans up resources before servlet is destroyed.
   ```java
   public void destroy() {
       // Cleanup logic
   }
   ```

### Diagram:
```
[Loading] --> [Initialization (init)] --> [Request Handling (service)] --> [Destruction (destroy)]
```

---

## 4. Servlet API & Deployment
Servlets rely on the **Java Servlet API** provided by `javax.servlet` and `javax.servlet.http` packages.

### Deployment:
1. **Directory Structure**:
   ```
   webapp/
   ├── WEB-INF/
   │   ├── web.xml
   │   └── classes/
   │       └── HelloWorldServlet.class
   └── index.html
   ```

2. **web.xml Configuration**:
   ```xml
   <web-app>
       <servlet>
           <servlet-name>HelloWorldServlet</servlet-name>
           <servlet-class>HelloWorldServlet</servlet-class>
       </servlet>
       <servlet-mapping>
           <servlet-name>HelloWorldServlet</servlet-name>
           <url-pattern>/hello</url-pattern>
       </servlet-mapping>
   </web-app>
   ```

---

## 5. Servlet Annotations
Annotations simplify servlet deployment by eliminating the need for `web.xml`.

### Example:
```java
import javax.servlet.annotation.WebServlet;

@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.getWriter().println("Hello, World!");
    }
}
```

---

## 6. The Servlet Interface
The **Servlet** interface defines the lifecycle methods:
- `init()`
- `service()`
- `destroy()`
- `getServletConfig()`
- `getServletInfo()`

---

## 7. The HttpServlet, HttpServletRequest, HttpServletResponse
### `HttpServlet`:
A subclass of `GenericServlet` that simplifies HTTP request handling.

### `HttpServletRequest`:
Encapsulates the client request. Useful methods:
- `getParameter(String name)`
- `getSession()`

### `HttpServletResponse`:
Encapsulates the server response. Useful methods:
- `setContentType(String type)`
- `getWriter()`

---

## 8. Exception Handling
### Types of Exceptions:
1. **ServletException**: General exceptions in servlets.
2. **IOException**: Input/output-related issues.

### Example:
```java
try {
    // Code
} catch (IOException e) {
    throw new ServletException("Error processing request", e);
}
```

### Error Page Configuration in `web.xml`:
```xml
<error-page>
    <error-code>404</error-code>
    <location>/error.jsp</location>
</error-page>
```

---

## 9. Servlet, DAO, POJO DB Layers
### Architecture:
1. **Servlet**: Handles HTTP requests and responses.
2. **DAO (Data Access Object)**: Encapsulates database operations.
3. **POJO (Plain Old Java Object)**: Represents data as objects.

### Example:
#### POJO:
```java
public class User {
    private int id;
    private String name;
    private String email;
    // Getters and Setters
}
```

#### DAO:
```java
public class UserDAO {
    public User getUserById(int id) {
        // Database code
        return user;
    }
}
```

#### Servlet:
```java
@WebServlet("/user")
public class UserServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        UserDAO dao = new UserDAO();
        User user = dao.getUserById(1);
        response.getWriter().println("User: " + user.getName());
    }
}
```

---

# Session

## What is a Session?
A **session** represents a single interaction between a client and a server over a period of time. It helps maintain state information for a user across multiple HTTP requests, as HTTP is inherently stateless. Sessions are widely used in web applications to track user activities, such as login status, shopping cart contents, or preferences.

### Characteristics:
- Temporary: A session exists for a specific duration.
- User-specific: Each user has a unique session.
- Server-side: Most session data is stored on the server, ensuring better security.

### Session Lifecycle:
1. **Creation:** A session is created when a user accesses a web application for the first time.
2. **Usage:** Data is stored in the session for subsequent requests.
3. **Invalidation:** The session ends due to timeout or manual invalidation.

### Common Use Cases:
- Storing user login credentials.
- Keeping track of shopping cart items.
- Retaining user preferences.

---

# Session Management

## What is Session Management?
Session management refers to techniques used to maintain the state of a user across multiple HTTP requests. It ensures continuity of user interaction by associating data (like authentication information) with the user.

### Techniques for Session Management:
1. **Cookies:**
   - Stores session data on the client-side as key-value pairs.
   - Limited storage (typically 4 KB per cookie).
2. **URL Rewriting:**
   - Appends a session ID to the URL.
   - Example: `http://example.com;jsessionid=12345`
3. **Hidden Fields:**
   - Embeds session data in hidden form fields within web pages.
4. **HttpSession API (Java-specific):**
   - Stores session data on the server-side.

---

# Session Tracking

Session tracking is the process of identifying and tracking a user’s interaction with a web application. It ensures that the server recognizes subsequent requests from the same client.

## Techniques for Session Tracking:

### 1. Using Cookies
- **Definition:** Cookies are small text files stored on the client’s browser.
- **Working:**
  1. Server sends a `Set-Cookie` header to the browser.
  2. Browser stores the cookie and sends it back with each request using the `Cookie` header.

#### Example Code:
```java
// Setting a cookie
Cookie userCookie = new Cookie("username", "JohnDoe");
userCookie.setMaxAge(60 * 60); // 1 hour
response.addCookie(userCookie);

// Reading a cookie
Cookie[] cookies = request.getCookies();
if (cookies != null) {
    for (Cookie cookie : cookies) {
        if (cookie.getName().equals("username")) {
            String username = cookie.getValue();
        }
    }
}
```

#### Advantages:
- Easy to implement.
- No server storage required.

#### Disadvantages:
- Limited storage size.
- Can be disabled by users.
- Security risks if data isn’t encrypted.

### 2. Using HttpSession
- **Definition:** The `HttpSession` interface provides a way to store session data on the server.
- **Working:**
  1. The server creates a unique `JSESSIONID` for each session.
  2. This ID is sent to the client via cookies or URL rewriting.
  3. Session data is stored on the server and accessed using the session ID.

#### Example Code:
```java
// Creating a session and adding attributes
HttpSession session = request.getSession();
session.setAttribute("username", "JohnDoe");

// Retrieving session data
String username = (String) session.getAttribute("username");

// Invalidating a session
session.invalidate();
```

#### Advantages:
- Data stored securely on the server.
- Handles session timeout automatically (### 30 min by default).

#### Disadvantages:
- Increases server memory usage.
- Session replication is needed in a clustered environment.

---

# Request Dispatcher

## What is a Request Dispatcher?
The `RequestDispatcher` interface in Java is used to forward a request from one resource (such as a servlet) to another resource (servlet, JSP, or HTML file) within the same web application.

### Methods of RequestDispatcher:
1. **`forward()`**: Forwards the request and response to another resource on the server.
2. **`include()`**: Includes the content of another resource in the response.

#### Example Code:
```java
// Forwarding a request
RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
rd.forward(request, response);

// Including a resource
RequestDispatcher rd = request.getRequestDispatcher("header.jsp");
rd.include(request, response);
```

### Forward vs Include:
| Feature          | Forward                                   | Include                                    |
|------------------|------------------------------------------|-------------------------------------------|
| Purpose          | Transfers control to another resource    | Embeds content of another resource        |
| URL Changes      | No                                       | No                                        |
| Execution Flow   | Stops after forwarding                   | Continues after including                 |

---

# Page Navigation

Page navigation refers to guiding users between different web pages in a web application. It is commonly achieved using:
1. **Hyperlinks:** Static navigation using `<a>` tags.
2. **Form Submissions:** Dynamic navigation using `<form>` elements.
3. **Request Dispatcher:** Server-side navigation using servlets.

#### Example of Hyperlink:
```html
<a href="products.jsp">View Products</a>
```

#### Example of Form Submission:
```html
<form action="LoginServlet" method="POST">
    <input type="text" name="username" />
    <button type="submit">Login</button>
</form>
```

---

# Case Study: Servlet-Based Application

## Use Case: User Authentication System

### Requirements:
1. A login page for user authentication.
2. Session management to track user login.
3. Logout functionality.

### Folder Structure:
```
web-app/
├── webapp/
│   ├── index.html          # Login page
│   ├── dashboard.jsp       # User dashboard
│   └── logout.jsp          # Logout page
├── src/
│   ├── LoginServlet.java   # Handles login requests
│   └── LogoutServlet.java  # Handles logout requests
├── web.xml                 # Servlet mappings
```

### Code Implementation:

#### 1. `index.html`
```html
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <form action="LoginServlet" method="POST">
        <label>Username:</label>
        <input type="text" name="username" required />
        <label>Password:</label>
        <input type="password" name="password" required />
        <button type="submit">Login</button>
    </form>
</body>
</html>
```

#### 2. `LoginServlet.java`
```java
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "password123".equals(password)) {
            HttpSession session = request.getSession();
            session.setAttribute("user", username);
            response.sendRedirect("dashboard.jsp");
        } else {
            response.getWriter().println("Invalid credentials!");
        }
    }
}
```

#### 3. `LogoutServlet.java`
```java
@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.invalidate();
        response.sendRedirect("index.html");
    }
}
```

#### 4. `dashboard.jsp`
```jsp
<%
    HttpSession session = request.getSession(false);
    if (session == null || session.getAttribute("user") == null) {
        response.sendRedirect("index.html");
    }
%>
<h1>Welcome, <%= session.getAttribute("user") %>!</h1>
<a href="LogoutServlet">Logout</a>
```

---


# **JSP: Separating UI from Content Generation Code**

JavaServer Pages (JSP) is a technology used to create dynamic web content by embedding Java code into HTML pages. The main idea behind JSP is to separate the user interface (UI) from the content generation logic, promoting maintainability, reusability, and modularity.

### Why Separate UI from Content Generation?
- **Maintainability:** By separating the logic and presentation, developers can modify the business logic and UI independently.
- **Reusability:** UI and content generation logic can be reused across different pages or applications.
- **Improved Collaboration:** Developers can work on business logic and UI design simultaneously without interfering with each other.

### **How JSP Achieves Separation:**
- **JSP Pages:** These contain the HTML content (UI) mixed with special JSP tags that allow interaction with Java.
- **Servlets:** Java classes (servlets) handle the business logic and dynamic content generation.
- **JavaBeans:** Reusable components that encapsulate data and logic, often used to interact with JSP.

#### Example:
```jsp
<!-- index.jsp -->
<html>
<body>
    <h2>Welcome, ${userName}!</h2> <!-- Dynamically generated from backend -->
</body>
</html>
```
In this example, the UI is displayed using HTML, while the content (userName) is dynamically generated using Java, such as from a servlet or JavaBean.

---

# **MVC Architecture**

MVC (Model-View-Controller) is an architectural design pattern used in web development to separate the concerns of data handling, UI presentation, and user interaction.

### Components of MVC:
1. **Model:** Represents the data and the business logic of the application. It interacts with the database to retrieve and manipulate data.
2. **View:** The UI part that displays data to the user. It contains the layout and design of the page.
3. **Controller:** Acts as an intermediary between the Model and View. It handles user requests, processes them, and updates the Model or View accordingly.

### How MVC Works:
- The **Controller** receives user input (requests) and updates the **Model**.
- The **Model** then updates the **View** to reflect the new data.
- The **View** displays the updated data to the user.

#### Diagram:

```
      User
       ↓
   Controller  ←→ Model ←→ Database
       ↑
     View
```

---

# **Design Pattern: MVC Pattern**

<img width="1398" alt="MVC diagrams" src="https://github.com/user-attachments/assets/59ddbc1a-edbd-4575-bbfd-55e1bf9adb79" />


The MVC (Model-View-Controller) pattern is a widely used software design pattern that decouples the user interface (View) from the business logic (Model) and user input (Controller).

### Benefits of MVC:
- **Separation of Concerns:** Different layers handle distinct aspects of the application.
- **Maintainability:** Since the business logic and UI are separate, maintaining the application becomes easier.
- **Scalability:** As the complexity of an application grows, it is easier to scale and extend the application by modifying individual components.

### Detailed Flow:
1. **Request:** The user interacts with the View (UI) through a browser (click, form submit, etc.).
2. **Controller:** The Controller receives the request and processes it (via business logic in the Model).
3. **Model:** The Model handles data retrieval and manipulation, often interacting with a database.
4. **View:** After processing, the Controller updates the View with the new data for display.

---

# **Life Cycle of a JSP Page**

The life cycle of a JSP page refers to the various stages a JSP page goes through from its creation to its destruction.

### Stages of JSP Life Cycle:

1. **Translation:** The JSP file is translated into a Servlet by the container (such as Apache Tomcat).
2. **Compilation:** The generated Servlet is compiled into bytecode.
3. **Instantiation:** The JSP servlet is instantiated.
4. **Initialization:** The `init()` method is called, and any initialization code is executed.
5. **Request Handling:** The `service()` method handles each request and generates dynamic content.
6. **Destroy:** When the JSP is no longer needed, the `destroy()` method is called, and the servlet is removed from memory.

#### Flowchart:
```
+------------------+        +------------------+        +----------------------+
|  Request for JSP |  --->  |  JSP Translated  |  --->  |  JSP Servlet Created  |
+------------------+        +------------------+        +----------------------+
                               ↓                        |
                       +---------------------+          ↓
                       | Servlet Initialization|        |
                       +---------------------+        |
                               ↓                        |
                       +---------------------+        |
                       | Processing Request  |        |
                       +---------------------+        |
                               ↓                        |
                      +------------------------+       |
                      | JSP Output Generated   |       |
                      +------------------------+       |
                               ↓                        |
                       +-------------------+            |
                       | JSP Servlet Destroyed | <------+
                       +-------------------+
```

---

# **Directives, Implicit and Explicit Objects, Scriptlets, Expressions, Expression Language**

### **Directives:**
JSP directives provide global information to the JSP engine. They define properties of the entire JSP page. Common directives include:
- **Page Directive:** Specifies page-level settings.
  ```jsp
  <%@ page language="java" contentType="text/html; charset=ISO-8859-1" %>
  ```

- **Include Directive:** Includes another file during the translation phase.
  ```jsp
  <%@ include file="header.jsp" %>
  ```

### **Implicit Objects:**
JSP provides several predefined objects (implicitly available) that developers can use to interact with the environment.

| Object           | Description                                       |
|------------------|---------------------------------------------------|
| `request`        | Represents the HTTP request sent by the client.   |
| `response`       | Represents the HTTP response sent to the client.  |
| `out`            | A `JspWriter` object used to send output to the client. |
| `session`        | Represents the session between the client and the server. |
| `application`    | Represents the servlet context for the entire web application. |
| `config`         | Contains initialization parameters of the servlet. |
| `pageContext`    | Provides access to various JSP page attributes. |

### **Scriptlets:**
Scriptlets allow embedding Java code inside a JSP page.

```jsp
<% 
   String user = "JohnDoe"; 
   out.println("Hello, " + user); 
%>
```

### **Expressions:**
An expression evaluates a Java expression and outputs the result to the response.

```jsp
<%= 2 + 2 %>  <!-- Outputs: 4 -->
```

### **Expression Language (EL):**
EL simplifies the syntax to access data in a JSP page. It removes the need for scriptlets.

```jsp
${userName} <!-- Accesses the 'userName' variable -->
```

---

# **Scope**

The scope in JSP determines the visibility and lifetime of objects.

| Scope        | Description                                             |
|--------------|---------------------------------------------------------|
| **Page Scope**    | The object is accessible only within the current JSP page. |
| **Request Scope** | The object is accessible across different JSP pages in the same request. |
| **Session Scope** | The object is accessible throughout the user's session. |
| **Application Scope** | The object is accessible across the entire web application. |

### Example:
```jsp
<% 
   pageContext.setAttribute("message", "Hello from PageScope");
%>
```

---

# **JSP Error Page Handling**

JSP provides mechanisms to handle errors and display custom error pages.

### How to Define an Error Page:
1. **In the JSP Page:**
   ```jsp
   <%@ page errorPage="error.jsp" %>
   ```
2. **In the `web.xml` Deployment Descriptor:**
   ```xml
   <error-page>
       <exception-type>java.lang.Exception</exception-type>
       <location>/error.jsp</location>
   </error-page>
   ```

### Error Handling Example:
```jsp
<%@ page isErrorPage="true" %>
<html>
<body>
    <h2>Error: ${exception}</h2>
</body>
</html>
```

---

# **JSTL (JavaServer Pages Standard Tag Library)**

JSTL provides a set of tags to simplify common tasks like iteration, conditionals, and database access.

### Key JSTL Tags:
- **Core Tags:** For iteration, conditionals, and variable handling.
  - `<c:forEach>`: Used for iterating over collections.
  - `<c:if>`: Conditional tag for executing logic.
  
```jsp
<c:forEach var="user" items="${users}">
    <p>${user.name}</p>
</c:forEach>
```

- **Formatting Tags:** For formatting dates, numbers, etc.
  - `<fmt:formatDate>`: Formats a date.
  
```jsp
<fmt:formatDate value="${currentDate}" pattern="yyyy-MM-dd" />
```

- **SQL Tags:** For database operations.
  - `<sql:query>`: Executes a SQL query.

```
```

# Hibernate Framework Deep Dive

## Introduction to Hibernate Framework

Hibernate is an **open-source Object-Relational Mapping (ORM) framework** for Java. It simplifies the development of Java applications by providing a framework to map Java objects to database tables and vice versa. By abstracting away the complexities of JDBC and SQL, Hibernate allows developers to focus on business logic rather than database connectivity.

### Key Features:
- **Lightweight and Open-Source:** Hibernate is freely available and easy to integrate.
- **ORM Tool:** Maps Java objects to relational database tables.
- **Database Independence:** Supports multiple databases, enabling easy portability.
- **HQL (Hibernate Query Language):** An object-oriented query language similar to SQL.
- **Caching:** Supports first-level and second-level caching for better performance.
- **Automatic Table Generation:** Automatically creates and updates database tables based on entity mappings.
- **Transaction Management:** Integrates seamlessly with JTA and other transaction management APIs.

---

## Hibernate Architecture

The architecture of Hibernate consists of the following core components:

### 1. **SessionFactory**
- A heavyweight object that provides Session objects.
- Created once per application and is thread-safe.

### 2. **Session**
- Represents a single unit of work with the database.
- Provides methods for CRUD operations.

### 3. **Transaction**
- Manages transaction boundaries.
- Ensures data consistency and rollback in case of failures.

### 4. **Query**
- Provides methods to execute HQL or native SQL queries.

### 5. **Configuration**
- Reads the `hibernate.cfg.xml` file or annotations to initialize Hibernate.
- Configures database settings and mapping files.

### 6. **Entities**
- Java classes that represent database tables.

#### Hibernate Architecture Diagram:
```mermaid
graph TD
    A[Configuration] --> B[SessionFactory]
    B --> C[Session]
    C --> D[Transaction]
    C --> E[Entities]
    C --> F[Query]
    D --> G[Database]
    F --> G
```

---

## Hibernate in IDE

### Creating a Web Application Using Hibernate API
1. **Setup Project:**
   - Create a Maven or Gradle project.
   - Add Hibernate and database dependencies to `pom.xml` or `build.gradle`.

2. **Configure Hibernate:**
   - Create `hibernate.cfg.xml`:
     ```xml
     <?xml version="1.0"?>
     <!DOCTYPE hibernate-configuration PUBLIC
       "-//Hibernate/Hibernate Configuration DTD 3.0//EN"
       "http://hibernate.sourceforge.net/hibernate-configuration-3.0.dtd">
     <hibernate-configuration>
         <session-factory>
             <property name="hibernate.connection.driver_class">com.mysql.cj.jdbc.Driver</property>
             <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/mydb</property>
             <property name="hibernate.connection.username">root</property>
             <property name="hibernate.connection.password">password</property>
             <property name="hibernate.dialect">org.hibernate.dialect.MySQLDialect</property>
             <property name="hibernate.hbm2ddl.auto">update</property>
         </session-factory>
     </hibernate-configuration>
     ```

3. **Create Entity Class:**
   ```java
   @Entity
   @Table(name = "Employee")
   public class Employee {
       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
       private int id;

       private String name;

       private String department;

       // Getters and setters
   }
   ```

4. **Perform CRUD Operations:**
   ```java
   SessionFactory factory = new Configuration().configure().buildSessionFactory();
   Session session = factory.openSession();
   Transaction tx = session.beginTransaction();

   Employee emp = new Employee();
   emp.setName("John");
   emp.setDepartment("IT");

   session.save(emp);
   tx.commit();
   session.close();
   ```

### Lifecycle of Hibernate Entities
1. **Transient State:** Object is created but not associated with Hibernate.
2. **Persistent State:** Object is associated with a Session and mapped to a database.
3. **Detached State:** Object is no longer associated with a Session.

#### Entity Lifecycle Diagram:
```mermaid
graph LR
    A[Transient] --> B[Persistent]
    B --> C[Detached]
    B --> D[Deleted]
```

---

## Hibernate with Annotations Example

Annotations in Hibernate simplify mapping by using Java metadata instead of XML files.

### Example:
```java
@Entity
@Table(name = "Product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "product_name")
    private String name;

    private double price;

    // Getters and setters
}
```

---

## Hibernate Mappings and Relationships

### Types of Mappings:
1. **One-to-One Mapping**
   ```java
   @OneToOne
   @JoinColumn(name = "address_id")
   private Address address;
   ```

2. **One-to-Many Mapping**
   ```java
   @OneToMany(mappedBy = "employee")
   private List<Project> projects;
   ```

3. **Many-to-Many Mapping**
   ```java
   @ManyToMany
   @JoinTable(
       name = "employee_project",
       joinColumns = @JoinColumn(name = "employee_id"),
       inverseJoinColumns = @JoinColumn(name = "project_id")
   )
   private List<Project> projects;
   ```

### Relationship Diagram:
```mermaid
graph TD
    A[Employee] -- OneToOne --> B[Address]
    A -- OneToMany --> C[Project]
    A -- ManyToMany --> D[Department]
```

---

## Collection and Component Mapping

### Collection Mapping:
- Used for mapping collections like `List`, `Set`, `Map`.

```java
@Entity
public class Department {

    @Id
    private int id;

    @ElementCollection
    @CollectionTable(name = "employees", joinColumns = @JoinColumn(name = "department_id"))
    @Column(name = "employee_name")
    private List<String> employees;
}
```

### Component Mapping:
- Embeds a dependent object within another entity.

```java
@Embeddable
public class Address {
    private String city;
    private String state;
}

@Entity
public class Employee {
    @Embedded
    private Address address;
}
```

---

## HQL, Named Queries, and Criteria Queries

### HQL (Hibernate Query Language):
A powerful query language similar to SQL, but it works with entities instead of tables.

```java
List<Employee> employees = session.createQuery("FROM Employee WHERE department = 'IT'").list();
```

### Named Queries:
Predefined queries that can be reused.

```java
@NamedQuery(name = "findByDepartment", query = "FROM Employee WHERE department = :dept")
public class Employee {
}
```

### Criteria Queries:
API for building queries programmatically.

```java
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<Employee> query = builder.createQuery(Employee.class);
Root<Employee> root = query.from(Employee.class);
query.select(root).where(builder.equal(root.get("department"), "IT"));
List<Employee> employees = session.createQuery(query).getResultList();
```

---

## JPQL (Java Persistence Query Language)
JPQL is a query language defined as part of JPA (Java Persistence API). It is similar to HQL and operates on entity objects rather than database tables.

### Features:
- Database-independent.
- Object-oriented.
- Supports joins, grouping, and aggregation.

### Example:
#### Basic Query:
```java
TypedQuery<User> query = entityManager.createQuery("SELECT u FROM User u WHERE u.name = :name", User.class);
query.setParameter("name", "John");
List<User> users = query.getResultList();
```

#### Aggregation Query:
```java
Query query = entityManager.createQuery("SELECT COUNT(u) FROM User u");
Long userCount = (Long) query.getSingleResult();
```

#### Joins:
```java
TypedQuery<Order> query = entityManager.createQuery("SELECT o FROM Order o JOIN o.user u WHERE u.name = :name", Order.class);
query.setParameter("name", "John");
List<Order> orders = query.getResultList();
```

### JPQL vs SQL:
| Feature               | JPQL                          | SQL                           |
|-----------------------|-------------------------------|-------------------------------|
| Operates on           | Entity objects                | Database tables               |
| Database dependency   | No                            | Yes                           |
| Abstraction           | High                          | Low                           |

---
---

# Lazy vs Eager Initialization in Hibernate

In the context of Hibernate, **Lazy Initialization** and **Eager Initialization** are strategies used to load associated entities (i.e., related objects) from the database. These strategies control when and how related data is fetched and can significantly impact the performance of a Hibernate-based application.

## 1. Lazy Initialization

- **Lazy Initialization** means that associated entities (like collections or other objects) are not loaded from the database until they are actually accessed for the first time.
- Hibernate creates proxy objects for the related entities, and these proxies are loaded only when a method or property of the entity is accessed.
- The goal is to avoid unnecessary database queries and reduce memory usage by loading data only when it's needed.
  
### How it works:
- If an entity is lazily loaded, Hibernate will initially fetch only the main entity from the database.
- If any of its associated entities or collections are accessed later, Hibernate will execute a database query to fetch the data for those associations.

### Example:
```java
@Entity
public class Department {
    @Id
    private int id;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Employee> employees;
}
```
In this example, the `employees` list is lazily loaded. When you load a `Department` entity, the list of employees is not loaded until you explicitly access it (e.g., `department.getEmployees()`).

### Pros:
- **Reduced Memory Usage**: Since associated data is only fetched when needed.
- **Improved Performance**: If you don’t need related entities, they won’t be loaded, which avoids unnecessary database queries.

### Cons:
- **LazyInitializationException**: If the session is closed before you access the lazy-loaded data (e.g., accessing the collection after the session has been closed), you might encounter a `LazyInitializationException`.

---

## 2. Eager Initialization

- **Eager Initialization** means that associated entities are loaded immediately when the parent entity is loaded, even if you don't access them explicitly.
- Hibernate fetches all related data in a single query (or a join query) when loading the parent entity, which means that the associated entities are retrieved immediately, regardless of whether you will use them or not.
  
### How it works:
- If an entity is eagerly loaded, Hibernate will issue a query that includes the related entities, often using `JOIN` to retrieve both the parent and child entities in one go.

### Example:
```java
@Entity
public class Department {
    @Id
    private int id;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Employee> employees;
}
```
In this example, the `employees` list will be loaded immediately when the `Department` entity is loaded, regardless of whether you access it later.

### Pros:
- **No LazyInitializationException**: Since related data is already fetched with the parent entity, you don’t risk encountering this exception.
- **Convenient**: All associated data is available as soon as the entity is loaded, so you don’t have to worry about loading it later.

### Cons:
- **Performance Overhead**: If the associated entities are large or if you don’t need them, fetching them eagerly can be inefficient. It can lead to unnecessary database queries, increased memory usage, and slower performance.
- **N+1 Query Problem**: If you're using eager fetching with associations like `@OneToMany`, it could result in multiple queries being executed (e.g., loading the parent entity first, then loading each associated entity separately), which can be very inefficient.

---

## Comparison of Lazy vs Eager Initialization

| Feature                         | **Lazy Initialization**                      | **Eager Initialization**                     |
|----------------------------------|----------------------------------------------|----------------------------------------------|
| **When are associated entities fetched?** | Only when accessed explicitly.             | Immediately, when the parent entity is loaded.|
| **Performance impact**           | Better, since related entities are not fetched unless needed. | May reduce performance due to unnecessary loading of data. |
| **Use case**                     | Suitable for large or optional associations. | Suitable when associated data is always needed. |
| **Risk of LazyInitializationException** | Yes, if the session is closed before accessing the entity. | No, because data is fetched immediately. |
| **Database queries**             | One query for the parent, additional queries when accessing associated data. | One query that loads both parent and associated data. |
| **Example** | @OneToMany, @ManyToMany | @ManyToOne, @OneToOne |
---

## Fetch Types in Hibernate Annotations

- **`FetchType.LAZY`**: Hibernate will fetch the association data only when it is accessed. This is the default fetch type for most relationships (e.g., `@OneToMany`, `@ManyToMany`).
- **`FetchType.EAGER`**: Hibernate will fetch the association data immediately when the parent entity is loaded. This is the default for `@ManyToOne` and `@OneToOne` relationships.

## Handling Lazy Initialization Exception

To avoid `LazyInitializationException`, you have several strategies:
1. **Open Session in View**: Keep the session open during the entire request to allow lazy loading while accessing related entities.
2. **Fetch the Data Eagerly**: Change the fetch type to `EAGER` if you know that the related entities will always be needed.
3. **Use DTOs**: Retrieve only the necessary data using `JOIN FETCH` in your queries or use DTOs to limit the data fetched.

---

---
# Spring Framework Overview

## **What is Spring Framework?**
The **Spring Framework** is a powerful, lightweight, and widely-used framework for building enterprise Java applications. It provides comprehensive support for infrastructure-level tasks, enabling developers to focus on application-level business logic.

### Key Features:
1. **Dependency Injection (DI):** Simplifies object creation and management.
2. **Aspect-Oriented Programming (AOP):** Facilitates separation of cross-cutting concerns like logging and security.
3. **Modularity:** Composed of various modules, each serving specific functionality.
4. **Integration:** Supports integration with other frameworks (e.g., Hibernate, JPA, and Struts).
5. **MVC Framework:** Simplifies the development of web applications.

---

## **Overview of Spring Architecture**

The Spring Framework is built on a modular architecture. Its core is the **Inversion of Control (IoC)** container, and it extends support through additional modules for web applications, data access, security, and more.
![spring-framework-modules](https://github.com/user-attachments/assets/a9ca303b-4682-47a3-a7f4-9d4579948c8e)
### Key Layers in Spring Architecture:
1. **Core Container:**
   - Includes **Beans**, **Core**, **Context**, and **Expression Language** modules.
   - Responsible for dependency injection and providing a runtime environment for managing beans.

2. **Data Access/Integration Layer:**
   - Supports JDBC, ORM, JMS, and transactions.
   - Provides abstraction over data access.

3. **Web Layer:**
   - Includes **Spring MVC** for web application development.
   - Provides features like RESTful web services, templating, and view resolution.

4. **AOP and Instrumentation Layer:**
   - Enables aspect-oriented programming.
   - Allows for custom behavior to be added to objects dynamically.

5. **Test Layer:**
   - Supports unit and integration testing of Spring applications.

---

## **Spring MVC Architecture**

The Spring MVC (Model-View-Controller) framework is a key part of Spring, designed to simplify web application development.
<img width="2072" alt="Spring MVC flow diagram" src="https://github.com/user-attachments/assets/cfaf06d4-8647-4ae1-b88c-4aa07af16851" />


### Key Components of Spring MVC:
1. **DispatcherServlet:**
   - Acts as the front controller, handling all incoming HTTP requests.
   - Delegates requests to appropriate handlers.

2. **Controller:**
   - Handles user input and processes business logic.
   - Returns a `ModelAndView` object.

3. **Model:**
   - Holds application data.
   - Shared between the controller and the view.

4. **View:**
   - Represents the user interface (UI).
   - Renders model data as HTML, JSON, XML, etc.

### Spring MVC Workflow:
1. A user sends a request to the server.
2. The **DispatcherServlet** intercepts the request.
3. It consults the **Handler Mapping** to identify the appropriate controller.
4. The controller processes the request and updates the **Model**.
5. The **View Resolver** identifies the appropriate view for rendering.
6. The view is rendered and sent back to the user.

---

## **Spring Modules Overview**

Spring is composed of several modules organized into the following categories:


1. **Core Container:**
   - **Beans:** Provides the BeanFactory for DI.
   - **Core:** Provides fundamental parts of the framework.
   - **Context:** Offers the ApplicationContext for advanced features like internationalization and lifecycle events.
   - **Expression Language (EL):** Used for querying and manipulating objects.

2. **Data Access/Integration:**
   - **JDBC:** Simplifies database access.
   - **ORM:** Integrates with Hibernate, JPA, etc.
   - **JMS:** Supports Java Messaging Service.
   - **Transactions:** Manages programmatic and declarative transactions.

3. **Web:**
   - **Spring MVC:** Facilitates web application development.
   - **WebSocket:** Supports full-duplex communication.
   - **Servlet:** Integrates with Java Servlet API.

4. **AOP, Aspects, and Instrumentation:**
   - Provides support for AOP and dynamic proxies.

5. **Test:**
   - Supports testing of Spring components using JUnit or TestNG.

---

## **Understanding Spring 4 Annotations (Basic Introduction)**

Spring 4 introduced many annotations to simplify development by eliminating XML-based configuration. Here are some key annotations:
<img width="836" alt="xml vs annotations" src="https://github.com/user-attachments/assets/c74d1b34-6427-4d95-9cb2-ff26848cef46" />

1. **@Component:** Marks a class as a Spring-managed component.
2. **@Controller:** Indicates that a class serves as a web controller in Spring MVC.
3. **@Service:** Denotes a service-layer component.
4. **@Repository:** Specialization of `@Component` for data access.
5. **@Autowired:** Enables automatic dependency injection.
6. **@Configuration:** Marks a class as a source of bean definitions.
7. **@Bean:** Indicates a method produces a Spring bean.
8. **@RestController:** Combines `@Controller` and `@ResponseBody` for RESTful web services.
9. **@RequestMapping:** Maps HTTP requests to handler methods.
10. **@Transactional:** Manages transactions declaratively.

---

## **What is IoC (Inversion of Control)?**

**Inversion of Control (IoC)** is a design principle that transfers the control of object creation and dependency management from the application to the framework.

### Key Concepts:
- **Dependency Injection (DI):** Objects are provided their dependencies by the IoC container.
- **Control Reversal:** Instead of the application controlling the flow, the framework controls it.

### Benefits:
- Simplifies code by managing object lifecycles.
- Enhances testability by using mock objects.
- Reduces tight coupling between components.

---

## **IoC Container**

The **IoC Container** is the core of Spring. It is responsible for managing the lifecycle, configuration, and dependencies of beans.

### Types of IoC Containers:
1. **BeanFactory:**
   - Basic container.
   - Lazily initializes beans (only when needed).

2. **ApplicationContext:**
   - More advanced container with additional features like internationalization and event handling.
   - Eagerly initializes beans.

### Core Features:
1. **Bean Definition:** Metadata about beans, such as dependencies and scopes, are defined in XML or annotations.
2. **Dependency Injection:** Handles injection of beans via constructor or setter injection.
3. **Bean Scope:** Supports different scopes like `singleton`, `prototype`, etc.

### Example: IoC Container in Action
```java
@Configuration
public class AppConfig {
    @Bean
    public MyService myService() {
        return new MyService();
    }
}

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MyService service = context.getBean(MyService.class);
        service.performTask();
    }
}
```
---

## **Dependency Injection**
**Dependency Injection (DI)** is a design pattern that allows a class to receive its dependencies from an external source rather than creating them internally.

### Types of Dependency Injection in Spring:
1. **Constructor Injection:**
   - Dependencies are provided via the class constructor.
   ```java
   public class Example {
       private final Dependency dependency;

       public Example(Dependency dependency) {
           this.dependency = dependency;
       }
   }
   ```

2. **Setter Injection:**
   - Dependencies are provided via setter methods.
   ```java
   public class Example {
       private Dependency dependency;

       public void setDependency(Dependency dependency) {
           this.dependency = dependency;
       }
   }
   ```

3. **Field Injection:**
   - Dependencies are injected directly into fields using annotations (e.g., `@Autowired`).
   ```java
   @Component
   public class Example {
       @Autowired
       private Dependency dependency;
   }
   ```
### Key Differences and Considerations

| Feature                   | Constructor Injection                          | Setter Injection                         |
|---------------------------|-----------------------------------------------|------------------------------------------|
| **Mandatory Dependencies**| Ensures all required dependencies are set at instantiation. | Cannot enforce mandatory dependencies.   |
| **Optional Dependencies** | Not ideal for optional dependencies.          | Ideal for optional dependencies.         |
| **Immutability**          | Promotes immutability.                        | Allows mutability of dependencies.       |
| **Readability**           | Can be less readable with many arguments.     | More readable for fewer dependencies.    |
| **Default Values**        | Dependencies must be provided in the constructor. | Can set default values for properties. |
| **Flexibility**           | Dependencies are fixed after instantiation.   | Dependencies can be changed post-instantiation. |


---

## **Spring Beans**
A **Spring Bean** is an object managed by the Spring IoC container. Beans are the backbone of a Spring application, and their lifecycle is controlled by the container.

### Defining Beans:
1. **Using XML Configuration:**
   ```xml
   <bean id="exampleBean" class="com.example.Example"/>
   ```

2. **Using Annotations:**
   - Annotate the class with `@Component`, `@Service`, `@Repository`, or `@Controller`.
   ```java
   @Component
   public class Example {
   }
   ```

3. **Using Java Configurations:**
   - Define beans in a configuration class using the `@Bean` annotation.
   ```java
   @Configuration
   public class AppConfig {
       @Bean
       public Example exampleBean() {
           return new Example();
       }
   }
   ```

---

## **Autowiring Beans**
**Autowiring** automatically resolves and injects bean dependencies without explicit configuration.

### Autowiring Modes:
1. **@Autowired:** Automatically wires a bean by type.
   ```java
   @Autowired
   private Example example;
   ```

2. **@Qualifier:** Used to resolve ambiguity when multiple beans of the same type exist.
   ```java
   @Autowired
   @Qualifier("specificBean")
   private Example example;
   ```

3. **@Primary:** Marks a bean as the default choice when multiple beans are available.
   ```java
   @Bean
   @Primary
   public Example defaultExample() {
       return new Example();
   }
   ```

---

## **Bean Scopes**
Spring supports several bean scopes to define the lifecycle and visibility of beans.

### Common Scopes:
1. **Singleton (Default):**
   - A single instance per Spring IoC container.
   ```java
   @Scope("singleton")
   ```

2. **Prototype:**
   - A new instance is created every time the bean is requested.
   ```java
   @Scope("prototype")
   ```

3. **Request:**
   - One instance per HTTP request (used in web applications).
   ```java
   @Scope(value = WebApplicationContext.SCOPE_REQUEST)
   ```

4. **Session:**
   - One instance per HTTP session (used in web applications).
   ```java
   @Scope(value = WebApplicationContext.SCOPE_SESSION)
   ```

---

## **Spring MVC**
Spring MVC is a web framework built on the Model-View-Controller design pattern, simplifying web application development.

### Components of Spring MVC:
1. **DispatcherServlet:**
   - The front controller that handles all HTTP requests and responses.

2. **Controller:**
   - Processes user requests and interacts with the service layer.

3. **Model:**
   - Holds application data and passes it between the controller and the view.

4. **View:**
   - Represents the user interface and displays data from the model.

---

## **Model, ModelAndView, HandlerMapping, and ViewResolver**

### **Model:**
- Used to store data and pass it from the controller to the view.
- Example:
  ```java
  @Controller
  public class ExampleController {
      @GetMapping("/example")
      public String showExample(Model model) {
          model.addAttribute("message", "Hello, Spring MVC!");
          return "exampleView";
      }
  }
  ```

### **ModelAndView:**
- Combines the model data and view name into a single object.
- Example:
  ```java
  @Controller
  public class ExampleController {
      @GetMapping("/example")
      public ModelAndView showExample() {
          ModelAndView mav = new ModelAndView("exampleView");
          mav.addObject("message", "Hello, Spring MVC!");
          return mav;
      }
  }
  ```

### **HandlerMapping:**
- Maps HTTP requests to appropriate controller methods.
- Example:
  ```java
  @RequestMapping("/example")
  public String handleRequest() {
      return "viewName";
  }
  ```

### **ViewResolver:**
- Resolves logical view names to actual views (e.g., JSP, Thymeleaf).
- Example:
  ```java
  @Configuration
  public class WebConfig implements WebMvcConfigurer {
      @Bean
      public InternalResourceViewResolver viewResolver() {
          InternalResourceViewResolver resolver = new InternalResourceViewResolver();
          resolver.setPrefix("/WEB-INF/views/");
          resolver.setSuffix(".jsp");
          return resolver;
      }
  }
  ```
  ---
  # Spring MVC Additional Topics

## **Design Pattern: Front Controller Pattern**
The **Front Controller Pattern** is a design pattern commonly used in web applications. It centralizes the handling of incoming requests by delegating them to a single controller (the Front Controller), which coordinates the workflow of the application.

### Key Features:
1. **Single Entry Point:** All client requests are handled by a single servlet or controller.
2. **Request Delegation:** The front controller delegates the requests to appropriate handlers (controllers).
3. **Separation of Concerns:** Keeps the request handling logic separate from the business logic.

### Benefits:
- Simplifies request management.
- Makes it easier to implement security, logging, and other cross-cutting concerns.
- Promotes a cleaner, modular design.

### Example in Spring MVC:
In Spring MVC, the **DispatcherServlet** acts as the front controller, routing requests to specific handler methods.

---

## **Spring MVC Web Application with JSP Views (Without Spring Boot)**

### Steps to Create a Spring MVC Application:
1. **Set Up the Project:**
   - Use Maven or Gradle for dependency management.
   - Add required Spring libraries (e.g., `spring-webmvc`).

2. **Configure web.xml:**
   - Define the DispatcherServlet and map it to a URL pattern.
   ```xml
   <web-app>
       <servlet>
           <servlet-name>dispatcher</servlet-name>
           <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
           <load-on-startup>1</load-on-startup>
       </servlet>
       <servlet-mapping>
           <servlet-name>dispatcher</servlet-name>
           <url-pattern>/</url-pattern>
       </servlet-mapping>
   </web-app>
   ```

3. **Create DispatcherServlet Configuration:**
   - Define the view resolver and component scanning in `dispatcher-servlet.xml`.
   ```xml
   <beans xmlns="http://www.springframework.org/schema/beans"
          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
          xsi:schemaLocation="http://www.springframework.org/schema/beans
                              http://www.springframework.org/schema/beans/spring-beans.xsd">
       <context:component-scan base-package="com.example"/>
       <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
           <property name="prefix" value="/WEB-INF/views/"/>
           <property name="suffix" value=".jsp"/>
       </bean>
   </beans>
   ```

4. **Create a Controller:**
   ```java
   @Controller
   public class HomeController {
       @RequestMapping("/home")
       public String homePage(Model model) {
           model.addAttribute("message", "Welcome to Spring MVC with JSP Views!");
           return "home";
       }
   }
   ```

5. **Create JSP Views:**
   - Save JSP files in `/WEB-INF/views/`.
   ```jsp
   <!-- /WEB-INF/views/home.jsp -->
   <html>
       <body>
           <h1>${message}</h1>
       </body>
   </html>
   ```

6. **Deploy and Test:**
   - Deploy the application to a servlet container (e.g., Tomcat).

---

## **Using Thymeleaf as Alternate View Technology (Introduction)**
Thymeleaf is a modern server-side Java template engine for web and standalone environments.

### Features:
1. **HTML-Driven:** Uses natural templates, making it easier for designers and developers to collaborate.
2. **Spring Integration:** Seamlessly integrates with Spring MVC.
3. **Dynamic Content:** Allows for dynamic data binding and evaluation.

### Example Configuration:
```java
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.example")
public class WebConfig implements WebMvcConfigurer {
    @Bean
    public SpringTemplateEngine templateEngine() {
        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        templateEngine.setTemplateResolver(templateResolver());
        return templateEngine;
    }

    @Bean
    public ThymeleafViewResolver viewResolver() {
        ThymeleafViewResolver resolver = new ThymeleafViewResolver();
        resolver.setTemplateEngine(templateEngine());
        return resolver;
    }

    @Bean
    public ClassLoaderTemplateResolver templateResolver() {
        ClassLoaderTemplateResolver resolver = new ClassLoaderTemplateResolver();
        resolver.setPrefix("/templates/");
        resolver.setSuffix(".html");
        return resolver;
    }
}
```

---

## **Spring Validations**
Spring provides validation support to ensure data integrity and enforce business rules.

### Steps to Implement:
1. **Add Dependencies:**
   - Include `spring-boot-starter-validation` or equivalent dependencies.

2. **Use Validation Annotations:**
   ```java
   public class User {
       @NotNull
       @Size(min = 5, max = 15)
       private String username;

       @Email
       private String email;
   }
   ```

3. **Validate in Controllers:**
   ```java
   @Controller
   public class UserController {
       @PostMapping("/register")
       public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result) {
           if (result.hasErrors()) {
               return "errorPage";
           }
           return "successPage";
       }
   }
   ```

---

## **Spring i18n, Localization, and Properties**

### Internationalization (i18n):
Allows for creating multilingual applications.

1. **Define Message Properties Files:**
   - `messages_en.properties`
   - `messages_fr.properties`

2. **Configure Message Source:**
   ```java
   @Bean
   public MessageSource messageSource() {
       ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
       messageSource.setBasename("messages");
       return messageSource;
   }
   ```

3. **Access Messages:**
   ```java
   @Controller
   public class ExampleController {
       @Autowired
       private MessageSource messageSource;

       public String getMessage(Locale locale) {
           return messageSource.getMessage("welcome.message", null, locale);
       }
   }
   ```

### Localization:
- Use `LocaleResolver` to determine the user’s locale.
- Example:
  ```java
  @Bean
  public LocaleResolver localeResolver() {
      SessionLocaleResolver resolver = new SessionLocaleResolver();
      resolver.setDefaultLocale(Locale.US);
      return resolver;
  }
  ```

---

## **File Upload Example**

### Steps to Implement:
1. **Add Dependencies:**
   - Include `commons-fileupload` or similar libraries.

2. **Configure Multipart Resolver:**
   ```java
   @Bean
   public MultipartResolver multipartResolver() {
       return new StandardServletMultipartResolver();
   }
   ```

3. **Create File Upload Controller:**
   ```java
   @Controller
   public class FileUploadController {
       @PostMapping("/upload")
       public String handleFileUpload(@RequestParam("file") MultipartFile file) {
           try {
               byte[] bytes = file.getBytes();
               Path path = Paths.get("/uploads/" + file.getOriginalFilename());
               Files.write(path, bytes);
           } catch (IOException e) {
               e.printStackTrace();
           }
           return "uploadSuccess";
       }
   }
   ```

4. **Create JSP Form:**
   ```jsp
   <form method="post" enctype="multipart/form-data" action="/upload">
       <input type="file" name="file"/>
       <button type="submit">Upload</button>
   </form>
   ```
---
# Spring Boot Essentials

## **Why Spring Boot?**
Spring Boot is a framework built on top of the Spring Framework to simplify and accelerate the development of production-grade Spring applications. It minimizes boilerplate code, promotes convention over configuration, and offers powerful tools for rapid application development.

### Benefits of Spring Boot:
1. **Auto-Configuration:** Automatically configures the application based on its dependencies.
2. **Embedded Servers:** Includes embedded Tomcat, Jetty, or Undertow, so no need for an external server.
3. **Simplified Dependency Management:** Reduces complexity with predefined starter dependencies.
4. **Production-Ready Features:** Includes monitoring, health checks, and externalized configuration.
5. **Minimal Code:** Eliminates repetitive XML configurations.

---

## **Spring Boot Overview**
Spring Boot provides a set of starter projects, opinions, and tools for building Spring applications quickly and efficiently.

### Key Features:
- **Spring Boot Starters:** Predefined dependency descriptors for different functionalities (e.g., `spring-boot-starter-web` for web applications).
- **Spring Boot CLI:** Command-line interface for building and testing Spring applications.
- **Actuator:** Provides monitoring and management endpoints.
- **Spring Initializr:** An online tool to generate a Spring Boot project template.

---

## **Basic Introduction of MAVEN**
**Maven** is a build automation tool primarily used for Java projects. It simplifies project management by handling dependencies, builds, and deployments.

### Key Concepts:
1. **POM (Project Object Model):** XML file (`pom.xml`) that defines the project structure, dependencies, and configurations.
2. **Repositories:**
   - **Local Repository:** Stored on the developer's machine.
   - **Central Repository:** Managed by the Maven community.
   - **Remote Repository:** Custom repositories for third-party libraries.
3. **Dependencies:** Managed using the `<dependencies>` section in `pom.xml`.

### Sample `pom.xml` for Spring Boot:
```xml
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.example</groupId>
    <artifactId>spring-boot-demo</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.0.0</version>
    </parent>

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
    </dependencies>
</project>
```

---

## **Building a Spring Web Application with Boot**

### Steps:
1. **Generate a Project:**
   - Use [Spring Initializr](https://start.spring.io/) to create a Spring Boot project with dependencies like `Spring Web`.

2. **Directory Structure:**
   ```
   src/main/java/
       com.example.demo/
           DemoApplication.java
           controller/
               HomeController.java
   src/main/resources/
       static/
       templates/
       application.properties
   ```

3. **Create a Controller:**
   ```java
   @RestController
   public class HomeController {
       @GetMapping("/hello")
       public String sayHello() {
           return "Hello, Spring Boot!";
       }
   }
   ```

4. **Run the Application:**
   - Execute the `DemoApplication` class.
   - Access the application at `http://localhost:8080/hello`.

---

## **Spring Boot in Detail**

Spring Boot offers extensive functionality for building enterprise-grade applications with minimal configuration.

### Features:
1. **Spring Boot Starters:**
   - Simplify dependency management with predefined starters like `spring-boot-starter-web`, `spring-boot-starter-data-jpa`, etc.
2. **Externalized Configuration:**
   - Configure application properties in `application.properties` or `application.yml`.
3. **Actuator:**
   - Adds monitoring endpoints, e.g., `/actuator/health`.
4. **Profiles:**
   - Manage environment-specific configurations using profiles like `dev`, `test`, `prod`.

---

## **Running a Web Application Using Spring Boot with CRUD (Static Data)**

### Steps to Build a CRUD Application:

1. **Project Setup:**
   - Include `spring-boot-starter-web` in `pom.xml`.

2. **Create the Model:**
   ```java
   public class Product {
       private int id;
       private String name;
       private double price;

       // Getters and Setters
   }
   ```

3. **Create the Controller:**
   ```java
   @RestController
   @RequestMapping("/products")
   public class ProductController {
       private List<Product> productList = new ArrayList<>(
           List.of(
               new Product(1, "Laptop", 1500.0),
               new Product(2, "Phone", 800.0)
           )
       );

       @GetMapping
       public List<Product> getAllProducts() {
           return productList;
       }

       @GetMapping("/{id}")
       public Product getProductById(@PathVariable int id) {
           return productList.stream()
               .filter(product -> product.getId() == id)
               .findFirst()
               .orElse(null);
       }

       @PostMapping
       public String addProduct(@RequestBody Product product) {
           productList.add(product);
           return "Product added successfully!";
       }

       @DeleteMapping("/{id}")
       public String deleteProduct(@PathVariable int id) {
           productList.removeIf(product -> product.getId() == id);
           return "Product removed successfully!";
       }
   }
   ```

4. **Test the Application:**
   - **Get All Products:** `GET /products`
   - **Get Product by ID:** `GET /products/{id}`
   - **Add a Product:** `POST /products`
   - **Delete a Product:** `DELETE /products/{id}`

5. **Run the Application:**
   - Access the endpoints at `http://localhost:8080/products`.

---

# Spring Data Module Overview

## **Spring Data JPA (Repository Support for JPA)**
Spring Data JPA simplifies data access and manipulation by providing repository abstractions over the Java Persistence API (JPA). It eliminates the need for boilerplate code and enhances the developer experience with powerful features.

### Key Features:
1. **Repository Abstractions:** Predefined interfaces like `CrudRepository` and `JpaRepository` offer common data access operations.
2. **Query Derivation:** Automatically generates SQL queries based on method names.
3. **Custom Queries:** Allows the use of `@Query` for defining custom JPQL or native SQL queries.
4. **Pagination and Sorting:** Provides built-in support for pageable and sorted results.
5. **Transaction Management:** Automatically handles transactions for repository methods.
6. **Auditing:** Tracks changes like creation and modification timestamps.

### Dependency:
Include the following dependency in your `pom.xml`:
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
<dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
    <scope>runtime</scope>
</dependency>
```

### Configuration:
- Spring Boot auto-configures the JPA and Hibernate setup using `application.properties`.
- Example:
```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
```

---

## **CrudRepository & JpaRepository**
Spring Data JPA provides predefined interfaces to simplify data access operations.

### **CrudRepository**
- Provides basic CRUD functionality (Create, Read, Update, Delete).
- Example Methods:
  - `save(S entity)`
  - `findById(ID id)`
  - `deleteById(ID id)`
  - `findAll()`

#### Example:
```java
@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
}
```

### **JpaRepository**
- Extends `CrudRepository` and adds JPA-specific features like pagination and batch operations.
- Example Methods:
  - `findAll(Sort sort)`
  - `findAll(Pageable pageable)`
  - `flush()`
  - `saveAndFlush(entity)`

#### Example:
```java
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
```

#### Key Differences:
| Feature                | CrudRepository          | JpaRepository          |
|------------------------|-------------------------|-------------------------|
| Pagination Support     | No                      | Yes                    |
| Batch Operations       | Limited                 | Extensive              |
| Custom Methods         | Available               | Available              |
| Sorting                | No                      | Yes                    |

---

## **Query Methods**
Query methods in Spring Data JPA allow you to retrieve data by simply defining method names based on the field names of the entity.

### Naming Conventions:
1. **Keywords:**
   - `findBy` – Fetch records by specific fields.
   - `countBy` – Count records.
   - `existsBy` – Check for existence.
2. **Conditions:**
   - `And`, `Or`, `Between`, `LessThan`, `GreaterThan`, `Like`, `Not`, `In`, `OrderBy`.

### Examples:
- Find by a single field:
  ```java
  List<Product> findByName(String name);
  ```

- Find by multiple fields:
  ```java
  List<Product> findByNameAndPrice(String name, double price);
  ```

- Find using custom conditions:
  ```java
  List<Product> findByPriceGreaterThan(double price);
  ```

- Find with sorting:
  ```java
  List<Product> findByCategoryOrderByPriceDesc(String category);
  ```

- Find with pagination:
  ```java
  Page<Product> findByCategory(String category, Pageable pageable);
  ```

---

## **Using Custom Query (@Query)**
When predefined query methods do not suffice, you can define custom queries using the `@Query` annotation.

### Syntax:
```java
@Query("<JPQL or SQL query>")
```

### Example:
1. **JPQL Query:**
   ```java
   @Query("SELECT p FROM Product p WHERE p.price > :price")
   List<Product> findProductsByPriceGreaterThan(@Param("price") double price);
   ```

2. **Native SQL Query:**
   ```java
   @Query(value = "SELECT * FROM products WHERE price > :price", nativeQuery = true)
   List<Product> findProductsByPriceGreaterThan(@Param("price") double price);
   ```

3. **Custom Update Query:**
   ```java
   @Modifying
   @Transactional
   @Query("UPDATE Product p SET p.price = :price WHERE p.id = :id")
   int updateProductPrice(@Param("id") Long id, @Param("price") double price);
   ```

4. **Delete Query:**
   ```java
   @Modifying
   @Transactional
   @Query("DELETE FROM Product p WHERE p.category = :category")
   int deleteProductsByCategory(@Param("category") String category);
   ```

### Points to Remember:
- Use `@Modifying` for update/delete queries.
- Annotate the method with `@Transactional` for transaction management.
- Ensure proper use of parameters with `@Param`.

### Advanced Usage:
- **Dynamic Queries with SpEL (Spring Expression Language):**
   ```java
   @Query("SELECT p FROM Product p WHERE p.price > ?#{[0]}")
   List<Product> findProductsByDynamicPrice(double dynamicPrice);
   ```

---

## **Pagination and Sorting in Detail**

Spring Data JPA simplifies pagination and sorting with the `Pageable` and `Sort` interfaces.

### Pagination:
- Example:
  ```java
  @Query("SELECT p FROM Product p WHERE p.category = :category")
  Page<Product> findByCategory(@Param("category") String category, Pageable pageable);
  ```
  ```java
  Pageable pageable = PageRequest.of(0, 10, Sort.by("price"));
  Page<Product> products = productRepository.findByCategory("Electronics", pageable);
  ```

### Sorting:
- Example:
  ```java
  List<Product> findByCategory(String category, Sort sort);
  ```
  ```java
  Sort sort = Sort.by(Sort.Direction.DESC, "price");
  List<Product> products = productRepository.findByCategory("Electronics", sort);
  ```

---

# Spring AOP Overview

## **AOP Overview**
**Aspect-Oriented Programming (AOP)** is a programming paradigm that allows developers to modularize cross-cutting concerns (aspects) such as logging, security, transaction management, etc., which are scattered across various parts of an application.

### Key Features of AOP:
1. **Separation of Concerns:** Allows isolating cross-cutting concerns from the core business logic.
2. **Modularization:** Provides better maintainability and readability by encapsulating cross-cutting behaviors.
3. **Dynamic Behavior:** Enables the injection of behaviors dynamically at runtime.

### Common Use Cases:
- Logging
- Transaction Management
- Security
- Performance Monitoring
- Exception Handling

---

## **Spring AOP**
Spring AOP is a module of the Spring Framework that implements aspect-oriented programming using proxies. It is lightweight, non-intrusive, and tightly integrated with Spring's IoC container.

### Features of Spring AOP:
1. **Proxy-Based Implementation:** Uses dynamic proxies to apply advice to beans.
2. **Declarative Support:** Offers XML and annotation-based configuration.
3. **Integration with IoC:** Works seamlessly with Spring beans.
4. **AspectJ Support:** Provides integration with the AspectJ framework for more advanced AOP features.

### AOP Configuration Options:
1. **Annotation-Based:**
   - Use `@Aspect` annotations with Java-based configuration.

2. **XML-Based:**
   - Define aspects and pointcuts in an XML configuration file.

---

## **AOP Terminology and Annotations**
To understand AOP, you need to know key terminology and the annotations used to define AOP components in Spring.

### 1. **Aspect**
An aspect is a modularization of a cross-cutting concern, implemented using advice and pointcuts.
- **Annotation:** `@Aspect`
- Example:
  ```java
  @Aspect
  public class LoggingAspect {
      @Before("execution(* com.example.service.*.*(..))")
      public void logBeforeMethod() {
          System.out.println("Executing method...");
      }
  }
  ```

### 2. **Advice**
Advice is the action taken by an aspect at a particular join point. Spring AOP provides different types of advice:
- **@Before:** Executes before a method is invoked.
- **@After:** Executes after a method finishes, regardless of its outcome.
- **@AfterReturning:** Executes after a method returns successfully.
- **@AfterThrowing:** Executes if a method throws an exception.
- **@Around:** Wraps a method invocation, allowing custom behavior before and after the method execution.

#### Example:
```java
@Aspect
public class LoggingAspect {
    @Before("execution(* com.example.service.*.*(..))")
    public void logBefore() {
        System.out.println("Method execution starts...");
    }

    @AfterReturning("execution(* com.example.service.*.*(..))")
    public void logAfterReturning() {
        System.out.println("Method executed successfully.");
    }
}
```

### 3. **Join Point**
A join point is a specific point during the execution of a program, such as the execution of a method or the handling of an exception, where advice can be applied.
- Spring AOP supports method execution join points.

### 4. **Pointcut**
A pointcut defines the conditions under which advice should be executed. It matches join points based on expressions.
- **Annotation:** Defined using `@Pointcut`.
- Example:
  ```java
  @Pointcut("execution(* com.example.service.*.*(..))")
  public void allServiceMethods() {}

  @Before("allServiceMethods()")
  public void logBeforeServiceMethods() {
      System.out.println("Executing service method...");
  }
  ```

### 5. **Target Object**
The target object is the object being advised by one or more aspects. Spring AOP uses proxies to apply advice to the target object.

---

## **Annotations Summary**
| Annotation         | Description                                                 |
|--------------------|-------------------------------------------------------------|
| `@Aspect`          | Marks a class as an aspect.                                 |
| `@Pointcut`        | Declares a reusable pointcut expression.                    |
| `@Before`          | Executes advice before a join point.                        |
| `@After`           | Executes advice after a join point, regardless of the outcome.|
| `@AfterReturning`  | Executes advice after a method returns successfully.        |
| `@AfterThrowing`   | Executes advice after a method throws an exception.         |
| `@Around`          | Wraps advice around a join point, controlling its execution.|

---

## **Examples of Common Pointcut Expressions**
1. Match all methods in a package:
   ```java
   @Pointcut("execution(* com.example.service.*.*(..))")
   public void allServiceMethods() {}
   ```

2. Match methods with a specific name:
   ```java
   @Pointcut("execution(* find*(..))")
   public void findMethods() {}
   ```

3. Match methods with specific arguments:
   ```java
   @Pointcut("execution(* *(String, ..))")
   public void methodsWithStringArg() {}
   ```

4. Match methods in classes with a specific annotation:
   ```java
   @Pointcut("@within(org.springframework.stereotype.Service)")
   public void methodsInServiceAnnotatedClasses() {}
   ```

5. Combining pointcuts:
   ```java
   @Pointcut("execution(* com.example..*(..)) && @annotation(org.springframework.transaction.annotation.Transactional)")
   public void transactionalMethods() {}
   ```

---

# Building REST Services with Spring

## **Introduction to Web Services**
Web services are a standardized way for applications to communicate over a network, typically using HTTP as a protocol. They enable interoperability between applications written in different languages and running on different platforms.

### Types of Web Services:
1. **SOAP (Simple Object Access Protocol):** A protocol-based approach that uses XML for message formatting.
   - **Advantages:** Platform-independent, supports multiple protocols, provides built-in security through WS-Security.
   - **Disadvantages:** Higher complexity, slower performance due to extensive processing.

2. **REST (Representational State Transfer):** An architectural style that uses HTTP methods for operations and supports multiple formats like JSON and XML.
   - **Advantages:** Lightweight, faster due to minimal overhead, easy to use and implement.
   - **Disadvantages:** Limited standards, relies heavily on HTTP protocol.

---

## **SOAP vs. RESTful Web Services**

| Feature              | SOAP                                  | REST                                  |
|----------------------|---------------------------------------|---------------------------------------|
| **Protocol**         | Strict protocol                      | Architectural style                   |
| **Data Format**      | XML only                             | JSON, XML, YAML, etc.                 |
| **Complexity**       | Higher, due to strict specifications | Lower, with minimal overhead          |
| **Transport**        | Can use multiple protocols (HTTP, TCP)| Primarily uses HTTP                   |
| **Performance**      | Slower due to extensive processing    | Faster with lightweight communication |
| **Statefulness**     | Can be stateful or stateless          | Stateless                             |
| **Standards**        | Well-defined standards (WSDL, XSD)   | No strict standards                   |

---

## **RESTful Web Service Introduction**
A **RESTful web service** is an API that adheres to the principles of REST. It uses HTTP methods to interact with resources identified by URIs.

### Key Principles:
1. **Statelessness:** Each request is independent, containing all necessary information.
2. **Client-Server Architecture:** Separation of client and server responsibilities.
3. **Uniform Interface:** Standardized communication via HTTP methods.
4. **Resource-Based:** Resources are identified using URIs.
5. **Representations:** Data is represented in formats like JSON or XML.

### HTTP Methods:
| HTTP Method | Purpose           | Example                 |
|-------------|-------------------|-------------------------|
| GET         | Retrieve data     | `/api/products`         |
| POST        | Create data       | `/api/products`         |
| PUT         | Update data       | `/api/products/{id}`    |
| DELETE      | Delete data       | `/api/products/{id}`    |

### RESTful API Best Practices:
1. **Use Nouns in URIs:** Represent resources, e.g., `/users`, `/products/{id}`.
2. **Use Proper HTTP Methods:** Map operations to methods correctly.
3. **Provide Status Codes:** Respond with appropriate HTTP status codes (e.g., 200, 201, 404).
4. **Paginate Large Data:** Limit the size of responses for better performance.
5. **Secure APIs:** Use HTTPS and authentication mechanisms.

---

## **Create RESTful Web Service in Java Using Spring Boot**

### Steps to Build a RESTful Service:
1. **Set Up the Project:**
   - Use [Spring Initializr](https://start.spring.io/) to create a project with dependencies like `Spring Web` and `Spring Boot DevTools`.

2. **Directory Structure:**
   ```
   src/main/java/
       com.example.demo/
           DemoApplication.java
           controller/
               ProductController.java
           model/
               Product.java
           service/
               ProductService.java
   src/main/resources/
       application.properties
   ```

3. **Define the Model:**
   ```java
   public class Product {
       private Long id;
       private String name;
       private Double price;

       // Getters and Setters
   }
   ```

4. **Example REST Controller:**
   ```java
   @RestController
   @RequestMapping("/api/products")
   public class ProductController {
       private final ProductService productService;

       public ProductController(ProductService productService) {
           this.productService = productService;
       }

       @GetMapping
       public List<Product> getAllProducts() {
           return productService.getAllProducts();
       }

       @PostMapping
       public Product createProduct(@RequestBody Product product) {
           return productService.saveProduct(product);
       }
   }
   ```

5. **Configure application.properties:**
   ```properties
   server.port=8080
   spring.datasource.url=jdbc:h2:mem:testdb
   spring.datasource.driver-class-name=org.h2.Driver
   spring.jpa.hibernate.ddl-auto=update
   ``
   
---

## **RESTful Web Service JSON Example**
JSON (JavaScript Object Notation) is the most commonly used format for data exchange in REST APIs.

### Example:
1. **Request (POST /api/products):**
   ```json
   {
       "name": "Laptop",
       "price": 1200.00
   }
   ```

2. **Response (GET /api/products):**
   ```json
   [
       {
           "id": 1,
           "name": "Laptop",
           "price": 1200.00
       }
   ]
   ```

---

## **RESTful Web Service CRUD Example**

### Example Endpoints:
1. **Create Product:**
   ```java
   @PostMapping
   public Product createProduct(@RequestBody Product product) {
       return productService.saveProduct(product);
   }
   ```

2. **Read Product:**
   ```java
   @GetMapping("/{id}")
   public Product getProductById(@PathVariable Long id) {
       return productService.getProductById(id);
   }
   ```

3. **Update Product:**
   ```java
   @PutMapping("/{id}")
   public Product updateProduct(@PathVariable Long id, @RequestBody Product product) {
       return productService.updateProduct(id, product);
   }
   ```

4. **Delete Product:**
   ```java
   @DeleteMapping("/{id}")
   public void deleteProduct(@PathVariable Long id) {
       productService.deleteProduct(id);
   }
   ```

---

## **Using POSTMAN Client to Invoke REST APIs**
**POSTMAN** is a popular tool for testing RESTful APIs. It allows you to send HTTP requests and inspect responses.

### Steps:
1. **Install POSTMAN:** Download and install it from [postman.com](https://www.postman.com/).
2. **Create a Request:**
   - Select the HTTP method (GET, POST, PUT, DELETE).
   - Enter the API URL (e.g., `http://localhost:8080/api/products`).
   - Add headers (e.g., `Content-Type: application/json`).
   - Add a JSON body for POST and PUT requests.
3. **Send the Request:**
   - Click **Send** to invoke the API.
4. **Inspect the Response:**
   - View the status code, response body, and headers.

---

## **REST Service Invocation Using REST Template**
The `RestTemplate` class in Spring provides a convenient way to make HTTP calls to REST services.

### Example:
1. **Get Request:**
   ```java
   RestTemplate restTemplate = new RestTemplate();
   Product product = restTemplate.getForObject("http://localhost:8080/api/products/1", Product.class);
   System.out.println(product.getName());
   ```

2. **Post Request:**
   ```java
   Product newProduct = new Product("Smartphone", 799.99);
   Product createdProduct = restTemplate.postForObject("http://localhost:8080/api/products", newProduct, Product.class);
   System.out.println(createdProduct.getId());
   ```

3. **Delete Request:**
   ```java
   restTemplate.delete("http://localhost:8080/api/products/1");
   ```

### Points to Remember:
1. Use `@Bean` to configure a `RestTemplate` if custom settings are needed:
   ```java
   @Configuration
   public class RestTemplateConfig {
       @Bean
       public RestTemplate restTemplate() {
           return new RestTemplate();
       }
   }
   ```
2. Handle exceptions with `RestClientException` for error scenarios.

---

# Testing in Spring

## **Introduction to Testing in Spring**
Testing is a crucial part of application development, ensuring that individual units of the application and their integration work as intended. Spring provides robust testing support, enabling developers to test both unit-level and integration-level components effectively.

### Key Features of Spring Testing:
1. **Dependency Injection in Tests:** Supports injecting beans into test classes for better testability.
2. **Test Context Framework:** Provides a framework for integration testing with Spring-managed beans.
3. **Mocking Support:** Works seamlessly with mocking frameworks like Mockito.
4. **Built-in Annotations:** Simplifies testing with annotations like `@ContextConfiguration`, `@MockBean`, and `@SpringBootTest`.
5. **Integration with JUnit and TestNG:** Supports popular testing frameworks for unit and integration tests.

### Types of Testing in Spring:
1. **Unit Testing:** Focuses on testing individual units like methods or classes.
2. **Integration Testing:** Verifies the correct interaction between multiple layers or components.
3. **End-to-End Testing:** Ensures the entire application behaves as expected in a production-like environment.

---

## **Unit Testing of Spring MVC Controllers**
Unit testing Spring MVC controllers focuses on verifying the behavior of individual controller methods without involving the service or repository layers.

### Tools and Frameworks:
1. **JUnit:** The most widely used testing framework for Java.
2. **MockMvc:** A Spring component that simulates HTTP requests to controllers.
3. **Mockito:** A mocking framework to simulate dependencies.

### Steps for Unit Testing Controllers:
1. Annotate the test class with `@WebMvcTest` to focus only on the web layer.
2. Use `MockMvc` to simulate HTTP requests and verify responses.
3. Mock dependencies using `@MockBean`.
4. Validate HTTP status codes, response payloads, and headers.

#### Example:
##### Controller:
```java
@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
        Product product = productService.getProductById(id);
        return ResponseEntity.ok(product);
    }
}
```

##### Unit Test:
```java
@WebMvcTest(ProductController.class)
public class ProductControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ProductService productService;

    @Test
    public void testGetProductById() throws Exception {
        Product mockProduct = new Product(1L, "Laptop", 1200.00);
        Mockito.when(productService.getProductById(1L)).thenReturn(mockProduct);

        mockMvc.perform(MockMvcRequestBuilders.get("/api/products/1")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Laptop"));
    }
}
```

### Key Annotations:
- `@WebMvcTest`: Focuses only on the web layer.
- `@MockBean`: Provides a mock of the service layer.
- `@Autowired`: Injects dependencies like `MockMvc`.

### Best Practices:
1. Keep tests independent of the service and repository layers.
2. Use descriptive test method names to reflect the scenario being tested.
3. Validate error scenarios, such as `404 Not Found` or `400 Bad Request`.

---

## **Unit Testing of Spring Service Layer**
Unit testing the service layer ensures that the business logic operates correctly, independent of the data access layer.

### Tools:
1. **Mockito:** Used to mock repository dependencies.
2. **JUnit:** Framework for writing and running tests.

### Steps for Service Layer Testing:
1. Mock the repository dependencies using `@Mock`.
2. Inject the mocked dependencies into the service class using `@InjectMocks`.
3. Test business logic in isolation.

#### Example:
##### Service:
```java
@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
    }
}
```

##### Unit Test:
```java
@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductService productService;

    @Test
    public void testGetProductById() {
        Product mockProduct = new Product(1L, "Phone", 800.00);
        Mockito.when(productRepository.findById(1L)).thenReturn(Optional.of(mockProduct));

        Product product = productService.getProductById(1L);
        assertEquals("Phone", product.getName());
    }

    @Test
    public void testGetProductByIdNotFound() {
        Mockito.when(productRepository.findById(1L)).thenReturn(Optional.empty());

        assertThrows(RuntimeException.class, () -> productService.getProductById(1L));
    }
}
```

### Best Practices:
1. Test both positive and negative scenarios.
2. Ensure all branches of the business logic are covered.
3. Use meaningful exception messages for failure cases.

---

## **Integration Testing of Spring MVC Applications: REST API**
Integration testing verifies the end-to-end behavior of an application, including the interaction between the web layer, service layer, and data layer.

### Tools:
1. **SpringBootTest:** Boots up the entire application context.
2. **TestRestTemplate:** A template for making HTTP calls in tests.
3. **Embedded Database (e.g., H2):** Used for testing the data layer.

### Steps for Integration Testing:
1. Annotate the test class with `@SpringBootTest` to load the full application context.
2. Use `TestRestTemplate` or `MockMvc` to simulate HTTP calls.
3. Validate the interaction between different layers.

#### Example:
```java
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class ProductIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testGetAllProducts() throws Exception {
        ResponseEntity<Product[]> response = restTemplate.getForEntity("/api/products", Product[].class);
        assertEquals(HttpStatus.OK, response.getStatusCode());

        Product[] products = response.getBody();
        assertNotNull(products);
    }
}
```

### Best Practices:
1. Use an embedded database like H2 for integration tests.
2. Isolate external dependencies (e.g., third-party APIs).
3. Clean up test data after each test execution.

---

## **Unit Testing Spring MVC Controllers with REST**
When testing RESTful controllers, `MockMvc` is commonly used to simulate HTTP requests and assert responses.

### Steps:
1. Annotate the test class with `@WebMvcTest`.
2. Mock the service layer using `@MockBean`.
3. Use `MockMvc` to perform requests and validate responses.

#### Example:
##### Controller:
```java
@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        Product savedProduct = productService.saveProduct(product);
        return ResponseEntity.ok(savedProduct);
    }
}
```

##### Unit Test:
```java
@WebMvcTest(ProductController.class)
public class ProductRestControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ProductService productService;

    @Test
    public void testCreateProduct() throws Exception {
        Product product = new Product(1L, "Tablet", 500.00);
        Mockito.when(productService.saveProduct(Mockito.any())).thenReturn(product);

        mockMvc.perform(MockMvcRequestBuilders.post("/api/products")
                .contentType(MediaType.APPLICATION_JSON)
                .content(new ObjectMapper().writeValueAsString(product)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Tablet"));
    }
}
```

### Best Practices:
1. Validate request payloads for correctness.
2. Test edge cases such as empty or invalid input.
3. Verify HTTP status codes and response content.

---

# Securing Web Applications with Spring Security

## **What is Spring Security?**
Spring Security is a powerful and customizable authentication and access-control framework that integrates seamlessly with Spring-based applications. It provides robust security features to protect applications from common security vulnerabilities like unauthorized access, session fixation, and CSRF attacks.

### **Key Features of Spring Security**
| **Feature**             | **Description**                                                                 |
|-------------------------|-------------------------------------------------------------------------------|
| **Authentication**     | Verifies user identity using credentials such as username and password.      |
| **Authorization**      | Determines user access rights based on roles or permissions.                 |
| **Declarative Security**| Configures security policies using annotations or XML configurations.         |
| **Password Management** | Supports hashing algorithms like BCrypt for secure password storage.         |
| **Protocol Integration**| Works with OAuth2, LDAP, SAML, and OpenID Connect.                          |
| **CSRF Protection**     | Prevents Cross-Site Request Forgery attacks by verifying request tokens.     |
| **Session Management**  | Handles session fixation and concurrent session control.                     |

### **Advantages**
1. Modular and customizable.
2. Provides security for both web applications and REST APIs.
3. Integrates seamlessly with Spring Framework and Spring Boot.

### Diagram of Spring Security Workflow
```mermaid
graph TD
    A[Client] -->|Sends HTTP Request| B[Spring Security]
    B -->|Authentication| C[Authentication Provider]
    C -->|Validates Credentials| D[UserDetailsService/DB]
    D -->|Returns User Details| C
    C -->|Successful Authentication| E[Security Context]
    E -->|Authorized Access| F[Application Resource]
```

---

## **Spring Security with Spring Boot**
Spring Security integrates seamlessly with Spring Boot, offering auto-configuration and ease of use.

### **Dependencies**
Add the following dependency to `pom.xml`:
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-security</artifactId>
</dependency>
```

### **Default Behavior**
1. Secures all endpoints by default.
2. Provides a default username (`user`) and a generated password printed in the console.

### **Custom Configuration**
#### File Structure:
```
src/main/java
  ├── com.example.security
  │     ├── SecurityConfig.java
  ├── resources
        └── application.properties
```

#### Security Configuration Code:
```java
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .antMatchers("/public/**").permitAll()
                .anyRequest().authenticated()
            .and()
            .formLogin()
                .loginPage("/login")
                .permitAll()
            .and()
            .logout()
                .permitAll();
    }
}
```

---

## **Basic Authentication**
Basic Authentication is a simple mechanism where the client sends credentials encoded in the HTTP header of every request.

### **Workflow**
1. The client encodes the username and password using Base64.
2. The encoded credentials are included in the `Authorization` header.
3. The server decodes the credentials and validates them.

#### **Configuration for Basic Authentication**
```java
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .antMatchers("/api/public/**").permitAll()
                .anyRequest().authenticated()
            .and()
            .httpBasic();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
            .withUser("user").password(passwordEncoder().encode("password")).roles("USER")
            .and()
            .withUser("admin").password(passwordEncoder().encode("admin")).roles("ADMIN");
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
```

### Diagram of Basic Authentication Flow:
```mermaid
graph TD
    A[Client] -->|Base64 Encoded Credentials| B[Spring Security]
    B -->|Decode Credentials| C[Authentication Provider]
    C -->|Validate User| D[In-Memory User Store]
    D -->|Return Success| E[Authorized Access]
```

---

## **Authentication with User Credentials from Database**
Using a database for authentication ensures centralized and secure management of user data.

### **Database Schema**
```sql
CREATE TABLE users (
    username VARCHAR(50) PRIMARY KEY,
    password VARCHAR(100) NOT NULL,
    enabled BOOLEAN NOT NULL
);

CREATE TABLE authorities (
    username VARCHAR(50) NOT NULL,
    authority VARCHAR(50) NOT NULL,
    FOREIGN KEY (username) REFERENCES users(username)
);
```

### **JDBC Authentication Configuration**
```java
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication()
            .dataSource(dataSource)
            .usersByUsernameQuery("SELECT username, password, enabled FROM users WHERE username = ?")
            .authoritiesByUsernameQuery("SELECT username, authority FROM authorities WHERE username = ?")
            .passwordEncoder(new BCryptPasswordEncoder());
    }
}
```

### Flowchart for Database Authentication:
```mermaid
graph TD
    A[Client] -->|HTTP Request| B[Spring Security]
    B -->|Query User| C[Database]
    C -->|Return Credentials| D[Authentication Manager]
    D -->|Valid User| E[Authorized Access]
```

---

## **JWT Authorization**
JWT (JSON Web Token) is a compact, self-contained token used for stateless authentication.

### **Structure of a JWT**
1. **Header:** Specifies the algorithm and token type.
2. **Payload:** Contains claims like user information and expiration time.
3. **Signature:** Verifies the token’s integrity.

Example:
```
Header: { "alg": "HS256", "typ": "JWT" }
Payload: { "sub": "user", "role": "USER", "exp": 1672444800 }
Signature: HMACSHA256(header + "." + payload, secret)
```

### **JWT Implementation in Spring**
1. **Generate JWT Token:**
```java
public String generateToken(String username) {
    return Jwts.builder()
        .setSubject(username)
        .setIssuedAt(new Date())
        .setExpiration(new Date(System.currentTimeMillis() + 86400000))
        .signWith(Keys.hmacShaKeyFor(secret.getBytes()), SignatureAlgorithm.HS256)
        .compact();
}
```

2. **Validate JWT Token:**
```java
public Claims validateToken(String token) {
    return Jwts.parserBuilder()
        .setSigningKey(secret.getBytes())
        .build()
        .parseClaimsJws(token)
        .getBody();
}
```

3. **Add JWT Filter:**
```java
public class JwtAuthenticationFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        String token = request.getHeader("Authorization");
        if (token != null && token.startsWith("Bearer ")) {
            token = token.substring(7);
            Claims claims = validateToken(token);
            // Set authentication context
        }
        filterChain.doFilter(request, response);
    }
}
```

---

# Microservices Overview

## **Introduction to Microservices**

Microservices is an architectural style that structures an application as a collection of small, independent, and loosely coupled services. Each service is designed to perform a specific business function and communicate with other services using lightweight protocols such as HTTP or messaging queues.

### **Key Characteristics of Microservices**
1. **Independence:** Each microservice operates independently and can be developed, deployed, and scaled separately.
2. **Business-Oriented:** Microservices are modeled around specific business capabilities.
3. **Decentralized Data Management:** Each microservice can have its own database, promoting data sovereignty.
4. **Resilience:** Failures in one service do not impact others.
5. **Technology Diversity:** Different technologies and programming languages can be used for different services.

### **Benefits of Microservices**
- Scalability: Allows scaling individual services based on demand.
- Agility: Enables faster development and deployment cycles.
- Resilience: Isolates failures to a specific service.
- Technology Freedom: Provides flexibility to choose the right tool for the job.

### **Challenges of Microservices**
- Increased Complexity: Managing multiple services increases operational overhead.
- Network Latency: Communication between services introduces latency.
- Data Consistency: Maintaining consistency across distributed services is complex.
- Monitoring and Debugging: Requires advanced tools for tracing and logging.

---

## **Microservices Architecture**

Microservices architecture structures an application as a collection of services, each focusing on a specific business function. These services interact through well-defined APIs.

### **Core Components**
1. **API Gateway:** Acts as a single entry point for all client requests and routes them to the appropriate services.
2. **Service Registry:** Keeps track of service locations to enable dynamic discovery and load balancing.
3. **Database Per Service:** Ensures that each service has its own database, avoiding tight coupling.
4. **Inter-Service Communication:** Achieved using REST APIs, gRPC, or messaging systems like RabbitMQ or Kafka.

### **Diagram of Microservices Architecture**
```mermaid
graph TD
    A[Client] -->|Request| B[API Gateway]
    B --> C[Service 1: User Management]
    B --> D[Service 2: Product Management]
    B --> E[Service 3: Order Processing]
    C --> F[(Database 1)]
    D --> G[(Database 2)]
    E --> H[(Database 3)]
    C -->|Message| E
    D -->|Event| E
```

### **Advantages of Microservices Architecture**
- **Flexibility:** Individual services can be modified without impacting others.
- **Scalability:** Services can be scaled independently.
- **Fault Isolation:** Failures in one service do not affect others.

---

## **Fragmentation of Business Requirements**
Fragmenting business requirements into smaller, manageable services is a key principle of microservices.

### **Steps for Fragmentation:**
1. **Identify Business Domains:** Break down the application into core domains (e.g., User Management, Inventory, Payments).
2. **Define Bounded Contexts:** Each service should operate within a specific context, with clear boundaries.
3. **Establish APIs:** Define APIs for each service to expose its functionality.
4. **Decouple Dependencies:** Minimize dependencies between services.

### **Example:**
For an e-commerce application:
- **User Service:** Manages user accounts and profiles.
- **Product Service:** Handles product listings and inventory.
- **Order Service:** Manages order placement and tracking.
- **Payment Service:** Processes payments.

---

## **Deployment Patterns**
Deployment patterns for microservices determine how services are packaged and deployed to ensure scalability, reliability, and maintainability.

### **1. Single-Service Instance Per Host**
- **Description:** Each service runs on a dedicated virtual machine or physical server.
- **Advantages:** Simplifies resource allocation and isolation.
- **Disadvantages:** Inefficient resource utilization and higher costs.

### **2. Containerized Deployment**
- **Description:** Services are packaged as containers (e.g., Docker) and deployed on container orchestration platforms like Kubernetes.
- **Advantages:** Efficient resource usage, easy scaling, and portability.
- **Disadvantages:** Requires expertise in container management.

### **3. Serverless Deployment**
- **Description:** Services run as serverless functions (e.g., AWS Lambda, Azure Functions) triggered by events.
- **Advantages:** No infrastructure management, pay-as-you-go model.
- **Disadvantages:** Limited control over the underlying infrastructure.

### **4. Multi-Cloud Deployment**
- **Description:** Services are distributed across multiple cloud providers.
- **Advantages:** Reduces vendor lock-in and improves availability.
- **Disadvantages:** Increases complexity in management.

### **Diagram: Containerized Deployment with Kubernetes**
```mermaid
graph TD
    A[Kubernetes Cluster]
    A --> B[Service 1: User Management Pod]
    A --> C[Service 2: Product Management Pod]
    A --> D[Service 3: Order Processing Pod]
    B --> E[(Database 1)]
    C --> F[(Database 2)]
    D --> G[(Database 3)]
```

### **Best Practices for Deployment:**
1. Use CI/CD pipelines for automated deployments.
2. Implement blue-green or canary deployments for minimal downtime.
3. Use monitoring tools like Prometheus and Grafana for observability.
4. Secure communication between services using TLS.

---

## **API Gateway**

### **Introduction**
An **API Gateway** is a server that acts as a single entry point for client requests in a microservices architecture. It handles requests by routing them to the appropriate microservice and can also perform various other functions such as authentication, rate limiting, logging, and response transformation.

### **Key Responsibilities**
1. **Request Routing:** Directs incoming requests to the correct microservice.
2. **Load Balancing:** Distributes requests evenly across service instances.
3. **Authentication and Authorization:** Ensures only authenticated users can access specific services.
4. **Response Aggregation:** Combines responses from multiple services into a single response.
5. **Protocol Translation:** Converts requests and responses between different protocols, such as HTTP and WebSocket.

### **Common API Gateway Tools**
| Tool                  | Description                               |
|-----------------------|-------------------------------------------|
| **Kong**             | Open-source, supports plugins for extensions.|
| **Netflix Zuul**     | Proxy server with dynamic routing capabilities.|
| **AWS API Gateway**  | Fully managed service for AWS users.      |
| **NGINX**            | Can act as a reverse proxy and load balancer.|
| **Traefik**          | Cloud-native, supports container orchestration.|

### **Advantages**
- Centralized entry point simplifies client interactions.
- Enforces security measures consistently.
- Reduces network latency by aggregating responses.

### **Disadvantages**
- Single point of failure if not properly managed.
- Can introduce latency due to additional processing.

### **Diagram: API Gateway Workflow**
```mermaid
graph TD
    A[Client] --> B[API Gateway]
    B --> C[User Service]
    B --> D[Order Service]
    B --> E[Payment Service]
```

---

## **Service Discovery**

### **Introduction**
Service Discovery is the process of automatically detecting services and their instances in a microservices architecture. It enables microservices to locate each other without hardcoding their addresses.

### **Types of Service Discovery**
1. **Client-Side Discovery:**
   - The client queries a service registry to find the available instances.
   - **Example:** Netflix Ribbon.

2. **Server-Side Discovery:**
   - The client makes a request to a discovery server, which routes the request to the appropriate service instance.
   - **Example:** AWS Elastic Load Balancer.

3. **Service Registry:**
   - A centralized database that stores information about available services.
   - **Examples:** Netflix Eureka, Consul, Zookeeper.

### **Workflow of Service Discovery**
1. **Registration:** Services register themselves with the service registry.
2. **Lookup:** Clients query the service registry to find service instances.
3. **Routing:** Requests are directed to the discovered service.

### **Diagram: Service Discovery Workflow**
```mermaid
graph TD
    A[Service A] -->|Register| B[Service Registry]
    C[Client] -->|Query| B
    B -->|Return Instance| D[Service B]
    C -->|Request| D
```

### **Advantages**
- Reduces configuration overhead for service communication.
- Supports dynamic scaling of services.
- Improves fault tolerance by detecting failed instances.

### **Disadvantages**
- Adds complexity to the architecture.
- Service registry becomes a potential single point of failure.

---

## **Database Management for Microservices**

### **Introduction**
In microservices architecture, the **Database per Service** pattern is commonly used, where each microservice has its own database to avoid tight coupling and ensure data sovereignty.

### **Patterns for Database Management**
1. **Database Per Service:**
   - Each microservice has its own database.
   - Promotes data independence but may lead to data duplication.

2. **Shared Database:**
   - Multiple services share the same database.
   - Simplifies data consistency but creates tight coupling.

3. **Event-Driven Data Sharing:**
   - Services exchange data via events.
   - Ensures eventual consistency.

### **Common Challenges**
1. **Data Consistency:** Ensuring consistency across distributed databases.
2. **Transactions:** Implementing distributed transactions using patterns like Saga or Two-Phase Commit.
3. **Data Duplication:** Managing duplicated data for better performance.

### **Transaction Management Patterns**
| Pattern              | Description                              |
|----------------------|------------------------------------------|
| **Saga Pattern**    | Breaks transactions into smaller, distributed steps.|
| **Two-Phase Commit**| Ensures atomicity but introduces latency.|
| **Eventual Consistency**| Relaxes real-time consistency for scalability.|

### **Diagram: Database Per Service Architecture**
```mermaid
graph TD
    A[User Service] --> B[(User Database)]
    C[Order Service] --> D[(Order Database)]
    E[Payment Service] --> F[(Payment Database)]
```

### **Best Practices for Database Management**
1. Use CQRS (Command Query Responsibility Segregation) to separate read and write operations.
2. Implement caching to reduce database load.
3. Use data replication for high availability.
4. Monitor database performance and scalability using tools like Prometheus.

