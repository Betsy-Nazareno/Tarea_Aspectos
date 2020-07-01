aspect inspector{
	
	
	pointcut success(String color) : call(* cambiarColorVentana(*)) && args(color)  ;
    after(String color) : success(color) {
    	System.out.println("La pantalla se ha coloreado de: "+ color);
    }
}
