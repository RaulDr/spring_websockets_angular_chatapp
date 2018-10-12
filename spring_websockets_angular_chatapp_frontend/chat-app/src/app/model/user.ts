export class User {
    name: String;
    username: String;
    email: String;
    role: String;
    password: String;

    constructor(name?: String, username?: String, email?: String, password?: String) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.role = 'user';
        this.password = password;
    }
}
