package DAO;

import userservice.IDAO;
import userservice.UserModel;

import java.util.ArrayList;
import java.util.List;

public class DaoBussi implements IDAO {

    private Repositoryy repositoryy;

    @Override
    public List<UserModel> getAll() {
        List<User> list = repositoryy.findAll();
        return usersToUserModels (list);
    }

    public static List<UserModel> usersToUserModels(List<User> users) {
        List<UserModel> userModels = new ArrayList<>();
        for ( User user: users) {
            UserModel userModel = userToUserModel (user);
            userModels.add(userModel);
        }
        return userModels;
    }

    public static UserModel userToUserModel(User user) {
        UserModel userModel = new UserModel();
        userModel.id = user.getId();
        userModel.name = user.getName();
        return userModel;
    }
}
