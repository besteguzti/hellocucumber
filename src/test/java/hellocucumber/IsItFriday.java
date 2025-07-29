package hellocucumber;

public class IsItFriday {

    public String isItFriday(String today) {
        if ("Friday".equalsIgnoreCase(today)) {
            return "TGIF";
        } else {
            return "Nope";
        }
    }
}
