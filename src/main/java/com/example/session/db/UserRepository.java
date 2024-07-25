package com.example.session.db;
// 사용자 저장소 (DB)

import com.example.session.model.UserDto;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserRepository {

    private List<UserDto> userList = new ArrayList<>(); // 공백의 리스트 생성

    public Optional<UserDto> findByName(String name){
        return userList.stream().filter(it->{
            return it.getName().equals(name);
        }).findFirst(); // 넘어온 이름 중 stream/filter 를 걸어서 같은 이름이 존재한다면 제일 첫 번째를 찾아서 리턴
    }

    @PostConstruct
    public void init(){

        // 리스트 형태로 name,password 생성
        userList.add(
                new UserDto(
                        "홍길동",
                        "1234"
                )
        );

        userList.add(
                new UserDto(
                        "유관순",
                        "1234"
                )
        );

        userList.add(
                new UserDto(
                        "철수",
                        "1234"
                )
        );

    }
}
