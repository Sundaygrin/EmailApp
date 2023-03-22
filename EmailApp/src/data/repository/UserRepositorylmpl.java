package data.repository;

import data.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UserRepositorylmpl implements UserRepository{
    private int count;

    private List<User> users = new ArrayList<>();


    @Override
    public User save(User user) {
        boolean userHasNotBeSaved = user.getId() ;
        if (userHasNotBeSaved){
            user.setId(generateUserId());
            users.add(user);
            count++;
        }
        return user;
    }

    private int  generateUserId() {
        return count + 1;
    }

    @Override
    public long count() {
        return count;
    }

    @Override
    public List<User> findAll() {
        return null;
    }


    @Override
    public void delete(User user) {
        for (User userIn : users){
            if(userIn == user){users.remove(user);
                count --;
                break;
            }
        }
    }

    @Override
    public void delete(int id) {
        for (User user:users) {
            if (user.getId()) {
                users.remove(user);
                count --;
                break;

            }

        }
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public User findByUsername(String username) {
        for (User user : users){
            if(Objects.equals(user.getUsername(), username)) {
                return  user;
            }
        }
        return null;
    }

    @Override
    public int size() {
        return users.size();
    }

    @Override
    public User remove(User users) {
        return users;
    }


}
