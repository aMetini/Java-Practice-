import com.exercise._people_abstract_class.*;

public class PeopleApp {
    public static void main(String[] args) throws Exception {
        Male male = new Male ("Raphael", 30);
        Female female = new Female("Raquel", 25);
        OtherGender otherGender = new OtherGender("Louis", 20);

        male.printClassName();
        female.printClassName();
        otherGender.printClassName();
    }
}
