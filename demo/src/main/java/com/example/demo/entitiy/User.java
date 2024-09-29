package com.example.demo.entitiy;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String userfullname;
    private String useremail;
    private String userpassword;

    @OneToOne
    private Basket userBasket;

    public User(int id, String userfullname, String useremail, String userpassword, Basket userBasket) {
        this.id = id;
        this.userfullname = userfullname;
        this.useremail = useremail;
        this.userpassword = userpassword;
        this.userBasket = userBasket;
    }

    public void setUserBasket(Basket userBasket) {
        this.userBasket = userBasket;
    }

    public User() {
    }

    public int getId() {return id;}
    public String getUserfullname() {return userfullname;}
    public String getUseremail() {return useremail;}
    public String getUserpassword() {return userpassword;}
    public Basket getUserBasket() {return userBasket;}
    public void setId(int id) {this.id = id;}
    public void setUserfullname(String userfullname) {this.userfullname = userfullname;}
    public void setUseremail(String useremail) {this.useremail = useremail;}
    public void setUserpassword(String userpassword) {this.userpassword = userpassword;}
}




