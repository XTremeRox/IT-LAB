# IT LAB ASSIGNMENTS
All assignments from the Internet Technology Lab for the Final(8th) Sem, NIT DGP.
>For most part I was doing this on a windows environment, so to serve HTML pages and to run JSP code I used ```Apache Tomcat Server``` (https://en.wikipedia.org/wiki/Apache_Tomcat), for PHP I used ```Apache HTTP Server``` (https://en.wikipedia.org/wiki/Apache_HTTP_Server) and for DB I used ```MySQL``` (https://en.wikipedia.org/wiki/MySQL), both are available in XAMPP Server (https://www.apachefriends.org/index.html) as a package, which makes it easier to setup both at the same time. 
# Questions
1. Write an HTML program to create your own website using the following HTML features:
    i) Hyperlink
    ii) Form
    iii) Table
    iv) Frame Tags
    v) Vertical Frames
    vi) Horizontal Frames
    vii) Hyperlink Tag to Target a displayed HTML page to another frame.

2. Write an HTML program to create your own website registration page (login and password) using the following HTML features : (password should have a length of 8 having one upper case, one lower case letter one numeric character and two special characters)
    i) Hyperlink
    ii) Form
    iii) Table
    iv) Ordered List
    v) Text Box
    vi) Text Area Box
    vii) Check Box
    viii) Password Field (above restriction of password)
    ix) Submit + Reset button
    x) Radio Button

3. Write a Javascript program to validate properly the fields of the Form in the website's registration page such as implement Exception Handeling, a Program of Image Rollover, Prompt, Alert, Looping, Validate Email along with Phone Number, using the regular expressions.
4. Write a CSS program to add styles in your website pages, such as colors, backgrounds, borders, margins, paddings, height-width, text, fonts, links, list, tables, positions and image(s).
5. Create a Simple "Client Server Programming" in JAVA. Here your client side has to pass a message to the server side. Server has to validate messages for proper number and return its doubles as response to the client. Make a simple GUI interface for client.
6. Create a JAVA program to connect your website with Server using "Client Server Programming".
7. Create a Form comprised of the following:
    i) First Name
    ii) Last Name
    iii) Username
    iv) Password
    v) Address (Office and Residential)
    vi) Contact (Phone/Mobile) Number
After filling all the details, there should be a SUBMIT button, while clicking that button, all details will be stored. The request will be processed through POST method.
8. Use JSP Database Connection: Select, Insert, Update & Delete and 'Connecting through ODBC Driver'.

### Entry Points and Details

| Question No. | Entry Point | Comments |
| ------ | ------ | ------ |
| 1 | "index.html"| The folder also contains some extra tasks which were given in lab |
| 2 | "index.html" | - |
| 3 | "index.html" | Error handeling is not obvious, undefined reference has been made to ```"undefinedelement"``` |
| 4 | "index.html" | Styles are in a seperate file "styles.css" |
| 5 | "server.java", "client.java" | ```server.java``` is meant to be started before ```client.java``` |
| 6 | "connect.java" | Pretty straighforward - Tries to connect to a website else throws error |
| 7 | "index.php" | The processing also happens in the same file (Apache HTTP Server required) |
| 8 | "index.jsp" | Java used instead of JSP, because no time... idk :( |
