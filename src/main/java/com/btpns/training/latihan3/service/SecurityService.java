package com.btpns.training.latihan3.service;

public interface SecurityService {
    String findLoggedInUsername();
    void autoLogin(String username, String password);

}
