<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Spring data</title>
    </head>

    <body>
        <form action="addAlien">
            <input type="text" placeholder="ID" name="aid"><br>
            <input type="text" placeholder="Name" name="aname"><br>
            <input type="text" placeholder="Tech" name="tech"><br>
            <input type="submit">
        </form>

        <form action="getAlien">
            <input type="text" placeholder="ID" name="aid"><br>
            <input type="submit">
        </form>
    </body>
    </html>