# Architecture of the Web

## 1. Brief History of the Internet

- **1960s**: The idea of connecting computers emerged. DARPA (Defense Advanced Research Projects Agency) funded ARPANET, the first packet-switching network.
- **1970s**: Introduction of the TCP/IP protocol suite:
  - TCP: Ensures reliable delivery of packets.
  - IP: Handles addressing and routing.
- **1983**: ARPANET adopted TCP/IP, creating the foundation for modern Internet.
- **1989**: Tim Berners-Lee introduced the World Wide Web, combining:
  - **HTML**: Hypertext Markup Language.
  - **HTTP**: Protocol to communicate between browsers and servers.
  - **URLs**: Uniform Resource Locators to identify resources.
- **1990s**: The Internet transitioned from academic research to commercial use, with the release of popular browsers like Mosaic and Netscape Navigator.

---

## 2. How Does the Internet Work?

The Internet connects billions of devices worldwide through a complex infrastructure. Here's how it works:

### 2.1. **Key Components**:
- **Devices**: Computers, smartphones, servers.
- **Routers**: Direct data packets between networks.
- **Switches**: Connect devices within a local network.
- **Cables and Satellites**: Provide physical connectivity.

### 2.2. **Data Transmission**:
1. Data is broken into small units called **packets**.
2. Each packet contains:
   - Source and destination IP addresses.
   - Data payload.
   - Sequence number (to reassemble data).
3. Packets travel through various routers to reach their destination, where they are reassembled.

### 2.3. **Client-Server Communication**:
1. The **client** (e.g., a browser) sends a request to the server using protocols like HTTP.
2. The **server** processes the request and responds with the requested data (e.g., a webpage).

### 2.4. **Routing**:
- Packets are routed based on their destination IP address.
- Routers use algorithms to determine the fastest path to the destination.

---

## 3. Internet Protocol

### 3.1. **IP (Internet Protocol)**:
- IP provides addressing for devices on a network.
- Versions:
  - **IPv4**: 32-bit address (e.g., `192.168.1.1`), supports ~4.3 billion devices.
  - **IPv6**: 128-bit address (e.g., `2001:db8::ff00:42:8329`), supports a virtually unlimited number of devices.

### 3.2. **HTTP (Hypertext Transfer Protocol)**:
- A protocol that allows clients to fetch resources from servers.
- Operates on a request-response model:
  1. Client sends an HTTP request.
  2. Server processes the request and returns an HTTP response.

---

## 4. Domain Names and DNS Servers

### 4.1. **Domain Names**:
- Human-readable addresses like `www.example.com`.
- Map to IP addresses, making it easier for users to access websites.

### 4.2. **DNS (Domain Name System)**:
- A hierarchical system that translates domain names into IP addresses.
- Structure:
  - **Root Servers**: Handle queries for top-level domains (TLDs).
  - **TLDs**: `.com`, `.org`, `.net`.
  - **Second-Level Domains**: `example.com`.
  - **Authoritative DNS Servers**: Provide the IP address for specific domains.

### DNS Query Flow:
1. User enters a domain name.
2. Browser queries the **Recursive DNS Server**.
3. The server checks:
   - Cache for previous results.
   - If not found, queries root servers and authoritative servers.
4. Returns the IP address to the client.

---

## 5. HTTP Protocols

### 5.1. **Difference Between HTTP/1.0, HTTP/1.1, and HTTP/2.0**
| Feature             | HTTP/1.0              | HTTP/1.1                        | HTTP/2.0                  |
|---------------------|-----------------------|----------------------------------|---------------------------|
| **Connection**      | One request per connection | Persistent connections allowed   | Multiplexing multiple requests on a single connection |
| **Compression**     | None                  | None                             | Header compression using HPACK |
| **Parallelism**     | None                  | Limited                          | Full parallelism          |
| **Performance**     | Basic                | Improved with pipelining         | High due to binary framing |
| **TLS Support**     | N/A                  | Optional                         | Native                   |

### 5.2. **HTTP Methods**
- **GET**: Retrieve data from the server.
- **POST**: Submit data to the server for processing.
- **PUT**: Update or replace a resource.
- **DELETE**: Remove a resource.
- **HEAD**: Fetch only headers, not the body.
- **OPTIONS**: Describe communication options for a resource.

### 5.3. **HTTP Status Codes**
| Code   | Description                                |
|--------|--------------------------------------------|
| 1xx    | Informational (`100 Continue`)            |
| 2xx    | Success (`200 OK`, `201 Created`)         |
| 3xx    | Redirection (`301 Moved Permanently`)     |
| 4xx    | Client Errors (`404 Not Found`)           |
| 5xx    | Server Errors (`500 Internal Server Error`)|

### 5.4. **Stateless Nature of HTTP**
- HTTP is stateless, meaning each request is independent.
- Sessions are maintained using:
  - **Cookies**: Small data stored on the client.
  - **URL Parameters**: Data passed in the URL.
  - **Server-Side Sessions**: Data stored on the server, linked via session IDs.

### 5.5. **HTTPS (HTTP Secure)**
- HTTPS adds encryption to HTTP using SSL/TLS.
- Benefits:
  - **Data Integrity**: Ensures data is not tampered with.
  - **Authentication**: Verifies the server's identity.
  - **Confidentiality**: Encrypts the data in transit.

---

## 6. Architecture of the Web

### 6.1. **Client-Server Model**
- **Client**: Initiates requests (e.g., browsers).
- **Server**: Responds to client requests (e.g., web servers).

### 6.2. **Three-Layer Architecture**
1. **Presentation Layer**:
   - User interface (HTML, CSS, JavaScript).
2. **Logic Layer**:
   - Handles application logic (e.g., server-side code).
3. **Data Layer**:
   - Manages databases and storage.

---

## 7. Web Servers

### 7.1. **IIS (Internet Information Services)**:
- Developed by Microsoft.
- Supports ASP.NET applications.
- Features:
  - Integrated Windows authentication.
  - Scalability and performance tuning.

### 7.2. **Apache HTTP Server**:
- Open-source and cross-platform.
- Supports multiple programming languages (PHP, Python).
- Features:
  - Modular design for extensibility.
  - Compatibility with Unix/Linux and Windows.

---

## 8. Flowchart: How the Web Works
```plaintext
Client (Browser)
    ↓
DNS Lookup (Domain to IP)
    ↓
HTTP Request (via IP)
    ↓
Web Server (e.g., Apache/IIS)
    ↓
Database (if needed)
    ↓
HTTP Response
    ↓
Rendered Web Page
```
# Introduction to HTML5

## What is HTML5?
HTML5 is the latest version of the HyperText Markup Language, designed to structure and present content on the web. It introduces new features to support multimedia, semantic elements, APIs, and enhanced performance. HTML5 is widely used for building responsive and interactive web applications.

### Key Features of HTML5:
1. **Semantic Elements**: New tags like `<header>`, `<footer>`, `<article>`, and `<section>` enhance readability and structure.
2. **Multimedia Support**: Native support for audio and video using `<audio>` and `<video>` tags.
3. **Canvas and SVG**: Allows dynamic graphics rendering without plugins.
4. **Geolocation API**: Enables location-based services.
5. **Responsive Design**: Works seamlessly with CSS3 for adaptive layouts.
6. **Offline Storage**: Provides local storage via `localStorage` and `sessionStorage`.
7. **Form Enhancements**: New input types like `email`, `date`, and `range`.

---

# Introduction to Basic HTML Tags

HTML tags form the building blocks of a webpage. They are enclosed in angle brackets (`< >`) and usually have an opening and closing tag.

---

## Common HTML Tags and Their Uses

### 1. **Alignment**
Align content using CSS, but HTML provides basic tags:
- `<center>` (deprecated in HTML5; use CSS instead):
  ```html
  <center>This text is centered</center>
  ```

### 2. **Headings**
HTML provides six levels of headings:
- Syntax:
  ```html
  <h1>Main Heading</h1>
  <h2>Subheading</h2>
  <h3>Smaller Heading</h3>
  ```
- Output:
  - `<h1>` is the largest.
  - `<h6>` is the smallest.

### 3. **Anchor**
Creates hyperlinks to other pages or resources:
- Syntax:
  ```html
  <a href="https://www.example.com">Visit Example</a>
  ```
- Attributes:
  - `href`: The URL to navigate.
  - `target="_blank"`: Opens the link in a new tab.

### 4. **Paragraph**
Defines a block of text:
- Syntax:
  ```html
  <p>This is a paragraph of text.</p>
  ```

### 5. **Image**
Displays images on a webpage:
- Syntax:
  ```html
  <img src="image.jpg" alt="Description" width="300" height="200">
  ```
- Attributes:
  - `src`: Path to the image file.
  - `alt`: Alternative text for accessibility.
  - `width` and `height`: Dimensions of the image.

### 6. **Lists**
HTML supports ordered and unordered lists:
- **Unordered List**:
  ```html
  <ul>
    <li>Item 1</li>
    <li>Item 2</li>
  </ul>
  ```
- **Ordered List**:
  ```html
  <ol>
    <li>First Item</li>
    <li>Second Item</li>
  </ol>
  ```
- Output:
  - `<ul>`: Bulleted list.
  - `<ol>`: Numbered list.

### 7. **Tables**
Defines tabular data:
- Syntax:
  ```html
  <table border="1">
    <tr>
      <th>Header 1</th>
      <th>Header 2</th>
    </tr>
    <tr>
      <td>Data 1</td>
      <td>Data 2</td>
    </tr>
  </table>
  ```
- Attributes:
  - `border`: Adds a border around the table.

### 8. **iFrames**
Embeds another HTML document within the current page:
- Syntax:
  ```html
  <iframe src="https://www.example.com" width="600" height="400"></iframe>
  ```
- Attributes:
  - `src`: URL of the embedded document.
  - `width` and `height`: Size of the frame.

---

# Example: Combining HTML Tags
```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>HTML5 Introduction</title>
</head>
<body>
  <h1>Welcome to HTML5</h1>
  <p>This is an example of basic HTML tags.</p>
  
  <h2>Example List</h2>
  <ul>
    <li>HTML</li>
    <li>CSS</li>
    <li>JavaScript</li>
  </ul>

  <h2>Sample Table</h2>
  <table border="1">
    <tr>
      <th>Language</th>
      <th>Popularity</th>
    </tr>
    <tr>
      <td>HTML</td>
      <td>High</td>
    </tr>
    <tr>
      <td>CSS</td>
      <td>High</td>
    </tr>
  </table>

  <h2>Embedded Content</h2>
  <iframe src="https://www.example.com" width="600" height="400"></iframe>

  <h2>Image Example</h2>
  <img src="image.jpg" alt="Example Image" width="300">

  <h2>Anchor Example</h2>
  <a href="https://www.example.com" target="_blank">Visit Example</a>
</body>
</html>
```

---

# Diagram: Basic HTML Structure
```plaintext
<!DOCTYPE html>
<html>
  <head>
    <title>Page Title</title>  <!-- Meta information -->
  </head>
  <body>
    <!-- Content -->
  </body>
</html>
```
# HTML5

## New Features in HTML5
HTML5 introduces numerous enhancements that improve web development capabilities, interactivity, and accessibility. Key features include:

1. **Improved Semantics**: Tags like `<header>`, `<footer>`, `<article>`, and `<section>` provide meaningful content structure.
2. **Enhanced Multimedia**: Native support for audio and video playback without plugins.
3. **Graphics and Effects**: The `<canvas>` element and SVG integration enable dynamic graphics rendering.
4. **APIs and Connectivity**:
   - Geolocation API
   - Offline storage using `localStorage` and `sessionStorage`
   - Drag-and-drop API.
5. **Performance and Integration**:
   - Reduced reliance on external plugins (e.g., Flash).
   - Improved parsing rules for error handling.

---

## New Elements, Attributes, and Features

### New Elements

| Element       | Description                                                                 |
|---------------|-----------------------------------------------------------------------------|
| `<header>`    | Represents the introductory section of a document or section.              |
| `<footer>`    | Represents the footer section with information like copyright.             |
| `<article>`   | Defines self-contained, independent content.                              |
| `<section>`   | Represents a thematic grouping of content.                                |
| `<nav>`       | Used for navigation links.                                                |
| `<figure>`    | Groups media elements with a caption.                                     |
| `<figcaption>`| Provides a caption for `<figure>`.                                        |
| `<mark>`      | Highlights text.                                                         |
| `<time>`      | Represents date and time.                                                |
| `<progress>`  | Displays progress of a task.                                             |

### New Attributes

| Attribute     | Description                                                                 |
|---------------|-----------------------------------------------------------------------------|
| `placeholder` | Provides placeholder text in inputs.                                       |
| `autofocus`   | Automatically focuses an element.                                         |
| `required`    | Specifies that an input must be filled out before submitting.             |
| `pattern`     | Defines a regular expression for input validation.                        |
| `form`        | Associates the element with a specific form.                              |
| `draggable`   | Specifies whether an element is draggable.                                |

### Link Relations

HTML5 introduces new values for the `rel` attribute in links:

| Relation       | Description                                                               |
|----------------|---------------------------------------------------------------------------|
| `preload`      | Specifies resources to load early.                                        |
| `prefetch`     | Indicates resources to fetch for future use.                              |
| `stylesheet`   | Links to external CSS files.                                             |

