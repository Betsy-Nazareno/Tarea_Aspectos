aspect inspector{
	
	
	pointcut success(String redsocial) : call(* cambiarColorVentana(*)) && args(redsocial)  ;
    after(String color) : success(color) {
    	switch(color) {
    	  case "Facebook":
    	    System.out.println("El fondo de la pantalla ha sido cambiado a Azul");
    	    break;
    	  case "Twitter":
    		  System.out.println("El fondo de la pantalla ha sido cambiado a Celeste");
    	    break;
    	  case "Instagram":
    		  System.out.println("El fondo de la pantalla ha sido cambiado a Morado");
    	    break;
    	  default:
    	    System.out.println("El fondo de la pantalla ha sido cambiado a Rojo");
    	    }
    }
}
