package block1.variables;

public class WorkShop {
    public static void main(String[] args) {
        Friend[] friends = {new Friend("Иван", 25, true, 89509505050L),
                new Friend("Петр", 26, false, 89509504949L),
                new Friend("Сергей", 27, true, 89509504848L),
                new Friend("Света", 26, false, 89509503040L)};

        for (Friend friend : friends) {
            System.out.println(friend);
        }
    }
}
