aspect inspector{
	
	
	pointcut success(String color) : call(Interfaz cambiarColor(*) ) && args(color);
    after(String color) : success(color) {
    	System.out.printf("La pantalla se ha coloreado de: "+ color);
    }
}
