package com.example.Album.Service;

import com.example.Album.model.User;
import com.example.Album.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


    @Autowired
    private UserRepository userRepository;
    public User getUser() {
        return userRepository.getUser();
    }
    public User saveUser(User user) {
        //UserRepository userRepository;
        return userRepository.saveUser(user);
    }

    public List<User> getAllAlbum() {

        return userRepository.getAllAlbum();
    }

    public User getAlbumId(int albumId) {
        return userRepository.getAlbumId(albumId);
    }

    public User updateAlbum(int albumId, User user) {
        return userRepository.updateAlbum(albumId, user);
    }

    public User deletedalbum(int albumId) {
        return userRepository.deletedalbum(albumId);
    }
}
