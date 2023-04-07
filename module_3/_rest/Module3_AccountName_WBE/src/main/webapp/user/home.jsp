<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 31-Mar-23
  Time: 6:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Furama Resort</title>
</head>
<body>
<header>
    <div class="logo">
        <img style="height: 80px; width: 80px"
             src="https://www.freepnglogos.com/uploads/company-logo-png/company-logo-transparent-png-19.png"/>
        <p>Logo</p>
    </div>
    <div class="user_profile">
        <a>Nguyen Van A</a>
    </div>
</header>
<nav>
    <ul>
        <ol>Home</ol>
        <ol>Employee</ol>
        <ol><a href="/customer">Customer</a></ol>
        <ol>Service</ol>
        <ol>Contract</ol>
        <ol>
            <form action="/" method="post">
                <input type="text" placeholder="search"/>
                <input type="submit" value="search" name="action"/>
            </form>
        </ol>
    </ul>
</nav>
<main>
    <aside>
        <article class="art">
            <h3>Item One</h3>
        </article>
        <article class="art">
            <h3>Item Two</h3>
        </article>
        <article class="art">
            <h3>Item Three</h3>
        </article>
    </aside>
    <aside>
        <h3>Body...</h3>
    </aside>
</main>
<footer><h3>Footer..</h3></footer>
</body>
</html>
