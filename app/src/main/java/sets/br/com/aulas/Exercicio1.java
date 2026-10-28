package sets.br.com.aulas;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

import sets.br.com.aulas.users.User;
import sets.br.com.aulas.Aula;

public class Exercicio1 implements Aula {
    @Override
    public void exibir() {
        Set<User> users = new HashSet<>();
        users.add(new User(1,"Teste1"));
        users.add(new User(2,"Teste2"));
        users.add(new User(3,"Teste3"));
        users.add(new User(4,"Teste4"));

        System.out.println("Hashset");
        users.forEach(System.out::println);

        //Quando se trabalha com hashset, usa-se o hashcode do obj
        System.out.println("CONTAINS Hashset: "+ users.contains(new User(1,"Teste1")));

        System.out.println("Com iterator Hashset: ");
        var iterator = users.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Usando a interface Predicate: ");
        System.out.println(users.removeIf(Predicate.not(user -> user.getId() > 2)));

    }
}
