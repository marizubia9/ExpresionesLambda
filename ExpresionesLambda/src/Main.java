import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno a = new Alumno("Juan", 21);
		Alumno b = new Alumno("Lander", 22);
		Alumno c = new Alumno("Gabri", 25);
		
		Comparar comparator_Edad = (Alumno x,Alumno y)->{
			if (x.getEdad() > y.getEdad()) return x;
			else return y;};
		System.out.println(comparator_Edad.compare(a, b).getEdad());
		
		List<Alumno> lista = new ArrayList<>();
		lista.add(a);
		lista.add(b);
		lista.add(c);
		
		List<Alumno> listaOrdenada = new ArrayList<>();
		for(int i=0; i<lista.size(); i++)
		{
			System.out.println("La persona más mayor tiene" + comparator_Edad.compare(lista.get(i), lista.get(i+1)).getEdad());
		}
		
//		List<Alumno> mayores = lista.stream()
//									.filter()
//									.collect(Collectors.toCollection(() -> new ArrayList<Integer>()));
//									 
//		mayores.forEach(e -> System.out.println(e.getName()));
		
//
//		for (String elemento : lista) {
//			System.out.println(elemento);
//		}
	
	}
		
	

}
