package com.example.BasicSpringSqlConnection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    //First part in <> : with whom to connect(Entity) ,in 2nd part what is the data type of primary key


    //Generally in interface : you have to write custom queries , for Eg:
    //    @Query("select * from user_info where id = ")
}
