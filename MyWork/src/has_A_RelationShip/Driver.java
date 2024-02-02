package has_A_RelationShip;

public class Driver {
public static void main(String[] args) {
	Car c= new Car("bmw", new Engine(23));
	c.engine.cumbo();
	c.drive();
	
}
}
