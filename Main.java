public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        Person William = new Person("William, Duke of Cambridge");
        Person Diana = new Person("Diana, Princess of Wales");
        Person Charles = new Person("Charles, Princes of Wales");
        Person Elizabeth = new Person("Queen Elizabeth II");
        Person Philip = new Person("Philip, Duke of Edinburgh");

        William.mother = Diana;
        William.father = Charles;
        Charles.mother = Elizabeth;
        Charles.father = Philip;

        FamilyTree familyTree = new FamilyTree(William);
        familyTree.print();

    }
}