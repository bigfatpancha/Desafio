<html>
<head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<body>

<table>
	<thead>
		<th>Aspirante</th>
		<th>DNI</th>
	</thead>
	<tbody>
		<c:forEach items="${aspirantes}" var="aspirante">
			<tr>
				<td><a href="/CrunchifySpringMVCTutorial/detalle/${aspirante.dni}">${aspirante.nombre} ${aspirante.apellido}</a></td>
				<td>${aspirante.dni}</td>
			</tr>
		
		</c:forEach>
		
	</tbody>

</table>

</body>
</html>