package ConstructureClass;

public class TestApartment {

	public static void main(String[] args) {
		Apartment myHouse= new Apartment("white house");
		myHouse.displayHouseName();
		
		Apartment yourHouse=new Apartment();
		yourHouse.displayHouseName();
		
		Apartment theirHouse=new Apartment("black house", 50);
		theirHouse.displayHouseName();

	}

}
