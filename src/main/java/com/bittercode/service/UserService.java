package com.bittercode.service;

import javax.servlet.http.HttpSession;

import com.bittercode.model.StoreException;
import com.bittercode.model.User;
import com.bittercode.model.UserRole;
import org.checkerframework.checker.nullness.qual.Nullable;

public interface UserService {
    public @Nullable User login(UserRole role, String email, String password, HttpSession session) throws StoreException;

    public String register(UserRole role, User user) throws StoreException;

    public boolean isLoggedIn(UserRole role, HttpSession session);

    public boolean logout(HttpSession session);

}
