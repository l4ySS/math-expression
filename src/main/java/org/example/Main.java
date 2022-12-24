package org.example;

import java.util.List;

/**
 * Основной класс.
 * @author  Slivkin Sergey
 * @version 1.0
 */
public class Main {
    /**
     * Метод, проводящий вычисления со строкой
     * математического выражения и выводящий результат в консоль.
     * @param args Не используется.
     */
    public static void main(String[] args) {
        ExpressionCalc expressionChecker = new ExpressionCalc();
        String expressionText = "((20+2)+20)/2";
        List<ExpressionCalc.Lexeme> lexemes = ExpressionCalc.lexAnalyze(expressionText);
        ExpressionCalc.LexemeBuffer lexemeBuffer = new ExpressionCalc.LexemeBuffer(lexemes);
        System.out.println(ExpressionCalc.expr(lexemeBuffer));
    }
}