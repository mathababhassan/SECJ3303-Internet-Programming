<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Person BMI Info</title>
</head>
<body>

<h2>Person Information</h2>

<p><strong>Name:</strong> ${person.name}</p>
<p><strong>Year of Birth:</strong> ${person.yob}</p>
<p><strong>Weight:</strong> ${person.weight} kg</p>
<p><strong>Height:</strong> ${person.height} m</p>

<h3>BMI Results</h3>
<p><strong>BMI:</strong> ${person.bmi}</p>
<p><strong>Category:</strong> ${person.category}</p>

<hr>

<p>
    <a href="/springhealthhub/api/person">View as JSON (REST API)</a>
</p>

</body>
</html>
