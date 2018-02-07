<html>
<head>
<script type="text/javascript">
	function imprimirTirilla(){
		alert('imprimir tirilla');
		var file new Blob(["texto del archivo"], {type:'application/pdf'});
		var fileURL =URL.createObjectURL(file);
		window.open(fileURL,'_blank');
	}

</script>
</head>


<body>
<h2>Hello World!</h2>
<form action="http://localhost:8080/cursoSpringMVC/datos/entidad" method="post">
	<fieldset>
		<legend>Formulario de ejemplo del Body</legend>
		<label for="nombre">Nombre</label>
		<input type="text" name="nombre" id="nombre"/>
		<label for="edad"></label>
		<input type="text" name="edad" id="edad" size="2"/>
		<input type="submit" name="enviar" value="Enviar"/>
		<input type="button" onclick="imprimirTirilla();" name="ImprimirTirilla" value="Imprimir Tirilla">
	</fieldset>
</form>
</body>
</html>
