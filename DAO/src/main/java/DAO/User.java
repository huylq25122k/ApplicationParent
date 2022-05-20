package DAO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import userservice.UserModel;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Users", schema = "mutiproject")
public class User extends UserModel {
    // extend thế này k có tác dụng gì
    // nhưng cái này là cái lấy dl từ db lên ,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;

}
