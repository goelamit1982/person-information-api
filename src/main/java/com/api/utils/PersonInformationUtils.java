package com.api.utils;

import com.api.dto.PersonInformationDto;

import static org.apache.commons.lang3.StringUtils.isNotEmpty;


public class PersonInformationUtils {

    private static final String EMAIL_PATTERN =
            "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    private static final String NAME_PATTERN =
              "^[a-zA-Z0-9]([._-](?![._-])|[a-zA-Z0-9]){3,18}[a-zA-Z0-9]$"
    ;

    private PersonInformationUtils() {}



    public static boolean isValid(PersonInformationDto request) {
        return (request != null && isValidType(request));
    }

    private static boolean isValidType(PersonInformationDto request) {
        boolean isValid = isNotEmpty(request.getUserName()) && isNotEmpty(request.getEmail()) && isNotEmpty(request.getGender());

        isValid = isValid && isValidData(request.getEmail(), EMAIL_PATTERN);
        //isValid = isValid && isValidData(request.getUserName(), NAME_PATTERN);

        isValid = isValid && (request.getAge() > 0);

        isValid = isValid && Constants.GENDER.contains(request.getGender());

        return isValid;
    }


    private static boolean isValidData(String value, String pattern) {
        boolean isValidData = false;
        if (isNotEmpty(pattern)) {
            isValidData = isValidPattern(value, pattern);
        }

        return isValidData;
    }

    protected static boolean isValidAge(Integer value, int minLength, int maxLength) {
        return  value >= 0 ;
    }

    private static boolean isValidPattern(String value, String pattern) {
        return isNotEmpty(value) && value.matches(pattern);
    }
}
