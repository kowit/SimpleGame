package Models;

public class User {
    private int id;
    private String name;

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    /**
     * User Builder
     */
    public static class Builder {
        private int id;
        private String name;

        public Builder(int id) {
            this.id = id;
        }

        public Builder withId(int id) {
            this.id = id;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public User build() {
            User user = new User();
            user.id = id;
            user.name = name;
            return user;
        }
    }
}
