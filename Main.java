public class Main{

public static void main(String[] args){
	
String[] arrayLetras= new String[10];
try{

if( args.length>0){

System.out.println("Hay"+ args.length +" argumento(s)");
for(int i=0;i<args.length;i++){ 
System.out.println(args[i]);

}

}

}

catch(IndexOutOfBoundsException indexOutOfBoundsException){

System.out.print("El indice del ha superado la capacidad inicial del array");

}



}

}
