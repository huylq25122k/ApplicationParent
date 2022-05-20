package userservice;



import java.util.List;

public interface IDAO {
    List<UserModel> getAll();
    // đây nếu truyền vào entity là sai đề rồi
    // k thì nó se
    // đây là cái cần lấy đúng k ? truyền vào UM

}
