package com.example.layoutexamples;

public class cardmodel {



        private String user_name, message, time;

        private int profile_pic;



        public cardmodel(String user_name, String message, String time, int profile_pic) {

            this.user_name = user_name;

            this.message = message;

            this.time = time;

            this.profile_pic = profile_pic;

        }



        public String getUser_name() {

            return user_name;

        }



        public String getMessage() {

            return message;

        }



        public String getTime() {

            return time;

        }



        public int getProfile_pic() {

            return profile_pic;

        }

    }

