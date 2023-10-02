public class Elf extends Actor{
    Elf(String name, String creature, String rol){
        this.name = name;
        this.creature = creature;
        this.rol = rol;
    }
    public void talk(){
        System.out.println("Hi! My name is "+ name + ". I am an Elf");
    }
}