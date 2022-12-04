package com.example.zad4;

public class Zad4ApplicationStub extends Zad4Application {
    private final Zad4Application zad4Application = new Zad4Application(1L ,"Mikolaj" , 50, 80, 190, 55);

    @Override
    public Long getId() {
        return zad4Application.getId();
    }

    @Override
    public String getName() {
        return zad4Application.getName();
    }

    @Override
    public int getAge() {
        return zad4Application.getAge();
    }

    @Override
    public int getHeight() {
        return zad4Application.getHeight();
    }

   // @Override
   // public int getWight() {
   //     return zad4Application.getWeight();
   // }

    @Override
    public int getNumber() {
        return zad4Application.getNumber();
    }



    @Override
    public void setId(Long id) {
        zad4Application.setId(id);
    }

    @Override
    public void setName(String name) {
        zad4Application.setName(name);
    }

    @Override
    public void setAge(int age) {
        zad4Application.setAge(age);
    }

    @Override
    public void setHeight(int height) {
        zad4Application.setHeight(height);
    }

    //@Override
    //public void setWight(int wight) {
    //    zad4Application.setWeight(wight);
   // }

    @Override
    public void setNumber(int number) {
        zad4Application.setNumber(number);
    }


    @Override
    public boolean doesPersonExists(Long Id) {
        return zad4Application.getId().equals(Id);
    }


    @Override
    public String toString() {
        return "Player{" +
                "name='" + zad4Application.getName() + '\'' +
                ", age=" + zad4Application.getAge() +
                ", height=" + zad4Application.getHeight() +
                ", weight=" + zad4Application.getWeight() +
                ", number=" + zad4Application.getNumber() +
                '}';
    }
}

