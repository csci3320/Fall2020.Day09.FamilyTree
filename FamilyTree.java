
public class FamilyTree {
    Person root;

    public FamilyTree(Person newRoot){
        root = newRoot;
    }

    public void print(){
        //Recursive initial condition
        print(root);
    }

    public void print(Person person){
        //Stopping condition
        if(person == null){
            return;
        }
        //Body of our loop
        System.out.println(person.name);
        //Iterate
        print(person.mother);
        print(person.father);
    }
}