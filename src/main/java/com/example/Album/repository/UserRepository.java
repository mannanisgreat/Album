package com.example.Album.Repository;

import com.example.Album.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    List<User> albumList=new ArrayList();
    public User getUser() {

        User user = new User(1 , "My Picture", "Own photo", "C:\\\\Users\\\\MANNAN\\\\Desktop\\\\mannan.jpg");
        return user;
    }

    public User saveUser(User user) {
        user.setAlbumId(albumList.size() + 1);
        albumList.add(user);
        return user;
    }

    public List<User> getAllAlbum() {
        return albumList;
    }

    public User getAlbumId(int albumId) {
        for(User user:albumList)
        {
            if(user.getAlbumId() == albumId){

                return user;
            }
        }
        return null;

    }

    public User updateAlbum(int albumId, User user) {
        for(User u:albumList)
        {
            if(u.getAlbumId() == albumId)
            {
                u.setName(user.getName());
                u.setAlbumId(user.getAlbumId());
                u.setDescription(user.getDescription());

                return u;
            }
        }
        return null;
    }

    public User deletedalbum(int albumId) {
        User deletedalbum=null;
        for(User u:albumList)
        {
            if(u.getAlbumId() == albumId)
            {
                deletedalbum = u;
                albumList.remove(u);
                return deletedalbum;
            }

        }
        return deletedalbum;
    }
}

