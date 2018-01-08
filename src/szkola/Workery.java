package szkola;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Workery {


	    private String name;
	    private int age;


	    Workery(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public String getName(){
	        return name;
	    }
	    public void setName(String name){
	        this.name = name;
	    }

	    public int getAge(){
	        return age;
	    }

	    public void setInt(int age){
	        this.age = age;
	    }

	    public String toString(){
	        return "name "+name+" wiek "+ age;
	    }

	}

