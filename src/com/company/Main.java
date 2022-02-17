package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(50);
        System.out.println(boss.getHealth()+"\n"+boss.getDamage());


        Skeleton skeleton=new Skeleton();
        skeleton.setHealth(400);
        skeleton.setDamage(50);
        skeleton.weapon.setWeaponName("Стрелы");
        skeleton.weapon.setWeaponType("Рукодельное");
        System.out.println(skeleton.printInfo());

    Skeleton skeleton2=new Skeleton();
        skeleton.setHealth(300);
        skeleton.setDamage(30);
        skeleton.weapon.setWeaponName("Нож");
        skeleton.weapon.setWeaponType("Холодное");
        System.out.println(skeleton.printInfo());



    }
}
