package com.example.zad4;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@NoArgsConstructor
@AllArgsConstructor
public class Zad4Application {

    public static void main(String[] args) {
        SpringApplication.run(Zad4Application.class, args);
    }

    private Long id;
    private String name;
    private int age;
    private int weight;
    private int height;
    private int number;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", number=" + number +
                '}';
    }

    public int addWeight(int age) {
        if (age > 80) {
            weight = weight + 10;
        } else {
            throw new IllegalArgumentException("Error");
        }
        return weight;
    }

    public int addHeight(int age) {
        if (age > 80) {
            height = height - 10;
        } else {
            throw new IllegalArgumentException("Error");
        }
        return height;
    }

    public int Number (int number) {
       if ((height+weight) > 100) {
           number = number + 100;
       }  else
       {
           throw new IllegalArgumentException("Zla wartosc");
       }
       return number;
    }

    public boolean searchForPerson(String givenId) {
        if (getId().equals(givenId)) {
            System.out.println(toString());
            return(true);
        } else {
            return false;
        }
    }
    public boolean isPersonDead() {
        return age > 150;
    }
    public boolean doesPersonExists(Long id) {
        return id.equals(id);
    }
}