### Microdata
Microdata allows embedding structured data into HTML to improve search engine understanding.

Example:
```html
<div itemscope itemtype="https://schema.org/Person">
  <span itemprop="name">Alice</span>
  <span itemprop="jobTitle">Engineer</span>
</div>
```

### ARIA Accessibility
Accessible Rich Internet Applications (ARIA) improve accessibility for users with disabilities.

Example:
```html
<div role="banner">Site Title</div>
<nav role="navigation">
  <ul>
    <li><a href="#">Home</a></li>
    <li><a href="#">About</a></li>
  </ul>
</nav>
```

### Objects and Events
- **New Objects**: `FormData`, `Blob`, and `ArrayBuffer`.
- **New Events**: `oninput`, `oncanplay`, `onplay`, `onpause`.

### Canvas Tag
The `<canvas>` element enables dynamic graphics using JavaScript.

Example:
```html
<canvas id="myCanvas" width="300" height="150"></canvas>
<script>
  const canvas = document.getElementById('myCanvas');
  const ctx = canvas.getContext('2d');
  ctx.fillStyle = 'blue';
  ctx.fillRect(50, 50, 100, 75);
</script>
```

---

## HTML5 Validation
HTML5 enhances form validation with built-in attributes:

| Attribute     | Purpose                                  |
|---------------|------------------------------------------|
| `required`    | Ensures the input field is filled.       |
| `pattern`     | Validates input against a regular expression. |
| `maxlength`   | Limits the length of the input.          |
| `type`        | Validates based on the input type (e.g., email). |

Example:
```html
<form>
  <label for="email">Email:</label>
  <input type="email" id="email" required placeholder="Enter your email">
  <button type="submit">Submit</button>
</form>
```

---

## Audio & Video Support

### Audio Tag
The `<audio>` tag embeds audio files.

Example:
```html
<audio controls>
  <source src="audio.mp3" type="audio/mpeg">
  Your browser does not support the audio element.
</audio>
```

### Video Tag
The `<video>` tag embeds video files.

Example:
```html
<video controls width="600">
  <source src="video.mp4" type="video/mp4">
  Your browser does not support the video element.
</video>
```

---

## Geo-location Support
The Geolocation API retrieves the user’s location.

Example:
```html
<button onclick="getLocation()">Get Location</button>
<p id="location"></p>

<script>
  function getLocation() {
    if (navigator.geolocation) {
      navigator.geolocation.getCurrentPosition(showPosition);
    } else {
      document.getElementById('location').innerText = "Geolocation not supported.";
    }
  }

  function showPosition(position) {
    document.getElementById('location').innerText = 
      `Latitude: ${position.coords.latitude}, Longitude: ${position.coords.longitude}`;
  }
</script>
```

# HTML Forms & Controls

## HTML Forms
HTML forms are used to collect user input and send it to a server for processing. Forms are defined using the `<form>` tag, which can contain various input elements.

### Basic Syntax
```html
<form action="/submit" method="POST">
  <!-- Form Controls Go Here -->
</form>
```

### Common Form Controls

#### 1. **Input**
The `<input>` tag is a versatile element for collecting user input.

| Type           | Description                             | Example                                      |
|----------------|-----------------------------------------|----------------------------------------------|
| `text`         | Single-line text input                 | `<input type="text" name="username">`     |
| `password`     | Masked text input                      | `<input type="password" name="pwd">`     |
| `email`        | Validates email addresses              | `<input type="email" name="email">`      |
| `number`       | Accepts numerical input                | `<input type="number" name="age">`       |
| `date`         | Date picker                            | `<input type="date" name="dob">`         |
| `file`         | Uploads a file                         | `<input type="file" name="profilePic">`  |

#### 2. **Text Area**
The `<textarea>` tag is used for multi-line text input.

```html
<textarea name="message" rows="4" cols="50">Enter your message here...</textarea>
```

#### 3. **Radio Buttons**
Used to select one option from a group.

```html
<label>
  <input type="radio" name="gender" value="male"> Male
</label>
<label>
  <input type="radio" name="gender" value="female"> Female
</label>
```

#### 4. **Checkbox**
Allows multiple selections.

```html
<label>
  <input type="checkbox" name="hobby" value="reading"> Reading
</label>
<label>
  <input type="checkbox" name="hobby" value="sports"> Sports
</label>
```

#### 5. **Dropdown (Select)**
The `<select>` tag creates a dropdown menu.

```html
<select name="country">
  <option value="india">India</option>
  <option value="usa">USA</option>
  <option value="uk">UK</option>
</select>
```

#### 6. **Buttons**

| Button Type | Description                            | Example                                  |
|-------------|----------------------------------------|------------------------------------------|
| `submit`    | Submits the form                      | `<button type="submit">Submit</button>` |
| `reset`     | Resets form fields to their defaults  | `<button type="reset">Reset</button>`   |
| `button`    | General-purpose button                | `<button type="button">Click Me</button>` |

### Example Form
```html
<form action="/submit" method="POST">
  <label for="username">Username:</label>
  <input type="text" id="username" name="username" required>

  <label for="password">Password:</label>
  <input type="password" id="password" name="password" required>

  <label for="gender">Gender:</label>
  <input type="radio" name="gender" value="male"> Male
  <input type="radio" name="gender" value="female"> Female

  <label for="country">Country:</label>
  <select id="country" name="country">
    <option value="india">India</option>
    <option value="usa">USA</option>
    <option value="uk">UK</option>
  </select>

  <button type="submit">Submit</button>
  <button type="reset">Reset</button>
</form>
```

---

# Introduction to Document Object Model (DOM)

## What is the DOM?
The Document Object Model (DOM) is a programming interface for web documents. It represents the structure of a webpage as a tree of objects that can be manipulated using programming languages like JavaScript.

### DOM Tree Structure
The DOM organizes the HTML document into a tree-like structure:

- The document root is `<html>`.
- Each HTML element becomes a node in the tree.
- Text, attributes, and comments are also nodes.

Example Tree:
```plaintext
<html>
 └── <body>
      ├── <h1>
      │    └── "Hello World"
      ├── <p>
      │    └── "This is a paragraph."
      └── <ul>
           ├── <li>Item 1</li>
           └── <li>Item 2</li>
```

### Accessing the DOM
JavaScript can be used to interact with the DOM.

#### Selecting Elements
| Method                     | Description                                      | Example                                   |
|----------------------------|--------------------------------------------------|-------------------------------------------|
| `getElementById()`         | Selects an element by its ID                    | `document.getElementById('id')`          |
| `getElementsByClassName()` | Selects elements by their class name            | `document.getElementsByClassName('class')` |
| `querySelector()`          | Selects the first element that matches a CSS selector | `document.querySelector('.class')`    |
| `querySelectorAll()`       | Selects all elements that match a CSS selector  | `document.querySelectorAll('div')`       |

#### Modifying Elements
```html
<p id="demo">This is a paragraph.</p>
<button onclick="changeText()">Change Text</button>
<script>
  function changeText() {
    document.getElementById('demo').innerHTML = 'Text has been changed!';
  }
</script>
```

#### Adding and Removing Elements
```html
<ul id="list">
  <li>Item 1</li>
</ul>
<button onclick="addItem()">Add Item</button>
<script>
  function addItem() {
    const ul = document.getElementById('list');
    const li = document.createElement('li');
    li.textContent = 'New Item';
    ul.appendChild(li);
  }
</script>
```

### Events in the DOM
Events allow interaction with the DOM, such as clicks, mouse movements, and keypresses.

#### Example: Event Listener
```html
<button id="btn">Click Me</button>
<script>
  document.getElementById('btn').addEventListener('click', function() {
    alert('Button clicked!');
  });
</script>
```

---

# CSS Basics and Styling HTML

## Introduction to CSS
CSS (Cascading Style Sheets) is a stylesheet language used to describe the presentation of a document written in HTML or XML. It controls the layout, colors, fonts, and overall appearance of web pages.

### Benefits of CSS
1. **Separation of Content and Style**: Improves maintainability.
2. **Consistency**: Allows consistent styling across multiple pages.
3. **Flexibility**: Provides responsive designs with ease.
4. **Performance**: Reduces file size by centralizing styles.

---

## Styling HTML with CSS
CSS can style HTML elements by applying rules through:
1. **Selectors**: Identifying which elements to style.
2. **Properties**: Defining the style aspects.

### Example
```html
<!DOCTYPE html>
<html>
<head>
  <style>
    body {
      font-family: Arial, sans-serif;
      color: #333;
    }
    h1 {
      color: blue;
      text-align: center;
    }
  </style>
</head>
<body>
  <h1>Welcome to CSS</h1>
  <p>This page is styled using CSS.</p>
</body>
</html>
```

---

## CSS Types: Inline, Internal, External, and Multiple Styles

### 1. **Inline CSS**
CSS applied directly within an HTML element's `style` attribute.

Example:
```html
<p style="color: red; font-size: 20px;">This is inline CSS.</p>
```

### 2. **Internal CSS**
CSS rules written inside a `<style>` tag within the `<head>` section of the HTML.

Example:
```html
<style>
  p {
    color: green;
    font-size: 18px;
  }
</style>
```

### 3. **External CSS**
CSS rules stored in a separate file linked to the HTML document using the `<link>` tag.

Example:
```html
<link rel="stylesheet" href="styles.css">
```
`styles.css`:
```css
body {
  background-color: #f0f0f0;
}
h1 {
  color: darkblue;
}
```

### 4. **Multiple Styles**
CSS precedence determines which rule applies when multiple rules target the same element:
1. Inline > Internal > External.
2. Specificity and importance (`!important`) can override this.

Example:
```html
<p style="color: red;">This inline style overrides external and internal CSS.</p>
```

---

## CSS Fonts
CSS provides control over fonts through properties like `font-family`, `font-size`, `font-style`, and `font-weight`.

Example:
```css
p {
  font-family: 'Times New Roman', Times, serif;
  font-size: 16px;
  font-weight: bold;
  font-style: italic;
}
```
---

## CSS Box Model
The CSS Box Model describes the rectangular boxes generated for elements.

### Components:
1. **Content**: The actual content of the box (e.g., text, images).
2. **Padding**: Space between the content and the border.
3. **Border**: Surrounds the padding.
4. **Margin**: Space outside the border.

Example:
```css
div {
  width: 300px;
  padding: 20px;
  border: 5px solid black;
  margin: 10px;
}
```
Visual Representation:
```plaintext
+--------------------------+ <- Margin
|  +--------------------+  | <- Border
|  |  +-------------+  |  | <- Padding
|  |  |  Content    |  |  |
|  |  +-------------+  |  |
|  +--------------------+  |
+--------------------------+
```

---

## The `id` and `class` Attributes

### `id` Attribute
- Used to uniquely identify a single HTML element.
- Syntax:
```html
<div id="unique">This is unique.</div>
```
- CSS:
```css
#unique {
  color: red;
}
```

### `class` Attribute
- Used to define a group of elements with shared styles.
- Syntax:
```html
<div class="common">Styled with class.</div>
```
- CSS:
```css
.common {
  font-size: 20px;
}
```

---

## HTML `<style>` Tag
The `<style>` tag defines internal CSS rules inside the `<head>` section of an HTML document.

Example:
```html
<style>
  h1 {
    color: purple;
    font-size: 28px;
  }
</style>
```

---

## Linking a Style to an HTML Document
An external CSS file can be linked using the `<link>` tag.

### Syntax
```html
<head>
  <link rel="stylesheet" href="styles.css">
</head>
```

### Example
HTML:
```html
<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet" href="styles.css">
</head>
<body>
  <h1>External CSS Example</h1>
</body>
</html>
```
CSS (`styles.css`):
```css
h1 {
  color: orange;
  text-align: center;
}
```

---

# UI Scripting and Bootstrap

## Introduction to UI Scripting
UI scripting involves creating interactive and visually appealing user interfaces using languages like HTML, CSS, and JavaScript. It focuses on:
- Enhancing user experience (UX).
- Improving accessibility and usability.
- Ensuring responsiveness across devices.

### Key Elements of UI Scripting:
1. **Interactive Elements**: Forms, buttons, and modals.
2. **Dynamic Content**: Utilizing JavaScript for real-time updates.
3. **Styling**: Using CSS and frameworks like Bootstrap for visual design.

---

## The Best Experience for All Users
Modern web design ensures optimal user experiences across all devices by following responsive design principles.

### Device Categories:
1. **Desktop**: Larger screens require content-rich layouts.
2. **Tablet**: Intermediate screens benefit from collapsible menus and scaled elements.
3. **Mobile**: Small screens require simplified navigation and touch-friendly controls.

### Responsive Design Techniques:
- **Fluid Grids**: Use percentage-based layouts.
- **Media Queries**: Adjust styles based on screen size.
- **Flexible Images**: Ensure images adapt to their containers.

Example Media Query:
```css
@media (max-width: 768px) {
  body {
    font-size: 14px;
  }
}
```

---

## Bootstrap
Bootstrap is a popular open-source CSS framework for developing responsive, mobile-first websites.

### Overview of Bootstrap
1. **Ease of Use**: Predefined classes simplify styling.
2. **Responsive Design**: Adapts layouts for all screen sizes.
3. **Customizable**: Extendable through custom CSS and JavaScript.

### Why Use Bootstrap?
- Saves development time.
- Ensures consistency in design.
- Provides pre-built components and utilities.

