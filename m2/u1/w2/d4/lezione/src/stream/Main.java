package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	
	
	static List<String> list1 = new ArrayList<String>();
	static List<String> list2 = Arrays.asList("Test1","Test2","Test3");
	public static void main(String[] args) {
	
		list1.add("Angular");
		list1.add("Angular");
		list1.add("CorsoEpicode");
		list1.add("JavaSpring");
		
		//list1.forEach(e->System.out.println(e));
		//list2.forEach(e->System.out.println(e));
		
		//filtro gli elementi con 8o piu caratteri e li metto in filteredList
		//poi aggiungo !
		//creo una strina concatenata con # aalla fine di ogni elemento
		
		Stream<String> filteredList = list1
				.stream()
				.filter(e->e.length()>= 8)
				.map(el -> el+"!");
				//.collect(Collectors.toList());
		
		String s = filteredList.reduce("", (acc, el)-> acc+el+"#");
		
		System.out.println(s);
		
		//creo set e lo modifico con stream
		//faccio stessa cosa con set
		//set non duplica ma list si
		
		List<String> filtList = list1
				.stream()
				.map(el -> "|"+el+"|")
				.collect(Collectors.toList());
		
		Set<String> filtSet = list1
				.stream()
				.map(el -> "|"+el+"|")
				.collect(Collectors.toSet());
		
		System.out.println("LISTA:");
		filtList.forEach(e->System.out.println(e));
		System.out.println("SET:");
		filtSet.forEach(e->System.out.println(e));
		
		//STREAM BUILDER
		
		Stream<Integer> streamBuilder = Stream.<Integer>builder()
				.add(666).add(14).add(20).add(768).add(66)
				.build();
		
		//long count = streamBuilder.count();
		//System.out.println("count stringhe: "+ count);
		//Integer max = streamBuilder.max(Integer::compare).get();
		//System.out.println("Numero max: "+max);
		//Integer min = streamBuilder.min(Integer::compare).get();
		//System.out.println("Numero min: "+min);
		streamBuilder.sorted().forEach(el -> System.out.println(el));
		
		//ESPERIMENTI
		List<Integer> halo = Stream.<Integer>builder()
				.add(666).add(14).add(20)
				.build().collect(Collectors.toList());
		Optional<Integer> sum = halo.stream().reduce((acc,el)-> acc+el);
		System.out.println(sum);
		
		
	}

}
