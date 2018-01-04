package szkola;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class testowe {

    public static void main(String[] args){

        new Thread(()-> {
            System.out.println("dupa dupa");
            System.out.println("dsdd");
            System.out.println("asdsadad");
        }).start();


        emp jon = new emp("dupa", 20);
        emp jan = new emp("sds", 40);



        List<emp> emps = new ArrayList<>();
        emps.add(jon);
        emps.add(jan);

        
        AndClass and = new AndClass();
        String s = and.smth();
        System.out.println(s);
        

//        Collections.sort(emps, new Comparator<emp>() {
//            @Override
//            public int compare(emp emp1, emp emp2) {
//                return emp1.getName().compareTo(emp2.getName());
//            }
//        });

        Collections.sort(emps, ( emp1, emp2) ->
        emp1.getName().compareTo(emp2.getName()));


        for(emp e: emps){
            System.out.println(e);
        }

//        String sill = doString(new UpConcat() {
//            @Override
//            public String upAndConcat(String s1, String s2) {
//                return s1.toUpperCase()+s2.toUpperCase();
//            }
//        },
//        emps.get(0).getName(), emps.get(1).getName());
//        System.out.println(sill);


        UpConcat uc = (s1, s2) -> {String res = s1.toUpperCase()+s2.toUpperCase();
        return res;
        };

        String sill = doString(uc, emps.get(0).getName(), emps.get(1).getName());

    }


    public final static String doString(UpConcat uc, String s1, String s2){
        return uc.upAndConcat(s1, s2);
    }

}


class emp{

    private String name;
    private int age;


    emp(String name, int age) {
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


interface UpConcat{
    public String upAndConcat(String s1, String s2);
}

class AndClass{
	
	public String smth() {
		/*System.out.println("nowa klasa name "+getClass().getSimpleName());
		return testowe.doString(new UpConcat() {
			
			@Override
			public String upAndConcat(String s1, String s2) {
				System.err.println("anonimowa klasa "+getClass().getSimpleName());
				return s1.toUpperCase() + s2.toUpperCase();
			}
		}, "str1", "str2");*/
		UpConcat uc = (s1, s2) -> {
			System.out.println("lambda lambda "+getClass().getSimpleName());
			String res = s1.toUpperCase() + s2.toUpperCase();
			return res;
		};
		System.out.println("and class "+getClass().getSimpleName());
		return testowe.doString(uc, "str1", "sttr2");
	}
	
}










