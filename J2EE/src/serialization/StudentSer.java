package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class StudentSer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	transient int SSN;

	public StudentSer(int id, String name, int SSN) {
		this.id = id;
		this.name = name;
		this.SSN = SSN;
	}

	public static void main(String[] args) throws IOException,
			ClassNotFoundException {

		StudentSer s = new StudentSer(1, "Ankit", 223);

		// Writing Object to file
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
				"Serialization.txt"));
		oos.writeObject(s);
		oos.flush();
		oos.close();

		// Reading from file to Object
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
				"DeSerialization.txt"));
		StudentSer s1 = (StudentSer) ois.readObject();
		System.out.println(s1.id + " " + s1.name + " " + s1.SSN);

		ois.close();
	}
}
