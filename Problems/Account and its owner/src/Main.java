public static void main(String[] args) {

    User owner = new User("demo-user","Alexander","Schmidt");
    Account account = new Account("123456",1000,owner);
    process(account);


}

static class Account {

    private String code;
    private long balance;
    private User owner;

    public Account(String code, long balance, User owner) {
        this.code = code;
        this.balance = balance;
        this.owner = owner;
    }

    public String getCode() {
        return code;
    }

    public long getBalance() {
        return balance;
    }

    public User getOwner() {
        return owner;
    }
}

static class User {

    private String login;
    private String firstName;
    private String lastName;

    public User(String login, String firstName, String lastName) {
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getLogin() {
        return login;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}