import java.util.ArrayList;

public class DataBase {
	private ArrayList<Person> person;

	public DataBase(ArrayList<Person> ArrPerson) {
		this.person = ArrPerson;
	}

	public ArrayList<Person> getPerson() {
		return this.person;
	}

	public void printDatabase() {
		System.out.println(" ");
		System.out.println("All people information" + "\n" + "\n" + this.person);

	}

	public void changeFN(String a, int b) {
		for (Person item : this.person) {
			if (b == (((Person) item).getID()))
				((Person) item).setFirstName(a);
		}
	}

	public void changeLN(String a, int b) {
		for (Person item : this.person) {
			if (b == (((Person) item).getID()))
				((Person) item).setLastName(a);
		}
	}
	
	public void delete(int a){
		for (Person item : this.person) {
			if( item.getID() ==( a ) ){
                this.person.remove( item );
                break;
			}
			}
	}

	public void displayByID(int a) {
		System.out.println(" ");
		System.out.println("ID " + a + " info ");
		System.out.println(" ");
		for (Person item : this.person) {
			if (a == (((Person) item).getID()))
				System.out.println((((Person) item).toString()));
		}
	}

}