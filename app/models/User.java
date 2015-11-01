package models;

import play.db.jpa.Model;

import javax.persistence.Entity;

/**
 * Author: DarrenZeng
 * Date: 2015-11-01
 */
@Entity
public class User extends Model {
    public String email;
    public String password;
    public String fullname;
    public boolean isAdmin;

    public User(String email, String password, String fullname) {
        this.email = email;
        this.password = password;
        this.fullname = fullname;
    }
}
