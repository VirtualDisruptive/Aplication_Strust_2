<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title><s:text name="hello.message"/></title>
</head>

<body>

<h1>Sistemas de Gestion de Alunmos</h1>
<p>Encuentra o crea un Alumno</p>

  <h2>Buscar Alumno</h2>
  <h3>Mostrar todos los alumnos</h3>
      <s:a action="showStudents"  >Todos los Alumnos</s:a>
  <h3>Buscar por DNI</h3>
     <!-- Formulario para enviar el DNI -->
     <s:form action="search" method="get">
         <s:textfield name="dni" label="Introduce el DNI" />
         <s:submit value="Enviar" />
     </s:form>
     <h2>crear Alumno</h2>
     <!-- Botón para ir a la página de registro -->
     <s:a action="registry"  >Registrar Alumno</s:a>


</body>
</html>
