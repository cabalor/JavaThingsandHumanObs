package semestr2;


public class Subject {

	
	
	public String anem;
	public Person p1;
	public Student s1;
	
	public Subject(String anem) {
		this.anem = anem;
	}
	
	
	public void setTeacher(Person p) {
		this.p1 = p;
	}
	
	
	public void addStudent(Person p) throws TooManyStudentsException{
		if(s1 == null) {
		this.s1 = (Student)p;
		} else {
			throw new TooManyStudentsException();
		}
	}


	@Override
	public String toString() {
		return anem + " ,teacher "+ p1.name + " uczen "+s1.name;
	}
	
	
}
