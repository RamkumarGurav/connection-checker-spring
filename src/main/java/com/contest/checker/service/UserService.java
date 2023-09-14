package com.contest.checker.service;

import com.contest.checker.dto.UserDto;
import com.contest.checker.dto.UserWithRoleNameDto;
import com.contest.checker.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface UserService {


    User createUser(User user);

    List<User> getAllUsers();

    List<User> getUsersStartsWith(String name);

    Optional<User> getSingleUser(Long userId);


    Optional<User> getSingleActiveUserById(Long userId,boolean active);

    Optional<User> getSingleActiveUserByEmail(String email,boolean active);

    Optional<User> getSingleUserByEmailId(String email);

    User register(User user);

    User updateUser(User user);



    User deactivateUser(User user);

   void permanentlyDeleteUser(Long userId);

//--------DTO conversion --------------------------------------
    UserDto userToUserDto(User user);
    UserWithRoleNameDto userToUserDtoWithRoleName(User user);

    List<UserWithRoleNameDto> usersToUserDtosWithRoleName(List<User> users);



//    User userDtoToUser(UserDto userDto);
    //-----------------------------------------------------------------------

    User registerAdmin(User filteredUser);


    Page<User> searchUsersByKeywordAndOtherProps(String keyword, String firstName, String lastName,
                                                 String email, String mobile, String gender, String roleName, Pageable pageable);


//    Page<User> search(String name, String email, String gender, String mobile, List<String> fields, String role, Pageable pageable);

    User registerUserByAdmin(User filteredUser);


    User deleteUser(User user);

    User undeleteUserButNotActive(User user);

    User activateUser(User user);
}
