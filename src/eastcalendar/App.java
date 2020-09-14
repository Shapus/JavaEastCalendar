/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eastcalendar;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class App {
    Scanner scanner = new Scanner(System.in);
    int start_year = 1984;
    String[] colors = new String[5];
    String[] animals = new String[12];
    int color_index;
    int animal_index;
    public void run(){
        System.out.print("Введите год: ");
        int user_year = scanner.nextInt();
        colors[0] = "зеленый";
        colors[1] = "красный";
        colors[2] = "желтый";
        colors[3] = "белый";
        colors[4] = "черный";
        
        animals[0] = "крыса";
        animals[1] = "корова";
        animals[2] = "тигр";
        animals[3] = "заяц";
        animals[4] = "дракон";
        animals[5] = "змея";
        animals[6] = "лошадь";
        animals[7] = "овца";
        animals[8] = "обезьяна";
        animals[9] = "курица";
        animals[10] = "собака";
        animals[11] = "свинья";
        
        int delta = (start_year - user_year)%60;
        System.out.println(delta);
        if(delta > 0){
            color_index = (colors.length-1) - (int)(delta/12);
            animal_index = (animals.length-1) - delta%12;
        }
        else{
            color_index = (int)(Math.abs(delta)/12);
            animal_index = (int)(Math.abs(delta)%12);            
        }
        System.out.println(color_index);
        System.out.println(animal_index);
        System.out.printf("Год: %d\n", user_year);
        System.out.printf("Цвет: %s\n", colors[color_index]);
        System.out.printf("Зверь: %s\n", animals[animal_index]);
    }
}
