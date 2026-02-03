package com.alex.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodOperator {
    public FoodOperator() {
    }

    private   Scanner sc = new Scanner(System.in);
    private ArrayList<Food> allFoods = new ArrayList<>();

    public  void start(){
        //option command tab
        while (true) {
            System.out.println("Dish Management System");

            System.out.println("1.add dish");
            System.out.println("2.remove dish");
            System.out.println("3.show the dish");


            System.out.println("please input relevant code function");
            int command = sc.nextInt();

            switch (command){
                case 1:
                    addFood();
                    break;


                case 2:
                    removeFood();
                    break;

                case 3:
                    showAllFoods();
                    break;
            }
        }
    }

    private void removeFood() {
        System.out.println("====================删除菜品====================");
        // 先判断是否有菜品，无则直接返回
        if (allFoods.isEmpty()) {
            System.out.println("暂无菜品信息，无需删除！");
            return;
        }
        // 先展示所有菜品，方便用户选择删除
        showAllFoods();
        System.out.print("请输入要删除的菜品名称：");
        String delName = sc.nextLine();

        // 遍历集合，查找并删除菜品
        boolean isDeleted = false;
        for (int i = 0; i < allFoods.size(); i++) {
            Food f = allFoods.get(i);
            // 按名称匹配删除（忽略大小写，优化体验：如输入“麻辣鱼”和“MA LA YU”都能匹配）
            if (f.getName().equalsIgnoreCase(delName)) {
                allFoods.remove(i);
                isDeleted = true;
                System.out.println("菜品【" + delName + "】删除成功！");
                break; // 假设菜品名唯一，删除后直接退出循环
            }
        }

        // 新增：未找到菜品的提示
        if (!isDeleted) {
            System.out.println("未找到菜品【" + delName + "】，删除失败！");
        }
    }

    public void showAllFoods() {

        System.out.println("====================所有菜品====================");
        // 新增：判断集合是否为空，避免空列表遍历无提示
        if (allFoods.isEmpty()) {
            System.out.println("暂无菜品信息，请先新增菜品！");
            return;
        }
        // 遍历打印所有菜品，索引从1开始，更符合用户习惯
        for (int i = 0; i < allFoods.size(); i++) {
            Food f = allFoods.get(i);
            System.out.println((i + 1) + "." + f.toString()); // 修复：加println打印
        }
    }

    private void addFood() {

        System.out.println("====================新增菜品====================");
        Food f = new Food();

        System.out.print("请输入菜品名称：");
        String name = sc.nextLine(); // 用nextLine，支持含空格的名称（如“麻辣鱼”）
        f.setName(name);

        // 新增：校验价格是否为合法数字，避免输入非数字崩溃
        double price = 0;
        while (true) {
            System.out.print("请输入菜品价格：");
            if (sc.hasNextDouble()) {
                price = sc.nextDouble();
                // 新增：校验价格是否为正数，符合业务逻辑
                if (price > 0) {
                    break;
                } else {
                    System.out.println("价格错误！请输入大于0的数字！");
                }
            } else {
                System.out.println("输入错误！请输入合法的价格数字！");
                sc.next(); // 清空无效输入
            }
        }
        sc.nextLine(); // 吸收价格后的换行符
        f.setPrice(price);

        System.out.print("请输入菜品描述：");
        String desc = sc.nextLine(); // 用nextLine，支持含空格的描述（如“麻辣鲜香，鱼肉嫩滑”）
        f.setDesc(desc);

        allFoods.add(f);
        System.out.println("菜品【" + name + "】新增成功！");

    }

}
