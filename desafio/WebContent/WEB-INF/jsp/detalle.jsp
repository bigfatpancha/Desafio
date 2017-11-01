<html>
<head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%></head>
<body>

<img src="${aspirante.foto}" alt="" height="200" width="200">
<h2>${aspirante.nombre} ${aspirante.apellido}</h2>
<label>DNI: ${aspirante.dni}</label><br>
<label>Fecha de nacimiento: ${aspirante.fechaNac}</label><br>
<label>Domicilio: ${aspirante.domicilio.calle}, ${aspirante.domicilio.ciudad}, ${aspirante.domicilio.provincia}</label><br>
<label>Telefono: ${aspirante.telefono}</label><br>
<label>Mail: ${aspirante.mail}</label><br>
<label>Experiencia Laboral: </label><br>
<ul>
<c:forEach items="${aspirante.experiencia}" var="experiencia">
	<li>Trabajo en ${experiencia.empresa} desde ${experiencia.inicio} hasta ${experiencia.fin}</li>
</c:forEach>
</ul>
<form action="/Desafio/doLogin" method="post" id="form">
	<input type="hidden" name="usuario" value="${usuario.user}">
	<input type="hidden" name="contrasenia" value="${usuario.pass}">
</form>
<button type="submit" form="form" >Volver</button>

</body>
</html>