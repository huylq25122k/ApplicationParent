package DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import userservice.UserModel;

import java.util.List;

@Controller
@RequestMapping("/api")
public class controller {
    @Autowired
    private DaoBussi daoBussi;

    @GetMapping("/getUser")
    public List<UserModel> getAll(){
        List<UserModel> userModels = daoBussi.getAll();
        return userModels;
    }
    //Đúng ra cái ầny thì oẻ bên controler chúư
}
