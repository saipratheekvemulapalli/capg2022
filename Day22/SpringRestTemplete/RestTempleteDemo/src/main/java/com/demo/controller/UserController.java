package com.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.model.User;
import com.demo.model.UserDetailsResponse;
import com.demo.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	// CRUD -- CREATE operation
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public @ResponseBody User createUser(@RequestBody User user) {
		User userResponse = userService.createUser(user);
		return userResponse;
	}

	// CRUD -- READ operation
	@RequestMapping(value = "/getAllUsers", method = RequestMethod.GET)
	public @ResponseBody UserDetailsResponse getAllUsers() {
		List<User> userList = userService.getAllUsers();
		UserDetailsResponse userDetailsResponse = new UserDetailsResponse();
		userDetailsResponse.setUsers(userList);
		return userDetailsResponse;
	}

	// CRUD -- READ operation
	@RequestMapping(value = "/getSpecificUser/{id}", method = RequestMethod.GET)
	public @ResponseBody User getUserForId(@PathVariable("id") int id) {
		User user = userService.getUserForId(id);
		return user;
	}

	// CRUD -- UPDATE operation
	@RequestMapping(value = "/updateUser", method = RequestMethod.PUT)
	public @ResponseBody User updateUser(@RequestBody User user) {
		User userResponse = userService.updateUser(user);
		return userResponse;
	}

	// CRUD -- DELETE operation
	@RequestMapping(value = "/deleteUser/{id}", method = RequestMethod.DELETE)
	public @ResponseBody User deleteeUser(@PathVariable("id") int id) {
		User userResponse = userService.deleteUser(id);
		return userResponse;
	}
}