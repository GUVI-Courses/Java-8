import java.util.Optional;

public class OptionalProject {

    public static class User{
        private String name;
        private String email;

        public User(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public String getName(){
            return name;
        }
        public String getEmail(){
            return email;
        }
    }
    public static void main(String[] args){
       User user = getUserProfile(true);
       Optional<User> optionalUser = Optional.ofNullable(user);
        if(optionalUser.isPresent()){
            System.out.println("User Name: "+optionalUser.get().getName());
            System.out.println("Email: "+optionalUser.get().getEmail());
        }else{
            System.out.println("User not found");
        }

        User guest = optionalUser.orElse(new User("Guest","guest@gmail.com"));

        System.out.println("Guest Name: "+guest.getName());
        System.out.println("Guest Email: "+guest.getEmail());

        String emailDomain = optionalUser
                .map(User::getEmail)
                .map(email->email.substring(email.indexOf("@")+1))
                .orElse("no-domain.com");

        System.out.println("Email Domain: "+emailDomain);
    }

    public static User getUserProfile(boolean exists){
        if(exists){
            return new User("Alice", "alice@gmail.com");
        }else{
            return null;
        }
    }


}
