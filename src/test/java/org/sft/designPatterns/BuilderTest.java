package org.sft.designPatterns;

public class BuilderTest {

    public static void main(String[] args) {
        User user = new User("siva", "Automation");

        System.out.println(user.getEmail());
        System.out.println(user.getPassword());

        User user1 = new UserBuilder().setEmail("prasad").build();

        User user2 = new UserBuilder().setEmail("siva").setPassword("reddy").build();

        System.out.println( user1.getEmail());
        System.out.println(user1.getPassword());


        System.out.println( user2.getEmail());
        System.out.println(user2.getPassword());

        System.out.println(user2);
    }
}
