<%@ page import="com.example.baithi.entity.Employee" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.example.baithi.entity.Employee" %>
<%@ page import="java.util.HashMap" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    HashMap<String, String> errors = (HashMap<String, String>) request.getAttribute("errors");
    if (errors == null) {
        errors = new HashMap<>();
    }
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<div class="container mt-3">
    <h2>Worker</h2>
    <form method="post" action="/addEmployee">
        <div class="mb-3 mt-3">
            <label>Full Name:</label>
            <input type="text" class="form-control" id="fullName" placeholder="Enter full name" name="fullName">
            <%
                if (errors.containsKey("fullName")) {
            %>
            <p style="color: red; font-size: 13px;">* <%=errors.get("fullName")%>
            </p>
            <%}%>
        </div>
        <div class="mb-3 mt-3">
            <label>Birthday:</label>
            <input type="datetime-local" class="form-control" id="birthday" placeholder="Enter Birthday" name="birthday">
        </div>
        <div class="mb-3 mt-3">
            <label>Address:</label>
            <input type="text" class="form-control" id="address" placeholder="Enter Address" name="address">
        </div>
        <div class="mb-3">
            <label>Position:</label>
            <input type="text" class="form-control" id="position" placeholder="Enter Position" name="position">
        </div>
        <div class="mb-3">
            <label>Department:</label>
            <input type="text" class="form-control" id="department" placeholder="Enter Department" name="department">
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
        <button type="reset" class="btn btn-primary">Reset</button>
    </form>
</div>
</body>
</html>