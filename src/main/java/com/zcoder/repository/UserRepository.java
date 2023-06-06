package com.zcoder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zcoder.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
