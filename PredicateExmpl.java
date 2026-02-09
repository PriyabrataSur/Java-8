import java.util.function.Predicate;
public class PredicateExmpl{
    public static void main(String[] args) {
        String[] team = {"EB","MB","BFC","OFC","HFC","EZX","ABCD"};
        Predicate<String> checkN = s -> s.charAt(1)== 'B' ;

        for(String name: team){
            if (checkN.test(name)) {
                System.out.println(name);
            }
        }
    }
}