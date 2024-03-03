<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
 <title>search</title>

</head>

<body>


<h3>Alunmo: </h3>
<p>Esta es informacion del alunmo:</p>


<p><strong><s:text name="form.name.message"/></strong>: <s:property value="alumnoBean.name" /></p>
<p><strong><s:text name="form.lastName.message"/></strong>: <s:property value="alumnoBean.lastName" /></p>
<p><strong><s:text name="form.DNI.message"/></strong>: <s:property value="alumnoBean.dni" /></p>
<p><strong><s:text name="form.phone.message"/></strong>: <s:property value="alumnoBean.phone  " /></p>

<s:a action="showStudents"  >Todos los Alumnos</s:a>

<s:a action="index"  >Inicio</s:a>


</body>
</html>
