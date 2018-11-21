package com.itmuch.cloud.respostity;

import com.itmuch.cloud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<User,Long>{

}
