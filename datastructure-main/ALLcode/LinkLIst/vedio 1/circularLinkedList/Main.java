

public class Main {
    public static void main(String[] args) {
        Circular list = new Circular();
               list.insert(23);
               list.insert(3);
               list.insert(19);
               list.insert(75);
               list.display();
               list.delete(19);
               list.display();
    }
    
}
