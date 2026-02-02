package com.alex.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScoreCaculator {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // 示例：调用方法，指定5名评委计算分数（可直接修改数字为任意≥3的数）
        calculateScoreByJudgeCount(5);
        // 若需跨类调用，直接 ScoreCalculator.calculateScoreByJudgeCount(评委数) 即可
    }

    /**
     * 核心对外方法：指定评委人数，完成分数录入+计算+结果输出的全流程
     * @param judgeCount 评委人数（必须≥3，否则无法计算）
     */
    public static void calculateScoreByJudgeCount(int judgeCount) {
        // 第一步：校验评委人数合法性（至少3人，否则无法去掉高低分）
        if (!isJudgeCountValid(judgeCount)) {
            System.out.println("错误：评委人数必须≥3，当前输入：" + judgeCount);
            return;
        }

        // 第二步：按指定评委人数，录入分数
        List<Integer> scores = inputScoresByJudgeCount(judgeCount);

        // 第三步：调用计算方法，去掉高低分算平均分
        Double averageScore = calculateAverageScore(scores);

        // 第四步：输出结果
        printResult(scores, averageScore);
    }

    /**
     * 校验评委人数是否合法：≥3为合法
     * @param judgeCount 评委人数
     * @return 合法返回true，否则false
     */
    private static boolean isJudgeCountValid(int judgeCount) {
        return judgeCount >= 3;
    }

    /**
     * 按指定评委人数录入分数，精准录满结束，自动过滤非法分数
     * @param judgeCount 指定评委人数
     * @return 合法的评委分数列表
     */
    private static List<Integer> inputScoresByJudgeCount(int judgeCount) {
        List<Integer> scores = new ArrayList<>(judgeCount);
        System.out.printf("开始录入%d名评委的分数（分数范围：0-100，整数）\n", judgeCount);

        for (int i = 1; i <= judgeCount; ) { // 注意：i不自动++，合法录入后才自增
            System.out.printf("请输入第%d名评委的分数：", i);
            // 处理非数字输入，避免程序崩溃
            if (!scanner.hasNextInt()) {
                System.out.println("输入无效！请输入整数分数！");
                scanner.next(); // 清空无效输入缓冲区
                continue;
            }

            int score = scanner.nextInt();
            // 校验分数合法性，合法则加入列表，且评委序号自增
            if (isScoreValid(score)) {
                scores.add(score);
                i++; // 只有录入合法分数，才算完成一名评委的录入
            } else {
                System.out.printf("分数无效！请输入0-100之间的整数，当前输入：%d\n", score);
            }
        }
        return scores;
    }

    /**
     * 校验单个分数是否合法：0-100为合法
     * @param score 评委打分
     * @return 合法返回true，否则false
     */
    private static boolean isScoreValid(int score) {
        return score >= 0 && score <= 100;
    }

    /**
     * 核心计算方法：去掉一个最高分+一个最低分，计算平均分
     * @param scores 合法的评委分数列表（数量=指定评委数≥3）
     * @return 平均分（Double类型，避免整数除法精度丢失）
     */
    public static Double calculateAverageScore(List<Integer> scores) {
        // 双重校验：防止空列表/数量不足
        if (scores == null || scores.size() < 3) {
            return null;
        }

        int sum = 0;
        int max = scores.get(0);
        int min = scores.get(0);

        // 遍历累加总分，同时找出最高分、最低分
        for (int score : scores) {
            sum += score;
            if (score > max) {
                max = score;
            }
            if (score < min) {
                min = score;
            }
        }

        // 去掉高低分后计算平均分
        int effectiveSum = sum - max - min; // 有效总分
        int effectiveJudgeCount = scores.size() - 2; // 有效评委数
        return (double) effectiveSum / effectiveJudgeCount;
    }

    /**
     * 结果打印方法：格式化展示打分详情+最终得分
     * @param scores 评委分数列表
     * @param averageScore 计算后的平均分
     */
    private static void printResult(List<Integer> scores, Double averageScore) {
        if (averageScore == null) {
            System.out.println("无法计算平均分，有效分数数量不足！");
            return;
        }

        // 格式化输出，展示所有分数、最高分、最低分、最终得分
        System.out.println("\n===== 打分计算结果 =====");
        System.out.printf("所有评委分数：%s\n", scores);
        System.out.printf("去掉最高分：%d，去掉最低分：%d\n", getMaxScore(scores), getMinScore(scores));
        System.out.printf("最终平均得分（保留2位小数）：%.2f\n", averageScore);
    }

    /**
     * 辅助方法：获取分数列表的最高分
     */
    private static int getMaxScore(List<Integer> scores) {
        int max = scores.get(0);
        for (int score : scores) {
            if (score > max) max = score;
        }
        return max;
    }

    /**
     * 辅助方法：获取分数列表的最低分
     */
    private static int getMinScore(List<Integer> scores) {
        int min = scores.get(0);
        for (int score : scores) {
            if (score < min) min = score;
        }
        return min;
    }
}
