package sets.br.com.aulas.users;

import java.util.Objects;

public class User implements Comparable<User>{
    private int id;
    private String name;

    public User(int id, String name)  {
        this.id = id;
        this.name=name;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    @Override 
    public String toString() {
        return String.format("{'id':%d,'name':'%s' }", id,name);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj ==this) return true;
        if(Objects.isNull(obj) || (!(obj instanceof User))) return false;
        User user = (User) obj;
        return this.id == user.getId() && Objects.equals(this.name,user.getName());
    }

    @Override 
    public  int hashCode() {
        return Objects.hash(this.id, this.name);
    }

    @Override 
    public int compareTo(User u) {
        var compareResult = 0;
        if(this.id > u.id) compareResult ++;
        if(this.id < u.id) compareResult --;
        return compareResult;
    }
}