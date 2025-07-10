package com.vaishnavi.practice.classDemo;

public class Passenger {
        public String name;
        private String address;
        private int age;
        String gender;
        protected int ticketPrice;
        public float luggageSize;

        public void setAddress(String address) {
            this.address = address;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public void setTicketPrice(int ticketPrice) {
            this.ticketPrice = ticketPrice;
        }

        @Override
        public String toString() {
            return "Passenger{" +
                    "name='" + name + '\'' +
                    ", address='" + address + '\'' +
                    ", age=" + age +
                    ", gender='" + gender + '\'' +
                    ", ticketPrice=" + ticketPrice +
                    ", luggageSize=" + luggageSize +
                    '}';
        }
    }