---

## Bootstrap Grid System
The Bootstrap grid system divides the page into a flexible 12-column layout for responsive designs.

### Grid Classes
| Class            | Description                             |
|------------------|-----------------------------------------|
| `.col-`          | For extra small devices (less than 576px). |
| `.col-sm-`       | For small devices (576px and up).      |
| `.col-md-`       | For medium devices (768px and up).     |
| `.col-lg-`       | For large devices (992px and up).      |
| `.col-xl-`       | For extra-large devices (1200px and up). |

### Basic Structure
```html
<div class="container">
  <div class="row">
    <div class="col-md-4">Column 1</div>
    <div class="col-md-4">Column 2</div>
    <div class="col-md-4">Column 3</div>
  </div>
</div>
```

### Nesting Columns
```html
<div class="container">
  <div class="row">
    <div class="col-md-6">
      Parent Column
      <div class="row">
        <div class="col-md-6">Child Column 1</div>
        <div class="col-md-6">Child Column 2</div>
      </div>
    </div>
    <div class="col-md-6">Another Parent Column</div>
  </div>
</div>
```

---

## Typography in Bootstrap
Bootstrap provides utility classes for text styling.

| Class                | Description                          |
|----------------------|--------------------------------------|
| `.text-start`        | Aligns text to the left.             |
| `.text-center`       | Centers the text.                   |
| `.text-end`          | Aligns text to the right.           |
| `.text-muted`        | Applies muted text color.           |
| `.text-uppercase`    | Converts text to uppercase.         |
| `.font-weight-bold`  | Makes text bold.                    |
| `.font-italic`       | Italicizes text.                    |

Example:
```html
<p class="text-uppercase text-center text-muted">Uppercase, Centered, and Muted Text</p>
```

---

## Bootstrap Components

### Common Components
1. **Tables**:
   ```html
   <table class="table table-bordered table-hover">
     <thead>
       <tr>
         <th>#</th>
         <th>Name</th>
         <th>Age</th>
       </tr>
     </thead>
     <tbody>
       <tr>
         <td>1</td>
         <td>John</td>
         <td>25</td>
       </tr>
       <tr>
         <td>2</td>
         <td>Jane</td>
         <td>30</td>
       </tr>
     </tbody>
   </table>
   ```

2. **Images**:
   ```html
   <img src="image.jpg" class="img-fluid rounded" alt="Responsive Image">
   ```

3. **Buttons**:
   ```html
   <button class="btn btn-primary btn-lg">Large Button</button>
   <button class="btn btn-secondary btn-sm">Small Button</button>
   ```

4. **Alerts**:
   ```html
   <div class="alert alert-warning alert-dismissible fade show" role="alert">
     Warning Message!
     <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
   </div>
   ```

### Advanced Components
1. **Progress Bars**:
   ```html
   <div class="progress">
     <div class="progress-bar progress-bar-striped progress-bar-animated" role="progressbar" style="width: 75%;">75%</div>
   </div>
   ```

2. **Dropdowns**:
   ```html
   <div class="dropdown">
     <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-bs-toggle="dropdown" aria-expanded="false">
       Dropdown button
     </button>
     <ul class="dropdown-menu" aria-labelledby="dropdownMenuButton">
       <li><a class="dropdown-item" href="#">Action</a></li>
       <li><a class="dropdown-item" href="#">Another action</a></li>
     </ul>
   </div>
   ```

3. **Navbar**:
   ```html
   <nav class="navbar navbar-expand-lg navbar-light bg-light">
     <a class="navbar-brand" href="#">Navbar</a>
     <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
       <span class="navbar-toggler-icon"></span>
     </button>
     <div class="collapse navbar-collapse" id="navbarNav">
       <ul class="navbar-nav">
         <li class="nav-item">
           <a class="nav-link active" href="#">Home</a>
         </li>
         <li class="nav-item">
           <a class="nav-link" href="#">Features</a>
         </li>
       </ul>
     </div>
   </nav>
   ```

4. **Modal Dialog**:
   ```html
   <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">
     Launch demo modal
   </button>

   <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
     <div class="modal-dialog">
       <div class="modal-content">
         <div class="modal-header">
           <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
           <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
         </div>
         <div class="modal-body">
           This is the modal content.
         </div>
         <div class="modal-footer">
           <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
           <button type="button" class="btn btn-primary">Save changes</button>
         </div>
       </div>
     </div>
   </div>
   ```

---

## Forms and Inputs in Bootstrap
Bootstrap simplifies form styling with classes like `form-control` and `form-group`.

Example:
```html
<form>
  <div class="mb-3">
    <label for="email" class="form-label">Email address:</label>
    <input type="email" class="form-control" id="email" placeholder="name@example.com">
  </div>
  <div class="mb-3">
    <label for="password" class="form-label">Password:</label>
    <input type="password" class="form-control" id="password">
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
```

---

## Bootstrap Themes and Templates
Bootstrap offers pre-built themes and templates that can be customized:

### Bootswatch
- A collection of free themes compatible with Bootstrap.
- Example themes: Cerulean, Cosmo, Flatly.

### Custom Templates
- Tailored layouts for specific use cases like blogs, portfolios, and e-commerce.
- Example:
```html
<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
  <nav class="navbar navbar-dark bg-dark">
    <a class="navbar-brand" href="#">Custom Template</a>
  </nav>
  <div class="container mt-5">
    <h1>Welcome to Bootstrap</h1>
    <p>This is a custom template.</p>
  </div>
</body>
</html>
```

# JavaScript Basics

## Introduction to JavaScript
JavaScript is a versatile, high-level, interpreted programming language primarily used to create dynamic and interactive content on web pages. It is one of the core technologies of the web, alongside HTML and CSS.

### Key Features of JavaScript:
1. **Client-Side Execution**: Runs directly in the browser without requiring server interaction.
2. **Event-Driven**: Enables handling user interactions like clicks, form submissions, and keyboard inputs.
3. **Object-Oriented**: Supports object-oriented programming with prototypes and classes.
4. **Platform-Independent**: Works across different operating systems and browsers.

### Example:
```html
<!DOCTYPE html>
<html>
<head>
  <title>JavaScript Example</title>
</head>
<body>
  <h1 id="greeting">Hello, World!</h1>
  <button onclick="changeGreeting()">Click Me</button>

  <script>
    function changeGreeting() {
      document.getElementById('greeting').innerText = 'Hello, JavaScript!';
    }
  </script>
</body>
</html>
```

---

## Variables in JavaScript
Variables are containers for storing data values. In JavaScript, you can declare variables using `var`, `let`, or `const`.

### Declaration Keywords:
| Keyword | Scope               | Reassignment | Example                   |
|---------|---------------------|--------------|---------------------------|
| `var`   | Function scope      | Yes          | `var x = 10;`             |
| `let`   | Block scope         | Yes          | `let y = 20;`             |
| `const` | Block scope         | No           | `const z = 30;`           |

### Example:
```javascript
let name = 'Alice';
const age = 25;
var isActive = true;

console.log(name, age, isActive);
```

---

## Statements, Operators, Comments, Expressions, and Control Structures

### Statements
JavaScript code is executed in the form of statements, which can be declarations, expressions, or control flow constructs.

Example:
```javascript
let x = 10; // Declaration statement
x += 5;    // Expression statement
if (x > 10) { console.log('x is greater than 10'); } // Control statement
```

### Operators
JavaScript provides various operators:

| Type       | Example | Description                |
|------------|---------|----------------------------|
| Arithmetic | `+`, `-` | Perform mathematical operations |
| Comparison | `===`, `!=` | Compare values           |
| Logical    | `&&`, `||` | Logical operations        |
| Assignment | `=`, `+=` | Assign values             |

### Comments
- **Single-line**: `// This is a comment`
- **Multi-line**:
  ```javascript
  /* This is 
     a multi-line comment */
  ```

### Control Structures
- **if-else**:
  ```javascript
  if (x > 10) {
    console.log('x is large');
  } else {
    console.log('x is small');
  }
  ```
- **Loops**:
  ```javascript
  for (let i = 0; i < 5; i++) {
    console.log(i);
  }
  ```

---

## JavaScript Scopes
Scope determines the accessibility of variables. 

1. **Global Scope**: Variables accessible throughout the script.
2. **Local Scope**: Variables accessible within a function or block.
3. **Block Scope**: Variables declared with `let` and `const`.

Example:
```javascript
let globalVar = 'I am global';

function localScopeExample() {
  let localVar = 'I am local';
  console.log(localVar);
}

localScopeExample();
console.log(globalVar);
```

---

## Strings and String Methods

### Strings
Strings represent text in JavaScript. They can be enclosed in single, double, or backticks.

Example:
```javascript
let greeting = "Hello, World!";
let name = 'Alice';
let message = `Welcome, ${name}`;
```

### Common String Methods
| Method         | Description                            | Example                      |
|----------------|----------------------------------------|------------------------------|
| `length`       | Returns the length of the string       | `greeting.length`            |
| `toUpperCase`  | Converts to uppercase                 | `greeting.toUpperCase()`     |
| `toLowerCase`  | Converts to lowercase                 | `greeting.toLowerCase()`     |
| `slice`        | Extracts part of a string             | `greeting.slice(0, 5)`       |
| `replace`      | Replaces part of a string             | `greeting.replace('World', 'JavaScript')` |

---

## Numbers and Number Methods
JavaScript supports numbers as integers or floating-point values.

Example:
```javascript
let num1 = 10;
let num2 = 20.5;
console.log(num1 + num2);
```

### Common Number Methods
| Method        | Description                     | Example                   |
|---------------|---------------------------------|---------------------------|
| `toFixed`     | Rounds to a fixed number of decimals | `(20.567).toFixed(2)`  |
| `toString`    | Converts number to string       | `(123).toString()`        |
| `parseInt`    | Converts string to integer      | `parseInt('123')`         |
| `parseFloat`  | Converts string to float        | `parseFloat('123.45')`    |

---

## Boolean Values
Booleans represent `true` or `false` values.

Example:
```javascript
let isJavaScriptFun = true;
console.log(isJavaScriptFun);
```

---

## Dates, Date Formats, and Date Methods
JavaScript provides the `Date` object to handle dates and times.

### Example:
```javascript
let now = new Date();
console.log(now);
```

### Common Date Methods
| Method          | Description                     | Example                       |
|-----------------|---------------------------------|-------------------------------|
| `getFullYear`   | Returns the year               | `now.getFullYear()`          |
| `getMonth`      | Returns the month (0-11)       | `now.getMonth()`             |
| `getDate`       | Returns the day of the month   | `now.getDate()`              |
| `getDay`        | Returns the weekday (0-6)      | `now.getDay()`               |
| `toISOString`   | Converts to ISO 8601 format    | `now.toISOString()`          |

---

## Arrays and Array Methods

### Arrays
Arrays are collections of elements stored in a single variable.

Example:
```javascript
let fruits = ['Apple', 'Banana', 'Cherry'];
console.log(fruits[0]); // Apple
```

### Common Array Methods
| Method         | Description                     | Example                     |
|----------------|---------------------------------|-----------------------------|
| `push`         | Adds an element to the end      | `fruits.push('Orange')`    |
| `pop`          | Removes the last element        | `fruits.pop()`             |
| `shift`        | Removes the first element       | `fruits.shift()`           |
| `unshift`      | Adds an element to the beginning | `fruits.unshift('Grape')` |
| `splice`       | Adds/Removes elements           | `fruits.splice(1, 1)`      |
| `slice`        | Extracts a section of the array | `fruits.slice(0, 2)`       |

---


# JavaScript Advanced Concepts

## Objects in JavaScript

### Object Definitions
Objects are collections of key-value pairs, where keys are strings (or symbols) and values can be any data type. Objects allow dynamic and structured data representation.

Example:
```javascript
const person = {
  firstName: "John",
  lastName: "Doe",
  age: 30,
  greet: function() {
    return `Hello, my name is ${this.firstName} ${this.lastName}.`;
  }
};
console.log(person.greet()); // Hello, my name is John Doe.
```

### Object Properties
Properties define the characteristics of an object and can be added, modified, or deleted dynamically.
- Access properties using dot notation or bracket notation.

Example:
```javascript
console.log(person.lastName); // Dot notation
console.log(person["age"]); // Bracket notation
person.age = 31; // Modify property
person.hobby = "Reading"; // Add property
console.log(person.hobby); // Reading
```

### Object Methods
Methods are functions associated with an object, enabling encapsulation of behavior within the object.

Example:
```javascript
const calculator = {
  add: function(a, b) {
    return a + b;
  },
  subtract(a, b) {
    return a - b; // Shorthand for method
  }
};
console.log(calculator.add(5, 3)); // 8
console.log(calculator.subtract(10, 7)); // 3
```

### Object Prototypes
Prototypes allow objects to inherit properties and methods from a prototype chain. This feature is the basis of JavaScript's inheritance model.

Example:
```javascript
function Person(name) {
  this.name = name;
}
Person.prototype.greet = function() {
  return `Hello, ${this.name}!`;
};
const alice = new Person("Alice");
const bob = new Person("Bob");
console.log(alice.greet()); // Hello, Alice!
console.log(bob.greet()); // Hello, Bob!
```

---

## Functions in JavaScript

