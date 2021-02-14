package com.example.Album.Repository;

import com.example.Album.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    List<User> albumList=new ArrayList();
    public User getUser() {

        User user = new User(1 , "WeddingPics", "About best moments", "C:\\Users\\syeda hafsa fatima\\Desktop\\MY phone backuup\\DCIM\\AR Emoji camera\\A1.jpg");
        return user;
    }

    public User saveUser(User user) {
        user.setAlbumId(albumList.size() + 1);
        albumList.add(user);
        return user;
    }

    public List<User> getAllAlbums() {
        return albumList;
    }

    public User getAlbumbyId(int albumId) {
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
                //u.setAddress(user.getAddress());
                //u.setAge(user.getAge());
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

