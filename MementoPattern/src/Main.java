public class Main {

    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();


        originator.setState("Remove left drum brake");
        caretaker.addMemento( originator.save() );
        originator.setState("Remove right drum brake");
        System.out.println("----------------------------------");


        originator.setState("Add left disc brake");
        caretaker.addMemento( originator.save() );
        originator.setState("Add right disc brake");

        System.out.println("----------------------------------");
        originator.restore(caretaker.getMemento() );
        System.out.println("----------------------------------");
        originator.setState("Brake Replacement Complete");

    }
}