### Function Definitions
Functions encapsulate reusable code. They can be defined using function declarations, expressions, or arrow functions.

Example:
```javascript
// Function Declaration
function greet() {
  console.log("Hello, World!");
}

// Function Expression
const add = function(a, b) {
  return a + b;
};

// Arrow Function
const multiply = (a, b) => a * b;

console.log(add(2, 3)); // 5
console.log(multiply(4, 5)); // 20
```

### Function Parameters
Functions can accept parameters and use default values.

Example:
```javascript
function introduce(name = "Guest") {
  return `Welcome, ${name}!`;
}
console.log(introduce("Alice")); // Welcome, Alice!
console.log(introduce()); // Welcome, Guest!
```

### Function Invocation
Functions can be invoked directly or through an event.

Example:
```javascript
function sayHello() {
  console.log("Hello!");
}
sayHello(); // Direct invocation

const button = document.querySelector("button");
button.addEventListener("click", sayHello); // Event-based invocation
```

### Function Closures
Closures enable functions to access their outer lexical environment even after the outer function has completed execution.

Example:
```javascript
function counter() {
  let count = 0;
  return function() {
    count++;
    return count;
  };
}
const increment = counter();
console.log(increment()); // 1
console.log(increment()); // 2
```

---

## Introduction to Object-Oriented Programming in JavaScript
JavaScript supports Object-Oriented Programming (OOP) principles, including:

### Methods
Methods encapsulate behavior inside objects or classes.

Example:
```javascript
class Animal {
  speak() {
    console.log("Animal speaks");
  }
}
const dog = new Animal();
dog.speak(); // Animal speaks
```

### Constructor
Constructors initialize properties of objects.

Example:
```javascript
class Animal {
  constructor(name) {
    this.name = name;
  }
  speak() {
    console.log(`${this.name} makes a sound.`);
  }
}
const dog = new Animal("Dog");
dog.speak(); // Dog makes a sound.
```

### Inheritance
Inheritance allows classes to extend functionality from parent classes.

Example:
```javascript
class Animal {
  constructor(name) {
    this.name = name;
  }
  speak() {
    console.log(`${this.name} makes a sound.`);
  }
}
class Dog extends Animal {
  speak() {
    console.log(`${this.name} barks.`);
  }
}
const dog = new Dog("Buddy");
dog.speak(); // Buddy barks
```

### Encapsulation
Encapsulation restricts access to object properties and methods.

Example:
```javascript
class Person {
  #ssn; // Private property
  constructor(name, ssn) {
    this.name = name;
    this.#ssn = ssn;
  }
  getSSN() {
    return this.#ssn;
  }
}
const john = new Person("John", "123-45-6789");
console.log(john.getSSN()); // 123-45-6789
```

### Abstraction
Abstraction hides implementation details while exposing essential features.

Example:
```javascript
class Vehicle {
  startEngine() {
    console.log("Engine started.");
  }
}
const car = new Vehicle();
car.startEngine(); // Engine started.
```

### Polymorphism
Polymorphism enables methods to have different implementations based on the object type.

Example:
```javascript
class Shape {
  draw() {
    console.log("Drawing a shape.");
  }
}
class Circle extends Shape {
  draw() {
    console.log("Drawing a circle.");
  }
}
const shape = new Shape();
const circle = new Circle();
shape.draw(); // Drawing a shape.
circle.draw(); // Drawing a circle.
```

---


## Document Object Model (DOM)

### Object Hierarchy in JavaScript
The DOM represents the structure of a web document as a hierarchical tree. Each HTML element, attribute, and text becomes a node.

```plaintext
Document
├── <html>
│   ├── <head>
│   │   ├── <title>
│   │   └── <meta>
│   └── <body>
│       ├── <div>
│       ├── <p>
│       └── <script>
```

### HTML DOM
The HTML DOM provides methods and properties to manipulate the content, style, and structure of a webpage dynamically.

#### Key DOM Objects:
- **`document`**: Represents the entire HTML document.
- **`window`**: The global object representing the browser window.
- **`navigator`**: Provides browser and system information.
- **`location`**: Contains information about the current URL.

#### Example:
```javascript
console.log(document.title); // Logs the title of the document
console.log(location.href); // Logs the current URL
```

### DOM Elements
Elements are nodes in the DOM tree corresponding to HTML tags.

#### Accessing Elements:
```javascript
const div = document.getElementById("myDiv");
console.log(div.innerHTML); // Retrieves content inside the <div>
```

### DOM Events
Events are triggered by user actions (e.g., clicks, keypresses) or browser actions.

#### Event Listener Example:
```javascript
const button = document.getElementById("myButton");
button.addEventListener("click", () => {
  alert("Button clicked!");
});
```

### DOM Methods
- **`getElementById()`**: Access an element by its `id`.
- **`querySelector()`**: Returns the first matching element for a CSS selector.
- **`createElement()`**: Dynamically creates elements.
- **`appendChild()`**: Adds a node to the DOM.

#### Example of Manipulation:
```javascript
const newElement = document.createElement("p");
newElement.textContent = "This is a dynamically added paragraph.";
document.body.appendChild(newElement);
```

---

## Forms, Forms API, Forms Validation

### Forms
HTML forms are used to collect user input and send it to a server.

#### Example:
```html
<form id="myForm">
  <label for="email">Email:</label>
  <input type="email" id="email" required>
  <button type="submit">Submit</button>
</form>
```

### Forms API
JavaScript can interact with forms through the DOM.

#### Example:
```javascript
const form = document.getElementById("myForm");
form.addEventListener("submit", (e) => {
  e.preventDefault(); // Prevent default form submission
  console.log("Form submitted!");
});
```

### Forms Validation
Form validation ensures that user input meets specific criteria.

#### HTML5 Attributes for Validation:
- **`required`**: Ensures the field is filled.
- **`pattern`**: Validates input using a regular expression.
- **`type`**: Validates based on input type (e.g., `email`).

#### JavaScript Validation:
```javascript
const emailInput = document.getElementById("email");
if (!emailInput.value.includes("@")) {
  alert("Please enter a valid email address.");
}
```

---

## Regular Expressions
Regular expressions (RegEx) are powerful tools for pattern matching and text manipulation.

### Syntax:
```javascript
const regex = /\d+/; // Matches one or more digits
console.log(regex.test("123")); // true
```

### Common Methods:
- **`test()`**: Checks if the string matches the pattern.
- **`exec()`**: Returns the matched result.

#### Example:
```javascript
const regex = /hello/i; // Case-insensitive match
console.log(regex.test("Hello, world!")); // true
console.log("Hello, world!".match(regex)); // ['Hello']
```

---

## Errors and Debugging

### Errors
Errors occur during code execution and can be handled using `try...catch` blocks.

#### Types of Errors:
- **SyntaxError**: Issues in the code structure.
- **ReferenceError**: Accessing undeclared variables.
- **TypeError**: Invalid operations on data types.

#### Example:
```javascript
try {
  const result = unknownFunction(); // Causes ReferenceError
} catch (error) {
  console.error("An error occurred:", error.message);
}
```

### Debugging
Debugging involves identifying and resolving issues in code.

#### Debugging Tools:
- **`console` Methods**:
  - `console.log()`: Log output.
  - `console.error()`: Log errors.
  - `console.table()`: Display data in a table format.
- **Breakpoints**: Pause code execution in the browser dev tools.

---

## Introduction to Browser Dev Tools
Browser DevTools provide a suite of tools to inspect, debug, and optimize web pages.

### Key Tabs:
1. **Elements**: Inspect and modify HTML/CSS in real time.
2. **Console**: Execute JavaScript commands and log output.
3. **Network**: Analyze HTTP requests, responses, and loading times.
4. **Performance**: Monitor resource usage and optimize performance.

#### Example:
Open DevTools with `F12` or `Ctrl+Shift+I`. Use the Console tab to run:
```javascript
console.log("Testing DevTools");
```

---

## Pushing Code Quality via JSLint Tool

### What is JSLint?
JSLint is a static code analysis tool for JavaScript, ensuring quality and adherence to best practices.

