package com.api.utils;

import java.util.Arrays;
import java.util.List;

public interface Constants {
	static final String GET_USER_BY_ID = "/getUser/{userId}";
	static final String GET_ALL_USERS = "/persons/v1/all";
	static final String SAVE_USER = "/persons/v1/save";
	static final List<String> GENDER = Arrays.asList("M","F","Other","Male","Female");
}
