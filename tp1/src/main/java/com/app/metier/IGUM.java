package com.app.metier;

public interface IGUM {
    abstract public void saveUser(String email, String password);
    abstract public User validateUser(String email, String password);

}