### Steps to Use JSLint:
1. Visit the [JSLint website](https://www.jslint.com/).
2. Paste your JavaScript code into the text box.
3. Click **Validate** to identify issues and suggestions.

#### Example Input:
```javascript
let x = 10;
console.log(x);
```

#### Output:
```plaintext
No issues found.
```

### Benefits:
- Identifies potential errors early.
- Promotes consistency in coding standards.
- Improves maintainability and readability.

---

## JSON: JavaScript Object Notation

### Introduction and Need of JSON
JSON (JavaScript Object Notation) is a lightweight data-interchange format that is easy for humans to read and write and easy for machines to parse and generate. It is primarily used for transmitting data between a server and a client in web applications.

#### Key Benefits:
1. **Lightweight**: JSON uses minimal syntax and is compact.
2. **Human-readable**: The structure is easy to understand.
3. **Language-independent**: JSON is supported by most programming languages.
4. **Widely used**: Common in APIs and configuration files.

#### Example Use Case:
- A web application retrieves user details from a server as a JSON object:
```json
{
  "name": "Alice",
  "age": 25,
  "email": "alice@example.com"
}
```

---

### JSON Syntax Rules

1. **Data Structure**: JSON is built on key-value pairs.
   - Keys must be strings enclosed in double quotes (`"`).
   - Values can be strings, numbers, arrays, objects, `true`, `false`, or `null`.

2. **Commas**: Separate key-value pairs and array elements.

3. **Curly Braces**: Enclose JSON objects (`{}`).

4. **Square Brackets**: Represent arrays (`[]`).

#### Example:
```json
{
  "name": "John",
  "age": 30,
  "isAdmin": false,
  "courses": ["Math", "Science"],
  "address": {
    "city": "New York",
    "zip": "10001"
  }
}
```

---

### JSON Objects
A JSON object is a collection of key-value pairs.

#### Example:
```json
{
  "id": 1,
  "title": "Introduction to JSON",
  "author": "Jane Doe"
}
```
Accessing data in JavaScript:
```javascript
const jsonObj = {
  "id": 1,
  "title": "Introduction to JSON",
  "author": "Jane Doe"
};
console.log(jsonObj.title); // Output: Introduction to JSON
```

---

### JSON Arrays
A JSON array is an ordered list of values, which can be strings, numbers, objects, or even nested arrays.

#### Example:
```json
{
  "students": [
    { "name": "Alice", "age": 22 },
    { "name": "Bob", "age": 23 }
  ]
}
```
Accessing array elements in JavaScript:
```javascript
const jsonArray = {
  "students": [
    { "name": "Alice", "age": 22 },
    { "name": "Bob", "age": 23 }
  ]
};
console.log(jsonArray.students[0].name); // Output: Alice
```

---

### JSON Files
JSON files store data in `.json` format and are often used for configuration or data transfer.

#### Example JSON File (`data.json`):
```json
{
  "appName": "Task Manager",
  "version": "1.0.0",
  "features": ["Add Task", "Delete Task", "View Task"]
}
```
Loading a JSON file in JavaScript (e.g., in Node.js):
```javascript
const fs = require('fs');
const data = fs.readFileSync('data.json');
const jsonData = JSON.parse(data);
console.log(jsonData.appName); // Output: Task Manager
```

---

### JSON Parsing
JSON parsing involves converting JSON strings into JavaScript objects or vice versa.

#### Methods:
1. **`JSON.parse()`**: Converts JSON strings into JavaScript objects.
   - Example:
     ```javascript
     const jsonString = '{ "name": "Alice", "age": 25 }';
     const obj = JSON.parse(jsonString);
     console.log(obj.name); // Output: Alice
     ```

2. **`JSON.stringify()`**: Converts JavaScript objects into JSON strings.
   - Example:
     ```javascript
     const jsObj = { name: "Bob", age: 30 };
     const jsonString = JSON.stringify(jsObj);
     console.log(jsonString); // Output: {"name":"Bob","age":30}
     ```

---

## jQuery: Introduction

jQuery is a fast, small, and feature-rich JavaScript library that simplifies tasks such as DOM traversal, event handling, animations, and Ajax interactions. It provides an easy-to-use API that works across a multitude of browsers.

### Key Features:
1. **Cross-browser Compatibility**: Ensures consistent behavior across browsers.
2. **Simplified Syntax**: Reduces the complexity of JavaScript code.
3. **Rich Animations**: Built-in methods for creating interactive effects.
4. **Extensibility**: Supports plugins to extend functionality.

### Basic Example:
```html
<!DOCTYPE html>
<html>
<head>
  <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
</head>
<body>
  <button id="btn">Click Me</button>
  <p id="message">Hello, World!</p>
  <script>
    $("#btn").click(function() {
      $("#message").text("Button clicked!");
    });
  </script>
</body>
</html>
```

---

## jQuery Selectors
jQuery selectors allow you to easily select and manipulate elements in the DOM using CSS-like syntax.

### Common Selectors:
| Selector        | Description                       | Example                        |
|-----------------|-----------------------------------|--------------------------------|
| `*`            | Selects all elements              | `$("*")`                     |
| `#id`          | Selects an element by its ID      | `$("#myId")`                 |
| `.class`        | Selects elements by class name    | `$(".myClass")`              |
| `tag`          | Selects elements by tag name      | `$("div")`                   |
| `[attr=value]`  | Selects elements by attribute     | `$("[type='text']")`         |
| `:nth-child(n)` | Selects the nth child of a parent | `$("li:nth-child(2)")`       |

### Example:
```javascript
$("p").css("color", "blue"); // Changes all <p> text color to blue
$("#myId").hide(); // Hides the element with ID "myId"
```

---

## jQuery Events
jQuery makes it simple to handle events such as clicks, mouse movements, and keyboard interactions.

### Common Event Methods:
| Event Method    | Description                       | Example                        |
|-----------------|-----------------------------------|--------------------------------|
| `.click()`      | Handles click events              | `$("#btn").click(handler)`   |
| `.hover()`      | Handles mouse hover events        | `$("div").hover(in, out)`    |
| `.keydown()`    | Handles key press events          | `$("input").keydown(handler)`|
| `.on()`         | Binds multiple events             | `$("#element").on("click")`|

### Example:
```javascript
$("button").click(function() {
  alert("Button was clicked!");
});
```

---

## jQuery Animation Effects
jQuery provides methods for creating animations and effects.

### Common Effects:
| Method          | Description                                | Example                        |
|-----------------|--------------------------------------------|--------------------------------|
| `.hide()`       | Hides an element                          | `$("#element").hide();`      |
| `.show()`       | Shows a hidden element                    | `$("#element").show();`      |
| `.fadeIn()`     | Fades in an element                       | `$("#element").fadeIn();`    |
| `.fadeOut()`    | Fades out an element                      | `$("#element").fadeOut();`   |
| `.slideUp()`    | Slides an element up                      | `$("#element").slideUp();`   |
| `.slideDown()`  | Slides an element down                    | `$("#element").slideDown();` |
| `.animate()`    | Performs custom animations                | `$("#element").animate({})`  |

### Example:
```javascript
$("#fadeButton").click(function() {
  $("#box").fadeOut();
});
```

---

## jQuery DOM Traversal and Manipulation

### DOM Traversal:
jQuery simplifies navigating the DOM tree.

| Method         | Description                          | Example                        |
|----------------|--------------------------------------|--------------------------------|
| `.parent()`    | Selects the parent of an element     | `$("span").parent()`         |
| `.children()`  | Selects children of an element       | `$("div").children()`        |
| `.siblings()`  | Selects siblings of an element       | `$("p").siblings()`          |
| `.find()`      | Selects descendants                 | `$("div").find("p")`        |

### DOM Manipulation:
jQuery allows adding, removing, and modifying elements dynamically.

| Method         | Description                          | Example                        |
|----------------|--------------------------------------|--------------------------------|
| `.html()`      | Gets or sets HTML content            | `$("div").html("<b>Text</b>")` |
| `.text()`      | Gets or sets text content            | `$("p").text("New Text")`    |
| `.append()`    | Adds content at the end of an element | `$("div").append("<p>Text</p>")` |
| `.prepend()`   | Adds content at the beginning         | `$("div").prepend("<p>Start</p>")` |

### Example:
```javascript
$("#addButton").click(function() {
  $("#list").append("<li>New Item</li>");
});
```

---

## Data Attributes and Templates

### Data Attributes:
Custom data attributes store extra information in HTML elements.

#### Example:
```html
<button data-user="Alice">Click Me</button>
<script>
  $("button").click(function() {
    alert($(this).data("user")); // Outputs: Alice
  });
</script>
```

### Templates:
Templates dynamically generate HTML content using placeholders.

#### Example:
```javascript
const user = { name: "John", age: 30 };
const template = `<p>Name: ${user.name}, Age: ${user.age}</p>`;
$("#content").html(template);
```

---

## jQuery DOM Utility Functions
Utility functions perform common tasks such as measuring and manipulating elements.

| Method          | Description                              | Example                        |
|-----------------|------------------------------------------|--------------------------------|
| `.width()`      | Gets or sets the width of an element     | `$("div").width();`          |
| `.height()`     | Gets or sets the height of an element    | `$("div").height();`         |
| `.offset()`     | Gets the position relative to the document | `$("div").offset();`         |
| `.css()`        | Gets or sets CSS properties             | `$("div").css("color", "blue")` |

---

## jQuery Plugins
Plugins extend the functionality of jQuery by adding reusable code modules.

### Example of a Plugin:
Using the [jQuery UI library](https://jqueryui.com/) to create a date picker:
```html
<input type="text" id="datepicker">
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.min.js"></script>
<script>
  $("#datepicker").datepicker();
</script>
```

---

## AJAX: Asynchronous JavaScript and XML

### Introduction to AJAX
AJAX (Asynchronous JavaScript and XML) is a technique that allows web applications to retrieve and send data to servers asynchronously without refreshing the page. This improves user experience by making web applications faster and more responsive.

#### Key Features:
1. **Asynchronous Communication**: Allows partial updates to the page without reloading.
2. **Data Exchange Formats**: Works with JSON, XML, HTML, or plain text.
3. **Browser Compatibility**: Supported by modern browsers.

#### Basic Workflow:
1. A user interacts with the page (e.g., clicks a button).
2. An AJAX request is sent to the server.
3. The server processes the request and sends a response.
4. The webpage updates dynamically without refreshing.

#### Example:
```javascript
const xhr = new XMLHttpRequest();
xhr.open("GET", "https://api.example.com/data", true);
xhr.onload = function() {
  if (xhr.status === 200) {
    console.log(JSON.parse(xhr.responseText));
  }
};
xhr.send();
```

---

### AJAX Framework and Its Architecture

AJAX follows a client-server architecture:

1. **Client Side**: Initiates the request (browser using JavaScript).
2. **Server Side**: Processes the request and sends a response.
3. **Response Handling**: The client processes and updates the DOM dynamically.

#### Components of AJAX:
1. **JavaScript**: Used to make requests and update the DOM.
2. **XMLHttpRequest (XHR)**: An API for transferring data between a client and server.
3. **Server-Side Script**: Handles requests and sends responses (e.g., PHP, Node.js).
4. **Data Format**: JSON or XML for data exchange.

---

### Web Services and AJAX

Web services provide APIs that AJAX can use to retrieve or send data. They often use RESTful or SOAP protocols.

#### RESTful Web Services:
- Use HTTP methods such as `GET`, `POST`, `PUT`, and `DELETE`.
- Return data in JSON format for easy parsing.

#### Example:
```javascript
fetch("https://api.example.com/users")
  .then(response => response.json())
  .then(data => console.log(data))
  .catch(error => console.error("Error:", error));
```

#### SOAP Web Services:
- Use XML for data exchange.
- Require more verbose request and response formats.

---

### AJAX Using jQuery

jQuery simplifies AJAX calls with its built-in methods, making it easier to interact with web services.

#### Common Methods:
1. **`$.ajax()`**: Performs an AJAX request with extensive configuration options.
2. **`$.get()`**: Simplifies `GET` requests.
3. **`$.post()`**: Simplifies `POST` requests.

#### Example: Using `$.ajax()`
```javascript
$.ajax({
  url: "https://api.example.com/data",
  type: "GET",
  dataType: "json",
  success: function(data) {
    console.log(data);
  },
  error: function(error) {
    console.error("Error:", error);
  }
});
```

#### Example: Using `$.get()`
```javascript
$.get("https://api.example.com/data", function(data) {
  console.log(data);
});
```

#### Example: Using `$.post()`
```javascript
$.post("https://api.example.com/save", { name: "Alice", age: 25 }, function(response) {
  console.log(response);
});
```

---

### Practical AJAX Example with jQuery

#### HTML:
```html
<button id="loadData">Load Data</button>
<div id="content"></div>
```

#### jQuery AJAX Call:
```javascript
$("#loadData").click(function() {
  $.get("https://api.example.com/data", function(data) {
    $("#content").html(`<p>${data.message}</p>`);
  });
});
```

---

## Axios: A Promise-based HTTP Client

### Introduction to Axios
Axios is a popular JavaScript library used for making HTTP requests. It is promise-based, enabling cleaner and more readable asynchronous code. Axios works in both browser and Node.js environments.

#### Key Features:
1. **Promise-based**: Supports `async/await` for better code readability.
2. **Automatic JSON Parsing**: Parses JSON responses automatically.
3. **Interceptors**: Modify requests or responses globally.
4. **Error Handling**: Provides detailed error objects.
5. **Cancelation**: Cancel ongoing requests easily.

---

## The Axios Instance and Its Config

### Axios Instance
An Axios instance is a custom configuration of Axios. It allows you to set default properties such as the base URL and headers for your HTTP requests.

#### Creating an Axios Instance:
```javascript
const axiosInstance = axios.create({
  baseURL: "https://api.example.com",
  timeout: 5000, // Request timeout in milliseconds
  headers: {
    "Content-Type": "application/json",
    Authorization: "Bearer YOUR_ACCESS_TOKEN",
  },
});
```

#### Using the Instance:
```javascript
axiosInstance.get("/users")
  .then(response => console.log(response.data))
  .catch(error => console.error(error));
```

### Config Options
Axios provides a wide range of configuration options for fine-tuning requests.

| Option         | Description                             |
|----------------|-----------------------------------------|
| `baseURL`      | Sets the base URL for requests          |
| `headers`      | Configures custom HTTP headers          |
| `params`       | Adds query parameters to the URL        |
| `timeout`      | Sets a timeout for the request (in ms)  |
| `auth`         | Provides basic authentication credentials |
| `responseType` | Specifies the response type (e.g., `json`, `blob`) |

---

## Handling Request and Response

### Making HTTP Requests
Axios supports all HTTP methods (`GET`, `POST`, `PUT`, `DELETE`, etc.).

#### Example:
```javascript
// GET Request
axios.get("https://api.example.com/data")
  .then(response => console.log(response.data))
  .catch(error => console.error(error));

// POST Request
axios.post("https://api.example.com/users", {
  name: "Alice",
  email: "alice@example.com",
})
  .then(response => console.log(response.data))
  .catch(error => console.error(error));
```

### Request and Response Interceptors
Interceptors allow you to modify requests or responses globally.

#### Request Interceptor:
```javascript
axios.interceptors.request.use(config => {
  config.headers.Authorization = "Bearer TOKEN";
  return config;
}, error => {
  return Promise.reject(error);
});
```

#### Response Interceptor:
```javascript
axios.interceptors.response.use(response => {
  return response;
}, error => {
  if (error.response.status === 401) {
    console.error("Unauthorized! Please log in again.");
  }
  return Promise.reject(error);
});
```

---

## Handling Errors
Axios provides detailed error objects to help identify and handle issues effectively.

### Error Object Properties:
| Property        | Description                             |
|-----------------|-----------------------------------------|
| `response`      | Contains the server response (if available) |
| `request`       | Represents the actual request object    |
| `message`       | Error message string                   |
| `config`        | The Axios request configuration         |

#### Example:
```javascript
axios.get("https://api.example.com/invalid-endpoint")
  .then(response => console.log(response.data))
  .catch(error => {
    if (error.response) {
      // Server responded with a status code outside the range 2xx
      console.error("Error Status:", error.response.status);
      console.error("Error Data:", error.response.data);
    } else if (error.request) {
      // Request was made, but no response was received
      console.error("No response received:", error.request);
    } else {
      // Something else happened while setting up the request
      console.error("Error Message:", error.message);
    }
  });
```

---

## Introduction to Node.js

Node.js is an open-source, cross-platform JavaScript runtime built on Chrome's V8 JavaScript engine. It allows developers to run JavaScript on the server side, enabling backend development using the same language as frontend development.

### Key Features of Node.js:
1. **Asynchronous and Event-Driven**: Non-blocking I/O operations enable high scalability.
2. **Single-Threaded**: Uses a single-threaded model with event looping for handling multiple requests.
3. **Fast Execution**: Built on the V8 engine, Node.js executes code efficiently.
4. **NPM Ecosystem**: The Node Package Manager (NPM) offers a vast collection of libraries and tools.

#### Example:
```javascript
const http = require('http');

const server = http.createServer((req, res) => {
  res.statusCode = 200;
  res.setHeader('Content-Type', 'text/plain');
  res.end('Hello, Node.js!');
});

server.listen(3000, () => {
  console.log('Server running at http://localhost:3000/');
});
```

---

## Browser JS vs. Node.js

While both browser JavaScript and Node.js share the same language, they differ significantly in functionality and use cases.

| Feature                | Browser JS                           | Node.js                            |
|------------------------|---------------------------------------|------------------------------------|
| **Environment**        | Runs in the browser                  | Runs on the server                 |
| **Global Object**      | `window`                             | `global`                           |
| **I/O Access**         | Limited to DOM, cookies, etc.        | Access to file system, network, etc. |
| **Modules**            | ES6 Modules (`import/export`)        | CommonJS (`require`) and ES6 Modules |
| **APIs**               | Browser-specific (e.g., `fetch`, `alert`) | Server APIs (e.g., `fs`, `http`) |

#### Example:
- **Browser**:
  ```javascript
  console.log(window.location.href);
  ```
- **Node.js**:
  ```javascript
  const fs = require('fs');
  fs.readFile('example.txt', 'utf8', (err, data) => {
    if (err) throw err;
    console.log(data);
  });
  ```

---

## ECMAScript 2015 (ES6)

ES6 (ECMAScript 2015) introduced significant features and enhancements to JavaScript, making it more powerful and easier to write.

### Key Features:

#### 1. **let and const**
- `let`: Block-scoped variable declaration.
- `const`: Block-scoped constant declaration.

Example:
```javascript
let age = 25;
const name = 'Alice';
```

#### 2. **Arrow Functions**
Concise syntax for defining functions.
```javascript
const add = (a, b) => a + b;
console.log(add(5, 3)); // Output: 8
```

#### 3. **Template Literals**
String interpolation using backticks.
```javascript
const greeting = `Hello, ${name}!`;
console.log(greeting);
```

#### 4. **Destructuring**
Extract values from objects or arrays.
```javascript
const person = { name: 'John', age: 30 };
const { name, age } = person;
console.log(name, age);
```

#### 5. **Modules**
Use `import` and `export` for modular code.
```javascript
// module.js
export const greet = () => console.log('Hello!');

// main.js
import { greet } from './module.js';
greet();
```

#### 6. **Promises**
Handle asynchronous operations.
```javascript
const fetchData = new Promise((resolve, reject) => {
  setTimeout(() => resolve('Data loaded'), 1000);
});
fetchData.then(console.log).catch(console.error);
```

#### 7. **Classes**
Define reusable templates for objects.
```javascript
class Animal {
  constructor(name) {
    this.name = name;
  }
  speak() {
    console.log(`${this.name} makes a sound.`);
  }
}
const dog = new Animal('Dog');
dog.speak();
```

---

## Node.js REPL

The Node.js Read-Eval-Print Loop (REPL) is an interactive shell for executing JavaScript code.

### Features:
1. **Interactive Execution**: Run JavaScript code line-by-line.
2. **Test Code Quickly**: Debug snippets or test libraries.
3. **Access Node.js APIs**: Experiment with Node.js-specific modules like `fs` or `http`.

### Starting REPL:
1. Open your terminal.
2. Type `node` and press Enter.

### Example:
```plaintext
$ node
> const name = 'Alice';
> console.log(`Hello, ${name}!`);
Hello, Alice!
```

### Useful REPL Commands:
| Command        | Description                                |
|----------------|--------------------------------------------|
| `.help`        | Displays help information                  |
| `.exit`        | Exits the REPL                            |
| `.save filename` | Saves the current session to a file       |
| `.load filename` | Loads a file into the current session     |

---


## Introduction to Asynchronous Programming and Callbacks

Asynchronous programming allows tasks to run in the background while the rest of the program continues execution. This is crucial for tasks such as file reading, API requests, and timers, where waiting for a response could delay other operations.

### How Asynchronous Programming Works
JavaScript uses a **single-threaded** model but achieves asynchronous behavior through:
1. **Callback Functions**
2. **Promises**
3. **Async/Await**
4. **Event Loop**

### Callbacks
A callback is a function passed as an argument to another function, executed once the operation is complete.

#### Example: Using a Callback
```javascript
function fetchData(callback) {
  setTimeout(() => {
    callback("Data retrieved");
  }, 1000);
}

fetchData((message) => {
  console.log(message); // Output: Data retrieved
});
```

### Issues with Callbacks
- **Callback Hell**: Deeply nested callbacks make code harder to read and maintain.
```javascript
fetchData((data) => {
  processData(data, (processedData) => {
    saveData(processedData, (response) => {
      console.log("Data saved:", response);
    });
  });
});
```

---

## Promises and Async/Await

### Promises
A Promise is a JavaScript object representing the eventual completion or failure of an asynchronous operation. Promises solve the issue of callback hell by chaining `.then()` calls.

#### States of a Promise:
1. **Pending**: The operation has not completed.
2. **Fulfilled**: The operation completed successfully.
3. **Rejected**: The operation failed.

#### Example: Creating a Promise
```javascript
const fetchData = new Promise((resolve, reject) => {
  setTimeout(() => resolve("Data retrieved"), 1000);
});

fetchData
  .then((data) => console.log(data)) // Output: Data retrieved
  .catch((error) => console.error(error));
```

#### Chaining Promises
```javascript
fetchData
  .then((data) => {
    console.log(data);
    return processData(data);
  })
  .then((processedData) => {
    console.log("Processed:", processedData);
  })
  .catch((error) => console.error("Error:", error));
```

### Async/Await
Introduced in ES2017, `async` and `await` make asynchronous code look and behave more like synchronous code.

#### Example: Async/Await
```javascript
async function fetchAndProcessData() {
  try {
    const data = await fetchData;
    console.log(data); // Output: Data retrieved
    const processedData = await processData(data);
    console.log("Processed:", processedData);
  } catch (error) {
    console.error("Error:", error);
  }
}

fetchAndProcessData();
```

---

## The Event Loop and Timers

### The Event Loop
The event loop is a mechanism in JavaScript that handles asynchronous operations by coordinating the **call stack**, **task queue**, and **microtask queue**.

#### Components:
1. **Call Stack**: Executes JavaScript code.
2. **Task Queue**: Holds tasks from asynchronous operations (e.g., `setTimeout` callbacks).
3. **Microtask Queue**: Holds tasks from Promises and `MutationObserver`.

#### Event Loop Workflow:
1. JavaScript executes all code in the call stack.
2. It processes microtasks (e.g., resolved Promises) from the microtask queue.
3. Then it processes tasks from the task queue.

### Visual Representation of the Event Loop:
```plaintext
Call Stack       Task Queue       Microtask Queue
[ ]             [setTimeout]      [Promise.then]
```

#### Example:
```javascript
console.log("Start");

setTimeout(() => {
  console.log("Timeout");
}, 0);

Promise.resolve("Promise").then((message) => {
  console.log(message);
});

console.log("End");
// Output:
// Start
// End
// Promise
// Timeout
```

### Timers
JavaScript provides built-in timer functions like `setTimeout` and `setInterval`.

#### setTimeout
Schedules a task to execute after a delay.
```javascript
setTimeout(() => {
  console.log("Executed after 1 second");
}, 1000);
```

#### setInterval
Repeats a task at regular intervals.
```javascript
setInterval(() => {
  console.log("Repeats every 2 seconds");
}, 2000);
```

---

## Summary Table: Key Concepts
| Feature               | Description                                | Example                                                                 |
|-----------------------|--------------------------------------------|-------------------------------------------------------------------------|
| **Callback**          | Function executed after an operation       | `setTimeout(() => console.log("Done"), 1000);`                         |
| **Promise**           | Object representing future value           | `fetchData.then(data => console.log(data));`                           |
| **Async/Await**       | Syntactic sugar over Promises              | `const data = await fetchData;`                                        |
| **Event Loop**        | Handles asynchronous operations            | Processes tasks from queues in priority order                          |
| **setTimeout**        | Executes a function after delay            | `setTimeout(() => console.log("Timeout"), 1000);`                      |
| **setInterval**       | Repeats a function at intervals            | `setInterval(() => console.log("Interval"), 2000);`                    |

---

## Understanding Node Modules, Exports, and Require

Node.js modules are reusable JavaScript files that help organize code into smaller, manageable components. Node.js follows the CommonJS module system.

### Core Concepts:

#### 1. **Modules**
Modules encapsulate code to avoid polluting the global namespace. Node.js includes built-in modules (e.g., `fs`, `http`, `path`) and allows user-defined modules.

#### 2. **Exporting**
Exporting allows a module to expose variables, functions, or objects for use in other modules.

#### Example:
```javascript
// math.js
const add = (a, b) => a + b;
const subtract = (a, b) => a - b;
module.exports = { add, subtract };
```

#### 3. **Requiring**
The `require` function imports modules.

#### Example:
```javascript
// app.js
const math = require('./math');
console.log(math.add(5, 3)); // Output: 8
```

### Types of Modules:
1. **Core Modules**: Built into Node.js (e.g., `fs`, `http`).
2. **Local Modules**: Created by the developer.
3. **Third-Party Modules**: Installed via npm (e.g., `express`, `lodash`).

#### Example of a Core Module:
```javascript
const fs = require('fs');
fs.writeFileSync('example.txt', 'Hello, Node.js!');
```

---

## Introduction to npm

npm (Node Package Manager) is a package manager for JavaScript, bundled with Node.js. It helps install, update, and manage dependencies for a Node.js project.

### Key Features of npm:
1. **Install Packages**: Add libraries or tools to your project.
2. **Manage Dependencies**: Track and update packages.
3. **Create Scripts**: Automate tasks using `npm` commands.

---

## package.json and package-lock.json Files

### package.json
The `package.json` file is a manifest that holds metadata about a Node.js project and its dependencies.

#### Key Sections:
| Field              | Description                                   |
|--------------------|-----------------------------------------------|
| `name`             | Name of the project                          |
| `version`          | Version of the project                       |
| `dependencies`     | Lists required packages                      |
| `devDependencies`  | Lists development-only dependencies          |
| `scripts`          | Commands to run scripts (e.g., `start`, `test`) |

#### Example:
```json
{
  "name": "my-app",
  "version": "1.0.0",
  "scripts": {
    "start": "node app.js",
    "test": "echo \"No tests defined\""
  },
  "dependencies": {
    "express": "^4.18.2"
  },
  "devDependencies": {
    "nodemon": "^2.0.22"
  }
}
```

### package-lock.json
This file locks the exact versions of dependencies installed, ensuring consistent installations across environments.

#### Example:
```json
{
  "name": "my-app",
  "version": "1.0.0",
  "lockfileVersion": 2,
  "dependencies": {
    "express": {
      "version": "4.18.2",
      "resolved": "https://registry.npmjs.org/express/-/express-4.18.2.tgz",
      "integrity": "sha512-c1Zz..."
    }
  }
}
```

---

## Install, Update, and Manage Package Dependencies

### Installing Packages
1. **Local Installation** (default):
   Installs packages in the `node_modules` directory of your project.
   ```bash
   npm install express
   ```

2. **Global Installation**:
   Installs packages globally for all projects.
   ```bash
   npm install -g nodemon
   ```

### Updating Packages
- Update a specific package:
  ```bash
  npm update express
  ```
- Update all packages:
  ```bash
  npm update
  ```

### Managing Dependencies
- **Add a dependency**:
  ```bash
  npm install lodash --save
  ```
- **Add a dev dependency**:
  ```bash
  npm install nodemon --save-dev
  ```
- **Remove a package**:
  ```bash
  npm uninstall express
  ```

---

## Local and Global Packages

### Local Packages
Local packages are installed in the `node_modules` directory of the project. These packages are only accessible within the project.

#### Example:
```bash
npm install moment
```
```javascript
const moment = require('moment');
console.log(moment().format('MMMM Do YYYY, h:mm:ss a'));
```

### Global Packages
Global packages are installed system-wide and are accessible from any project or the command line.

#### Example:
```bash
npm install -g nodemon
nodemon app.js
```

---


## File I/O – Synchronous and Asynchronous Methods

Node.js provides the `fs` module for interacting with the file system. It supports both synchronous and asynchronous methods for reading, writing, and managing files.

### Synchronous Methods
Synchronous methods block the execution of code until the file operation is complete.

#### Example:
```javascript
const fs = require('fs');

// Write to a file
fs.writeFileSync('example.txt', 'Hello, Synchronous World!');
console.log('File written successfully');

// Read from a file
const data = fs.readFileSync('example.txt', 'utf8');
console.log(data); // Output: Hello, Synchronous World!
```

### Asynchronous Methods
Asynchronous methods use callbacks or Promises, allowing the program to continue execution while the file operation is performed.

#### Example:
```javascript
const fs = require('fs');

// Write to a file
fs.writeFile('example.txt', 'Hello, Asynchronous World!', (err) => {
  if (err) throw err;
  console.log('File written successfully');

  // Read from the file
  fs.readFile('example.txt', 'utf8', (err, data) => {
    if (err) throw err;
    console.log(data); // Output: Hello, Asynchronous World!
  });
});
```

---

## HTTP Module – Building an HTTP Server

The `http` module in Node.js allows developers to create HTTP servers to handle client requests and send responses.

### Example: Basic HTTP Server
```javascript
const http = require('http');

const server = http.createServer((req, res) => {
  res.statusCode = 200;
  res.setHeader('Content-Type', 'text/plain');
  res.end('Hello, World!');
});

server.listen(3000, () => {
  console.log('Server running at http://localhost:3000/');
});
```

### Handling Different Routes
```javascript
const http = require('http');

const server = http.createServer((req, res) => {
  if (req.url === '/') {
    res.writeHead(200, { 'Content-Type': 'text/plain' });
    res.end('Welcome to the Home Page');
  } else if (req.url === '/about') {
    res.writeHead(200, { 'Content-Type': 'text/plain' });
    res.end('About Us');
  } else {
    res.writeHead(404, { 'Content-Type': 'text/plain' });
    res.end('Page Not Found');
  }
});

server.listen(3000, () => {
  console.log('Server running at http://localhost:3000/');
});
```

---

## Developing a Node Web Application

Building web applications in Node.js often involves using frameworks like `Express` to simplify development.

### Steps to Develop a Node Web Application

1. **Initialize the Project**
   ```bash
   npm init -y
   npm install express
   ```

2. **Create the Server**
   Create a file named `app.js`:
   ```javascript
   const express = require('express');
   const app = express();

   app.get('/', (req, res) => {
     res.send('Welcome to My Web App');
   });

   app.get('/about', (req, res) => {
     res.send('About Us Page');
   });

   app.listen(3000, () => {
     console.log('Server running at http://localhost:3000/');
   });
   ```

3. **Add Middleware**
   Middleware processes requests before they reach the route handlers.
   ```javascript
   const express = require('express');
   const app = express();

   // Middleware to log requests
   app.use((req, res, next) => {
     console.log(`${req.method} ${req.url}`);
     next();
   });

   app.get('/', (req, res) => {
     res.send('Hello with Middleware!');
   });

   app.listen(3000, () => {
     console.log('Server running at http://localhost:3000/');
   });
   ```

4. **Serve Static Files**
   ```javascript
   app.use(express.static('public'));
   ```
   Place your static files (HTML, CSS, JS) in the `public` directory.

5. **Connect to a Database**
   Use a database like MongoDB or MySQL for dynamic content.
   ```javascript
   const mongoose = require('mongoose');

   mongoose.connect('mongodb://localhost:27017/myapp', { useNewUrlParser: true, useUnifiedTopology: true });

   const userSchema = new mongoose.Schema({
     name: String,
     email: String
   });

   const User = mongoose.model('User', userSchema);

   app.get('/users', async (req, res) => {
     const users = await User.find();
     res.json(users);
   });
   ```

---

## Introduction to Express

Express is a lightweight and flexible web application framework for Node.js. It simplifies the development of web applications and APIs by providing robust features for routing, middleware, and view rendering.

### Key Features:
1. **Minimal and Flexible**: Focuses on web and API development.
2. **Routing**: Defines routes for handling HTTP methods and URLs.
3. **Middleware**: Processes requests and responses.
4. **View Rendering**: Supports template engines like EJS, Pug, and Handlebars.
5. **Built-in HTTP Utilities**: Simplifies working with cookies, sessions, and file uploads.

#### Example Use Case:
Building a RESTful API or serving dynamic web pages.

---

## Getting Started with Express

### Step 1: Install Express
1. Initialize a new Node.js project:
   ```bash
   npm init -y
   ```
2. Install Express:
   ```bash
   npm install express
   ```

### Step 2: Create a Basic Express Application
Create a file `app.js`:
```javascript
const express = require('express');
const app = express();

app.get('/', (req, res) => {
  res.send('Welcome to Express!');
});

app.listen(3000, () => {
  console.log('Server is running on http://localhost:3000');
});
```
Run the server:
```bash
node app.js
```
Visit `http://localhost:3000` in your browser.

---

## Application, Request, and Response Objects

### Application Object (`app`)
The `app` object is an instance of the Express application. It is used to configure middleware, define routes, and listen for connections.

#### Example:
```javascript
const express = require('express');
const app = express();

app.set('view engine', 'ejs'); // Set a configuration value
```

### Request Object (`req`)
The `req` object represents the HTTP request and provides properties like:
- `req.query`: Query string parameters.
- `req.params`: URL route parameters.
- `req.body`: Data sent in the request body (requires middleware like `express.json()`).

#### Example:
```javascript
app.get('/user/:id', (req, res) => {
  res.send(`User ID: ${req.params.id}`);
});
```

### Response Object (`res`)
The `res` object is used to send responses back to the client.

#### Example:
```javascript
app.get('/', (req, res) => {
  res.status(200).send('Hello, World!');
});
```

---

## Routes and Middleware

### Routes
Routes define how an application responds to client requests for specific URLs.

#### Example:
```javascript
app.get('/about', (req, res) => {
  res.send('About Us');
});
app.post('/submit', (req, res) => {
  res.send('Form submitted');
});
```

### Middleware
Middleware functions are executed during the lifecycle of a request. They can:
- Execute code.
- Modify the `req` and `res` objects.
- End the request-response cycle.
- Call the next middleware.

#### Types of Middleware:
1. **Application-Level Middleware**:
   ```javascript
   app.use((req, res, next) => {
     console.log('Request URL:', req.url);
     next();
   });
   ```

2. **Router-Level Middleware**:
   ```javascript
   const router = express.Router();
   router.use((req, res, next) => {
     console.log('Router Middleware');
     next();
   });
   ```

3. **Error-Handling Middleware**:
   ```javascript
   app.use((err, req, res, next) => {
     console.error(err.stack);
     res.status(500).send('Something broke!');
   });
   ```

---

## Templates, Template Engines, and Rendering Views

### Templates and Template Engines
Template engines allow dynamic rendering of HTML pages by embedding JavaScript code.

#### Popular Template Engines:
- **EJS**: `<%= variable %>` syntax for embedding JavaScript.
- **Pug**: Indentation-based syntax.
- **Handlebars**: `{{variable}}` syntax for embedding JavaScript.

### Setting Up a Template Engine
1. Install EJS:
   ```bash
   npm install ejs
   ```
2. Configure Express to use EJS:
   ```javascript
   app.set('view engine', 'ejs');
   app.set('views', './views');
   ```

### Rendering Views
Create a file `views/index.ejs`:
```html
<!DOCTYPE html>
<html>
<head>
  <title>Home</title>
</head>
<body>
  <h1>Welcome, <%= name %>!</h1>
</body>
</html>
```

Render the view in a route:
```javascript
app.get('/', (req, res) => {
  res.render('index', { name: 'Express User' });
});
```

---

# **Introduction to React**

## What is React?
React is a **JavaScript library** for building **user interfaces**. It is maintained by **Meta (formerly Facebook)** and a community of developers. React is primarily used for creating single-page applications (SPAs) by breaking the UI into **reusable components**.

### Key Features of React:
- **Declarative:** Focuses on "what to render" rather than "how to render."
- **Component-Based:** Build encapsulated components that manage their state.
- **Virtual DOM:** React uses a virtual representation of the DOM for efficient updates.
- **One-Way Data Binding:** Ensures a unidirectional flow of data for better control.
- **JSX:** Syntax extension that allows HTML-like code in JavaScript.

### Advantages:
- Improves **performance** with Virtual DOM.
- Reusable **components** reduce code duplication.
- Easy to test and debug.
- Supported by a large community.

---

# **Getting Started with React**

### Setting Up a React Project
You can start with React using **Vite**, **Create React App (CRA)**, or custom setups with Webpack. Below is an example using **Vite**.

#### Prerequisites:
- Node.js (v14+ recommended)
- npm or yarn package manager

#### Steps:
1. **Install Vite:**
   ```bash
   npm create vite@latest my-app --template react
   cd my-app
   npm install
   ```

2. **Start the Development Server:**
   ```bash
   npm run dev
   ```

3. **Directory Structure:**
   ```
   my-app/
   ├── public/          # Static assets
   ├── src/             # React components and logic
   │   ├── App.jsx      # Root component
   │   └── index.css    # Global styles
   ├── package.json     # Project metadata
   └── vite.config.js   # Vite configuration
   ```

4. Open `http://localhost:3000` in your browser.

---

# **React Elements and React Components**

## React Elements
A React Element is the **smallest building block** of a React application. It represents a DOM node or component in memory.

### Example:
```jsx
const element = <h1>Hello, World!</h1>;
ReactDOM.render(element, document.getElementById('root'));
```

- **Immutable**: React Elements cannot be modified once created.
- Use JSX to define React Elements.

## React Components
React Components are **functions** or **classes** that return React Elements. They can hold logic and manage their state.

### Types of Components:
1. **Function Components**
2. **Class Components**

---

# **Function and Class Components**

## 1. Function Components
Simpler and more modern way of creating components.

### Example:
```jsx
function Greeting(props) {
  return <h1>Hello, {props.name}!</h1>;
}
```

### Features:
- Stateless before React 16.8, but now supports state using **Hooks**.
- Easier to test and debug.

---

## 2. Class Components
Traditional way of defining components.

### Example:
```jsx
class Greeting extends React.Component {
  render() {
    return <h1>Hello, {this.props.name}!</h1>;
  }
}
```

### Features:
- Stateful by using `this.state`.
- Requires lifecycle methods for side effects.

---

# **Working with React Components and Props**

### Props (Properties)
Props are **read-only** inputs to components. They allow you to pass data from parent to child components.

#### Example:
```jsx
function Welcome(props) {
  return <h1>Welcome, {props.user}!</h1>;
}

ReactDOM.render(<Welcome user="Pratik" />, document.getElementById('root'));
```

---

## **Compose Components**
Composition involves combining smaller components to build complex UIs.

### Example:
```jsx
function Header() {
  return <h1>My Application</h1>;
}

function Footer() {
  return <p>© 2025 All Rights Reserved</p>;
}

function App() {
  return (
    <div>
      <Header />
      <Footer />
    </div>
  );
}
```

---

## **Render Components**
React's rendering is handled by the `ReactDOM.render()` function.

### Example:
```jsx
ReactDOM.render(<App />, document.getElementById('root'));
```

---

## **Declutter Components**
Large components can be **decluttered** by splitting logic into smaller reusable pieces.

### Before:
```jsx
function Profile(props) {
  return (
    <div>
      <h1>{props.name}</h1>
      <p>{props.bio}</p>
      <button onClick={props.onFollow}>Follow</button>
    </div>
  );
}
```

### After (Decluttered):
```jsx
function ProfileHeader({ name }) {
  return <h1>{name}</h1>;
}

function ProfileBody({ bio }) {
  return <p>{bio}</p>;
}

function ProfileActions({ onFollow }) {
  return <button onClick={onFollow}>Follow</button>;
}

function Profile({ name, bio, onFollow }) {
  return (
    <div>
      <ProfileHeader name={name} />
      <ProfileBody bio={bio} />
      <ProfileActions onFollow={onFollow} />
    </div>
  );
}
```

---

# **Diagrams and Flowcharts**

## React Component Lifecycle (For Class Components)
```mermaid
graph TD;
    A[Mounting] --> B[constructor()]
    B --> C[render()]
    C --> D[componentDidMount()]
    A --> E[Updating]
    E --> F[shouldComponentUpdate()]
    F --> G[render()]
    G --> H[componentDidUpdate()]
    A --> I[Unmounting]
    I --> J[componentWillUnmount()]
```

---

# Summary Table

| Feature            | Function Components | Class Components |
|--------------------|---------------------|------------------|
| Syntax             | Simpler             | Verbose          |
| State Management   | Hooks               | `this.state`     |
| Lifecycle Methods  | Hooks               | Built-in Methods |
| Performance        | Faster              | Slightly Slower  |

---

## **Introduction to State and Lifecycle**

## What is State?
State is a **JavaScript object** that holds dynamic data for a React component. It determines how that component renders and behaves. Unlike props, state is **managed within the component** and can change over time.

### Characteristics of State:
- **Local to a component**: Each component can have its own state.
- **Mutable**: State can be updated using `setState` (class components) or the `useState` Hook (function components).
- **Triggers Re-rendering**: Changes to state cause the component to re-render.

## What is Lifecycle in React?
Lifecycle methods are **special methods** in class components that allow you to hook into different phases of a component’s existence: **Mounting**, **Updating**, and **Unmounting**.

---

# **Stateful Components and Lifecycle Methods**

### Stateful Components
Stateful components are those that manage their own state. Both class and function components can be stateful:

#### Example (Class Component):
```jsx
class Counter extends React.Component {
  constructor(props) {
    super(props);
    this.state = { count: 0 };
  }

  increment = () => {
    this.setState({ count: this.state.count + 1 });
  };

  render() {
    return (
      <div>
        <p>Count: {this.state.count}</p>
        <button onClick={this.increment}>Increment</button>
      </div>
    );
  }
}
```

#### Example (Function Component):
```jsx
import React, { useState } from 'react';

function Counter() {
  const [count, setCount] = useState(0);

  return (
    <div>
      <p>Count: {count}</p>
      <button onClick={() => setCount(count + 1)}>Increment</button>
    </div>
  );
}
```

---

### Lifecycle Methods in Class Components

#### Mounting:
Methods invoked when the component is added to the DOM.
- `constructor()`
- `render()`
- `componentDidMount()`

#### Updating:
Methods invoked when the component's state or props change.
- `shouldComponentUpdate()`
- `render()`
- `componentDidUpdate()`

#### Unmounting:
Method invoked when the component is removed from the DOM.
- `componentWillUnmount()`

### Lifecycle Example:
```jsx
class LifecycleDemo extends React.Component {
  constructor(props) {
    super(props);
    this.state = { data: null };
  }

  componentDidMount() {
    console.log("Component mounted");
    // Example: Fetch data here
  }

  componentDidUpdate(prevProps, prevState) {
    console.log("Component updated");
  }

  componentWillUnmount() {
    console.log("Component will unmount");
  }

  render() {
    return <div>Lifecycle Demo</div>;
  }
}
```

---

# **Props vs. State vs. Context**

| Feature          | Props                        | State                        | Context                          |
|------------------|------------------------------|------------------------------|----------------------------------|
| Definition       | Read-only data passed to components | Mutable data managed within a component | Global data accessible to multiple components |
| Mutability       | Immutable                   | Mutable                     | Immutable (context values can change via a provider) |
| Scope            | Parent to child             | Local to the component      | Shared across the component tree |
| Use Case         | Pass data to child components | Manage component-specific data | Share global data like themes, user info |

### Example of Context:
```jsx
import React, { createContext, useContext } from "react";

const ThemeContext = createContext("light");

function App() {
  return (
    <ThemeContext.Provider value="dark">
      <Toolbar />
    </ThemeContext.Provider>
  );
}

function Toolbar() {
  const theme = useContext(ThemeContext);
  return <div>Current Theme: {theme}</div>;
}
```

---

# **Handling Events**

### Handling Events in React
React uses **synthetic events**, which wrap native DOM events for cross-browser compatibility. Event handling is similar to handling events in plain JavaScript, but with a slightly different syntax.

#### Example of Event Handling:
```jsx
function ButtonClick() {
  function handleClick() {
    alert("Button clicked!");
  }

  return <button onClick={handleClick}>Click Me</button>;
}
```

### Passing Arguments to Event Handlers:
```jsx
function ButtonClick() {
  function handleClick(id) {
    alert(`Button ${id} clicked!`);
  }

  return <button onClick={() => handleClick(1)}>Click Me</button>;
}
```

---

# **Conditional Rendering**

Conditional rendering means rendering different UI elements based on some condition.

### Using `if-else`:
```jsx
function Greeting({ isLoggedIn }) {
  if (isLoggedIn) {
    return <h1>Welcome back!</h1>;
  } else {
    return <h1>Please log in.</h1>;
  }
}
```

### Using Ternary Operator:
```jsx
function Greeting({ isLoggedIn }) {
  return isLoggedIn ? <h1>Welcome back!</h1> : <h1>Please log in.</h1>;
}
```

### Using Logical AND (`&&`):
```jsx
function Notification({ hasMessage }) {
  return (
    <div>
      {hasMessage && <p>You have new messages!</p>}
    </div>
  );
}
```

---

# **Lists and Keys**

## Rendering Multiple Components
When working with lists in React, you often render multiple components dynamically using arrays and the `map()` function.

### Example:
```jsx
function ItemList() {
  const items = ["Apple", "Banana", "Cherry"];

  return (
    <ul>
      {items.map((item, index) => (
        <li key={index}>{item}</li>
      ))}
    </ul>
  );
}
```

### Why Keys Are Important:
- Keys help React identify which items have changed, are added, or removed.
- They improve performance by allowing React to re-render only the updated parts.
- **Keys must be unique among siblings.**

---

## Basic List Component
A simple reusable list component can make rendering dynamic lists easier.

### Example:
```jsx
function BasicList({ items }) {
  return (
    <ul>
      {items.map((item) => (
        <li key={item.id}>{item.name}</li>
      ))}
    </ul>
  );
}

const itemList = [
  { id: 1, name: "Apple" },
  { id: 2, name: "Banana" },
  { id: 3, name: "Cherry" }
];

ReactDOM.render(<BasicList items={itemList} />, document.getElementById("root"));
```

---

# **Working with Forms and Inputs**

Forms are a key part of user interaction in React. Controlled components are typically used to manage form state.

## Controlled Components
A controlled component is an input element whose value is controlled by React state.

### Example:
```jsx
function FormExample() {
  const [name, setName] = React.useState("");

  function handleSubmit(event) {
    event.preventDefault();
    alert(`Form submitted with name: ${name}`);
  }

  return (
    <form onSubmit={handleSubmit}>
      <label>
        Name:
        <input
          type="text"
          value={name}
          onChange={(e) => setName(e.target.value)}
        />
      </label>
      <button type="submit">Submit</button>
    </form>
  );
}
```

---

# **Refs and the DOM**

Refs are used to access DOM elements directly in React. They are created using the `React.createRef()` method or the `useRef()` Hook.

### Example Using `useRef()`:
```jsx
function InputFocus() {
  const inputRef = React.useRef(null);

  function handleFocus() {
    inputRef.current.focus();
  }

  return (
    <div>
      <input type="text" ref={inputRef} />
      <button onClick={handleFocus}>Focus Input</button>
    </div>
  );
}
```

### When to Use Refs:
- Managing focus, text selection, or media playback.
- Triggering imperative animations.
- Integrating third-party DOM libraries.

---

# **Lifting State Up**

Lifting state up involves moving state to the closest common ancestor of components that share the same data. This ensures a **single source of truth** for shared state.

### Example:
```jsx
function TemperatureInput({ scale, temperature, onTemperatureChange }) {
  const scaleNames = {
    c: "Celsius",
    f: "Fahrenheit"
  };

  return (
    <fieldset>
      <legend>Enter temperature in {scaleNames[scale]}:</legend>
      <input
        value={temperature}
        onChange={(e) => onTemperatureChange(e.target.value)}
      />
    </fieldset>
  );
}

function Calculator() {
  const [temperature, setTemperature] = React.useState("");
  const [scale, setScale] = React.useState("c");

  function handleCelsiusChange(temp) {
    setTemperature(temp);
    setScale("c");
  }

  function handleFahrenheitChange(temp) {
    setTemperature(temp);
    setScale("f");
  }

  return (
    <div>
      <TemperatureInput
        scale="c"
        temperature={scale === "c" ? temperature : ((temperature - 32) * 5) / 9}
        onTemperatureChange={handleCelsiusChange}
      />
      <TemperatureInput
        scale="f"
        temperature={scale === "f" ? temperature : (temperature * 9) / 5 + 32}
        onTemperatureChange={handleFahrenheitChange}
      />
    </div>
  );
}
```

### Benefits of Lifting State:
- Avoids duplication of state logic.
- Ensures data consistency between components.

---

# **Error Boundaries**

## What are Error Boundaries?
Error Boundaries are React components that **catch JavaScript errors** anywhere in their child component tree, log those errors, and display a fallback UI instead of crashing the application.

### Features:
- Error boundaries catch errors during **rendering**, in **lifecycle methods**, and in constructors of the whole tree below them.
- They do **not catch errors** inside event handlers.

### Example of an Error Boundary:
```jsx
class ErrorBoundary extends React.Component {
  constructor(props) {
    super(props);
    this.state = { hasError: false };
  }

  static getDerivedStateFromError(error) {
    return { hasError: true };
  }

  componentDidCatch(error, info) {
    console.error("ErrorBoundary caught an error", error, info);
  }

  render() {
    if (this.state.hasError) {
      return <h1>Something went wrong.</h1>;
    }

    return this.props.children;
  }
}

function ProblematicComponent() {
  throw new Error("An unexpected error occurred!");
}

function App() {
  return (
    <ErrorBoundary>
      <ProblematicComponent />
    </ErrorBoundary>
  );
}
```

### When to Use Error Boundaries:
- Wrapping application-wide critical components.
- Catching errors in specific UI parts (e.g., widgets or feature modules).

---

# **Composition vs. Inheritance**

React recommends **composition** over inheritance to reuse code and build flexible UIs.

## **Containment**
Containment is when one component acts as a container for child components, allowing for flexible content placement.

### Example:
```jsx
function Card({ children }) {
  return <div className="card">{children}</div>;
}

function App() {
  return (
    <Card>
      <h1>Title</h1>
      <p>This is some content inside the card.</p>
    </Card>
  );
}
```

## **Specialization**
Specialization refers to creating specialized components by composing more generic ones.

### Example:
```jsx
function Button({ label, onClick }) {
  return <button onClick={onClick}>{label}</button>;
}

function PrimaryButton(props) {
  return <Button {...props} style={{ backgroundColor: "blue", color: "white" }} />;
}

function SecondaryButton(props) {
  return <Button {...props} style={{ backgroundColor: "gray", color: "white" }} />;
}

function App() {
  return (
    <div>
      <PrimaryButton label="Save" onClick={() => alert("Saved!")} />
      <SecondaryButton label="Cancel" onClick={() => alert("Cancelled!")} />
    </div>
  );
}
```

---

# **Thinking in React**

## The Five Steps to Building a React App:
1. **Break the UI into a component hierarchy.**
   - Identify all UI components and their relationships.

2. **Build a static version of the app.**
   - Create components without interactivity by passing data via props.

3. **Identify the minimal representation of state.**
   - Determine the least amount of state required and decide where it should live.

4. **Identify where state should live.**
   - Place state in the closest common ancestor of components that need it.

5. **Add inverse data flow.**
   - Allow child components to update state in parent components.

### Example:
#### Step 1: Break the UI into components
```plaintext
FilterableProductTable
├── SearchBar
└── ProductTable
    ├── ProductCategoryRow
    └── ProductRow
```

#### Step 2: Static Version
```jsx
function ProductRow({ product }) {
  return (
    <tr>
      <td>{product.name}</td>
      <td>{product.price}</td>
    </tr>
  );
}

function ProductTable({ products }) {
  return (
    <table>
      <thead>
        <tr>
          <th>Name</th>
          <th>Price</th>
        </tr>
      </thead>
      <tbody>
        {products.map((product) => (
          <ProductRow key={product.name} product={product} />
        ))}
      </tbody>
    </table>
  );
}

function App() {
  const products = [
    { name: "Apple", price: "$1" },
    { name: "Banana", price: "$0.5" }
  ];

  return <ProductTable products={products} />;
}
```

### Summary of "Thinking in React"
- Break down your app into smaller components.
- Build a static version first.
- Focus on the minimal state required.
- Use props to pass data and callbacks to manage interactions.

---

# **Introduction to Redux**

## What is Redux?
Redux is a **state management library** commonly used with React. It provides a centralized store for managing the state of an application, making it predictable and easier to debug.

### Key Concepts:
1. **Single Source of Truth**: The entire state of the application is stored in a single JavaScript object called the **store**.
2. **State is Read-Only**: The state can only be updated by dispatching **actions**.
3. **Changes are Made with Pure Functions**: Reducers are pure functions that take the current state and an action as arguments and return a new state.

### Benefits of Redux:
- Simplifies state management in large applications.
- Predictable state updates.
- Excellent debugging capabilities (e.g., Redux DevTools).
- Integrates seamlessly with React using libraries like `react-redux`.

---

# **Actions, Reducers, and Stores**

## Actions
Actions are plain JavaScript objects that describe **what happened** in the application. Every action must have a `type` property, and it can include additional payload data.

### Example:
```javascript
const addTodoAction = {
  type: 'ADD_TODO',
  payload: {
    id: 1,
    text: 'Learn Redux'
  }
};
```

### Action Creators:
Functions that create actions for better reusability.
```javascript
function addTodo(id, text) {
  return {
    type: 'ADD_TODO',
    payload: { id, text }
  };
}
```

## Reducers
Reducers are pure functions that specify **how the state should change** in response to actions.

### Example:
```javascript
function todoReducer(state = [], action) {
  switch (action.type) {
    case 'ADD_TODO':
      return [...state, action.payload];
    default:
      return state;
  }
}
```

### Key Points:
- Reducers must be pure (no side effects).
- They should not modify the original state; instead, they return a new state object.

## Store
The store is the central location that holds the application state. It provides methods to:
- **Get the state** (`store.getState()`)
- **Dispatch actions** (`store.dispatch(action)`)
- **Subscribe to changes** (`store.subscribe(listener)`)

### Creating a Store:
```javascript
import { createStore } from 'redux';

const store = createStore(todoReducer);

store.subscribe(() => console.log(store.getState()));

store.dispatch(addTodo(1, 'Learn Redux'));
```

---

# **Usage with React**

To use Redux with React, the `react-redux` library is commonly employed for seamless integration.

## Steps to Integrate Redux with React:

### 1. Install Dependencies:
```bash
npm install redux react-redux
```

### 2. Set Up the Store:
```javascript
import { createStore } from 'redux';
import { Provider } from 'react-redux';
import todoReducer from './reducers';

const store = createStore(todoReducer);

function App() {
  return (
    <Provider store={store}>
      <TodoApp />
    </Provider>
  );
}
```

### 3. Connect Components:
Use `connect` or React hooks like `useSelector` and `useDispatch` to interact with the Redux store.

#### Example Using `connect`:
```javascript
import React from 'react';
import { connect } from 'react-redux';

function TodoList({ todos }) {
  return (
    <ul>
      {todos.map(todo => (
        <li key={todo.id}>{todo.text}</li>
      ))}
    </ul>
  );
}

const mapStateToProps = (state) => ({
  todos: state
});

export default connect(mapStateToProps)(TodoList);
```

#### Example Using Hooks:
```javascript
import React from 'react';
import { useSelector, useDispatch } from 'react-redux';
import { addTodo } from './actions';

function TodoApp() {
  const todos = useSelector((state) => state);
  const dispatch = useDispatch();

  function handleAddTodo() {
    dispatch(addTodo(2, 'Learn Hooks with Redux'));
  }

  return (
    <div>
      <ul>
        {todos.map((todo) => (
          <li key={todo.id}>{todo.text}</li>
        ))}
      </ul>
      <button onClick={handleAddTodo}>Add Todo</button>
    </div>
  );
}

export default TodoApp;
```

---

# Summary Table

| Concept    | Description                                      |
|------------|--------------------------------------------------|
| Actions    | Describe what happened                          |
| Reducers   | Define how the state changes                    |
| Store      | Holds the application state and manages updates |
| react-redux | Library for connecting Redux with React         |

---
| Dialog Box       | Purpose                                 | Buttons Available          | Returns                             |
|-----------------------|---------------------------------------------|---------------------------------|-----------------------------------------|
| *alert()*         | Displays a simple alert message.           | OK                              | undefined                             |
| *confirm()*       | Asks the user to confirm an action.         | OK, Cancel                      | true (OK) or false (Cancel)         |
| *prompt()*        | Prompts the user for input.                | OK, Cancel                      | User input (string) or null (Cancel)  |
---
