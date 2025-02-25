package com.sahil.sahil.entity;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;


    @Entity
    public class Employee extends BaseEntity {
        @NotBlank(message = "Name cannot be empty")
        private String name;

        @Email(message = "Invalid email format")
        private String email;

        private Double salary;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public Double getSalary() {
            return salary;
        }

        public void setSalary(Double salary) {
            this.salary = salary;
        }
    }


