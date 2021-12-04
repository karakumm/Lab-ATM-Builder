package builder;

public class Main {
    public static void main(String[] args) {
        User user = User.builder().name("Oleno4ka").age(18).gender("female").occupation("UCU").build();
        System.out.println(user);
    }
}
