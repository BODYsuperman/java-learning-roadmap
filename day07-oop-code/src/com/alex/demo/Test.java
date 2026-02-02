package com.alex.demo;

public class Test {
    public static void main(String[] args) {
        Movie[] movieArray = new Movie[5];

        // 2. 逐个下标赋值，创建5个电影对象
        movieArray[0] = new Movie(1, "流浪地球3", 69.9, "吴京、刘德华");
        movieArray[1] = new Movie(2, "热辣滚烫2", 39.9, "贾玲、雷佳音");
        movieArray[2] = new Movie(3, "哪吒之魔童闹海", 59.9, "吕艳婷、囧森瑟夫");
        movieArray[3] = new Movie(4, "唐人街探案4", 49.9, "王宝强、刘昊然");
        movieArray[4] = new Movie(5, "战狼3", 55.9, "吴京、余男");


        MovieOperator movieOperator = new MovieOperator(movieArray);
        movieOperator.showAllMovies();

        movieOperator.getMovieById(1);

    }
}
