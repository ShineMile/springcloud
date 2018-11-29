package lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        BinaryOperator<Long> addLongs = (x, y) -> x + y;
        Predicate<Integer> atLeast5 = x -> x > 5;
        System.out.println(addLongs);
        BinaryOperator<Integer> add = (x, y) -> x + y;
        Runnable helloWorld = () -> System.out.println("hello world");
        helloWorld.run();
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            if (i < 5) {
                user.setAge(17);
                user.setUserName("aaaa" + i);
                user.setAdult(false);

            } else if (i < 7 ) {
                user.setAge(18);
                user.setAdult(true);
                user.setUserName("bbbb" + i);
            } else {
                user.setAge(19);
                user.setAdult(true);
                user.setUserName("cccc" + i);
            }
            userList.add(user);
        }
        Stream<User> userStream = userList.stream().filter(user -> {
            System.out.println(user.getUserName());
            return user.getAge() == 18;
        });
        //userStream.count();
        System.out.println(userStream.count());
        List<String> stringList = Stream.of("a", "b", "c").collect(Collectors.toList());
    }

}
