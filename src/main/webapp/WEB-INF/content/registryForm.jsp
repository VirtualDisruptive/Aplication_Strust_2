<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
  <title><s:text name="hello.message"/></title>
  <s:head/>
  <sx:head/>
</head>

<body>



<s:form theme="simple" id="itemAdd" name="itemAdd" action="createStudent" method="post" validate="true">
  <h1><s:text name="form.tittle.message"/></h1>
  <table>
  <tr>
      <td class="evenRow">
        <s:fielderror fieldName = "alumnoBean.name" />
        <s:text name="form.name.message"/>
        <s:textfield id="subject" name="alumnoBean.name"/>
      </td>
    </tr>

     <tr>
      <td class="evenRow">
        <s:fielderror fieldName = "alumnoBean.lastName" />
        <s:text name="form.lastName.message"/>
        <s:textfield id="grossAmount" name="alumnoBean.lastName"/>
      </td>
    </tr>

    <tr>
      <td class="evenRow">
        <s:fielderror fieldName = "alumnoBean.dni" />
        <s:text name="form.DNI.message"/>
        <s:textfield id="grossAmount" name="alumnoBean.dni"/>
      </td>
    </tr>

   <tr>
      <td class="evenRow">
        <s:fielderror fieldName = "alumnoBean.phone" />
        <s:text name="form.phone.message"/>
        <s:textfield id="grossAmount" name="alumnoBean.phone"/>
      </td>
    </tr>





  <tr>
    <td class="evenRow">
        <s:submit align="left" value="Enviar"/>
    </td>
  </tr>
  </table>
</s:form>

</body>
</html>
