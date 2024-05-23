package comcydeo.demo;

import comcydeo.demo.entity.User;
import comcydeo.demo.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DemoApplication {

    private static UserRepository userRepository;

    public DemoApplication(UserRepository userRepository) {
        DemoApplication.userRepository = userRepository;
    }

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
        List<User> usersByEmail = userRepository.getUserByEmail("ower@cydeo.com");
        List<User> users = userRepository.findAll();

        for (User user : usersByEmail) {
            System.out.println(user.getEmail());
            System.out.println(user.getFirstName());
            System.out.println(user.getLastName());
            System.out.println(user.getRole().getName());
        }

        System.out.println("---");

        for (User user : users) {
            System.out.println(user.getEmail());
            System.out.println(user.getFirstName());
            System.out.println(user.getLastName());
            System.out.println(user.getRole().getName());
        System.out.println("***");
        }
    }

}
