package LLDPractice;

import LLDPractice.model.User;


import java.util.ArrayList;
import java.util.List;

public class UserService {
    List<User> user = new ArrayList<>();
    public long loggedInUser;

    public void registerUser(String name, String gender, long mobileNo, String address, String pinCode) {
        /**
         * 1. add new entry for each User.
         */
        User userObj = new User();
        userObj.address = address;
        userObj.gender = gender;
        userObj.name = name;
        userObj.mobileNo = mobileNo;
        userObj.pinCode = pinCode;
        this.user.add(userObj);
    }

    public List<User> getUserList() {
        return user;
    }

    public void SetloginUser(long mobileNo) {
        /**
         * set active User details.
         */
        this.loggedInUser = mobileNo;
    }

    public long getLoggedInUserDetails() {
        return this.loggedInUser;
    }

}
