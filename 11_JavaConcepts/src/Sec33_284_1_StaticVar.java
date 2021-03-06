
public class Sec33_284_1_StaticVar {

	// Instance variables as they are tied up to individual objects
	// They change from object to object
	String name;
	String address;

	// Static variables common for all objects of a class. They are called class
	// variables
	static String cityName = "Bangalore";
	static int i = 1;

	// Static block
	static String a;
	static int f;

	static {
		a = "vdf";
		f = 22;
	}

	public Sec33_284_1_StaticVar(String name, String address) {
		// Variables in constructor are local variables

		// Here name, address, cityName are local variables
		// this points to current class instance
		this.name = name;
		this.address = address;
		i++;
		System.out.println(i);
	}

	public void getAddress() {
		System.out.println(address + " " + cityName);

	}

	// Static methods accept static variables
	public static void getCity() {
		System.out.println(cityName);
	}

	public static void main(String[] args) {
		Sec33_284_1_StaticVar obj = new Sec33_284_1_StaticVar("Bob", "123 dd");
		Sec33_284_1_StaticVar obj1 = new Sec33_284_1_StaticVar("Bob1", "123 dd1");

		obj.getAddress();
		obj1.getAddress();

		// static methods can be called without creating objects
		// They are class methods they can be accessed by className without creating
		// objects
		Sec33_284_1_StaticVar.getCity();
		Sec33_284_1_StaticVar.i = 4;
		obj.address = "sdd";
	}

}
