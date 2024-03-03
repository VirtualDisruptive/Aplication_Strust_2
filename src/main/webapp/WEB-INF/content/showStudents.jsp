<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <title>Lista de Estudiantes</title>
</head>
<body>
    <h2>Lista de Estudiantes</h2>
    <table border="1">
        <tr>
            <th>Nombre</th>
            <th>Apellido</th>
            <th>DNI</th>
            <th>Teléfono</th>
        </tr>
        <s:iterator value="alumnos">
            <tr>
                <td><s:property value="name" /></td>
                <td><s:property value="lastName" /></td>
                <td><s:property value="dni" /></td>
                <td><s:property value="phone" /></td>
            </tr>
        </s:iterator>
    </table>

    <s:a action="index"  >Inicio</s:a>
</body>
</html>
