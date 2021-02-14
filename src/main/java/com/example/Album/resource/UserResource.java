package com.example.Album.Resource;

import com.example.Album.model.User;
import com.example.Album.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class UserResource {
    @Autowired
    private UserService userService;


    @GetMapping("/album")

    public User getUser() {
        return userService.getUser();
    }

    @PostMapping("/album")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }
    @GetMapping("/allAlbums")
    public List<User> getAllAlbums()
    {
        return userService.getAllAlbums();
    }
    @GetMapping("/album/{albumId}")
    public User getAlbumbyId(@PathVariable("albumId") int albumId)
    {
        return userService.getAlbumbyId(albumId);
    }

    @PutMapping("/album/{albumId}")
    public User updateAlbum(@PathVariable("albumId") int albumId, @RequestBody User user)
    {
        return userService.updateAlbum(albumId, user);
    }

    @DeleteMapping("/album")
    public User deletedalbum(@RequestParam(name = "albumId") int albumId)
    {
        return userService.deletedalbum(albumId);
    }

}
