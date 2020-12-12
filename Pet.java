public class Pet {

private String name;
private int age;
private String location;
private String type;

public Pet() {
	name = "Buddy";
	age = 3;
	location = "Texas";
	type = "dog";
}

public Pet(String newName,int newAge) {
	name = newName;
	age = newAge;
}
public Pet(String newLocation,String newType) {
	location = newLocation;
	type = newType;
}
	public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getType() {
	return type;
}

public void setLocation(String location) {
	this.location = location;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
