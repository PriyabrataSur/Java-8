import java.util.function.Predicate;
class Vote{
	String countryName ; 
	int age;
    boolean sir;

	Vote(String name , int age, boolean sir){
		this.countryName = name;
		this.age = age;
        this.sir = sir; 
	}
}

public class PredicateJoinVote{
	static boolean eligibility(Vote vote , Predicate<Vote> predicate){
		return predicate.test(vote);
	}
	public static void main(String []args){
		Vote v1 = new Vote("India", 29, true);

		Predicate<Vote> checkByAge = v -> v.age >= 18;
        Predicate<Vote> checkByCountryName = v -> v.countryName == "India";
        Predicate<Vote> checkBySir = v -> v.sir == true;

		Predicate<Vote> predicate = checkByAge.and(checkByCountryName).and(checkBySir);

		boolean eligible = eligibility(v1, predicate);
		System.out.println(eligible);
		
	}
} 
