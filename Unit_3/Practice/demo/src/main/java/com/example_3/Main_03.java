package com.example_3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 * Даны следующие сведения о кубиках: размер каждого кубика (длина ребра в
 * целых сантиметрах), его цвет (красный, желтый, зеленый тд) и материал
 * (деревянный, металлический, картонный и тд.). Найти:
 * - количество кубиков желтого цвета и их суммарный объем;
 * - количество деревянных кубиков с ребром 3 см
 */
public class Main_03 {
    public static void main(String[] args) {
        Cube cube = new Cube(3, "Красный", "Деревянный");
        Cube cube1 = new Cube(4, "Желтый", "Металлический");
        Cube cube2 = new Cube(4, "Желтый", "Металлический");

        List<Cube> cubeList = new ArrayList<>();
        cubeList.add(cube);
        cubeList.add(cube1);
        cubeList.add(cube2);

        System.out.println("CubeList : " + cubeList);
        Integer k = 0;
        Integer volume = 0;
        Integer kWood = 0;
        for (Cube cubeList2 : cubeList) {
            if (cubeList2.getColors().equals("Желтый")) {
                k++;
                volume += cube.volumeCube();
            }
            if (cube.getMaterial().equals("Деревянный") && cube.getSumSize() == 3) {
                kWood++;

            }
        }
        System.out.println("k : " + k);
        System.out.println("volume : " + volume);
        System.out.println("kWood : " + kWood);
        System.out.println("unicumListCube(cubeList) : " + unicumListCube(cubeList));

    }

    /**
     * @param cubeList
     * @return
     */
    private static Collection unicumListCube(List<Cube> cubeList) {
        return new HashSet(cubeList);
    }
}
