package projectoClase2Practico;

public class Ejecutable {

	public static void main(String[] args) {
	    //Creamos un array de objetos de la clase usuario
        Usuario arrayUsuarios[]=new Usuario[10];
 
        //punto 1 crear usuarios
        arrayUsuarios[0]= new Usuario("Raul", "Rojas", "22121245", "Comercial", "Comercial", 21, 16);
        arrayUsuarios[1]= new Usuario("Victor", "Vidal", "26121245", "Comercial", "Atencion al publico", 7, 25);
        arrayUsuarios[2]= new Usuario("Manuel", "Fernandez", "15121245", "Comercial", "Atencion al publico", 21, 56);
        arrayUsuarios[3]= new Usuario("Esteban", "Hernandez", "12121245", "Comercial", "Programador", 7, 45);
        arrayUsuarios[4]= new Usuario("Pedro", "Rojas", "12121245", "Comercial", "Comercial", 14, 18);
        arrayUsuarios[5]= new Usuario("Analia", "Hernandez", "12121245", "Comercial", "Atencion al publico", 14, 20);
        arrayUsuarios[6]= new Usuario("Carolina", "Ortiz", "12121245", "Comercial", "Otro", 50, 45);
        arrayUsuarios[7]= new Usuario("Ana", "Fernandez", "12121245", "Comercial", "Comercial", 21, 23);
        arrayUsuarios[8]= new Usuario("Marta", "Oliva", "12121245", "Comercial", "Atencion al publico", 21, 19);
        arrayUsuarios[9]= new Usuario("Alejandro", "Rojas", "12121245", "Comercial", "Programador", 14, 24);
        
        //Consultas
 
        //int suma=0;
        for (int i=0;i<arrayUsuarios.length;i++){
        	//punto 2	
        	if (arrayUsuarios[i].getEdad() < 18) {
        		arrayUsuarios[i].setApellido("");
        		arrayUsuarios[i].setNombre("");
        		arrayUsuarios[i].setDni("");
        		arrayUsuarios[i].setArea("");
        		arrayUsuarios[i].setDiasVacaciones(0);
        		arrayUsuarios[i].setEdad(0);
        		arrayUsuarios[i].setSector("");
        		arrayUsuarios[i].setCategoriaVacaciones(0);        		
        	}       	
        	//punto 3 codigo
        	switch (arrayUsuarios[i].getSector()) {
    			case "Comercial" : arrayUsuarios[i].setCodigo(1); 
    			break;
    			case "Atencion al publico" : arrayUsuarios[i].setCodigo(2); 
    			break;
    			case "Programador" : arrayUsuarios[i].setCodigo(3); 
    			break;
        			
        		default: arrayUsuarios[i].setCodigo(10); 
        	}
        	//punto 4 dias vacaciones 
        	switch (arrayUsuarios[i].getDiasVacaciones()) {
    			case 7 : arrayUsuarios[i].setCategoriaVacaciones(1);
    			break;
    			case 14 : arrayUsuarios[i].setCategoriaVacaciones(2); 
    			break;
    			case 21 : arrayUsuarios[i].setCategoriaVacaciones(3);
    			break;
        			
        		default: arrayUsuarios[i].setCategoriaVacaciones(5); 
        	}
        if 	(arrayUsuarios[i].getApellido() != "") {
            System.out.println("apellido:  " + arrayUsuarios[i].getApellido() + "  nombre:  " + arrayUsuarios[i].getNombre());	
            System.out.println("D.N.I.:  " + arrayUsuarios[i].getDni() + "  Sector:  " + arrayUsuarios[i].getSector());	
            System.out.println("Area:  " + arrayUsuarios[i].getArea() + "  Codigo:  " + arrayUsuarios[i].getCodigo());	
            System.out.println("Edad:  " + arrayUsuarios[i].getEdad());	
            System.out.println("Dias de Vacaciones:  " + arrayUsuarios[i].getDiasVacaciones() + "  Categoria:  " + arrayUsuarios[i].getCategoriaVacaciones());	
            System.out.println("---------------------------------------------------------");	
        }else {
        	System.out.println("Eliminado menor de 18");	
        	  System.out.println("---------------------------------------------------------");	
        }			
       
    }

	}

}
